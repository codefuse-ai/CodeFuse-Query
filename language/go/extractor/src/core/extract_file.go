package core

import (
	"bytes"
	"fmt"
	"go/ast"
	"go/constant"
	"go/token"
	"go/types"
	"log"
	"strconv"
	"strings"
	"time"

	"alipay.com/code_insight/coref-go-extractor/src/orm"
	"alipay.com/code_insight/coref-go-extractor/src/util"

	"golang.org/x/tools/go/packages"
)

// extractFile handles the extraction process for a Go file.
func (ex *Extraction) extractFile(ast *ast.File, pkg *packages.Package) error {
	if !ast.Package.IsValid() {
		log.Println("Skipping extracting a file without a 'package' declaration.")
		return nil
	}
	fset := pkg.Fset
	path := normalizedPath(ast, fset)
	log.Printf("Extracting %s", path)

	// Defer logging the time taken to extract until the function completes.
	defer func(start time.Time) {
		log.Printf("Done extracting %s (%dms).", path, time.Since(start).Milliseconds())
	}(time.Now())

	profile, err := NewProfile(path, pkg, ex.Db, &ex.IDManager, ex.SrcRootDir)
	if err != nil {
		return fmt.Errorf("error creating profile for %s: %w", path, err)
	}

	// Extract file-level information.
	ex.extractFileInfo(profile, path)

	// Extract scopes if necessary.
	if ex.Config.ParseRule.NeedScope {
		extractScopes(profile, ast, profile.Package)
	}

	// Extract AST information.
	extractAstInfo(profile, ast)

	// Extract additional type and line number information if necessary.
	if ex.Config.ParseRule.NeedScope {
		extractObjectTypes(profile)
	}

	extractNumLines(profile, path, ast)
	return nil
}

// extractAstInfo extracts information from the abstract syntax tree (AST) of a Go file.
func extractAstInfo(p *Profile, ast *ast.File) {
	lbl := p.Labeler.GetFileLabel()

	// Extract the package name.
	extractExpr(p, ast.Name, lbl, 0)

	// Extract top-level declaration nodes.
	for i, decl := range ast.Decls {
		extractDecl(p, decl, lbl, i)
	}

	// Extract comment groups.
	for i, cg := range ast.Comments {
		extractCommentGroup(p, cg, lbl, i)
	}

	// Extract documentation associated with the package.
	extractDoc(p, ast.Doc, lbl)

	// Emit scope node information.
	emitScopeNodeInfo(p, ast, lbl)
}

// extractTypeOf looks up the type of `expr`, extracts it if it hasn't previously been
// extracted, and associates it with `expr` in the `type_of` table.
func extractTypeOf(p *Profile, expr ast.Expr, lbl Label) {
	// Look up the type information for the given expression.
	tp := typeOf(p, expr)

	// If the type information exists, proceed to extraction and storage.
	if tp == nil {
		return
	}

	// Extract the type information and obtain a label for it.
	tplbl, extracted := extractType(p, tp)
	if !extracted {
		return
	}

	// Store the association between the expression label and the extracted type label
	// in the `type_of` table.
	typeOfID := util.GetIDFromDigest(fmt.Sprintf("%v#expr:%v", p.Path, lbl.ID), "TypeOf")
	p.StoreTable(&orm.TypeOf{
		Oid:  typeOfID,
		Expr: lbl.ID,
		Tp:   tplbl.ID,
	})
}

// extractType extracts type information for `tp` and returns its associated label.
// Types are only extracted once, so the second time `extractType` is invoked it simply returns the label.
func extractType(p *Profile, tp types.Type) (Label, bool) {
	// Retrieve the existing label for the type if it has already been processed.
	lbl, exists := getTypeLabel(p, tp)
	if exists {
		// Type has already been processed, return the existing label.
		return lbl, true
	}

	// Determine the kind of type and process accordingly.
	var kind int
	var ok = true

	switch tp := tp.(type) {
	case *types.Basic:
		// Handle basic types.
		kind = processBasicType(p, tp, lbl)
	case *types.Array:
		// Handle array types.
		kind = processArrayType(p, tp, lbl)
	case *types.Slice:
		// Handle slice types.
		kind = processSliceType(p, tp, lbl)
	case *types.Struct:
		// Handle struct types.
		kind = processStructType(p, tp, lbl)
	case *types.Pointer:
		// Handle pointer types.
		kind = processPointerType(p, tp, lbl)
	case *types.Interface:
		// Handle interface types.
		kind = processInterfaceType(p, tp, lbl)
	case *types.Tuple:
		// Handle tuple types.
		kind = processTupleType(p, tp, lbl)
	case *types.Signature:
		// Handle function signature types.
		kind = processSignatureType(p, tp, lbl)
	case *types.Map:
		// Handle map types.
		kind = processMapType(p, tp, lbl)
	case *types.Chan:
		// Handle channel types.
		kind = processChanType(p, tp, lbl)
	case *types.Named:
		// Handle named types.
		kind = processNamedType(p, tp, lbl)
	case *types.TypeParam:
		// Handle type parameter types.
		kind, ok = processTypeParamType(p, tp, lbl)
		if !ok {
			// If the processing of the type parameter was not successful,
			// return the label and false.
			return lbl, false
		}
	case *types.Union:
		// Handle union types.
		kind = processUnionType(p, tp, lbl)
	default:
		// Log and exit if the type is unknown.
		log.Fatalf("unexpected type %T", tp)
	}

	// Store the general type information now that specific processing is complete.
	storeGeneralTypeInfo(p, tp, lbl, kind)

	return lbl, ok
}

// processBasicType handles the extraction of basic types.
func processBasicType(p *Profile, tp *types.Basic, lbl Label) int {
	branch := orm.BasicTypes[tp.Kind()]
	if branch == nil {
		log.Fatalf("unknown basic type %v", tp.Kind())
	}
	return branch.Index()
}

// processArrayType handles the extraction of array types.
func processArrayType(p *Profile, tp *types.Array, lbl Label) int {
	kind := orm.ArrayType.Index()
	p.StoreTable(&orm.ArrayLength{
		Oid:    util.GetIDFromDigest(fmt.Sprintf("%v#type:%v", p.Path, lbl.ID), "ArrayLength"),
		FileId: p.Labeler.GetFileLabel().ID,
		Tp:     lbl.ID,
		Len:    tp.Len(),
	})
	extractElementType(p, lbl, tp.Elem())
	return kind
}

// processSliceType handles the extraction of slice types.
func processSliceType(p *Profile, tp *types.Slice, lbl Label) int {
	kind := orm.SliceType.Index()
	extractElementType(p, lbl, tp.Elem())
	return kind
}

// processStructType handles the extraction of struct types.
func processStructType(p *Profile, tp *types.Struct, lbl Label) int {
	kind := orm.StructType.Index()
	for i := 0; i < tp.NumFields(); i++ {
		field := tp.Field(i)

		// ensure the field is associated with a label - note that
		// struct fields do not have a parent scope, so they are not
		// dealt with by `extractScopes`
		fieldlbl, exists := p.Labeler.FieldID(field, i, lbl)
		if !exists {
			extractObject(p, field, fieldlbl)
		}

		p.StoreTable(&orm.FieldStruct{
			Oid:    fieldlbl.ID,
			Struct: lbl.ID,
		})

		name := field.Name()
		if field.Embedded() {
			name = ""
		}
		extractComponentType(p, lbl, i, name, field.Type())
	}
	return kind
}

// processPointerType handles the extraction of pointer types.
func processPointerType(p *Profile, tp *types.Pointer, lbl Label) int {
	kind := orm.PointerType.Index()
	extractBaseType(p, lbl, tp.Elem())
	return kind
}

// processInterfaceType handles the extraction of interface types.
func processInterfaceType(p *Profile, tp *types.Interface, lbl Label) int {
	kind := orm.InterfaceType.Index()
	for i := 0; i < tp.NumMethods(); i++ {
		meth := tp.Method(i)

		extractMethod(p, meth)

		extractComponentType(p, lbl, i, meth.Name(), meth.Type())
	}
	for i := 0; i < tp.NumEmbeddeds(); i++ {
		component := tp.EmbeddedType(i)
		if isNonUnionTypeSetLiteral(component) {
			component = createUnionFromType(component)
		}
		extractComponentType(p, lbl, -(i + 1), "", component)
	}
	return kind
}

// processTupleType handles the extraction of tuple types.
func processTupleType(p *Profile, tp *types.Tuple, lbl Label) int {
	kind := orm.TupleType.Index()
	for i := 0; i < tp.Len(); i++ {
		extractComponentType(p, lbl, i, "", tp.At(i).Type())
	}
	return kind
}

