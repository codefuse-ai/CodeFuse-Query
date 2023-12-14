# TryStatement

Primary key: `element_oid: int`

```rust
schema TryStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## TryStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: TryStatement) -> NumberOfLines;
```
## TryStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: TryStatement) -> CombineElement;
```
## TryStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: TryStatement) -> int;
```
## TryStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: TryStatement) -> Scope;
```
## TryStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: TryStatement) -> string;
```
## TryStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: TryStatement) -> int;
```
## TryStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: TryStatement) -> *CombineElement;
```
## TryStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: TryStatement) -> *Statement;
```
## TryStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: TryStatement) -> Statement;
```
## TryStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: TryStatement) -> int;
```
## TryStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: TryStatement) -> string;
```
## TryStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: TryStatement) -> Location;
```
## TryStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *TryStatement;
```
## TryStatement::is\<T\>

```rust
pub fn is<T>(self: TryStatement) -> bool;
```
## TryStatement::to\<T\>

```rust
pub fn to<T>(self: TryStatement) -> <any>;
```
## TryStatement::key\_neq

```rust
pub fn key_neq(self: TryStatement, object: <any>) -> bool;
```
## TryStatement::key\_eq

```rust
pub fn key_eq(self: TryStatement, object: <any>) -> bool;
```
## TryStatement::to\_set

```rust
pub fn to_set(self: TryStatement) -> *TryStatement;
```
