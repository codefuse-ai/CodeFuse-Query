package orm

// Comment is the table describing the comment element info
type Comment struct {
	Oid         int64
	FileId      int64
	CommentType int
	Parent      int64
	Index       int64
	DebugInfo   string
}

// Location is the table describing the location info in the containing file for locatable entity
type Location struct {
	Oid               int64
	StartLineNumber   int
	StartColumnNumber int
	EndLineNumber     int
	EndColumnNumber   int

	TokenStartOffset int
	TokenEndOffset   int
}

// HasLocation is the table associating entities with their locations
type HasLocation struct {
	Oid         int64
	LocationObj int64
	LocationId  int64
}

// CommentGroup is the table defining comment group entities
type CommentGroup struct {
	Oid    int64
	FileId int64
	Parent int64
	Idx    int
}

// DocComment is the table associating doc comments with the nodes they document
type DocComment struct {
	Oid            int64
	AssociateObj   int64
	CommentGroupId int64
}

// TypeOf is the table associating expressions with their types (if known)
type TypeOf struct {
	Oid  int64
	Expr int64
	Tp   int64
}

// ArrayLength is the table associating array types with their length (represented as a string
type ArrayLength struct {
	Oid    int64
	Tp     int64
	FileId int64
	Len    int64
}

// ElementType is the table associating container types with their element type
type ElementType struct {
	Oid       int64
	Container int64
	Tp        int64
}

// FieldStruct maps fields to the structs they are in
type FieldStruct struct {
	Oid    int64
	Struct int64
}

// TypeName is the table associating named types with their names
type TypeName struct {
	Oid  int64
	Name string
}

// TypeObject maps types to their corresponding objects, if any
type TypeObject struct {
	Oid    int64
	Object int64
}

// Def maps identifiers to the objects they define
type Def struct {
	Oid    int64
	Ident  int64
	Object int64
}

// Uses maps identifiers to the objects they denote 'uses'
type Uses struct {
	Oid    int64
	Ident  int64
	Object int64
}

// Variadic is the table describing which functions are variadic
type Variadic struct {
	Oid            int64
	AssociatedNode int64
}

// MethodHost maps interface methods to the named type they belong to
type MethodHost struct {
	Oid    int64
	Method int64
	Host   int64
}

// Type is the table describing types
type Type struct {
	Oid          int64
	Kind         int
	FormatString string
	RawString    string
}

// NumberOfLine is the table describing the classified line
type NumberOfLine struct {
	Oid                  int64
	NumberOfTotalLines   int
	NumberOfCodeLines    int
	NumberOfCommentLines int
}

// Pkg is the table describing packages
type Pkg struct {
	Oid   int64
	Path  string
	Name  string
	Scope int64
}

// Expr is the table defining expression AST nodes
type Expr struct {
	Oid       int64
	FileId    int64
	Kind      int
	ParentId  int64
	Idx       int
	DebugInfo string
}

// Literal is the table associating literal expression AST nodes with their values
type Literal struct {
	Oid   int64
	Expr  int64
	Value string
	Raw   string
}

// ConstValue is the table associating constant expressions with their values
type ConstValue struct {
	Oid   int64
	Expr  int64
	Value string
	Exact string
}

// Fields is the table defining field AST nodes
type Fields struct {
	Oid      int64
	ParentId int64
	Idx      int
	Kind     int
}

// Stmt is the table defining statement AST nodes
type Stmt struct {
	Oid       int64
	FileId    int64
	Kind      int
	ParentId  int64
	Idx       int
	DebugInfo string
}

// Decl is the table defining declaration AST nodes
type Decl struct {
	Oid       int64
	FileId    int64
	Kind      int
	ParentId  int64
	Idx       int
	DebugInfo string
}

// Spec is the table defining declaration specification AST nodes
type Spec struct {
	Oid       int64
	Kind      int
	ParentId  int64
	Idx       int
	DebugInfo string
}

// Object is the table describing objects (that is, declared entities)
type Object struct {
	Oid int64
	//Object    int64
	Kind      int
	Name      string
	DebugInfo string
}

// ObjectScope is the table describing the scope to which an object belongs (if any)
type ObjectScope struct {
	Oid    int64
	Object int64
	Scope  int64
}

// MethodReceiver maps methods to their receiver
type MethodReceiver struct {
	Oid      int64
	Method   int64
	Receiver int64
}