// processSignatureType handles the extraction of function signature types.
func processSignatureType(p *Profile, tp *types.Signature, lbl Label) int {
	kind := orm.SignatureType.Index()
	params, results := tp.Params(), tp.Results()
	if params != nil {
		for i := 0; i < params.Len(); i++ {
			params := params.At(i)
			extractComponentType(p, lbl, i+1, "", params.Type())
		}
	}
	if results != nil {
		for i := 0; i < results.Len(); i++ {
			result := results.At(i)
			extractComponentType(p, lbl, -(i + 1), "", result.Type())
		}
	}
	if tp.Variadic() {
		p.StoreTable(&orm.Variadic{
			Oid:            util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "Variadic"),
			AssociatedNode: lbl.ID,
		})
	}
	return kind
}

// processMapType handles the extraction of map types.
func processMapType(p *Profile, tp *types.Map, lbl Label) int {
	kind := orm.MapType.Index()
	extractKeyType(p, lbl, tp.Key())
	extractElementType(p, lbl, tp.Elem())
	return kind
}

// processChanType handles the extraction of channel types.
func processChanType(p *Profile, tp *types.Chan, lbl Label) int {
	kind := orm.ChanTypes[tp.Dir()].Index()
	extractElementType(p, lbl, tp.Elem())
	return kind
}

// processNamedType handles the extraction of named types.
func processNamedType(p *Profile, tp *types.Named, lbl Label) int {
	kind := orm.NamedType.Index()
	origintp := tp.Origin()
	p.StoreTable(&orm.TypeName{
		Oid:  lbl.ID,
		Name: tp.Obj().Name(),
	})
	underlying := origintp.Underlying()
	extractUnderlyingType(p, lbl, underlying)
	trackInstantiatedStructFields(p, tp, origintp)

	entitylbl, exists := p.Labeler.LookupObjectID(origintp.Obj(), lbl)
	if entitylbl == InvalidLabel {
		log.Printf("Omitting type-object binding for unknown object %v.\n", origintp.Obj())
	} else {
		if !exists {
			extractObject(p, origintp.Obj(), entitylbl)
		}
		p.StoreTable(&orm.TypeObject{
			Oid:    lbl.ID,
			Object: entitylbl.ID,
		})
	}

	// ensure all methods have labels - note that methods do not have a
	// parent scope, so they are not dealt with by `extractScopes`
	for i := 0; i < origintp.NumMethods(); i++ {
		meth := origintp.Method(i)

		extractMethod(p, meth)
	}

	// associate all methods of underlying interface with this type
	if underlyingInterface, ok := underlying.(*types.Interface); ok {
		for i := 0; i < underlyingInterface.NumMethods(); i++ {
			methlbl := extractMethod(p, underlyingInterface.Method(i))
			p.StoreTable(&orm.MethodHost{
				Oid:    util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, methlbl.ID), "MethodHost"),
				Method: methlbl.ID,
				Host:   lbl.ID,
			})
		}
	}
	return kind
}

// processTypeParamType handles the extraction of type parameter types.
// It returns the kind of type and a bool indicating if the processing was successful.
func processTypeParamType(p *Profile, tp *types.TypeParam, lbl Label) (int, bool) {
	kind := orm.TypeParamType.Index()
	parentlbl := getTypeParamParentLabel(p, tp)

	// If the parent label is invalid, return false to indicate failure.
	if parentlbl == InvalidLabel {
		return kind, false
	}

	// Extract the constraint type and get its label.
	constraintLabel, _ := extractType(p, tp.Constraint())

	// Store information about the type parameter in the `orm.TypeParam` table.
	p.StoreTable(&orm.TypeParam{
		Oid:    util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "TypeParam"),
		Tp:     lbl.ID,
		Name:   tp.Obj().Name(),
		Bound:  constraintLabel.ID,
		Parent: parentlbl.ID,
		Index:  tp.Index(),
	})

	// Return the kind of type and true to indicate success.
	return kind, true
}

// processUnionType handles the extraction of union types.
func processUnionType(p *Profile, tp *types.Union, lbl Label) int {
	kind := orm.TypeSetLiteral.Index()
	for i := 0; i < tp.Len(); i++ {
		term := tp.Term(i)
		tildeStr := ""
		if term.Tilde() {
			tildeStr = "~"
		}
		extractComponentType(p, lbl, i, tildeStr, term.Type())
	}
	return kind
}

// storeGeneralTypeInfo stores the common type information in the ORM table after
// the type-specific processing has been completed.
func storeGeneralTypeInfo(p *Profile, tp types.Type, lbl Label, kind int) {
	rawString := trimRootSuffix(p, tp.String())
	formatTypeString := trimRootSuffix(p, getTypeString(tp))

	// Store the general type information in the `orm.Type` table.
	p.StoreTable(&orm.Type{
		Oid:          lbl.ID,
		Kind:         kind,
		FormatString: formatTypeString,
		RawString:    rawString,
	})
}

func trimRootSuffix(p *Profile, s string) string {
	return strings.ReplaceAll(s, fmt.Sprintf("_%s/", p.SrcRoot), "")
}

type typeWriter struct {
	buf     *bytes.Buffer
	tparams *types.TypeParamList // local type parameters
}

func newTypeWriter(buf *bytes.Buffer) *typeWriter {
	return &typeWriter{buf, nil}
}

func getTypeString(tp types.Type) string {
	var buf bytes.Buffer
	w := newTypeWriter(&buf)
	w.typ(tp)
	return buf.String()
}

func (w *typeWriter) byte(b byte) {
	w.buf.WriteByte(b)
	if b == ',' || b == ';' {
		w.buf.WriteByte(' ')
	}
}

func (w *typeWriter) string(s string) {
	w.buf.WriteString(s)
}

func (w *typeWriter) typ(typ types.Type) {
	switch t := typ.(type) {
	case *types.Signature:
		w.string("func")
		w.signature(t)
	default:
		// Skip other Types.
		// Just treat like as the above context as 'rawString'
		w.string(t.String())
	}
}

func (w *typeWriter) tParamList(list []*types.TypeParam) {
	w.byte('[')
	var prev types.Type
	for i, tpar := range list {
		// Determine the type parameter and its constraint.
		// list is expected to hold type parameter names
		if tpar == nil {
			continue
		}
		if i > 0 {
			if tpar.Constraint() != prev {
				// bound changed - write previous one before advancing
				w.byte(' ')
				w.typ(prev)
			}
			w.byte(',')
		}
		prev = tpar.Constraint()
		w.typ(tpar)
	}
	if prev != nil {
		w.byte(' ')
		w.typ(prev)
	}
	w.byte(']')
}

func (w *typeWriter) tuple(tup *types.Tuple, variadic bool) {
	// fill a filed, just keep type info
	w.byte('(')
	if tup != nil {
		for i := 0; i < tup.Len(); i++ {
			if i > 0 {
				w.byte(',')
			}
			v := tup.At(i)
			typ := v.Type()
			if variadic && i == tup.Len()-1 {
				if s, ok := typ.(*types.Slice); ok {
					w.string("...")
					typ = s.Elem()
				} else {
					// special case:
					// append(s, "foo"...) leads to signature func([]byte, string...)
					if t, _ := typ.Underlying().(*types.Basic); t == nil || t.Kind() != types.String {
						continue
					}
					w.typ(typ)
					w.string("...")
					continue
				}
			}
			w.typ(typ)
		}
	}
	w.byte(')')
}

func list(l *types.TypeParamList) []*types.TypeParam {
	if l == nil {
		return nil
	}
	var rlist []*types.TypeParam
	for i := 0; i < l.Len(); i++ {
		rlist = append(rlist, l.At(i))
	}
	return rlist
}

func (w *typeWriter) signature(sig *types.Signature) {
	if sig.TypeParams().Len() != 0 {
		w.tParamList(list(sig.TypeParams()))
	}

	w.tuple(sig.Params(), sig.Variadic())

	n := sig.Results().Len()
	if n == 0 {
		// no result
		return
	}

	w.byte(' ')
	if n == 1 && (sig.Results().At(0).Name() == "") {
		// single unnamed result (if type hashing, name must be ignored)
		w.typ(sig.Results().At(0).Type())
		return
	}

	// multiple or named result(s)
	w.tuple(sig.Results(), false)
}

