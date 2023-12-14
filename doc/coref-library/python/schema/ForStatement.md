# ForStatement

Primary key: `element_oid: int`

```rust
schema ForStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## ForStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ForStatement) -> NumberOfLines;
```
## ForStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: ForStatement) -> CombineElement;
```
## ForStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ForStatement) -> int;
```
## ForStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: ForStatement) -> Scope;
```
## ForStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ForStatement) -> string;
```
## ForStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ForStatement) -> int;
```
## ForStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: ForStatement) -> *CombineElement;
```
## ForStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: ForStatement) -> *Statement;
```
## ForStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ForStatement) -> Statement;
```
## ForStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: ForStatement) -> int;
```
## ForStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ForStatement) -> string;
```
## ForStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ForStatement) -> Location;
```
## ForStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ForStatement;
```
## ForStatement::is\<T\>

```rust
pub fn is<T>(self: ForStatement) -> bool;
```
## ForStatement::to\<T\>

```rust
pub fn to<T>(self: ForStatement) -> <any>;
```
## ForStatement::key\_neq

```rust
pub fn key_neq(self: ForStatement, object: <any>) -> bool;
```
## ForStatement::key\_eq

```rust
pub fn key_eq(self: ForStatement, object: <any>) -> bool;
```
## ForStatement::to\_set

```rust
pub fn to_set(self: ForStatement) -> *ForStatement;
```
