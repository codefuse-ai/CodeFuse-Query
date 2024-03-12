package orm

import (
	"fmt"
	"strings"
)

// A DBType represents a database type
type DBType interface {
	def() string
	ref() string
	repr() string
	valid(val interface{}) bool
}

// A PrimitiveType represents a primitive dataase type
type PrimitiveType int

const (
	// INT represents the primitive database type `int`
	INT PrimitiveType = iota
	// FLOAT represents the primitive database type `float`
	FLOAT
	// BOOLEAN represents the primitive database type `boolean`
	BOOLEAN
	// DATE represents the primitive database type `date`
	DATE
	// STRING represents the primitive database type `string`
	STRING
)

// A PrimaryKeyType represents a database type defined by a primary key column
type PrimaryKeyType struct {
	name string
}

func (pkt PrimaryKeyType) valid(val interface{}) bool {
	//TODO implement me
	panic("implement me")
}

// A UnionType represents a database type defined as the union of other database types
type UnionType struct {
	name       string
	components []DBType
}

func (ut UnionType) valid(val interface{}) bool {
	//TODO implement me
	panic("implement me")
}

// An AliasType represents a database type which is an alias of another database type
type AliasType struct {
	name       string
	underlying DBType
}

// A CaseType represents a database type defined by a primary key column with a supplementary kind column
type CaseType struct {
	base     DBType
	column   string
	branches []*BranchType
}

func (ct CaseType) valid(val interface{}) bool {
	//TODO implement me
	panic("implement me")
}

// A BranchType represents one branch of a case type
type BranchType struct {
	idx  int
	name string
}

func (bt BranchType) valid(val interface{}) bool {
	//TODO implement me
	panic("implement me")
}

func (pt PrimitiveType) def() string {
	return ""
}

func (pt PrimitiveType) ref() string {
	switch pt {
	case INT:
		return "int"
	case FLOAT:
		return "float"
	case BOOLEAN:
		return "boolean"
	case DATE:
		return "date"
	case STRING:
		return "string"
	default:
		panic(fmt.Sprintf("Unexpected primitive type %d", pt))
	}
}

func (pt PrimitiveType) repr() string {
	switch pt {
	case INT:
		return "int"
	case FLOAT:
		return "float"
	case BOOLEAN:
		return "boolean"
	case DATE:
		return "date"
	case STRING:
		return "string"
	default:
		panic(fmt.Sprintf("Unexpected primitive type %d", pt))
	}
}

func (pt PrimitiveType) valid(value interface{}) bool {
	switch value.(type) {
	case int:
		return pt == INT
	case float64:
		return pt == FLOAT
	case bool:
		return pt == BOOLEAN
	case string:
		return pt == STRING
	}
	return false
}

func (pkt PrimaryKeyType) def() string {
	return ""
}

func (pkt PrimaryKeyType) ref() string {
	return pkt.name
}

func (pkt PrimaryKeyType) repr() string {
	return "int"
}

func (ut UnionType) def() string {
	var b strings.Builder
	nl := 0
	fmt.Fprintf(&b, "%s = ", ut.name)
	for i, comp := range ut.components {
		if i > 0 {
			if i < len(ut.components)-1 && b.Len()-nl > 100 {
				fmt.Fprintf(&b, "\n%s", strings.Repeat(" ", len(ut.name)))
				nl = b.Len()
			}
			fmt.Fprint(&b, " | ")
		}
		fmt.Fprint(&b, comp.ref())
	}
	fmt.Fprint(&b, ";")
	return b.String()
}

func (ut UnionType) ref() string {
	return ut.name
}

func (ut UnionType) repr() string {
	return "int"
}

func (at AliasType) def() string {
	return at.name + " = " + at.underlying.ref() + ";"
}

func (at AliasType) ref() string {
	return at.name
}

func (at AliasType) repr() string {
	return at.underlying.repr()
}

func (at AliasType) valid(value interface{}) bool {
	return at.underlying.valid(value)
}

func (ct CaseType) def() string {
	var b strings.Builder
	fmt.Fprintf(&b, "case %s.%s of", ct.base.ref(), ct.column)
	sep := "  "
	for _, branch := range ct.branches {
		fmt.Fprintf(&b, "\n%s%s", sep, branch.def())
		sep = "| "
	}
	fmt.Fprint(&b, ";")
	return b.String()
}

func (ct CaseType) ref() string {
	panic("case types do not have a name")
}

func (ct CaseType) repr() string {
	return "int"
}

func (bt BranchType) def() string {
	return fmt.Sprintf("%d = %s", bt.idx, bt.name)
}

func (bt BranchType) ref() string {
	return bt.name
}

func (bt BranchType) repr() string {
	return "int"
}

// Index returns the numeric index of this branch type
func (bt BranchType) Index() int {
	return bt.idx
}

// Tostring returns the name of this branch type
func (bt BranchType) String() string {
	return bt.name
}

var dbtypes = []DBType{}

// NewPrimaryKeyType constructs a new primary key type with the given `name`,
// and adds it to the union types `parents` (if any)
func NewPrimaryKeyType(name string, parents ...*UnionType) *PrimaryKeyType {
	tp := &PrimaryKeyType{name}
	dbtypes = append(dbtypes, tp)
	for _, parent := range parents {
		parent.components = append(parent.components, tp)
	}
	return tp
}

// NewUnionType constructs a new union type with the given `name`,
// and adds it to the union types `parents` (if any)
func NewUnionType(name string, parents ...*UnionType) *UnionType {
	tp := &UnionType{name, []DBType{}}
	dbtypes = append(dbtypes, tp)
	for _, parent := range parents {
		parent.components = append(parent.components, tp)
	}
	return tp
}

// AddChild adds the type with given `name` to the union type.
// This is useful if a type defined in a snippet should be a child of a type defined in Go.
func (parent *UnionType) AddChild(name string) bool {
	tp := &PrimaryKeyType{name}
	// don't add tp to types; it's expected that it's already in the db somehow.
	parent.components = append(parent.components, tp)
	return true
}

// NewAliasType constructs a new alias type with the given `name` that aliases `underlying`
func NewAliasType(name string, underlying DBType) *AliasType {
	tp := &AliasType{name, underlying}
	dbtypes = append(dbtypes, tp)
	return tp
}

// NewCaseType constructs a new case type on the given `base` type whose discriminator values
// come from `column`
func NewCaseType(base DBType, column string) *CaseType {
	tp := &CaseType{base, column, []*BranchType{}}
	dbtypes = append(dbtypes, tp)
	return tp
}

// NewBranch adds a new branch with the given `name` to this case type
// and adds it to the union types `parents` (if any)
func (ct *CaseType) NewBranch(name string, parents ...*UnionType) *BranchType {
	tp := &BranchType{len(ct.branches), name}
	ct.branches = append(ct.branches, tp)
	for _, parent := range parents {
		parent.components = append(parent.components, tp)
	}
	return tp
}