// extractMethod extracts a method `meth` and emits it to the objects table, then returns its label
func extractMethod(p *Profile, meth *types.Func) Label {
	// get the receiver type of the method
	recvtyp := meth.Type().(*types.Signature).Recv().Type()
	recvtyplbl, populated := extractType(p, recvtyp) // ensure receiver type has been extracted

	// if the meth has type params, should do a populating before actually extracting it
	if !populated {
		log.Printf("\t populateTypeParamParents '%s' filePath:%s", recvtyp.String(), p.Path)
		// Populate type parameter parents for methods. They do not appear as
		// objects in any scope, so they have to be dealt with separately here.
		populateTypeParamParents(p, meth.Type().(*types.Signature).TypeParams(), meth)
		populateTypeParamParents(p, meth.Type().(*types.Signature).RecvTypeParams(), meth)

		// extract type params and
		// update recvtyplbl value
		recvtyplbl, populated = extractType(p, recvtyp)

		if !populated {
			util.PrintTracebackAfterDetectedBadEntrance(2,
				fmt.Errorf("extractMethod() can not populate for '%s' filePath:%s", recvtyp.String(), p.Path))
		}
	}

	// if the method label does not exist, extract it
	methlbl, exists := p.Labeler.MethodID(meth, recvtyplbl)
	if !exists {
		// Populate type parameter parents for methods. They do not appear as
		// objects in any scope, so they have to be dealt with separately here.
		populateTypeParamParents(p, meth.Type().(*types.Signature).TypeParams(), meth)
		populateTypeParamParents(p, meth.Type().(*types.Signature).RecvTypeParams(), meth)
		extractObject(p, meth, methlbl)
	}

	return methlbl
}

// extractObjectKindAndDebugInfo determines the kind and debug information for the provided object.
func extractObjectKindAndDebugInfo(obj types.Object, isBuiltin bool) (int, string) {
	switch obj := obj.(type) {
	case *types.PkgName:
		return orm.PkgObjectType.Index(), orm.PkgObjectType.String()
	case *types.TypeName:
		if isBuiltin {
			return orm.BuiltinTypeObjectType.Index(), orm.BuiltinTypeObjectType.String()
		}
		return orm.DeclTypeObjectType.Index(), orm.DeclTypeObjectType.String()
	case *types.Const:
		if isBuiltin {
			return orm.BuiltinConstObjectType.Index(), orm.BuiltinConstObjectType.String()
		}
		return orm.DeclConstObjectType.Index(), orm.DeclConstObjectType.String()
	case *types.Nil:
		return orm.BuiltinConstObjectType.Index(), orm.BuiltinConstObjectType.String()
	case *types.Var:
		return orm.DeclVarObjectType.Index(), orm.DeclVarObjectType.String()
	case *types.Builtin:
		return orm.BuiltinFuncObjectType.Index(), orm.BuiltinFuncObjectType.String()
	case *types.Func:
		return orm.DeclFuncObjectType.Index(), orm.DeclFuncObjectType.String()
	case *types.Label:
		return orm.LabelObjectType.Index(), orm.LabelObjectType.String()
	default:
		log.Fatalf("unknown object of type %T", obj)
		panic("unreachable") // for static analyzers
	}
}

// extractMethodReceiver handles the extraction of method receiver information.
func extractMethodReceiver(p *Profile, obj types.Object, lbl Label) {
	sig, ok := obj.Type().(*types.Signature)
	if !ok || sig.Recv() == nil {
		return // Not a method or no receiver, so nothing to do.
	}

	recv := sig.Recv()
	recvlbl, exists := p.Labeler.ReceiverObjectID(recv, lbl)
	if !exists {
		extractObject(p, recv, recvlbl) // Extract the receiver object.
	}

	p.StoreTable(&orm.MethodReceiver{
		Oid:      util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "MethodReceiver"),
		Method:   lbl.ID,
		Receiver: recvlbl.ID,
	})
}

// extractObject extracts a single object and emits it to the objects table.
func extractObject(p *Profile, obj types.Object, lbl Label) {
	name := obj.Name()
	isBuiltin := obj.Parent() == types.Universe

	kind, debuginfo := extractObjectKindAndDebugInfo(obj, isBuiltin)

	p.StoreTable(&orm.Object{
		Oid:       lbl.ID,
		Kind:      kind,
		Name:      name,
		DebugInfo: obj.Type().String() + debuginfo,
	})

	// For methods, additionally extract information about the receiver.
	extractMethodReceiver(p, obj, lbl)
}

// ForEachObject iterates over all objects labeled by this labeler, and invokes
// the provided callback with a writer for the trap file, the object, and its
// label. It returns true if any extra objects were labeled and false otherwise.
func (p *Profile) ForEachObject(cb func(*Profile, types.Object, Label)) bool {
	// copy the objects into an array so that our behaviour is deterministic even
	// if `cb` adds any new objects
	i := 0
	objects := make([]types.Object, len(p.Labeler.ObjectLabels))
	for k := range p.Labeler.ObjectLabels {
		objects[i] = k
		i++
	}

	for _, object := range objects {
		//log.Printf("\t %s %s [%v/%v] %v\n", cb, p.Path, idx, len(objects), object.Name())
		cb(p, object, p.Labeler.ObjectLabels[object])
	}
	return len(p.Labeler.ObjectLabels) != len(objects)
}

// getTypeLabelKey generates a unique key for the given type to be used for label lookup or creation.
func getTypeLabelKey(p *Profile, tp types.Type, lbl Label) (string, bool) {
	buildTypeKey := func(typeStr string, parts ...string) (string, bool) {
		return fmt.Sprintf("%s,%s;%s", p.Path, strings.Join(parts, ","), typeStr), true
	}

	switch tp := tp.(type) {
	case *types.Basic:
		return buildTypeKey("basictype", fmt.Sprint(tp.Kind()), tp.String())
	case *types.Array:
		elem, _ := extractType(p, tp.Elem())
		return buildTypeKey("arraytype", fmt.Sprint(tp.Len()), elem.String(), tp.String())
	case *types.Slice:
		elem, _ := extractType(p, tp.Elem())
		return buildTypeKey("slicetype", elem.String(), tp.String())
	case *types.Struct:
		var fieldParts []string
		for i := 0; i < tp.NumFields(); i++ {
			field := tp.Field(i)
			fieldTypeLbl, _ := extractType(p, field.Type())
			name := field.Name()
			if field.Embedded() {
				name = ""
			}
			fieldParts = append(fieldParts, fmt.Sprintf("%s,{%s},%s", name, fieldTypeLbl, util.EscapeTrapSpecialChars(tp.Tag(i))))
		}
		return buildTypeKey("structtype", strings.Join(fieldParts, ","))
	case *types.Pointer:
		base, _ := extractType(p, tp.Elem())
		return buildTypeKey("pointertype", base.String(), tp.String())
	case *types.Interface:
		var methodParts, embeddedParts []string
		for i := 0; i < tp.NumMethods(); i++ {
			method := tp.Method(i)
			methodLabel, _ := extractType(p, method.Type())
			methodParts = append(methodParts, fmt.Sprint(method.Id()), methodLabel.String())
		}
		for i := 0; i < tp.NumEmbeddeds(); i++ {
			embeddedTypeLabel, _ := extractType(p, tp.EmbeddedType(i))
			embeddedParts = append(embeddedParts, embeddedTypeLabel.String())
		}
		compStr := strings.Join(methodParts, ",") + ";" + strings.Join(embeddedParts, ",")
		if tp.IsComparable() {
			compStr += ";comparable"
		}
		return buildTypeKey("interfacetype", compStr)
	case *types.Tuple:
		var tupleParts []string
		for i := 0; i < tp.Len(); i++ {
			tuplePartLabel, _ := extractType(p, tp.At(i).Type())
			tupleParts = append(tupleParts, tuplePartLabel.String())
		}
		return buildTypeKey("tupletype", strings.Join(tupleParts, ","))
	case *types.Signature:
		var paramsParts, resultsParts []string
		params, results := tp.Params(), tp.Results()
		if params != nil {
			for i := 0; i < params.Len(); i++ {
				paramLabel, _ := extractType(p, params.At(i).Type())
				paramId := params.At(i).Id()
				paramsParts = append(paramsParts, fmt.Sprintf("{%s,%s}", paramLabel, paramId))
			}
		}
		if results != nil {
			for i := 0; i < results.Len(); i++ {
				resultLabel, _ := extractType(p, results.At(i).Type())
				resultId := results.At(i).Id()
				resultsParts = append(resultsParts, fmt.Sprintf("{%s,%s}", resultLabel, resultId))
			}
		}
		variadicPart := ""
		if tp.Variadic() {
			variadicPart = ";variadic"
		}
		return buildTypeKey("signaturetype", strings.Join(paramsParts, ","), ";", strings.Join(resultsParts, ","), variadicPart)
	case *types.Map:
		key, _ := extractType(p, tp.Key())
		value, _ := extractType(p, tp.Elem())
		return buildTypeKey("maptype", key.String(), value.String())
	case *types.Chan:
		dir := tp.Dir()
		elem, _ := extractType(p, tp.Elem())
		return buildTypeKey("chantype", fmt.Sprint(dir), elem.String())
	case *types.Named:
		originType := tp.Origin()
		entityLabel, exists := p.Labeler.LookupObjectID(originType.Obj(), lbl)
		if entityLabel == InvalidLabel {
			panic(fmt.Sprintf("Cannot construct label for named type %v (underlying object is %v).\n", originType, originType.Obj()))
		}
		if !exists {
			extractObject(p, originType.Obj(), entityLabel)
		}
		return buildTypeKey("namedtype", entityLabel.String())
	case *types.TypeParam:
		parentLabel := getTypeParamParentLabel(p, tp)
		if parentLabel == InvalidLabel {
			return InvalidLabel.String(), false
		}
		return buildTypeKey("typeparamtype", parentLabel.String(), tp.Obj().Name(), tp.String())
	case *types.Union:
		var unionParts []string
		for i := 0; i < tp.Len(); i++ {
			term := tp.Term(i)
			termLabel, _ := extractType(p, tp.Term(i).Type())
			if term.Tilde() {
				unionParts = append(unionParts, "~"+termLabel.String())
			} else {
				unionParts = append(unionParts, termLabel.String())
			}
		}
		return buildTypeKey("uniontype", strings.Join(unionParts, "|"))
	default:
		log.Fatalf("(getTypeLabelKey) unexpected type %T", tp)
		return "", false
	}
}

