# GödelScript Query Language

## Index

- [GödelScript Basic Concepts and Syntax](#gödelscript-basic-concepts-and-syntax)
  - [Introduction](#introduction)
  - [Basic Program Structure](#basic-program-structure)
  - [Fundamental Types and Compiler Built-in Functions](#fundamental-types-and-compiler-built-in-functions)
  - [Functions](#functions)
  - [Statements](#statements)
  - [Schema](#schema)
  - [Database](#database)
  - [Import](#import)
  - [Query](#query)
  - [Ungrounded Error: Unassigned/Unbound Error](#ungrounded-error-unassignedunbound-error)
- [Query Examples](#query-examples)
  - [Java](#java)
  - [Python](#python)
  - [JavaScript](#javascript)
  - [XML](#xml)
  - [Go](#go)
- [Query Debugging and Optimization Tips](#query-debugging-and-optimization-tips)
  - [Schema Arguments Causing Excessively Large Cartesian Products](#schema-arguments-causing-excessively-large-cartesian-products)
  - [Multiple Layers of `for` Causing Excessively Large Cartesian Products](#multiple-layers-of-for-causing-excessively-large-cartesian-products)
  - [Avoid Misusing `@inline` and Strategies for Necessary Inline Optimization](#avoid-misusing-inline-and-strategies-for-necessary-inline-optimization)
- [Using Query Scripts on a Local Machine](#using-query-scripts-on-a-local-machine)

## Basic Concepts and Syntax of GödelScript

### Introduction

```rust
// script
fn hello(greeting: string) -> bool {
    return greeting = "hello world!"
}

fn main() {
    output(hello())
}
```

GödelScript， the Gödel query language, is a domain-specific language (DSL) for querying and data processing used by CodeQuery. GödelScript uses syntax similar to Rust, providing strict type checking, convenient type inference, and user-friendly error messages, allowing users to get started quickly.

Main use cases for the GödelScript compiler include:

1. Writing simple or complex queries for users, offering more convenient syntax to improve query writing efficiency.
2. Providing strict type checking and type inference, offering smarter code modification suggestions.
3. Offering strict [ungrounded](#ungrounded-error) detection to avoid triggering the common Soufflé Ungrounded Error.
4. Support for Language Server and IDE Extension.

### Basic Program Structure

#### Program Structure

A GödelScript program may include:

- [Module and symbol import statements](#import)
- [Schema type declarations](#schema)
- [Database type declarations](#database)
- [Method implementations](#method-implementation)
- [Function declarations and implementations](#function)
- [Query declarations](#query)

An example containing all the above components:

```rust
// script
// Package import/symbol import
use coref::java::* // Import all symbols
use coref::java::{JavaDB, Class} // Selective symbol import

// Function declaration
fn default_db() -> JavaDB {
    return JavaDB::load("example.db")
}

// Schema declaration
schema File {
    @primary id: int
}

// Database declaration
database NewDB {
    file: *File
}

// Impl
impl File {
    @data_constraint
    fn __all__() -> *File {
        yield File {id: 1}
        yield File {id: 2}
    }
}

// Query
query get_all_anno from
    Annotation anno in Annotation(default_db())
select
    anno.id as id
```

#### Comments

GödelScript uses comment syntax similar to C-like languages.

```rust
// Single line comment

/*
* 1. Multi-line comment
* 2. Multi-line comment
*/
```

#### The `main` Function

A GödelScript query script can include a `main` function, which has no return value. If the `main` function is not implemented and no query declarations are written, the program will not produce any output.

For more details, please refer to [main function](#gödelscript-main-function).

```rust
fn main() {
    output(query_1())
    output(query_2())
}
```

### Basic Types and Built-in Compiler Functions

GödelScript includes basic types `int`, `string`, and `bool`. `bool` is a basic type but cannot be stored as a value.

#### `int` Type Native Functions

| Function | Type | Explanation |
| --- | --- | --- |
| pow | (int, int) -> int | Exponentiation. Arguments must be non-negative numbers. |
| rem | (int, int) -> int | Remainder operation. |
| bitand | (int, int) -> int | Bitwise conjunction. |
| bitor | (int, int) -> int | Bitwise disjunction. |
| bitxor | (int, int) -> int | Bitwise exclusive disjunction. |
| bitnot | (int) -> int | Bitwise negation. |
| neg | (int) -> int | Arithmetic negation. |
| to_string | (int) -> string | Conversion to a string. |
| add | (int, int) -> int | Addition (+). |
| sub | (int, int) -> int | Subtraction (-). |
| mul | (int, int) -> int | Multiplication (*). |
| div | (int, int) -> int | Division (/). |
| eq | (int, int) -> bool | Equality (=). |
| ne | (int, int) -> bool | Inequality (!=). |
| gt | (int, int) -> bool | Greater than (>). |
| ge | (int, int) -> bool | Greater than or equal to (>=). |
| lt | (int, int) -> bool | Less than (<). |
| le | (int, int) -> bool | Less than or equal to (<=). |
| to_set | (int) -> *int | Cast to a set type. |

#### `string` Type Native Functions

| Function | Type | Explanation |
| --- | --- | --- |
| len | (string) -> int | Gets the length of a string. |
| substr | (string, int, int) -> string | Substring extraction using initial index and length. |
| contains | (string, string) -> bool | Checks if one string is contained within the current string. |
| matches | (string, string) -> bool | Checks if a regular expression fully matches the current string. |
| get_regex_match_result | (string, string, int) -> string | Gets a capture result from a full regex match on the current string, determined by the second parameter (int). For example, "abcdef".get_regex_match_result("a(.*)f", 1) yields "bcde". |
| to_int | (string) -> int | Converts to an integer. |
| add | (string, string) -> string | String concatenation. |
| eq | (string, string) -> bool | Checks string equality. |
| ne | (string, string) -> bool | Checks string inequality. |
| to_set | (string) -> *string | Cast to a set type. |

#### `bool` Type Native Functions

While `bool` exists as a basic type, it cannot be used as data in intermediate calculations, only as a conditional result.

| Function | Type | Explanation |
| --- | --- | --- |
| not | (bool) -> bool | Logical negation. |
| and | (bool, bool) -> bool | Logical conjunction. |
| or | (bool, bool) -> bool | Logical disjunction. |
| eq | (bool, bool) -> bool | Equality. |
| ne | (bool, bool) -> bool | Inequality. |

#### Native Functions for Sets

| Function | Type | Explanation |
| --- | --- | --- |
| len | (*T) -> int | Gets the count of a data set. |
| max | (*int) -> int | Finds the maximum value. |
| min | (*int) -> int | Finds the minimum value. |
| sum | (*int) -> int | Summation of the values. |
| find | (*T0) -> T1 | Finds a data entry from a set using a primary key. |

#### Global Native Functions

| Function | Type | Explanation |
| --- | --- | --- |
| output | ((...) -> bool) -> <null-type> | Outputs query content. |

#### Database Native Functions

| Function | Type | Explanation |
| --- | --- | --- |
| load | (string) -> T | Loads the database. |

#### Schema Native Functions

| Function | Type | Explanation |
| --- | --- | --- |
| to<T> | (self) -> T | Converts to another schema type, using duck typing. |
| is<T> | (self) -> bool | Determines if it can be another schema type, using duck typing. If the schema has a primary key, the underlying check will only use the primary key to determine compatibility. |
| key_eq | (self, T) -> bool | Checks if the primary keys of two schema instances are equal. |
| key_neq | (self, T) -> bool | Checks if the primary keys of two schema instances are **not** equal. |

Schema native function example:

```rust
use coref::java::*

fn default_java_db() -> JavaDB {
    return JavaDB::load("coref_java_src.db")
}

fn example() -> bool {
    for(stmt in StatementParent(default_java_db())) {
        if (stmt.is<ElementParent>()) {
            return true
        }
    }
}

fn convert() -> *ElementParent {
    for(stmt in StatementParent(default_java_db())) {
        yield stmt.to<ElementParent>()
    }
}
```

### Functions

#### The `main` Function of GödelScript

The main function is the only function in GödelScript that does not declare a return type. The main function only allows the use of output, and other statements will result in a compilation error. Using output(...) multiple times can output multiple query results, which will be displayed in separate tables, with the table names corresponding to the names of the query functions called within output.

#### Query Functions

Query functions are recommended to have a `bool` return type and need to use `output()` to output query results.

The query functions called within `output()` are no longer invoked in the conventional manner of passing arguments to functions. At this point, the parameter list changes to represent the table schema of the output table. Here are two examples of how query functions are applied:

1. Single-table `output`
   
   A single-table `output` specifically refers to using `output` only once within the `main` function to produce output.

   ```rust
   fn example(a: int, b: string) -> bool {...}

   fn main() {
       output(example()) // At this point, the parameter list becomes the output table schema and requires no arguments
   }
   ```

   The corresponding output table schema would be:

   ```json
   [
       {"a": 0, "b": "xxx"},
       {"a": 1, "b": "xxx"}
   ]
   ```

2. Multi-table `output`

   A multi-table `output` refers to using `output` multiple times within the `main` function to produce output. In this case, the output data will include corresponding table names.

   ```rust
   fn example0(a: int, b: string) -> bool {...}
   fn example1(a: string, b: int) -> bool {...}

   fn main() {
       output(example0())
       output(example1())
   }
   ```

   The corresponding output table schema would be:

   ```json
   {
       "example0":[
           {"a": 0, "b": "xxx"},
           {"a": 1, "b": "xxx"}
       ],
       "example1":[
           {"a": "xxx", "b": 0},
           {"a": "xxx", "b": 1}
       ]
   }
   ```

Below is a more detailed example where we directly construct two sets of data for output. In the following code, note that:

1. In GödelScript, boolean values can be represented with the keywords `true` and `false`.

2. The `=` symbol in GödelScript is quite special and should not be interpreted in the same way as in conventional programming languages. GödelScript is a Datalog language. Here, the `=` symbol carries dual semantics: both __assignment__ and __equality comparison__. Details can be found in [`=` operator](#assignment-and-equality-comparison-operator).

3. In the conditional statements of this example, both `a` and `b` use the assignment semantics of `=`, because the `int` and `string` type parameters are considered `ungrounded (unassigned/unbound)` within the function body and must be assigned before they can be used.

4. The return value of the `=` assignment statement is `true`.

```rust
fn example(a: int, b: string) -> bool {
    // The = symbol serves both assignment and comparison purposes, depending on whether the left-hand value has been "assigned"
    // Here, the = symbols for a and b are used with assignment semantics
    if (a = 1 && b = "1") {
        // GödelScript uses the keywords true and false to represent boolean values
        return true
    }
    if (a = 2 && b = "2") {
        return true
    }
}

fn main() {
    output(example())
}
```

The expected output should be:

```json
[
    {"a": 1, "b": "1"},
    {"a": 2, "b": "2"}
]
```

#### Regular Functions

Regular functions are used to encapsulate complex processes, and these functions must have a clear return type.
There are two possible return types:

1. A single return value, followed by a declaration of the return type after the arrow.

```rust
fn getFile(c: Class) -> File {
    return c.getRelativePath()
}
```

2. A set of return values, the return type after the arrow needs to be prefixed with `*` to indicate it's a set.

```rust
fn getAllFiles(db: JavaDB) -> *File {
    for (f: File in File(db)) {
        yield f
    }
}
```

Generally, `return` is used for functions with a single return value, while `yield` is used for functions returning a set.
In practice, since GödelScript uses the Datalog engine underneath, all operations are based on sets; a single return value actually only means that the returned set may contain only one data item, but it could also contain multiple items.

### Statements

#### `for` Statement: Declaring Variables from a Set

GödelScript uses the `for` keyword and syntax similar to loop statements to declare variables from a set:

```rust
for(f: File in getAllFiles()) {
    ...
}
```

The type after the colon for `f: File` can be omitted.
The `for` statement allows the direct definition of multiple variables, where subsequent variables can use all previously defined variables in the same statement during initialization:

```rust
for(a in XmlAttribute(db), b in XmlAttribute(db), c in XmlElement(db)) {
    ...
}

for(a in getAllFiles(), b in a.getAllPaths()) {
    ...
}
```

#### `let` Statement: Declaring a Single Variable

GödelScript uses the `let` keyword to declare a single/intermediate variable:

```rust
let(f: File = c.getRelativePath()) {
    ...
}
```

The type after the colon for `f: File` can be omitted.
The `let` statement allows the direct definition of multiple variables, where subsequent variables can use all previously defined variables in the same statement during initialization:

```rust
let(a = 1, b = a + 1, c = b + 1) {
    ...
}
```

#### `if` Statement

Conditional statements in GödelScript are similar to many procedural programming languages:

```rust
if (f.getName().contains("util") || f.getName().contains("com")) {
    ...
}
```

Conditions can be connected using logical operators: `!` for NOT, `||` for OR, and `&&` for AND.

Comparative operators in conditions: `>` for greater than, `<` for less than, `>=` for greater than or equal to, `<=` for less than or equal to, `=` for equal to or assignment, `!=` for not equal to.

Regular arithmetic operations can use the following operators: `+` for addition, `-` for subtraction/negation, `*` for multiplication, `/` for division.

##### Assignment and Equality Comparison Operator `=`

The `=` symbol in GödelScript carries two different semantics: assignment and equality comparison. The specific semantics need to be discussed based on the context:

1. Assignment

   Assignment generally occurs with fundamental type variables such as `int` and `string`. These variables, when used as function parameters, are typically considered unassigned. When a function with such variables is called, the parameters passed in actually serve as filtering conditions.

   ```rust
   fn example(a: int) -> bool {
       // This is somewhat counterintuitive; in procedural languages, this is usually taken to mean a == 1
       // However, in Datalog dialects, each function in Datalog is essentially calculating an intermediate table (view)
       // So this function is essentially generating a view with data [{"a": 1}]
       return a = 1 // assign a = 1
   }

   fn test() -> bool {
       // Although it seems like we are passing a parameter to make a = 2, it's not really the case
       // example() itself returns the view: [{"a": 1}]
       // Then it is constrained by a = 2, and as you can see, we don't get any result here
       // So it returns false
       return example(2) // false
   }
   ```

2. Equality Comparison

   For schema types, since each schema type has a universe behind it, schema type parameters in the parameter list are generally considered to have been assigned. For variables that have already been assigned, `=` operates as an equality comparison.

   ```rust
   // Declare schema
   schema A {...}

   // Implement schema member functions
   impl A {
       // Here we define the universe for schema A
       @data_constraint
       pub fn __all__() -> *A {...}
   }

   fn example(a: A) -> bool {
       for(temp in A::__all__()) {
           if (a = temp) {
               return true
           }
       }
   }
   ```

   Similarly, for internally declared `int` or `string` with initial values, `=` also operates as an equality comparison.

   ```rust
   fn example() -> bool {
       let (a = 1) { // assign a = 1
           if (a = 1) { // compare a = 1
               return true
           }
       }
   }
   ```

#### `match` Statement

GödelScript allows writing `match` statements for `int` and `string` types. A `match` statement is similar to a `switch` statement with multiple conditional branches, and the conditions in the `match` must be literals:

```rust
match(a) {
    1 => return 0,
    2 => return 1,
    3 => if (a + 1 < 10) {
        return 10
    }
}
```

#### Return Statements

GödelScript uses `return` and `yield`. `return` is for functions with a single return value, and `yield` is for returning sets.

```rust
fn a() -> int {
    return 0
}

fn b() -> *int {
	yield 1
	yield 2
	yield 3
}
```

### Schema

Schema is a structure for complex data tables in GödelScript.

#### Structure Declaration

GödelScript uses the `schema` keyword to declare a table structure:

```rust
schema File {
    id: int,
    name: string
}
```

If a field exists as a primary key in the database, you can use the `@primary` annotation to indicate that it's a primary key:

```rust
schema File {
    @primary id: int,
    name: string
}
```

**Table structures with a primary key significantly improve query speed, so try to bind a primary key, preferably of type `int`.**

#### Method Implementation

GödelScript declares and implements methods related to `schema` as follows:

```rust
impl File {
    // Static method
    fn f1() -> ... {...}
	// Member method, the first argument must be self
	fn f2(self) -> ... {...}
	...
}
```
##### Static Methods

Static methods do not require `self` as the first argument and are straightforward to use: `ClassName::MethodName(...)`.

```rust
impl File {
    fn getSchemaName() -> string {
        return "File"
    }
}

fn out(t: string) -> bool {
    if (t = File::getSchemaName()) {
        return true
    }
}
```

##### Member Methods

The first argument for member methods must be `self`, without specifying its type. These functions are called using `InstanceName.FunctionName(...)`.

```rust
impl File {
    fn getName(self) -> string {
        return self.name
    }
}

fn out(path: string) -> bool {
    let (db = JavaDB::load("coref_java_src.db")) {
        for (f in File::__all__(db)) {
            if (path = f.getName()) {
                return true
            }
        }
    }
}
```

##### Data Loading Method `fn __all__(db)`

A `schema` can contain a special **static method** for loading its dataset from the database.

```rust
impl File {
    @data_constraint
    fn __all__(db: JavaDB) -> *File {
        ...
    }
}
```

This method must contain the special annotation `@data_constraint`, indicating that it is specialized for loading. Without this annotation, the method will return an **empty set**. The return type must be a set of itself.

A `schema` that includes this method can use syntactic sugar to get its full set:

```rust
fn out() -> bool {
    for(f in File(JavaDB::load("..."))) {
        ...
    }
    ...
}
// Equivalent to
fn out() -> bool {
    for(f in File::__all__(JavaDB::load("..."))) {
        ...
    }
    ...
}
```

#### Constructing Anonymous Instances

GödelScript allows for the creation of anonymous instances with a specific syntax. The creation of anonymous instances is contingent on the instance existing within the full set of the `schema`, unless this usage appears within a `__all__` method, in which case the result will be empty.

```rust
schema A {
    @primary id: int,
    name: string
}
```

The corresponding syntax to create an anonymous instance is as follows:

```rust
A {id: 1, name: "first"}
```

#### Schema Inheritance

Schema inheritance in GödelScript is very straightforward, exemplified as follows:

```rust
schema MyFile extends File {}
```

##### Parent Field Inheritance

The subclass will inherit all fields from the parent class by default, so there is no need to manually rewrite them.

```rust
schema File {
    @primary id: int,
    name: string
}

schema MyFile extends File {}
```

##### Parent Method Inheritance

The subclass will inherit all methods from the parent class by default, except for those marked with `@data_constraint`. There is no need to manually rewrite them. However, the `__all__` method is special and will not be inherited, so you need to rewrite the `__all__` method to determine the full set of the inherited schema.

```rust
schema File {
    @primary id: int,
    name: string
}

impl File {
    @data_constraint
    fn __all__() -> *File {...}
	fn getId(self) -> int {...}
    fn staticMethod() -> string {return "File"}
}

schema MyFile extends File {}
```

##### Method Override

If the subclass implementation contains a method with the same name as the parent class, the parent method will be **overridden** by the subclass method.
The overridden method can use different parameter and return type. There's no need to use the same parameter and return type of parent class method.

```rust
schema File {
    @primary id: int,
    name: string
}

impl File {
    fn staticMethod() -> string {return "File"}
}

schema MyFile extends File {}

impl MyFile {
    fn staticMethod() -> string {return "MyFile"}
}
```

In this case, `File::staticMethod` is overridden by `MyFile::staticMethod`, so when calling the subclass method, the result obtained will be `"MyFile"`.

### Database

#### Database Declaration

The declaration format for databases is as follows:

```rust
database DatabaseName {
    // table_name corresponds to the real table name in the db
    // GodelSchemaType corresponds to the schema in which the table data is stored after reading into godel
    table_name : *GodelSchemaType
}
```

Before the colon is the **real table name** in the loaded database; after the colon is the **data table format**, which must be a `schema` type.
For example, if a table called `annotation` exists in the db and corresponds to the `Annotation` schema, the declaration would be:

```rust
database JavaDB {
    // Reads data from the db's annotation table and stores it in Annotation
    annotation : *Annotation
}
```

Additionally, it is necessary to ensure that the `Annotation` structure matches the table structure. For example:

```rust
schema Annotation {
    @primary id: int, // The primary annotation indicates that this field is the primary key; a table can also have no primary key
    content: string
}
```

The `annotation` table must contain `id` and `content` fields with corresponding storage types.

#### Database Loading

Database types have a static method `(database)::load(filename: string)`

```rust
fn loadDatabaseExample() -> bool {
    // The string passed to load is the db's filename, not the path
    // The db's path will be passed as a command-line argument when executing godel
    let (db: JavaDB = JavaDB::load("...")) {
        ...
    }
}
```

#### Data Table Access

In the example above, to access the `annotation` table:

```rust
fn getAnnotation() -> Annotation {
    // The string passed to load is the db's filename, not the path
    // The db's path will be passed as a command-line argument when executing godel
    let (db: JavaDB = JavaDB::load("...")) {
        // Directly use db.field to access the table data
        for (anno: Annotation in db.annotation) {
            ...
        }
    }
}
```

### Import

GödelScript uses the `use` keyword to import symbols from other files:

```rust
use coref::java::* // Import all symbols
use coref::xml::Location // Import a single symbol
use coref::xml::{XmlDB, XmlElement} // Import multiple symbols
```

#### Module Import Rules

The GödelScript package manager is enabled when the input parameters include `-p {package dir path}`.

The package manager will parse the folder structure, traversing all `.gdl` files. After obtaining the relative path of the files, it will map the path to the corresponding package path. If the relative path contains `-`, or if a folder name or filename starts with a digit, the path will not be accepted by the package manager, but it will not issue an error and will simply ignore it.

If you want to know which paths were ignored, you can use the `-v` parameter. With this parameter, the package manager will report the ignored paths as `warnings`. If there are path conflicts in the mapped paths, the package manager will report them as `errors` and exit the compilation process.

```rust
packages:
  coref::cfamily    -> /.../Library/coref.cfamily.gdl
  coref::go         -> /.../Library/coref.go.gdl
  coref::java       -> /.../Library/coref.java.gdl
  coref::javascript -> /.../Library/coref.javascript.gdl
  coref::properties -> /.../Library/coref.properties.gdl
  coref::python     -> /.../Library/coref.python.gdl
  coref::sql        -> /.../Library/coref.sql.gdl
  coref::xml        -> /.../Library/coref.xml.gdl
modules
  +--coref -> coref
     |--xml -> coref::xml
     |--properties -> coref::properties
     |--cfamily -> coref::cfamily
     |--java -> coref::java
     |--javascript -> coref::javascript
     |--go -> coref::go
     |--sql -> coref::sql
     +--python -> coref::python
```

#### Path Mapping Example

```rust
Library
|-- coref.java.gdl
|-- coref.xml.gdl
+-- coref
    |-- go.gdl
    +-- a
        +-- b.gdl
=>
coref::java
coref::xml
coref::go
coref::a::b
```

In this example, there is a path conflict:

```rust
Library
|-- coref
|   |-- java.gdl
|   +-- python.gdl
+-- coref.python.gdl
=>
coref::java
coref::python -- \
                  > Conflict
coref::python -- /
```

In this example, there are invalid characters in the path:

```rust
Library
|-- 0123.gdl
|-- my-godel-lib
|   +-- js.gdl
+-- lib-file.123.gdl
=>
0123
^ The first character is a digit
my-godel-lib::js
  ^     ^ Uses the `-` character
lib-file::123
   ^      ^ First character after `.` is a digit, and the path contains `-`
```

#### Symbol Conflict

In use, it's possible to encounter situations with symbol conflicts. In such cases, direct use of `File` will result in a symbol conflict, and you need to specify one of the symbols.

```rust
use coref::java::Location
use coref::xml::Location
schema MyLoc extends Location {}
                     ^^^^^^^^
Error: "Location" is ambiguous, with multiple symbols
       "coref::java::Location, coref::xml::Location".
```

Like other languages, GödelScript allows specifying a symbol directly through its full path, provided the symbol has been imported.

```rust
use coref::java::Location
use coref::xml::Location
schema MyLoc extends coref::xml::Location {}
```

Full path symbols can be used in the following situations:

- Schema inheritance

```rust
schema JavaLocation extends coref::java::Location {}
```

- Function parameters and return values

```rust
fn return_java_file(f: coref::java::File) -> coref::java::File {
    ...
}
```

- Database declarations

```rust
database MyDB {
    java_file: coref::java::File,
    xml_file: coref::xml::File,
    java_loc: coref::java::Location,
    xml_loc: coref::xml::Location
}
```

- Query list type declarations

```rust
query example from
	coref::java::Location loc in coref::java::Location(coref::java::JavaDB::load("..."))
where
	...
select
	...
```

- Schema static method calls

```rust
for(loc in coref::java::Location(coref::java::JavaDB::load("..."))) {
    ...
}

stmt.to<coref::java::ElementParent>()
stmt.is<coref::java::ElementParent>()
```

### Query

Query is used for simple queries and is guaranteed to be output even without declaring a `main` function. The syntax format for query is as follows:

```rust
query name from
    variable in initial value,
    variable in initial value,
    variable in initial value
where condition
select value as output column name
	value as output column name,
    value as output column name,
    value as output column name
```

Variable declarations in the `from` list do not need type annotations, as the compiler will automatically infer them. Additionally, the `select` list does not use `=` but the `in` keyword. Also, in the `select` list, the output column name cannot conflict with the calculation variables, but the column name can be omitted. Omitted column names will take random names in the output results, so it's best not to omit them.

Here is a `hello world` written in query syntax:

```rust
query hello_world from
	info in "hello world"
select info as greeting
```

The code above is equivalent to the following code:

```rust
fn hello_world(greeting: string) -> bool {
    let (info = "hello world") {
        if (greeting = info) {
            return true
        }
    }
}
fn main() {
    output(hello_world())
}
```

#### Example and Composition Structure

Query includes a query name, a `from` list, a `where` filter condition, and a `select` list.

```rust
// script
use coref::java::{Callable, Class, Interface, JavaDB}

fn db() -> JavaDB {
    return JavaDB::load("coref_java_src.db")
}

query class_method from
    m in Callable(db()),
    c in Class(db())
where
    c.id = m.getBelongedClass().id
select
    c.getQualifiedName() as className,
    m.getName() as methodName,
    m.getSignature() as methodSignature
```

#### Equivalent Code

The example above is equivalent to the following code:

```rust
// script
use coref::java::{Callable, Class, Interface, JavaDB}

fn db() -> JavaDB {
  return JavaDB::load("coref_java_src.db")
}

fn main() {
  output(class_method())
}

fn class_method(className: string, methodName: string, methodSignature: string) -> bool {
  for (m in Callable(db()), c in Class(db())) {
    if (c.id = m.getBelongedClass().id) {
      if (className = c.getQualifiedName() &&
          methodName = m.getName() &&
          methodSignature = m.getSignature()) {
        return true
      }
    }
  }
}
```

### Ungrounded Error

GödelScript will determine symbols that are not bound to a set as `ungrounded`. The basic rule of judgment is:

- Uninitialized/unusued/unbound symbols
   - Unbound `int`, `string` arguments
   - Unused database type arguments
   - Function body has statements, but no return statements
- Symbols bound within negation blocks
   - For example, `!(__tmp = 1)`, `__tmp` is considered unbound
   - Calling inline functions or data constructors in negation blocks

#### 1. Unused Database/Basic Type Parameters

In the function block, if there is a branch that does not use database or basic type parameters, it will inevitably lead to `ungrounded`:

```rust
fn test(db: JavaDB, a: int, b: string) -> bool {}
        ^^          ^       ^                  ^^
Error: ungrounded parameter "db, a, b" in this branch.
```

The compiler will indicate in which branch there is an unused parameter. Check the corresponding execution path and complete the parameter constraints based on the prompt.

If some functions have basic type parameters but always use literals when called, and if `ungrounded` is incorrectly reported, you can add an `@inline` annotation to the function to avoid incorrect constraint checks.

```rust
impl XXX {
    @inline
    fn getValueByAttributeNameByDefaultValue(self, attributeName: string) -> string {
        if (self.hasAttribute(attributeName)) {
            return self.getValueByAttributeName(attributeName)
        }
        if (!self.hasAttribute(attributeName) {
            return "null"
        }
    }
}

fn xxx() -> xx {
    ..
    attr.getValueByAttributeNameByDefaultValue("pattern")
                                               ^^^^^^^^^ Use literals, add @inline to pass the check
}
```

#### 2. No Return Statement in Non-Empty Function Body

GödelScript allows an empty function body without any statements. However, if there are other statements in the function body, GödelScript requires at least one return statement, otherwise an `ungrounded` error will occur.

```rust
fn test() -> int {}
                  ^^ No statements, passes compilation

fn test() -> int {
    let (a = 1) {}
    ^^^^^^^^^^^^^^ Statements present, no return statement, ungrounded
}
```

#### 3. Using Inline Functions or Data Constructors in Negation Blocks

As mentioned above, `@inline` annotation can be used to circumvent `ungrounded` errors. However, if inline functions are used in negation blocks, it will inevitably result in `ungrounded` errors.

Similarly, data constructors are used to bind temporary intermediate variables, but this will directly result in `ungrounded` errors.
Therefore, using inline functions or data constructors in negation blocks will inevitably lead to `ungrounded` errors, and the compiler will report errors for all such cases.

```rust
if (!check(method.to<ElementParent>())) {
           ^^^^^^^^^^^^^^^^^^^^^^^^^^ ungrounded
}
if (!check(ElementParent {id: 0})) {
           ^^^^^^^^^^^^^^ ungrounded
}

@inline
fn for_test() -> ElementParent {
    ...
}
if (!check(for_test())) {
           ^^^^^^^^^^ Negation block contains inline function, ungrounded
}
```

#### 4. Negation of Chained Calls

GödelScript does not perform `ungrounded` checks for negation of chained calls, but this writing will cause an `ungrounded` error in Soufflé:

```rust
use coref::java::*

fn default_java_db() -> JavaDB {
    return JavaDB::load("coref_java_src.db")
}

fn get_field() -> *Field {
    for (field in Field(default_java_db())) {
        if (!field.getLocation().getFile().getRelativePath().contains("/test/")) {
            yield field
        }
    }
}
```

Where:

```rust
!field.getLocation().getFile().getRelativePath().contains("/test/")
```

It will be translated to a Soufflé code fragment like this:

```rust
!(__tmp = field, Field_getLocation(__tmp, __tmp_1), ..., contains("/test/", __tmp_4))
  ^^^^^                                   ^^^^^^^
```

The variables used for intermediate storage being bound in `!(...)` but due to the negation operator, this binding is considered hypothetical. However, `__tmp`, `__tmp_1` are then considered to be variables declared for the entire statement scope, leading to `ungrounded`.

This can be avoided by declaring intermediate variables to catch intermediate results in a negation operation:

```rust
fn get_field() -> *Field {
    for (field in Field(default_java_db())) {
        let (path = field.getLocation().getFile().getRelativePath()) {
            if (!path.contains("/test/")) {
                yield field
            }
        }
    }
}
```

## Query Examples

### Java

#### Unused Methods

```rust
// script
use coref::java::*

fn default_java_db() -> JavaDB {
    return JavaDB::load("coref_java_src.db")
}

fn usedMethod(m: Method) -> bool {
    for(c in CallableBinding(default_java_db())) {
        if (c.getCallee().key_eq(m)) {
            return true
        }
    }
}

// find unused methods
fn unused_method(unused: string) -> bool {
    for(m in Method(default_java_db())) {
        if (!usedMethod(m) && unused = m.getSignature()) {
            return true
        }
    }
}

fn main() {
    output(unused_method())
}
```

#### Class Inheritance Relationship

```rust
// script
use coref::java::*

fn default_java_db() -> JavaDB {
	return JavaDB::load("coref_java_src.db")
}

/**
 * Find all class and the inheritances
 * including parent class inheritance and ancestor class inheritance
 */
fn class_hierarchy(className : string, superClassName : string) -> bool {
    for (c in Class(default_java_db()), ancestor in c.getAnAncestorClass()) {
        if (className = c.getQualifiedName() &&
            superClassName = ancestor.getQualifiedName()) {
            return true
        }
    }
}

fn main() { 
	output(class_hierarchy())
}
```

#### Querying All Methods in a Class

```rust
// script
use coref::java::*

fn default_java_db() -> JavaDB {
	return JavaDB::load("coref_java_src.db")
}

// Find all methods of the class
fn methods(className : string, methodName : string) -> bool {
    for (c in Class(default_java_db()), m in c.getAllMethods()) {
        if (className = c.getQualifiedName() &&
            methodName = m.getName()){
            return true
        }
    }
}

fn main() { 
	output(methods())
}
```

### Python

#### Cyclomatic Complexity

```rust
// script
use coref::python::*

fn default_db() -> PythonDB {
    return PythonDB::load("coref_python_src.db")
}

/**
 * Get cyclomatic complexity of functions
 *
 * @param name   function name
 * @param value  cyclomatic complexity of function
 * @param path   path of file including this function
 * @param sline  function start line
 * @param eline  function end line
 */
fn getCyclomaticComplexity(
    name: string,
    value: int,
    path: string,
    sline: int,
    eline: int) -> bool {
    // get metric function
    for (c in MetricFunction(default_db())) {
        if (path = c.getLocation().getFile().getRelativePath() &&
            name = c.getQualifiedName() &&
            value = c.getCyclomaticComplexity() &&
            sline = c.getLocation().getStartLineNumber() &&
            eline = c.getLocation().getEndLineNumber()) {
            return true
        }
    }
}

fn main() {
    output(getCyclomaticComplexity())
}
```

#### Comment Rate

```rust
// script
use coref::python::*

schema PublicVisitedElement extends CombineElement {}

impl PublicVisitedElement {
    @data_constraint
    pub fn __all__(db: PythonDB) -> *PublicVisitedElement {
        for (tmp in Class(db)) {
            yield PublicVisitedElement {id: tmp.element_oid}
        }
        for (tmp in Function(db)) {
            yield PublicVisitedElement {id: tmp.element_oid}
        }
    }
}

fn default_db() -> PythonDB {
    return PythonDB::load("coref_python_src.db")
}


// count number of total public element
fn countTotalPublicElement() -> int {
    return PublicVisitedElement(default_db()).len()
}

// get public elements with Docstring comment
fn withDocstringCommentElement() -> *PublicVisitedElement {
    let (db = default_db()) {
        for (e in PublicVisitedElement(db), j in DocstringComment(db)) {
            if (e.key_eq(j.getDocumentableElement())) {
                yield e
            }
        }
    }
}

// count number of public elements with Docstring comment
fn countTotalPublicDocumentedElement() -> int {
    return withDocstringCommentElement().len()
}

fn withPublicDocumentedBelowElement() -> *PublicVisitedElement {
    let (db = default_db()) {
        for (e in PublicVisitedElement(db), j in Comment(db)) {
            if (e.key_eq(j.getDocumentedClassOrFunctionElement())) {
                yield e
            }
        }
    }
}

// count number of public element with single line comment
fn countTotalPublicDocumentedBelowElement() -> int {
    return withPublicDocumentedBelowElement().len()
}


// calculate documented percentage
fn getDocumentedPercentage(documentedPercentage: int) -> bool {
    let (i = countTotalPublicElement(),
        j = countTotalPublicDocumentedElement(),
        k = countTotalPublicDocumentedBelowElement()) {
        if (i = 0) {
            if (documentedPercentage = -1) {
                return true
            }
        }
        if (i != 0) {
            if (documentedPercentage = (j + k) * 1000 / i) {
                return true
            }
        }
    }
}

fn main() {
    output(getDocumentedPercentage())
}
```

#### Comments in a Method

```rust
// script
use coref::python::*

schema PublicVisitedElement extends CombineElement {}

impl PublicVisitedElement {
    @data_constraint
    pub fn __all__(db: PythonDB) -> *PublicVisitedElement {
        for (tmp in Class(db)) {
            yield PublicVisitedElement {id: tmp.element_oid}
        }
        for (tmp in Function(db)) {
            yield PublicVisitedElement {id: tmp.element_oid}
        }
    }

    pub fn getName(self) -> string {
        let (tmp = Class(__all_data__).find(self)) {
            return tmp.getQualifiedName() 
        }
        let (tmp = Function(__all_data__).find(self)) {
            return tmp.getQualifiedName() 
        }
    }
}

fn default_db() -> PythonDB {
    return PythonDB::load("coref_python_src.db")
}

fn hasComment(e: PublicVisitedElement) -> bool {
    let (db = default_db()) {
        for (j in DocstringComment(db)) {
            if (e.key_eq(j.getDocumentableElement())) {
                return true
            }
        }
        for (j in Comment(db)) {
            if (e.key_eq(j.getDocumentedClassOrFunctionElement())) {
                return true
            }
        }
    }
}

/**
 * Get comment of each public element
 *
 * @param type          public visited element type
 * @param name          public visited element name
 * @param filePath      file path
 * @param sline         element start line
 * @param eline         element end line
 * @param isCommented   if is commented
 */
fn output_result(
    type: string,
    name: string,
    filePath: string,
    sline: int,
    eline: int,
    isCommented: int) -> bool {
    for (e in PublicVisitedElement(default_db())) {
        if (type = e.getType() && 
            name = e.getName() &&
            filePath = e.getLocation().getFile().getRelativePath() &&
            sline = e.getLocation().getStartLineNumber() &&
            eline = e.getLocation().getEndLineNumber()) {
            if (hasComment(e)) {
                if (isCommented = 1) {
                    return true
                }
            }
            if (!hasComment(e)) {
                if (isCommented = 0) {
                    return true
                }
            }
        }
    }
}

fn main() {
    output(output_result())
}
```

### JavaScript

#### AST Print

```rust
// script
use coref::javascript::*

/**
 * print AST
 *
 * @param filePath          file path
 * @param parentId          parent node ID
 * @param parentKind        parent node kind
 * @param parentStartLine   parent node start line
 * @param parentEndLine     parent node end line
 * @param childId           child node ID
 * @param childKind         child node kind
 * @param childStartLine    child node start line
 * @param childEndLine      child node end line
 * @param index             child node index
 */
fn out(
    filePath: string,
    parentId: int,
    parentKind: string,
    parentStartLine: int,
    parentEndLine: int,
    childId: int,
    childKind: string,
    childStartLine: int,
    childEndLine: int,
    index: int
) -> bool {
    let (db = JavascriptDB::load("coref_javascript_src.db")) {
        for (parent in Node(db),
            child in Node(db),
            parentSyntaxKind in SyntaxKind(),
            childSyntaxKind in SyntaxKind(),
            parentLocation in Location(db),
            childLocation in Location(db),
            file in File(db)) {
            if (parent.key_eq(child.getParent()) &&
                parentId = parent.id &&
                childId = child.id &&
                parentSyntaxKind.id = parent.getKind() &&
                childSyntaxKind.id = child.getKind() &&
                parentKind = parentSyntaxKind.getName() &&
                childKind = childSyntaxKind.getName() &&
                index = child.getIndex() &&
                parentLocation = parent.getLocation() &&
                childLocation = parent.getLocation() &&
                file = parentLocation.getFile() &&
                filePath = file.getRelativePath() &&
                parentStartLine = parentLocation.getStartLineNumber() &&
                parentEndLine = parentLocation.getEndLineNumber() &&
                childStartLine = childLocation.getStartLineNumber() &&
                childEndLine = childLocation.getEndLineNumber()) {
                return true
            }
        }
    }
}

fn main() {
    output(out())
}
```

#### Cyclomatic complexity

```rust
// script
use coref::javascript::*

fn default_db() -> JavascriptDB {
    return JavascriptDB::load("coref_javascript_src.db")
}

/**
 * Output the cyclomatic complexity of each function
 *
 * @param filePath      file path
 * @param functionName  function name
 * @param complexity    cyclomatic complexity
 * @param startLine     function start line
 * @param endLine       function end line
 */
fn out(filePath: string, functionName: string, complexity: int, startLine: int, endLine: int) -> bool {
    let (db = default_db()) {
        for (func in FunctionLikeDeclaration(db), file in File(db)) {
            if (complexity = func.getCyclomaticComplexity() &&
                functionName = func.getName() &&
                file = func.getLocation().getFile() &&
                filePath = file.getRelativePath() &&
                startLine = func.getLocation().getStartLineNumber() &&
                endLine = func.getLocation().getEndLineNumber()) {
                return true
            }
        }
    }
}

fn main() {
    output(out())
}
```

#### Change Effect

```rust
// script
use coref::javascript::*

fn default_db() -> JavascriptDB {
    return JavascriptDB::load("coref_javascript_src.db")
}

fn getACallerFunction(function: FunctionLikeDeclaration, callerFunction: FunctionLikeDeclaration) -> bool {
    for (mayInvokeExpression in MayInvokeExpression(default_db())) {
        if (mayInvokeExpression = function.getACallSite() &&
            callerFunction = mayInvokeExpression.getEnclosingFunction()) {
            return true
        }
    }
}

fn getAnEffectedFunction(function: FunctionLikeDeclaration, effectedFunction: FunctionLikeDeclaration) -> bool {
    if (getACallerFunction(function, effectedFunction)) {
        return true
    }
    for (callerFunction in FunctionLikeDeclaration(default_db())) {
        if (getACallerFunction(function, callerFunction) &&
            getAnEffectedFunction(callerFunction, effectedFunction)) {
            return true
        }
    }
}

/**
 * Query the effected functions according to the changed lines.
 *
 * @param function              the changed function id
 * @param signature             the changed function signature
 * @param functionPath          the changed function file path
 * @param startLine             the changed function start line
 * @param endLine               the changed function end line
 * @param effectedFunction      the effected function id
 * @param effectedSignature     the effected function signature
 * @param effectedFunctionPath  the effected function file path
 * @param effectedStartLine     the effected function start line
 * @param effectedEndLine       the effected function end line
 */
fn out(
    function: FunctionLikeDeclaration,
    signature: string,
    functionPath: string,
    startLine: int,
    endLine: int,
    effectedFunction: FunctionLikeDeclaration,
    effectedSignature: string,
    effectedFunctionPath: string,
    effectedStartLine: int,
    effectedEndLine: int
) -> bool {
    if (getAnEffectedFunction(function, effectedFunction)) {
        let (symbol = function.getSymbol(),
            effectedSymbol = effectedFunction.getSymbol(),
            location = function.getLocation(),
            effectedLocation = effectedFunction.getLocation()) {
            if (signature = symbol.getDescription() &&
                effectedSignature = effectedSymbol.getDescription() &&
                functionPath = location.getRelativePath() &&
                startLine = location.getStartLineNumber() &&
                endLine = location.getEndLineNumber() &&
                effectedFunctionPath = effectedLocation.getRelativePath() &&
                effectedStartLine = effectedLocation.getStartLineNumber() &&
                effectedEndLine = effectedLocation.getEndLineNumber()) {
                return true
            }
        }
    }
}

fn main() {
    output(out())
}
```

### XML

#### Getting bean

```rust
// script
use coref::xml::*

schema BeanXmlElement extends XmlElement {}

impl BeanXmlElement {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *BeanXmlElement {
        for (e in XmlElement(db)) {
            let (path = e.getLocation().getFile().getRelativePath()) {
                if (!path.contains("target") && e.getName() = "bean") {
                    yield BeanXmlElement {
                        id: e.id,
                        location_id: e.location_id,
                        parent_id: e.parent_id,
                        index_order: e.index_order
                    }
                }
            }
        }
    }
}

schema EntryXmlElement extends XmlElement {}

impl EntryXmlElement {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *EntryXmlElement {
        for (e in XmlElement(db)) {
            if (e.getName() = "entry") {
                yield EntryXmlElement {
                    id: e.id,
                    location_id: e.location_id,
                    parent_id: e.parent_id,
                    index_order: e.index_order
                }
            }
        }
    }
}

schema PropertyXmlElement extends XmlElement {}

impl PropertyXmlElement {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *PropertyXmlElement {
        for (e in XmlElement(db)) {
            if (e.getName() = "property") {
                yield PropertyXmlElement {
                    id: e.id,
                    location_id: e.location_id,
                    parent_id: e.parent_id,
                    index_order: e.index_order
                }
            }
        }
    }
}

fn default_db() -> XmlDB {
    return XmlDB::load("coref_xml_src.db")
}

// get class name
fn getClassName(bean: BeanXmlElement) -> string {
    for (attr in bean.getAttribute()) {
        if (attr.getName() = "class") {
            return attr.getValue()
        }
    }
}

// get key
fn getKey(e: EntryXmlElement) -> string {
    for (attr in e.getAttribute()) {
        if (attr.getName() = "key") {
            return attr.getValue()
        }
    }
}

// output value and class info of the bean
fn output1(className: string, pName: string, kName: string) -> bool {
    let (db = default_db()) {
        for (bean in BeanXmlElement(db), p in PropertyXmlElement(db), e in EntryXmlElement(db)) {
            if (className = getClassName(bean) &&
                bean.key_eq(p.getParent()) &&
                p.key_eq(e.getParent().getParent()) &&
                pName = p.getName() &&
                kName = getKey(e)) {
                return true
            }
        }
    }
}

fn main() {
    output(output1())
}
```

#### POM

```rust
// script
use coref::xml::*

schema DependencyElement extends XmlElement {}

impl DependencyElement {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *DependencyElement {
        for(e in XmlElement(db)) {
            if (e.getElementName() = "dependency") {
                yield DependencyElement {
                    id: e.id,
                    location_id: e.location_id,
                    parent_id: e.parent_id,
                    index_order: e.index_order
                }
            }
        }
    }
}

schema GroupElement extends XmlElement {}

impl GroupElement {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *GroupElement {
        for(e in XmlElement(db)) {
            if (e.getElementName() = "groupId") {
                yield GroupElement {
                    id: e.id,
                    location_id: e.location_id,
                    parent_id: e.parent_id,
                    index_order: e.index_order
                }
            }
        }
    }
}

schema VersionElement extends XmlElement {}

impl VersionElement {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *VersionElement {
        for(e in XmlElement(db)) {
            if (e.getElementName() = "version") {
                yield VersionElement {
                    id: e.id,
                    location_id: e.location_id,
                    parent_id: e.parent_id,
                    index_order: e.index_order
                }
            }
        }
    }
}

schema ArtifactElement extends XmlElement {}

impl ArtifactElement {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *ArtifactElement {
        for(e in XmlElement(db)) {
            if (e.getElementName() = "artifactId") {
                yield ArtifactElement {
                    id: e.id,
                    location_id: e.location_id,
                    parent_id: e.parent_id,
                    index_order: e.index_order
                }
            }
        }
    }
}

schema PomFile extends XmlFile {}

impl PomFile {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *PomFile {
        for(f in XmlFile(db)) {
            if (f.getFileName() = "pom.xml") {
                yield PomFile {
                    id: f.id,
                    file_name: f.file_name,
                    relative_path: f.relative_path
                }
            }
        }
    }
}

// output relative path of the file, referenced jar name and version
fn out(fileName: string, m1: string, m2: string, m3: string) -> bool {
    let (db = XmlDB::load("coref_xml_src.db")) {
        for (f in PomFile(db),
            e1 in GroupElement(db),
            e2 in VersionElement(db),
            e3 in ArtifactElement(db),
            c1 in XmlCharacter(db),
            c2 in XmlCharacter(db),
            c3 in XmlCharacter(db),
            p in DependencyElement(db)) {
            if (f.key_eq(p.getLocation().getFile()) &&
                fileName = f.getRelativePath() &&
                p.key_eq(e1.getParent()) &&
                e1.key_eq(c1.getBelongedElement()) &&
                m1 = c1.getText() &&
                p.key_eq(e2.getParent()) &&
                e2.key_eq(c2.getBelongedElement()) &&
                m2 = c2.getText() &&
                p.key_eq(e3.getParent()) &&
                e3.key_eq(c3.getBelongedElement()) &&
                m3 = c3.getText()) {
                return true
            }
        }
    }
}

fn main() {
    output(out())
}
```

#### RPC

```rust
// script
use coref::xml::*

// select XmlElement containing "mobileService"
schema MobileServiceXmlElement extends XmlElement{}

impl MobileServiceXmlElement {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *MobileServiceXmlElement {
        for (e in XmlElement(db)) {
            if (e.getElementName() = "mobileService") {
                yield MobileServiceXmlElement {
                    id: e.id,
                    location_id: e.location_id,
                    parent_id: e.parent_id,
                    index_order: e.index_order
                }
            }
        }
    }

    pub fn getServiceBeanValue(self) -> string {
        for (a in self.getAttribute()) {
            if (a.getName() = "serviceBean") {
                return a.getValue()
            }
        }
    }
}

// select XmlElement containing "sofa:extension"
schema SofaExtensionXmlElement extends XmlElement{}
impl SofaExtensionXmlElement {
    @data_constraint
    pub fn __all__(db: XmlDB) -> *SofaExtensionXmlElement {
        for (e in XmlElement(db)) {
            if (e.getName() = "sofa:extension") {
                yield SofaExtensionXmlElement {
                    id: e.id,
                    location_id: e.location_id,
                    parent_id: e.parent_id,
                    index_order: e.index_order
                }
            }
        }
    }
}

fn out(value: string) -> bool {
    let (db = XmlDB::load("coref_xml_src.db")) {
        for (m in MobileServiceXmlElement(db), s in SofaExtensionXmlElement(db), ancestor in m.getAnAncestor()) {
            if (s.key_eq(ancestor) && value = m.getServiceBeanValue()) {
                return true
            }
        }
    }
}

fn main() {
    output(out())
}
```

### Go

#### Message of All Files

```rust
// script
use coref::go::*

fn default_db() -> GoDB {
    return GoDB::load("coref_go_src.db")
}
/**
 * @param name          file name
 * @param funcCount     function/method quantity
 * @param totallines    total lines of file
 * @param codelines     code line of file
 * @param commentlines  comment line of fine
 * @param md5           md5 of this file
 * @param sha256        sha256 of this file
 */
fn out(
    name: string,
    funcCount: int,
    totallines: int,
    codelines: int,
    commentlines: int,
    md5: string,
    sha256: string) -> bool {
    for(f in File(default_db())) {
        if (name = f.getName() &&
            funcCount = f.getFunctionCount() &&
            md5 = f.getMd5Sum() &&
            sha256 = f.getSha256Sum() &&
            totallines = f.getLineInfo().getNumberOfTotalLines() &&
            codelines = f.getLineInfo().getNumberOfCodeLines() &&
            commentlines = f.getLineInfo().getNumberOfCommentLines()) {
            return true
        }
    }
}

fn main() {
    output(out())
}
```

#### Methods and Corresponding Comments

```rust
// script
use coref::go::*

fn default_db() -> GoDB {
    return GoDB::load("coref_go_src.db")
}

// Define a predicate called 'out' with parameters fileName, funcName, funcComment, and signature
fn out(fileName: string, funcName: string, funcComment: string, signature: string) -> bool {
    // Check if there exists a Function object 'func'
    for(func in Function(default_db())) {
        if (
            // Get the name of the file the function belongs to and assign it to the variable 'fileName'
            fileName = func.getBelongsFile().getName() &&
            // Get the name of the function and assign it to the variable 'funcName'
            funcName = func.getName() &&
            // Get the associated comment string for the function and assign it to the variable 'funcComment'
            funcComment = func.getAssociatedCommentString() &&
            // Get the function type signature and assign it to the variable 'signature'
            signature = func.getFunctionTypeSignature()) {
            return true
        }
    }
}

fn main() {
    output(out())
}
```

#### Cyclomatic complexity

```rust
// script
use coref::go::*

fn default_db() -> GoDB {
    return GoDB::load("coref_go_src.db")
}

/**
 * @param name: file name
 * @param func: function name
 * @param cmplx: function cyclomatic complexity
 * @param sl,el,sc,ec: function location info
 */
fn out(name: string, func: string, cmplx: int, sl: int, el: int) -> bool {
    for(f in GoFile(default_db()), function in Function(default_db())) {
        if ((!f.isAutoGenereatedFile()) &&
            f.key_eq(function.getBelongsFile()) &&
            name = f.getName() &&
            func = function.getName() &&
            cmplx = function.getCyclomaticComplexity() &&
            sl = function.getLocation().getStartLineNumber() &&
            el = function.getLocation().getEndLineNumber()) {
            return true
        }
    }
}

fn main() {
    output(out())
}
```

## Query Debugging and Optimization Techniques

When running GödelScript scripts, it is common to encounter issues with excessively long run times. Here, we provide some basic methods for diagnosis and solutions.

### Schema Parameters Causing Excessive Cartesian Products

By default, function parameters without the `@inline` annotation are considered "qualification" conditions, not true input values.

For example, in the following case, `get` receives a `Class` type parameter, but the actual final compilation result will resemble the code below:

```rust
fn check(class: Class) -> bool {
    if (class.getName().contains("io")) {
        return true
    }
}

// Actual compilation result
fn check(class: Class) -> bool {
    // Actually, it needs to fetch the entire Class set first
    for(__temp_class in Class::__all__(__all_data__)) {
        if (class = __temp_class) {
            if (class.getName().contains("io")) {
                return true
            }
        }
    }
}
```

Therefore, when passing multiple schema types as parameters, there will be Cartesian products of multiple full schema sets, leading to a significant increase in space and time costs.
The solution is simple: just add an `@inline` annotation:

```rust
@inline
fn check(class: Class) -> bool {
    if (class.getName().contains("io")) {
        return true
    }
}

fn example() -> bool {
    for(class in Class(default_java_db())) {
        if (check(class)) {
            return true
        }
    }
}

// The inline annotation will forcibly inline the function into the statement during the code generation stage, avoiding multiple table loads
// The actual compilation result is similar to
fn example() -> bool {
    for(class in Class(default_java_db())) {
        if (class.getName().contains("io")) {
            return true
        }
    }
}
```

### Multiple `for` Loops Causing Excessive Cartesian Products

In some cases, it is unavoidable to use multiple layers of `for` loops to load multiple tables for joint queries, causing severe inflation of Cartesian products. The number of Cartesian product results can be reduced by decreasing (filtering) the size of the sets in advance, as shown in the example:

```rust
fn getByIndex(self) -> Expression {
    let (db = default_java_db()) {
        for(e in Expression(db), p in Parameter(db)) {
            let (i = p.getIndex()) {
                if (e.key_eq(self.getValueByIndex(i))) {
                    return e
                }
            }
        }
    }
}
```

In this example, e and p form a Cartesian product, causing the intermediate process to take too long.
The set i is actually obtained from a method of p, and in actual use, this set is very small, much smaller than the full set of Parameter. Therefore, the retrieval of the i set can be extracted as a separate function to produce a small set, avoiding Cartesian product computations between large sets while ensuring result equivalence:

```rust
fn getAllParameterIndex() -> *int {
    let (db = default_java_db()) {
        for (p in Parameter(db)) {
            yield p.getIndex()
        }
    }
}

fn getByIndex(self) -> Expression {
    let (db = default_java_db()) {
        for(e in Expression(db), i in getAllParameterIndex()) {
            if (e.key_eq(self.getValueByIndex(i))) {
                return e
            }
        }
	}
}
```

The Cartesian product of e and p becomes e and i. Operationally, the cost of the Cartesian product is reduced, and the `getIndex` operation is advanced, rather than taking place after the Cartesian product, significantly improving performance.

### Do Not Overuse `@inline` / Must Use `@inline` Optimization Strategy

The underlying mechanism of inline functions is to **expand at the call site**. If the function does not have a large number of schema parameters and is called in many places, inline may lead to **code bloat and an exponential increase in the number of redundant calculations**, which may sometimes be counterproductive in reducing runtime.
If you must use inline, such as to avoid `ungrounded`, but find that using inline slows down the execution speed, you can split the embedded statements into predicates to prevent code bloat caused by expansion.

In the following example, `getValueByAttributeNameByDefaultValue` is marked with inline to prevent `attributeName` from being identified as `ungrounded`. Subsequently, a conditional statement was added in the if branch, causing the execution time to increase from 3 seconds to 35 seconds:

```rust
impl XmlElementBase {
  @inline
  fn getValueByAttributeNameByDefaultValue(self, attributeName: string) -> string {
    if (self.hasAttribute(attributeName)) {
      // return self.getValueByAttributeName(attributeName)
      // Changed to the following statement:
      let(value = self.getValueByAttributeName(attributeName)) {
        If (value = "n/a") {
          return ""
        }
        if (value != "n/a") {
          return value
        }
      }
    }
    if (!self.hasAttribute(attributeName)) {
      return "null"
    }
  }
}
```

As you can see, adding a level of assignment and a conditional statement, where this function is called nearly 20 times in the subsequent context, resulted in the code being expanded nearly 20 times. This also caused a magnitude difference in performance. At this point, you can extract the changed statement into a separate function. Since the extracted function does not use complex types as parameters, performance is not lost without inline, and after extraction, the result is as follows:

```rust
impl XmlElementBase {
  fn getTransValueByAttributeName(self, attributeName: string) -> string {
    let (value = self.getValueByAttributeName(attributeName)) {
      if (value = "n/a") {
        return ""
      }
      if (value != "n/a") {
        return value
      }
    }
  }
  @inline
  fn getValueByAttributeNameByDefaultValue(self, attributeName: string) -> string {
    if (self.hasAttribute(attributeName)) {
      return self.getTransValueByAttributeName(attributeName)
    }
    if (!self.hasAttribute(attributeName)) {
      return "null"
    }
  }
}
```

This way, the execution time is reduced from 35 seconds back to 3 seconds, meeting expectations.

## Using Query Scripts Locally

For instructions on using query scripts on your machine, see [Installation, Configuration, and Running](./3_install_and_run.md).