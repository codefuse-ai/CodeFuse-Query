package core

import (
	"alipay.com/code_insight/coref-go-extractor/src/util"
	"fmt"
	"go/types"
	"golang.org/x/tools/go/packages"
)

// Label represents a unique identifier for different elements such as files, nodes, scopes, etc.
type Label struct {
	ID int64
}

// InvalidLabel is the zero value for a Label, used to represent an uninitialized or invalid state.
var InvalidLabel = Label{}

// String returns the string representation of the Label.
func (lbl Label) String() string {
	return fmt.Sprintf("%d", lbl.ID)
}

// Labeler assigns unique labels to various program entities during the extraction process.
type Labeler struct {
	Profile      *Profile
	IDGenerator  *IDGenerator
	FileLabel    Label
	NodeLabels   map[interface{}]Label
	ScopeLabels  map[*types.Scope]Label
	ObjectLabels map[types.Object]Label
	TypeLabels   map[types.Type]Label
}

// newLabeler creates a new Labeler associated with the given Profile.
func newLabeler(p *Profile) *Labeler {
	return &Labeler{
		Profile:      p,
		IDGenerator:  p.IDGenerator,
		FileLabel:    InvalidLabel,
		NodeLabels:   make(map[interface{}]Label),
		ScopeLabels:  make(map[*types.Scope]Label),
		ObjectLabels: make(map[types.Object]Label),
		TypeLabels:   make(map[types.Type]Label),
	}
}

// nextID safely increments and returns the next available ID from the shared IDGenerator.
func (l *Labeler) nextID() int64 {
	l.IDGenerator.Lock()
	defer l.IDGenerator.Unlock()
	id := l.IDGenerator.NextID
	l.IDGenerator.NextID++
	return id
}

// GlobalID assigns a globally unique label to the given key and returns it.
func (l *Labeler) GlobalID(key string) Label {
	return Label{ID: util.GetIDFromDigest(fmt.Sprintf("%v", key), "GlobalID")}
}

// GetFileLabel returns the label for a file with path `path`.
func (l *Labeler) GetFileLabel() Label {
	if l.FileLabel == InvalidLabel {
		l.FileLabel = l.FileLabelFor(l.Profile.Path)
	}
	return l.FileLabel
}

// FileLabelFor returns the label for the file for which the trap writer `tw` is associated
func (l *Labeler) FileLabelFor(path string) Label {
	return Label{util.GetIDFromDigest(util.EscapeTrapSpecialChars(path), ";sourcefile")}
}

// LocalID associates a label with the given AST node `nd` and returns it
func (l *Labeler) LocalID(nd interface{}) Label {
	label, exists := l.NodeLabels[nd]
	if !exists {
		label = Label{util.GetIDFromDigest(fmt.Sprintf("%v#%v", nd, l.FreshID()), "LocalID")}
		l.NodeLabels[nd] = label
	}
	return label
}

// FreshID creates a new unique label.
func (l *Labeler) FreshID() Label {
	return Label{ID: l.nextID()}
}

// FieldID associates a label with the given field and returns it, together with
// a flag indicating whether the field already had a label associated with it.
func (l *Labeler) FieldID(field *types.Var, idx int, structlbl Label) (Label, bool) {
	if label, exists := l.ObjectLabels[field]; exists {
		return label, true
	}
	name := field.Name()
	if name == "_" {
		name = fmt.Sprintf("_%d", idx)
	}
	label := l.GlobalID(fmt.Sprintf("{%v},%s;field", structlbl, name))
	l.ObjectLabels[field] = label
	return label, false
}

// MethodID associates a label with the given method and returns it, together with
// a flag indicating whether the method already had a label associated with it.
func (l *Labeler) MethodID(method types.Object, recvtyplbl Label) (Label, bool) {
	label, exists := l.ObjectLabels[method]
	if !exists {
		label = l.GlobalID(fmt.Sprintf("{%v},%s;method", recvtyplbl, method.Name()))
		l.ObjectLabels[method] = label
	}
	return label, exists
}