// KeyType is the table associating maps with their key type
type KeyType struct {
	Oid int64
	Map int64
	Tp  int64
}

// BaseType is the table associating pointer types with their base type
type BaseType struct {
	Oid int64
	Ptr int64
	Tp  int64
}

// UnderlyingType is the table associating named types with their underlying type
type UnderlyingType struct {
	Oid   int64
	Named int64
	Tp    int64
}

// ComponentType is the table associating composite types with their component types
type ComponentType struct {
	Oid    int64
	Parent int64
	Index  int
	Name   string
	Tp     int64
}

// Scope is the table defining scopes
type Scope struct {
	Oid       int64
	Kind      int
	DebugInfo string
}

// ScopeNesting is the table describing scope nesting
type ScopeNesting struct {
	Oid   int64
	Inner int64
	Outer int64
}

// ScopeNode is the table associating local scopes with the AST nodes that induce them
type ScopeNode struct {
	Oid   int64
	Node  int64
	Scope int64
}

// ObjectType is the table describing the type of an object (if any)
type ObjectType struct {
	Object int64
	Tp     int64
}

// Typeiadic is the table describing which functions are typeiadic
type Typeiadic struct {
	Oid              int64
	AssociationObjId int64
}

// HasEllipsis is the table containing all call expressions that have ellipses
type HasEllipsis struct {
	Oid                    int64
	CallOrConversionExprId int64
}

// ModFile is the table defining the basic information about go.mod files
type ModFile struct {
	Oid       int64
	Path      string
	Name      string
	GoVersion string
}

// ModRequire is the table defining the mod requires
type ModRequire struct {
	Oid     int64
	ModId   int64
	Require string
}

// ModExpr is the table defining expression AST nodes for go.mod files
type ModExpr struct {
	Oid    int64
	Kind   int
	Parent int64
	Idx    int
}

// ModToken is the table associating go.mod tokens with their Line or LineBlock
type ModToken struct {
	Oid    int64
	Token  string
	Parent int64
	Idx    int
}

type DiagnosticFor struct {
	Diagnostic                 int64
	Compilation                int64
	FileNumber                 int
	FileNumberDiagnosticNumber int
}

type CompilationFinished struct {
	Oid            int64
	CpuSeconds     float64
	ElapsedSeconds float64
}

type Diagnostic struct {
	Oid              int64
	Severity         int
	ErrorTag         string
	ErrorMessage     string
	FullErrorMessage string
	LocationId       int64
}

// Error  is the table describing frontend errors
type Error struct {
	Oid    int64
	Kind   int
	Msg    string
	RawPos string
	File   string
	Line   int
	Col    int
	Pkg    int64
	Idx    int
}

type Compilation struct {
	Oid int64
	Cwd string
}

type CompilationArgs struct {
	Oid int64
	Num int
	Arg string
}

type CompilationCompilingFile struct {
	Oid  int64
	Num  int
	File int64
}

// File is the table defining file nodes
type File struct {
	Oid       int64
	PkgOid    int64 // belongs package
	Name      string
	Md5Sum    string
	Sha256Sum string
}

// Folder is the table defining folder entities
type Folder struct {
	Oid  int64
	Name string
}

// ContainerParent is the table defining the parent-child relation among container entities
type ContainerParent struct {
	Oid    int64
	Parent int64
	Child  int64
}

// TypeParamDecls is the table defining type param declaration AST nodes
type TypeParamDecls struct {
	Oid    int64
	Parent int64
	Index  int
}

// TypeParam is the table describing type parameter types
type TypeParam struct {
	Oid    int64
	Tp     int64
	Name   string
	Bound  int64
	Parent int64
	Index  int
}

// RuntimeInfo is the table defining the extractor runtine infor
type RuntimeInfo struct {
	Oid           int64
	BuildVersion  string //go编译器版本
	ExtractorInfo string
	GoOs          string
	GoArch        string
}

// UnExtracted is the table defining folders/files unExtracted
type UnExtracted struct {
	Oid  int64
	Type UnExtractedType
	Name string
}

// FileData is the table store Go/GoMod Files info
type FileData struct {
	Oid     int64    // Unique identifier for the record
	FileId  int64    // Associated file identifier
	Type    FileType // Represents type of file: 1 - Go file, 2 - GoMod file
	Content string   // Content of the file in string format
}
