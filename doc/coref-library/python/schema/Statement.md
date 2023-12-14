# Statement

Primary key: `element_oid: int`

```rust
schema Statement {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string,
}
```
## Statement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: Statement) -> string;
```
## Statement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Statement) -> int;
```
## Statement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: Statement) -> Statement;
```
## Statement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Statement) -> *CombineElement;
```
## Statement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: Statement) -> *Statement;
```
## Statement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Statement) -> int;
```
## Statement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Statement) -> string;
```
## Statement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: Statement) -> Scope;
```
## Statement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Statement) -> int;
```
## Statement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Statement) -> CombineElement;
```
## Statement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Statement;
```
## Statement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Statement) -> Location;
```
## Statement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Statement) -> NumberOfLines;
```
## Statement::is\<T\>

```rust
pub fn is<T>(self: Statement) -> bool;
```
## Statement::to\<T\>

```rust
pub fn to<T>(self: Statement) -> <any>;
```
## Statement::key\_neq

```rust
pub fn key_neq(self: Statement, object: <any>) -> bool;
```
## Statement::key\_eq

```rust
pub fn key_eq(self: Statement, object: <any>) -> bool;
```
## Statement::to\_set

```rust
pub fn to_set(self: Statement) -> *Statement;
```
