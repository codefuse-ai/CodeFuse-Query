# MetricFunction

Primary key: `element_oid: int`

```rust
schema MetricFunction {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string,
}
```
## MetricFunction::getName

```rust
/**
     * @brief gets the name of the function.
     * @return string 
     */
```
```rust
pub fn getName(self: MetricFunction) -> string;
```
## MetricFunction::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: MetricFunction) -> Statement;
```
## MetricFunction::getArgumentByIndex

```rust
/**
     * @brief gets the arg by index of the function.
     * @return Arg 
     */
```
```rust
pub fn getArgumentByIndex(self: MetricFunction, i: int) -> Arg;
```
## MetricFunction::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: MetricFunction) -> string;
```
## MetricFunction::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: MetricFunction) -> *Statement;
```
## MetricFunction::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: MetricFunction) -> *CombineElement;
```
## MetricFunction::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: MetricFunction) -> int;
```
## MetricFunction::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: MetricFunction) -> string;
```
## MetricFunction::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: MetricFunction) -> Scope;
```
## MetricFunction::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: MetricFunction) -> int;
```
## MetricFunction::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: MetricFunction) -> CombineElement;
```
## MetricFunction::getQualifiedName

```rust
/**
     * @brief gets the qualified name of the function.
     * @return string 
     */
```
```rust
pub fn getQualifiedName(self: MetricFunction) -> string;
```
## MetricFunction::getCyclomaticComplexity

```rust
/**
     * @brief The cyclomatic complexity of a callable is defined as the number
     * of branching statements (`if`, `while`, `do`, `for`, `matchcase`, `except`)
     * plus the number of branching expressions (`?`, `&&` and `||`)
     * plus one.
     * @return int 
     */
```
```rust
pub fn getCyclomaticComplexity(self: MetricFunction) -> int;
```
## MetricFunction::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: MetricFunction) -> int;
```
## MetricFunction::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: MetricFunction) -> NumberOfLines;
```
## MetricFunction::getArguments

```rust
/**
     * @brief gets the arguments of the function.
     * @return Arguments 
     */
```
```rust
pub fn getArguments(self: MetricFunction) -> Arguments;
```
## MetricFunction::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: MetricFunction) -> Location;
```
## MetricFunction::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *MetricFunction;
```
## MetricFunction::is\<T\>

```rust
pub fn is<T>(self: MetricFunction) -> bool;
```
## MetricFunction::to\<T\>

```rust
pub fn to<T>(self: MetricFunction) -> <any>;
```
## MetricFunction::key\_neq

```rust
pub fn key_neq(self: MetricFunction, object: <any>) -> bool;
```
## MetricFunction::key\_eq

```rust
pub fn key_eq(self: MetricFunction, object: <any>) -> bool;
```
## MetricFunction::to\_set

```rust
pub fn to_set(self: MetricFunction) -> *MetricFunction;
```