// createTypeLabel creates a new label for the given type.
func createTypeLabel(p *Profile, tp types.Type, label Label) Label {
	key, ok := getTypeLabelKey(p, tp, label)
	if ok {
		lbl := p.Labeler.GlobalID(key)
		p.Labeler.TypeLabels[tp] = lbl
		return lbl
	}
	return InvalidLabel
}

// getTypeLabel looks up the label associated with `tp`, creating a new label if it does not have one yet.
// The second result indicates whether the label already existed.
func getTypeLabel(p *Profile, tp types.Type) (Label, bool) {
	lbl, exists := p.Labeler.TypeLabels[tp]
	if exists {
		return lbl, true
	}
	return createTypeLabel(p, tp, lbl), false
}

// extractKeyType extracts `key` as the key type of the map type `mp`
func extractKeyType(p *Profile, mp Label, key types.Type) {
	p.StoreTable(&orm.KeyType{
		Oid: util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, mp.ID), "KeyType"),
		Map: mp.ID,
		Tp:  func(p *Profile, key types.Type) int64 { lb, _ := extractType(p, key); return lb.ID }(p, key),
	})
}

// extractElementType extracts `element` as the element type of the container type `container`
func extractElementType(p *Profile, container Label, element types.Type) {
	p.StoreTable(&orm.ElementType{
		Oid:       util.GetIDFromDigest(fmt.Sprintf("%vcontaineer#%v", p.Path, container.ID), "ElementType"),
		Container: container.ID,
		Tp:        func(p *Profile, element types.Type) int64 { lb, _ := extractType(p, element); return lb.ID }(p, element),
	})
}

// extractBaseType extracts `base` as the base type of the pointer type `ptr`
func extractBaseType(p *Profile, ptr Label, base types.Type) {
	p.StoreTable(&orm.BaseType{
		Oid: util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, ptr.ID), "BaseType"),
		Ptr: ptr.ID,
		Tp:  func(p *Profile, base types.Type) int64 { lb, _ := extractType(p, base); return lb.ID }(p, base),
	})
}

// extractUnderlyingType extracts `underlying` as the underlying type of the
// named type `named`
func extractUnderlyingType(p *Profile, named Label, underlying types.Type) {
	p.StoreTable(&orm.UnderlyingType{
		Oid:   util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, named.ID), "UnderlyingType"),
		Named: named.ID,
		Tp:    func(p *Profile, underlying types.Type) int64 { lb, _ := extractType(p, underlying); return lb.ID }(p, underlying),
	})
}

// extractComponentType extracts `component` as the `idx`th component type of `parent` with name `name`
func extractComponentType(p *Profile, parent Label, idx int, name string, component types.Type) {
	p.StoreTable(&orm.ComponentType{
		Oid:    util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, parent.ID), "ComponentType"),
		Parent: parent.ID,
		Index:  idx,
		Name:   name,
		Tp:     func(p *Profile, component types.Type) int64 { lb, _ := extractType(p, component); return lb.ID }(p, component),
	})
}