// LookupObjectID looks up the label associated with the given object and returns it;
// if the object does not have a label yet, it tries to construct one based on its scope and/or name.
func (l *Labeler) LookupObjectID(object types.Object, typelbl Label) (Label, bool) {
	label, exists := l.ObjectLabels[object]
	if !exists {
		if object.Parent() == nil {
			// blank identifiers and the pseudo-package `.` (from `import . "..."` imports) can only be referenced
			// once, so we can use a fresh label for them
			if object.Name() == "_" || object.Name() == "." {
				label = Label{util.GetIDFromDigest(fmt.Sprintf("%v#%v", object, l.FreshID()), "LocalID")} //l.FreshID()
				l.ObjectLabels[object] = label
				return label, false
			}
			label = InvalidLabel
		} else {
			label, exists = l.ScopedObjectID(object, func() Label { return typelbl })
		}
	}
	return label, exists
}

// ScopedObjectID associates a label with the given object and returns it,
// together with a flag indicating whether the object already had a label
// associated with it; the object must have a scope, since the scope's label is
// used to construct the label of the object.
//
// There is a special case for variables that are method receivers. When this is
// detected, we must construct a special label, as the variable can be reached
// from several files via the method. As the type label is required to construct
// the receiver object id, it is also required here.
func (l *Labeler) ScopedObjectID(object types.Object, getTypeLabel func() Label) (Label, bool) {
	label, exists := l.ObjectLabels[object]
	if !exists {
		scope := object.Parent()
		if scope == nil {
			panic(fmt.Sprintf("Object has no scope: %v :: %v.\n", object,
				l.Profile.Package.Fset.Position(object.Pos())))
		} else {
			// associate method receiver objects to special keys, because those can be
			// referenced from other files via their method
			meth := findMethodWithGivenReceiver(object.Type(), object)
			if meth == nil {
				if pointerType, ok := object.Type().(*types.Pointer); ok {
					meth = findMethodWithGivenReceiver(pointerType.Elem(), object)
				}
			}

			if meth != nil {
				methlbl, _ := l.MethodID(meth, getTypeLabel())
				label, _ = l.ReceiverObjectID(object, methlbl)
			} else {
				scopeLbl := l.ScopeID(scope, object.Pkg())
				label = Label{util.GetIDFromDigest(fmt.Sprintf("{%v},%s;object", scopeLbl, object.Name()), "ScopedObjectID")} //l.GlobalID(fmt.Sprintf("{%v},%s;object", scopeLbl, object.Name()))
			}
		}
		l.ObjectLabels[object] = label
	}
	return label, exists
}

func findMethodWithGivenReceiver(tp types.Type, object types.Object) *types.Func {
	if namedType, ok := tp.(*types.Named); ok {
		for i := 0; i < namedType.NumMethods(); i++ {
			meth := namedType.Method(i)
			if object == meth.Type().(*types.Signature).Recv() {
				return meth
			}
		}
	}
	return nil
}

// ScopeID associates a label with the given scope and returns it
func (l *Labeler) ScopeID(scope *types.Scope, pkg *types.Package) Label {
	label, exists := l.ScopeLabels[scope]
	if !exists {
		if scope == types.Universe {
			label = l.GlobalID("universe;scope")
		} else {
			if pkg != nil && pkg.Scope() == scope {
				// if this scope is the package scope
				pkgLabel := l.GlobalID(util.EscapeTrapSpecialChars(pkg.Path()) + ";package")
				label = l.GlobalID("{" + pkgLabel.String() + "};scope")
			} else {
				label = l.GlobalID("{" + fmt.Sprintf("scopeinfo:%p%v", scope, l.FreshID()) + "};scope")
			}
		}
		l.ScopeLabels[scope] = label
	}
	return label
}

func getPkgLableID(pkg *packages.Package) Label {
	if pkg != nil {
		return Label{util.GetIDFromDigest(util.EscapeTrapSpecialChars(pkg.PkgPath)+";pkg", "Pkg")}
	}
	return InvalidLabel
}

// ReceiverObjectID associates a label with the given object and returns it, together with a flag indicating whether
// the object already had a label associated with it; the object must be the receiver of `methlbl`, since that label
// is used to construct the label of the object
func (l *Labeler) ReceiverObjectID(object types.Object, methlbl Label) (Label, bool) {
	label, exists := l.ObjectLabels[object]
	if !exists {
		// if we can't, construct a special label
		label = Label{util.GetIDFromDigest(fmt.Sprintf("{%v},%s;receiver", methlbl, object.Name()), "ReceiverObjectID")} //l.GlobalID(fmt.Sprintf("{%v},%s;receiver", methlbl, object.Name()))
		l.ObjectLabels[object] = label
	}
	return label, exists
}
