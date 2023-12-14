# ReturnStatement

Primary key: `element_oid: int`

```rust
schema ReturnStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## ReturnStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ReturnStatement) -> NumberOfLines;
```
## ReturnStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: ReturnStatement) -> CombineElement;
```
## ReturnStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ReturnStatement) -> int;
```
## ReturnStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: ReturnStatement) -> Scope;
```
## ReturnStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ReturnStatement) -> string;
```
## ReturnStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ReturnStatement) -> int;
```
## ReturnStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: ReturnStatement) -> *CombineElement;
```
## ReturnStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: ReturnStatement) -> *Statement;
```
## ReturnStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ReturnStatement) -> Statement;
```
## ReturnStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: ReturnStatement) -> int;
```
## ReturnStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ReturnStatement) -> string;
```
## ReturnStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ReturnStatement) -> Location;
```
## ReturnStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ReturnStatement;
```
## ReturnStatement::is\<T\>

```rust
pub fn is<T>(self: ReturnStatement) -> bool;
```
## ReturnStatement::to\<T\>

```rust
pub fn to<T>(self: ReturnStatement) -> <any>;
```
## ReturnStatement::key\_neq

```rust
pub fn key_neq(self: ReturnStatement, object: <any>) -> bool;
```
## ReturnStatement::key\_eq

```rust
pub fn key_eq(self: ReturnStatement, object: <any>) -> bool;
```
## ReturnStatement::to\_set

```rust
pub fn to_set(self: ReturnStatement) -> *ReturnStatement;
```