func extractExpr(p *Profile, expr ast.Expr, parent Label, idx int) {
	if expr == nil {
		return
	}
	lbl := p.Labeler.LocalID(expr) //Cautious here!
	extractTypeOf(p, expr, lbl)

	var kind int
	var debugInfo string
	switch expr := expr.(type) {
	case *ast.BadExpr:
		kind = orm.BadExpr.Index()
		debugInfo = orm.BadExpr.String()
	case *ast.Ident:
		if expr == nil {
			return
		}
		kind = orm.IdentExpr.Index()
		debugInfo = orm.IdentExpr.String()

		p.StoreTable(&orm.Literal{
			Oid:   util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "Literal"),
			Expr:  lbl.ID,
			Value: expr.Name,
			Raw:   expr.Name,
		})
		def := p.Package.TypesInfo.Defs[expr]
		if def != nil {
			defTyp, _ := extractType(p, def.Type())
			objlbl, exists := p.Labeler.LookupObjectID(def, defTyp)
			if objlbl == InvalidLabel {
				log.Printf("Omitting def binding to unknown object %v", def)
			} else {
				if !exists {
					extractObject(p, def, objlbl)
				}
				p.StoreTable(&orm.Def{
					Oid:    util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "Def"),
					Ident:  lbl.ID,
					Object: objlbl.ID,
				})
			}
		}
		use := getObjectBeingUsed(p, expr)
		if use != nil {
			useTyp, _ := extractType(p, use.Type())
			objlbl, exists := p.Labeler.LookupObjectID(use, useTyp)
			if objlbl == InvalidLabel {
				log.Printf("Omitting use binding to unknown object %v", use)
			} else {
				if !exists {
					extractObject(p, use, objlbl)
				}
				p.StoreTable(&orm.Uses{
					Oid:    util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "Uses"),
					Ident:  lbl.ID,
					Object: objlbl.ID,
				})
			}
		}
	case *ast.Ellipsis:
		if expr == nil {
			return
		}
		kind = orm.EllipsisExpr.Index()
		debugInfo = orm.EllipsisExpr.String()

		extractExpr(p, expr.Elt, lbl, 0)
	case *ast.BasicLit:
		if expr == nil {
			return
		}
		value := ""
		switch expr.Kind {
		case token.INT:
			ival, _ := strconv.ParseInt(expr.Value, 0, 64)
			value = strconv.FormatInt(ival, 10)
			kind = orm.IntLitExpr.Index()
			debugInfo = orm.IntLitExpr.String()

		case token.FLOAT:
			value = expr.Value
			kind = orm.FloatLitExpr.Index()
			debugInfo = orm.FloatLitExpr.String()

		case token.IMAG:
			value = expr.Value
			kind = orm.ImagLitExpr.Index()
			debugInfo = orm.ImagLitExpr.String()

		case token.CHAR:
			value, _ = strconv.Unquote(expr.Value)
			kind = orm.CharLitExpr.Index()
			debugInfo = orm.CharLitExpr.String()

		case token.STRING:
			value, _ = strconv.Unquote(expr.Value)
			kind = orm.StringLitExpr.Index()
			debugInfo = orm.StringLitExpr.String()

		default:
			log.Fatalf("unknown literal kind %v", expr.Kind)
		}
		p.StoreTable(&orm.Literal{
			Oid:   util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "Literal"),
			Expr:  lbl.ID,
			Value: value,
			Raw:   expr.Value,
		})
	case *ast.FuncLit:
		if expr == nil {
			return
		}
		kind = orm.FuncLitExpr.Index()
		debugInfo = orm.FuncLitExpr.String()

		extractExpr(p, expr.Type, lbl, 0)
		extractStmt(p, expr.Body, lbl, 1)
	case *ast.CompositeLit:
		if expr == nil {
			return
		}
		kind = orm.CompositeLitExpr.Index()
		debugInfo = orm.CompositeLitExpr.String()

		extractExpr(p, expr.Type, lbl, 0)
		extractExprs(p, expr.Elts, lbl, 1, 1)
	case *ast.ParenExpr:
		if expr == nil {
			return
		}
		kind = orm.ParenExpr.Index()
		debugInfo = orm.ParenExpr.String()

		extractExpr(p, expr.X, lbl, 0)
	case *ast.SelectorExpr:
		if expr == nil {
			return
		}
		kind = orm.SelectorExpr.Index()
		debugInfo = orm.SelectorExpr.String()

		extractExpr(p, expr.X, lbl, 0)
		extractExpr(p, expr.Sel, lbl, 1)
	case *ast.IndexExpr:
		if expr == nil {
			return
		}
		typeofx := typeOf(p, expr.X)
		if typeofx == nil {
			// We are missing type information for `expr.X`, so we cannot
			// determine whether this is a generic function instantiation
			// or not.
			kind = orm.IndexExpr.Index()
			debugInfo = orm.IndexExpr.String()
		} else {
			if _, ok := typeofx.Underlying().(*types.Signature); ok {
				kind = orm.GenericFunctionInstantiationExpr.Index()
				debugInfo = orm.GenericFunctionInstantiationExpr.String()
			} else {
				// Can't distinguish between actual index expressions (into a
				// map, array, slice, string or pointer to array) and generic
				// type specialization expression, so we do it later in QL.
				kind = orm.IndexExpr.Index()
				debugInfo = orm.IndexExpr.String()
			}
		}
		extractExpr(p, expr.X, lbl, 0)
		extractExpr(p, expr.Index, lbl, 1)
	case *ast.IndexListExpr:
		if expr == nil {
			return
		}
		typeofx := typeOf(p, expr.X)
		if typeofx == nil {
			// We are missing type information for `expr.X`, so we cannot
			// determine whether this is a generic function instantiation
			// or not.
			kind = orm.GenericTypeInstantiationExpr.Index()
			debugInfo = orm.GenericTypeInstantiationExpr.String()
		} else {
			if _, ok := typeofx.Underlying().(*types.Signature); ok {
				kind = orm.GenericFunctionInstantiationExpr.Index()
				debugInfo = orm.GenericFunctionInstantiationExpr.String()
			} else {
				kind = orm.GenericTypeInstantiationExpr.Index()
				debugInfo = orm.GenericTypeInstantiationExpr.String()
			}
		}
		extractExpr(p, expr.X, lbl, 0)
		extractExprs(p, expr.Indices, lbl, 1, 1)
	case *ast.SliceExpr:
		if expr == nil {
			return
		}
		kind = orm.SliceExpr.Index()
		debugInfo = orm.SliceExpr.String()

		extractExpr(p, expr.X, lbl, 0)
		extractExpr(p, expr.Low, lbl, 1)
		extractExpr(p, expr.High, lbl, 2)
		extractExpr(p, expr.Max, lbl, 3)
	case *ast.TypeAssertExpr:
		if expr == nil {
			return
		}
		kind = orm.TypeAssertExpr.Index()
		debugInfo = orm.TypeAssertExpr.String()

		extractExpr(p, expr.X, lbl, 0)
		extractExpr(p, expr.Type, lbl, 1)
	case *ast.CallExpr:
		if expr == nil {
			return
		}
		kind = orm.CallOrConversionExpr.Index()
		debugInfo = orm.CallOrConversionExpr.String()

		extractExpr(p, expr.Fun, lbl, 0)
		extractExprs(p, expr.Args, lbl, 1, 1)
		if expr.Ellipsis.IsValid() {
			p.StoreTable(&orm.HasEllipsis{
				Oid:                    util.GetIDFromDigest(fmt.Sprintf("%v#expr#%v", p.Path, lbl.ID), "HasEllipsis"),
				CallOrConversionExprId: lbl.ID,
			})
		}
	case *ast.StarExpr:
		if expr == nil {
			return
		}
		kind = orm.StarExpr.Index()
		debugInfo = orm.StarExpr.String()

		extractExpr(p, expr.X, lbl, 0)
	case *ast.KeyValueExpr:
		if expr == nil {
			return
		}
		kind = orm.KeyValueExpr.Index()
		debugInfo = orm.KeyValueExpr.String()

		extractExpr(p, expr.Key, lbl, 0)
		extractExpr(p, expr.Value, lbl, 1)
	case *ast.UnaryExpr:
		if expr == nil {
			return
		}
		if expr.Op == token.TILDE {
			kind = orm.TypeSetLiteralExpr.Index()
			debugInfo = orm.TypeSetLiteralExpr.String()
		} else {
			tp := orm.UnaryExprs[expr.Op]
			if tp == nil {
				log.Fatalf("unsupported unary operator %s", expr.Op)
			}
			kind = tp.Index()
			debugInfo = tp.String()
		}
		extractExpr(p, expr.X, lbl, 0)
	case *ast.BinaryExpr:
		if expr == nil {
			return
		}
		_, isUnionType := typeOf(p, expr).(*types.Union)
		if expr.Op == token.OR && isUnionType {
			kind = orm.TypeSetLiteralExpr.Index()
			flattenBinaryExprTree(p, expr, lbl, 0)
		} else {
			tp := orm.BinaryExprs[expr.Op]
			if tp == nil {
				log.Fatalf("unsupported binary operator %s", expr.Op)
			}
			kind = tp.Index()
			debugInfo = tp.String()

			extractExpr(p, expr.X, lbl, 0)
			extractExpr(p, expr.Y, lbl, 1)
		}
	case *ast.ArrayType:
		if expr == nil {
			return
		}
		kind = orm.ArrayTypeExpr.Index()
		debugInfo = orm.ArrayTypeExpr.String()

		extractExpr(p, expr.Len, lbl, 0)
		extractExpr(p, expr.Elt, lbl, 1)
	case *ast.StructType:
		if expr == nil {
			return
		}
		kind = orm.StructTypeExpr.Index()
		extractFields(p, expr.Fields, lbl, 0, 1, 0)
	case *ast.FuncType:
		if expr == nil {
			return
		}
		kind = orm.FuncTypeExpr.Index()
		debugInfo = orm.FuncTypeExpr.String()

		extractFields(p, expr.Params, lbl, 0, 1, 1)
		extractFields(p, expr.Results, lbl, -1, -1, 2)
		emitScopeNodeInfo(p, expr, lbl)
	case *ast.InterfaceType:
		if expr == nil {
			return
		}
		kind = orm.InterfaceTypeExpr.Index()
		debugInfo = orm.InterfaceTypeExpr.String()

		makeTypeSetLiteralsUnionTyped(p, expr.Methods)
		extractFields(p, expr.Methods, lbl, 0, 1, 3)
	case *ast.MapType:
		if expr == nil {
			return
		}
		kind = orm.MapTypeExpr.Index()
		debugInfo = orm.MapTypeExpr.String()

		extractExpr(p, expr.Key, lbl, 0)
		extractExpr(p, expr.Value, lbl, 1)
	case *ast.ChanType:
		if expr == nil {
			return
		}
		tp := orm.ChanTypeExprs[expr.Dir]
		if tp == nil {
			log.Fatalf("unsupported channel direction %v", expr.Dir)
		}
		kind = tp.Index()
		debugInfo = tp.String()

		extractExpr(p, expr.Value, lbl, 0)
	default:
		log.Fatalf("unknown expression of type %T", expr)
	}
	p.StoreTable(&orm.Expr{
		Oid:       lbl.ID,
		FileId:    p.Labeler.GetFileLabel().ID,
		Kind:      kind,
		ParentId:  parent.ID,
		Idx:       idx,
		DebugInfo: debugInfo,
	})
	extractNodeLocation(p, expr, lbl)
	extractValueOf(p, expr, lbl)
}

// extractValueOf looks up the value of `expr`, and associates it with `expr` in
// the `consts` table
func extractValueOf(p *Profile, expr ast.Expr, lbl Label) {
	tpVal := p.Package.TypesInfo.Types[expr]

	if tpVal.Value != nil {
		// if Value is non-nil, the expression has a constant value

		// note that string literals in import statements do not have an associated
		// Value and so do not get added to the table

		var value string
		exact := tpVal.Value.ExactString()
		switch tpVal.Value.Kind() {
		case constant.String:
			// we need to unquote strings
			value = constant.StringVal(tpVal.Value)
			exact = constant.StringVal(tpVal.Value)
		case constant.Float:
			flval, _ := constant.Float64Val(tpVal.Value)
			value = fmt.Sprintf("%.20g", flval)
		case constant.Complex:
			rl, _ := constant.Float64Val(constant.Real(tpVal.Value))
			img, _ := constant.Float64Val(constant.Imag(tpVal.Value))
			value = fmt.Sprintf("(%.20g + %.20gi)", rl, img)
		default:
			value = tpVal.Value.ExactString()
		}

		p.StoreTable(&orm.ConstValue{
			Oid:   util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "ConstValue"),
			Expr:  lbl.ID,
			Value: value,
			Exact: exact,
		})
	} else if tpVal.IsNil() {
		p.StoreTable(&orm.ConstValue{
			Oid:   util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "ConstValue"),
			Expr:  lbl.ID,
			Value: "nil",
			Exact: "nil",
		})
	}
}

