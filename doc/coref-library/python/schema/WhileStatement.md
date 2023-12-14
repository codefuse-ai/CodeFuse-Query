# WhileStatement

Primary key: `element_oid: int`

```rust
schema WhileStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## WhileStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: WhileStatement) -> NumberOfLines;
```
## WhileStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: WhileStatement) -> CombineElement;
```
## WhileStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: WhileStatement) -> int;
```
## WhileStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: WhileStatement) -> Scope;
```
## WhileStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: WhileStatement) -> string;
```
## WhileStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: WhileStatement) -> int;
```
## WhileStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: WhileStatement) -> *CombineElement;
```
## WhileStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: WhileStatement) -> *Statement;
```
## WhileStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: WhileStatement) -> Statement;
```
## WhileStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: WhileStatement) -> int;
```
## WhileStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: WhileStatement) -> string;
```
## WhileStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: WhileStatement) -> Location;
```
## WhileStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *WhileStatement;
```
## WhileStatement::is\<T\>

```rust
pub fn is<T>(self: WhileStatement) -> bool;
```
## WhileStatement::to\<T\>

```rust
pub fn to<T>(self: WhileStatement) -> <any>;
```
## WhileStatement::key\_neq

```rust
pub fn key_neq(self: WhileStatement, object: <any>) -> bool;
```
## WhileStatement::key\_eq

```rust
pub fn key_eq(self: WhileStatement, object: <any>) -> bool;
```
## WhileStatement::to\_set

```rust
pub fn to_set(self: WhileStatement) -> *WhileStatement;
```