// emitScopeNodeInfo associates an AST node with its induced scope, if any
func emitScopeNodeInfo(p *Profile, nd ast.Node, lbl Label) {
	scope, exists := p.Package.TypesInfo.Scopes[nd]
	if exists {
		p.StoreTable(&orm.ScopeNode{
			Oid:   util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, lbl.ID), "ScopeNode"),
			Node:  lbl.ID,
			Scope: p.Labeler.ScopeID(scope, p.Package.Types).ID,
		})
	}
}

// extractFields extracts AST information for a list of fields, which are children of
// the given parent
// `idx` is the index of the first child in the list, and `dir` is the index increment of
// each child over its preceding child (usually either 1 for assigning increasing indices, or
// -1 for decreasing indices)
// and 'tp' is type for field kind
func extractFields(p *Profile, fields *ast.FieldList, parent Label, idx int, dir int, tp int) {
	if fields == nil || fields.List == nil {
		return
	}
	for _, field := range fields.List {
		lbl := p.Labeler.LocalID(field)
		p.StoreTable(&orm.Fields{
			Oid:      lbl.ID,
			ParentId: parent.ID,
			Idx:      idx,
			Kind:     tp,
		})
		extractNodeLocation(p, field, lbl)
		if field.Names != nil {
			for i, name := range field.Names {
				extractExpr(p, name, lbl, i+1)
			}
		}
		extractExpr(p, field.Type, lbl, 0)
		extractExpr(p, field.Tag, lbl, -1)
		extractDoc(p, field.Doc, lbl)
		idx += dir
	}
}

// extractStmt extracts AST information for a given statement and all other statements or expressions
// nested inside it
func extractStmt(p *Profile, stmt ast.Stmt, parent Label, idx int) {
	if stmt == nil {
		return
	}

	lbl := p.Labeler.LocalID(stmt)
	var kind int
	var debugInfo string
	switch stmt := stmt.(type) {
	case *ast.BadStmt:
		kind = orm.BadStmtType.Index()
		debugInfo = orm.BadStmtType.String()
	case *ast.DeclStmt:
		if stmt == nil {
			return
		}
		kind = orm.DeclStmtType.Index()
		debugInfo = orm.DeclStmtType.String()

		extractDecl(p, stmt.Decl, lbl, 0)
	case *ast.EmptyStmt:
		kind = orm.EmptyStmtType.Index()
		debugInfo = orm.EmptyStmtType.String()
	case *ast.LabeledStmt:
		if stmt == nil {
			return
		}
		kind = orm.LabeledStmtType.Index()
		debugInfo = orm.LabeledStmtType.String()

		extractExpr(p, stmt.Label, lbl, 0)
		extractStmt(p, stmt.Stmt, lbl, 1)
	case *ast.ExprStmt:
		if stmt == nil {
			return
		}
		kind = orm.ExprStmtType.Index()
		debugInfo = orm.ExprStmtType.String()

		extractExpr(p, stmt.X, lbl, 0)
	case *ast.SendStmt:
		if stmt == nil {
			return
		}
		kind = orm.SendStmtType.Index()
		debugInfo = orm.SendStmtType.String()

		extractExpr(p, stmt.Chan, lbl, 0)
		extractExpr(p, stmt.Value, lbl, 1)
	case *ast.IncDecStmt:
		if stmt == nil {
			return
		}
		if stmt.Tok == token.INC {
			kind = orm.IncStmtType.Index()
			debugInfo = orm.IncStmtType.String()

		} else if stmt.Tok == token.DEC {
			kind = orm.DecStmtType.Index()
			debugInfo = orm.DecStmtType.String()

		} else {
			log.Fatalf("unsupported increment/decrement operator %v", stmt.Tok)
		}
		extractExpr(p, stmt.X, lbl, 0)
	case *ast.AssignStmt:
		if stmt == nil {
			return
		}
		tp := orm.AssignStmtTypes[stmt.Tok]
		if tp == nil {
			log.Fatalf("unsupported assignment statement with operator %v", stmt.Tok)
		}
		kind = tp.Index()
		debugInfo = tp.String()

		extractExprs(p, stmt.Lhs, lbl, -1, -1)
		extractExprs(p, stmt.Rhs, lbl, 1, 1)
	case *ast.GoStmt:
		if stmt == nil {
			return
		}
		kind = orm.GoStmtType.Index()
		debugInfo = orm.GoStmtType.String()

		extractExpr(p, stmt.Call, lbl, 0)
	case *ast.DeferStmt:
		if stmt == nil {
			return
		}
		kind = orm.DeferStmtType.Index()
		debugInfo = orm.DeferStmtType.String()

		extractExpr(p, stmt.Call, lbl, 0)
	case *ast.ReturnStmt:
		kind = orm.ReturnStmtType.Index()
		debugInfo = orm.ReturnStmtType.String()

		extractExprs(p, stmt.Results, lbl, 0, 1)
	case *ast.BranchStmt:
		if stmt == nil {
			return
		}
		switch stmt.Tok {
		case token.BREAK:
			kind = orm.BreakStmtType.Index()
			debugInfo = orm.BreakStmtType.String()

		case token.CONTINUE:
			kind = orm.ContinueStmtType.Index()
			debugInfo = orm.ContinueStmtType.String()

		case token.GOTO:
			kind = orm.GotoStmtType.Index()
			debugInfo = orm.GotoStmtType.String()

		case token.FALLTHROUGH:
			kind = orm.FallthroughStmtType.Index()
			debugInfo = orm.FallthroughStmtType.String()

		default:
			log.Fatalf("unsupported branch statement type %v", stmt.Tok)
		}
		extractExpr(p, stmt.Label, lbl, 0)
	case *ast.BlockStmt:
		if stmt == nil {
			return
		}
		kind = orm.BlockStmtType.Index()
		debugInfo = orm.BlockStmtType.String()

		extractStmts(p, stmt.List, lbl, 0, 1)
		emitScopeNodeInfo(p, stmt, lbl)
	case *ast.IfStmt:
		if stmt == nil {
			return
		}
		kind = orm.IfStmtType.Index()
		debugInfo = orm.IfStmtType.String()

		extractStmt(p, stmt.Init, lbl, 0)
		extractExpr(p, stmt.Cond, lbl, 1)
		extractStmt(p, stmt.Body, lbl, 2)
		extractStmt(p, stmt.Else, lbl, 3)
		emitScopeNodeInfo(p, stmt, lbl)
	case *ast.CaseClause:
		if stmt == nil {
			return
		}
		kind = orm.CaseClauseType.Index()
		debugInfo = orm.CaseClauseType.String()

		extractExprs(p, stmt.List, lbl, -1, -1)
		extractStmts(p, stmt.Body, lbl, 0, 1)
		emitScopeNodeInfo(p, stmt, lbl)
	case *ast.SwitchStmt:
		if stmt == nil {
			return
		}
		kind = orm.ExprSwitchStmtType.Index()
		debugInfo = orm.ExprSwitchStmtType.String()

		extractStmt(p, stmt.Init, lbl, 0)
		extractExpr(p, stmt.Tag, lbl, 1)
		extractStmt(p, stmt.Body, lbl, 2)
		emitScopeNodeInfo(p, stmt, lbl)
	case *ast.TypeSwitchStmt:
		if stmt == nil {
			return
		}
		kind = orm.TypeSwitchStmtType.Index()
		debugInfo = orm.TypeSwitchStmtType.String()

		extractStmt(p, stmt.Init, lbl, 0)
		extractStmt(p, stmt.Assign, lbl, 1)
		extractStmt(p, stmt.Body, lbl, 2)
		emitScopeNodeInfo(p, stmt, lbl)
	case *ast.CommClause:
		if stmt == nil {
			return
		}
		kind = orm.CommClauseType.Index()
		debugInfo = orm.CommClauseType.String()

		extractStmt(p, stmt.Comm, lbl, 0)
		extractStmts(p, stmt.Body, lbl, 1, 1)
		emitScopeNodeInfo(p, stmt, lbl)
	case *ast.SelectStmt:
		kind = orm.SelectStmtType.Index()
		debugInfo = orm.SelectStmtType.String()

		extractStmt(p, stmt.Body, lbl, 0)
	case *ast.ForStmt:
		if stmt == nil {
			return
		}
		kind = orm.ForStmtType.Index()
		debugInfo = orm.ForStmtType.String()

		extractStmt(p, stmt.Init, lbl, 0)
		extractExpr(p, stmt.Cond, lbl, 1)
		extractStmt(p, stmt.Post, lbl, 2)
		extractStmt(p, stmt.Body, lbl, 3)
		emitScopeNodeInfo(p, stmt, lbl)
	case *ast.RangeStmt:
		if stmt == nil {
			return
		}
		kind = orm.RangeStmtType.Index()
		debugInfo = orm.RangeStmtType.String()

		extractExpr(p, stmt.Key, lbl, 0)
		extractExpr(p, stmt.Value, lbl, 1)
		extractExpr(p, stmt.X, lbl, 2)
		extractStmt(p, stmt.Body, lbl, 3)
		emitScopeNodeInfo(p, stmt, lbl)
	default:
		log.Fatalf("unknown statement of type %T", stmt)
	}
	p.StoreTable(&orm.Stmt{
		Oid:       lbl.ID,
		FileId:    p.Labeler.GetFileLabel().ID,
		Kind:      kind,
		ParentId:  parent.ID,
		Idx:       idx,
		DebugInfo: debugInfo,
	})
	extractNodeLocation(p, stmt, lbl)
}

// extractStmts extracts AST information for a list of statements, which are children of
// the given parent
// `idx` is the index of the first child in the list, and `dir` is the index increment of
// each child over its preceding child (usually either 1 for assigning increasing indices, or
// -1 for decreasing indices)
func extractStmts(p *Profile, stmts []ast.Stmt, parent Label, idx int, dir int) {
	if stmts != nil {
		for _, stmt := range stmts {
			extractStmt(p, stmt, parent, idx)
			idx += dir
		}
	}
}

// extractExprs extracts AST information for a list of expressions, which are children of
// the given parent
// `idx` is the index of the first child in the list, and `dir` is the index increment of
// each child over its preceding child (usually either 1 for assigning increasing indices, or
// -1 for decreasing indices)
func extractExprs(p *Profile, exprs []ast.Expr, parent Label, idx int, dir int) {
	if exprs != nil {
		for _, expr := range exprs {
			extractExpr(p, expr, parent, idx)
			idx += dir
		}
	}
}

func extractDecl(p *Profile, decl ast.Decl, parent Label, idx int) {
	lbl := p.Labeler.LocalID(decl)
	var kind int
	var debugInfo string
	switch decl := decl.(type) {
	case *ast.BadDecl:
		kind = orm.BadDeclType.Index()
		debugInfo = orm.BadDeclType.String()
	case *ast.GenDecl:
		if decl == nil {
			return
		}
		switch decl.Tok {
		case token.IMPORT:
			kind = orm.ImportDeclType.Index()
			debugInfo = orm.ImportDeclType.String()
		case token.CONST:
			kind = orm.ConstDeclType.Index()
			debugInfo = orm.ConstDeclType.String()
		case token.TYPE:
			kind = orm.TypeDeclType.Index()
			debugInfo = orm.TypeDeclType.String()
		case token.VAR:
			kind = orm.VarDeclType.Index()
			debugInfo = orm.VarDeclType.String()
		default:
			log.Fatalf("unknown declaration of kind %v", decl.Tok)
		}
		for i, spec := range decl.Specs {
			extractSpec(p, spec, lbl, i)
		}
		extractDoc(p, decl.Doc, lbl)
	case *ast.FuncDecl:
		if decl == nil {
			return
		}
		kind = orm.FuncDeclType.Index()
		debugInfo = orm.FuncDeclType.String()
		extractFields(p, decl.Recv, lbl, -1, -1, 4)
		extractExpr(p, decl.Name, lbl, 0)
		extractExpr(p, decl.Type, lbl, 1)
		extractStmt(p, decl.Body, lbl, 2)
		extractDoc(p, decl.Doc, lbl)
		extractTypeParamDecls(p, decl.Type.TypeParams, lbl)

		// Note that we currently don't extract any kind of declaration for
		// receiver type parameters. There isn't an explicit declaration, but
		// we could consider the index/indices of an IndexExpr/IndexListExpr
		// receiver as declarations.
	default:
		log.Fatalf("unknown declaration of type %T", decl)
	}
	p.StoreTable(&orm.Decl{
		Oid:       lbl.ID,
		FileId:    p.Labeler.GetFileLabel().ID,
		Kind:      kind,
		ParentId:  parent.ID,
		Idx:       idx,
		DebugInfo: debugInfo,
	})
	extractNodeLocation(p, decl, lbl)
}

// extractDoc extracts information about a doc comment group associated with a given element
func extractDoc(p *Profile, doc *ast.CommentGroup, elt Label) {
	if doc != nil {
		p.StoreTable(&orm.DocComment{
			Oid:            util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, elt.ID), "DocComment"),
			AssociateObj:   elt.ID,
			CommentGroupId: p.Labeler.LocalID(doc).ID,
		})
	}
}

// extractSpec extracts AST information for the given declaration specifier
func extractSpec(p *Profile, spec ast.Spec, parent Label, idx int) {
	lbl := p.Labeler.LocalID(spec)
	var kind int
	var debugInfo string
	switch spec := spec.(type) {
	case *ast.ImportSpec:
		if spec == nil {
			return
		}
		kind = orm.ImportSpecType.Index()
		debugInfo = orm.ImportSpecType.String()
		extractExpr(p, spec.Name, lbl, 0)
		extractExpr(p, spec.Path, lbl, 1)
		extractDoc(p, spec.Doc, lbl)
	case *ast.ValueSpec:
		if spec == nil {
			return
		}
		kind = orm.ValueSpecType.Index()
		debugInfo = orm.ValueSpecType.String()
		for i, name := range spec.Names {
			extractExpr(p, name, lbl, -(1 + i))
		}
		extractExpr(p, spec.Type, lbl, 0)
		extractExprs(p, spec.Values, lbl, 1, 1)
		extractDoc(p, spec.Doc, lbl)
	case *ast.TypeSpec:
		if spec == nil {
			return
		}
		if spec.Assign.IsValid() {
			kind = orm.AliasSpecType.Index()
			debugInfo = orm.AliasSpecType.String()
		} else {
			kind = orm.TypeDefSpecType.Index()
			debugInfo = orm.TypeDefSpecType.String()
		}
		extractExpr(p, spec.Name, lbl, 0)
		extractTypeParamDecls(p, spec.TypeParams, lbl)
		extractExpr(p, spec.Type, lbl, 1)
		extractDoc(p, spec.Doc, lbl)
	}
	p.StoreTable(&orm.Spec{
		Oid:       lbl.ID,
		Kind:      kind,
		ParentId:  parent.ID,
		Idx:       idx,
		DebugInfo: debugInfo,
	})
	extractNodeLocation(p, spec, lbl)
}

func extractCommentGroup(p *Profile, cg *ast.CommentGroup, parent Label, idx int) {
	lbl := p.Labeler.LocalID(cg)

	p.StoreTable(&orm.CommentGroup{
		Oid:    lbl.ID,
		FileId: p.Labeler.GetFileLabel().ID,
		Parent: parent.ID,
		Idx:    idx,
	})
	extractNodeLocation(p, cg, lbl)
	for i, c := range cg.List {
		extractComment(p, c, lbl, i)
	}
}

// extractComment extracts information about a given comment
func extractComment(p *Profile, c *ast.Comment, parent Label, idx int) {
	lbl := p.Labeler.LocalID(c)
	rawText := c.Text
	var kind int
	var text string
	if rawText[:2] == "//" {
		kind = orm.SlashSlashComment.Index()
		text = rawText[2:]
	} else {
		kind = orm.SlashStarComment.Index()
		text = rawText[2 : len(rawText)-2]
	}
	p.StoreTable(&orm.Comment{
		Oid:         lbl.ID,
		FileId:      p.Labeler.GetFileLabel().ID,
		CommentType: kind,
		Parent:      parent.ID,
		Index:       int64(idx),
		DebugInfo:   text,
	})
	extractNodeLocation(p, c, lbl)
}

// extractLocation emits a location entity for the given entity
func extractLocation(p *Profile, entity Label, sl int, sc int, el int, ec int, so, eo int) {
	hsLbl := Label{util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, entity.ID), "HasLocation")} //p.Labeler.GetFileLabel()
	p.StoreTable(&orm.HasLocation{
		Oid:         hsLbl.ID,
		LocationObj: entity.ID,
		LocationId:  emitLocation(p, hsLbl, sl, el, sc, ec, so, eo).ID,
	})
}

// emitLocation emits a location entity
func emitLocation(p *Profile, lbl Label, sl int, sc int, el int, ec int, so, eo int) Label {
	locLbl := p.Labeler.GlobalID(fmt.Sprintf("loc,{%s},%d,%d,%d,%d", lbl, sl, sc, el, ec))
	p.StoreTable(&orm.Location{
		Oid:               locLbl.ID,
		StartLineNumber:   sl,
		StartColumnNumber: el,
		EndLineNumber:     sc,
		EndColumnNumber:   ec,
		TokenStartOffset:  so,
		TokenEndOffset:    eo,
	})
	return locLbl
}

// extractNodeLocation extracts location information for the given node
func extractNodeLocation(p *Profile, nd ast.Node, lbl Label) {
	if nd == nil {
		return
	}
	fset := p.Package.Fset
	start, end, startOffest, endOffset := fset.Position(nd.Pos()), fset.Position(nd.End()), fset.Position(nd.Pos()).Offset, fset.Position(nd.End()).Offset
	extractLocation(p, lbl, start.Line, start.Column, end.Line, end.Column-1, startOffest, endOffset)
}

// extractLocalScope extracts symbol table information for the given scope and all its nested scopes
func extractLocalScope(p *Profile, scope *types.Scope, parentScopeLabel Label) {
	scopeLabel := p.Labeler.ScopeID(scope, nil)
	p.StoreTable(&orm.Scope{
		Oid:       scopeLabel.ID,
		Kind:      orm.LocalScopeType.Index(),
		DebugInfo: orm.LocalScopeType.String(),
	})
	extractScopeLocation(p, scope, scopeLabel)
	p.StoreTable(&orm.ScopeNesting{
		Oid:   util.GetIDFromDigest(fmt.Sprintf("%v#%v", p.Path, scopeLabel.ID), "ScopeNesting"),
		Inner: scopeLabel.ID,
		Outer: parentScopeLabel.ID,
	})
	for i := 0; i < scope.NumChildren(); i++ {
		childScope := scope.Child(i)
		extractLocalScope(p, childScope, scopeLabel)
	}

	extractObjects(p, scope, scopeLabel)
}

// For a type `t` which is the type of a field of an interface type, return
// whether `t` a type set literal which is not a union type. Note that a field
// of an interface must be a method signature, an embedded interface type or a
// type set literal.
func isNonUnionTypeSetLiteral(t types.Type) bool {
	if t == nil {
		return false
	}
	switch t.Underlying().(type) {
	case *types.Interface, *types.Union, *types.Signature:
		return false
	default:
		return true
	}
}

// Given a type `t`, return a union with a single term that is `t` without a
// tilde.
func createUnionFromType(t types.Type) *types.Union {
	return types.NewUnion([]*types.Term{types.NewTerm(false, t)})
}

// Go through a `FieldList` and update the types of all type set literals which
// are not already union types to be union types. We do this by changing the
// types stored in `tw.Package.TypesInfo.Types`. Type set literals can only
// occur in two places: a type parameter declaration or a type in an interface.
func makeTypeSetLiteralsUnionTyped(p *Profile, fields *ast.FieldList) {
	if fields == nil || fields.List == nil {
		return
	}
	for i := 0; i < len(fields.List); i++ {
		x := fields.List[i].Type
		if _, alreadyOverridden := p.TypesOverride[x]; !alreadyOverridden {
			xtp := typeOf(p, x)
			if isNonUnionTypeSetLiteral(xtp) {
				p.TypesOverride[x] = createUnionFromType(xtp)
			}
		}
	}
}

func typeOf(tw *Profile, e ast.Expr) types.Type {
	if val, ok := tw.TypesOverride[e]; ok {
		return val
	}
	return tw.Package.TypesInfo.TypeOf(e)
}

func flattenBinaryExprTree(tw *Profile, e ast.Expr, parent Label, idx int) int {
	binaryexpr, ok := e.(*ast.BinaryExpr)
	if ok {
		idx = flattenBinaryExprTree(tw, binaryexpr.X, parent, idx)
		idx = flattenBinaryExprTree(tw, binaryexpr.Y, parent, idx)
	} else {
		extractExpr(tw, e, parent, idx)
		idx = idx + 1
	}
	return idx
}

func extractTypeParamDecls(tw *Profile, fields *ast.FieldList, parent Label) {
	if fields == nil || fields.List == nil {
		return
	}

	// Type set literals can occur as the type in a type parameter declaration,
	// so we ensure that they are union typed.
	makeTypeSetLiteralsUnionTyped(tw, fields)

	idx := 0
	for _, field := range fields.List {
		lbl := tw.Labeler.LocalID(field)
		tw.StoreTable(&orm.TypeParamDecls{
			Oid:    lbl.ID,
			Parent: parent.ID,
			Index:  idx,
		})
		extractNodeLocation(tw, field, lbl)
		if field.Names != nil {
			for i, name := range field.Names {
				extractExpr(tw, name, lbl, i+1)
			}
		}
		extractExpr(tw, field.Type, lbl, 0)
		extractDoc(tw, field.Doc, lbl)
		idx += 1
	}
}

// populateTypeParamParents sets `parent` as the parent of the elements of `typeparams`
func populateTypeParamParents(tw *Profile, typeparams *types.TypeParamList, parent types.Object) {
	if typeparams != nil {
		for idx := 0; idx < typeparams.Len(); idx++ {
			setTypeParamParent(tw, typeparams.At(idx), parent)
		}
	}
}

// getobjectBeingUsed looks up `ident` in `tw.Package.TypesInfo.Uses` and makes
// some changes to the object to avoid returning objects relating to instantiated
// types.
func getObjectBeingUsed(tw *Profile, ident *ast.Ident) types.Object {
	obj := tw.Package.TypesInfo.Uses[ident]
	if obj == nil {
		return nil
	}
	if override, ok := tw.ObjectsOverride[obj]; ok {
		return override
	}
	if funcObj, ok := obj.(*types.Func); ok {
		sig := funcObj.Type().(*types.Signature)
		if recv := sig.Recv(); recv != nil {
			recvType := recv.Type()
			originType, isSame := tryGetGenericType(recvType)

			if originType == nil {
				if pointerType, ok := recvType.(*types.Pointer); ok {
					originType, isSame = tryGetGenericType(pointerType.Elem())
				}
			}

			if originType == nil || isSame {
				return obj
			}

			for i := 0; i < originType.NumMethods(); i++ {
				meth := originType.Method(i)
				if meth.Name() == funcObj.Name() {
					return meth
				}
			}
			if interfaceType, ok := originType.Underlying().(*types.Interface); ok {
				for i := 0; i < interfaceType.NumMethods(); i++ {
					meth := interfaceType.Method(i)
					if meth.Name() == funcObj.Name() {
						return meth
					}
				}
			}
			log.Fatalf("Could not find method %s on type %s", funcObj.Name(), originType)
		}
	}

	return obj
}

// tryGetGenericType returns the generic type of `tp`, and a boolean indicating
// whether it is the same as `tp`.
func tryGetGenericType(tp types.Type) (*types.Named, bool) {
	if namedType, ok := tp.(*types.Named); ok {
		originType := namedType.Origin()
		return originType, namedType == originType
	}
	return nil, false
}

// trackInstantiatedStructFields tries to give the fields of an instantiated
// struct type underlying `tp` the same labels as the corresponding fields of
// the generic struct type. This is so that when we come across the
// instantiated field in `tw.Package.TypesInfo.Uses` we will get the label for
// the generic field instead.
func trackInstantiatedStructFields(tw *Profile, tp, origintp *types.Named) {
	if tp == origintp {
		return
	}

	if instantiatedStruct, ok := tp.Underlying().(*types.Struct); ok {
		genericStruct, ok2 := origintp.Underlying().(*types.Struct)
		if !ok2 {
			log.Fatalf(
				"Error: underlying type of instantiated type is a struct but underlying type of generic type is %s",
				origintp.Underlying())
		}

		if instantiatedStruct.NumFields() != genericStruct.NumFields() {
			log.Fatalf(
				"Error: instantiated struct %s has different number of fields than the generic version %s (%d != %d)",
				instantiatedStruct, genericStruct, instantiatedStruct.NumFields(), genericStruct.NumFields())
		}

		for i := 0; i < instantiatedStruct.NumFields(); i++ {
			tw.ObjectsOverride[instantiatedStruct.Field(i)] = genericStruct.Field(i)
		}
	}
}

func getTypeParamParentLabel(tw *Profile, tp *types.TypeParam) Label {
	parent, exists := typeParamParent[tp]
	if !exists {
		return InvalidLabel
	}
	parentlbl, _ := tw.Labeler.ScopedObjectID(parent, func() Label {
		// the 2 layer skipping the current call.
		util.PrintTracebackAfterDetectedBadEntrance(2,
			fmt.Errorf("getTypeLabel() called for parent of type parameter %s", tp.String()))
		return InvalidLabel
	})
	return parentlbl
}

func setTypeParamParent(tw *Profile, tp *types.TypeParam, newobj types.Object) {
	obj, exists := typeParamParent[tp]
	if !exists {
		typeParamParent[tp] = newobj
	} else if newobj != obj {
		util.PrintTracebackAfterDetectedBadEntrance(1,
			fmt.Errorf("parent of type parameter '%s %s' being set to a different value: '%s' vs '%s' filePath:%s", tp.String(), tp.Constraint().String(), obj, newobj, tw.Path))
	}
}
