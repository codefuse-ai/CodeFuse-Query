# WithStatement

Primary key: `element_oid: int`

```rust
schema WithStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## WithStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: WithStatement) -> NumberOfLines;
```
## WithStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: WithStatement) -> CombineElement;
```
## WithStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: WithStatement) -> int;
```
## WithStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: WithStatement) -> Scope;
```
## WithStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: WithStatement) -> string;
```
## WithStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: WithStatement) -> int;
```
## WithStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: WithStatement) -> *Statement;
```
## WithStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: WithStatement) -> *CombineElement;
```
## WithStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: WithStatement) -> Statement;
```
## WithStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: WithStatement) -> int;
```
## WithStatement::getWithItem

```rust
/**
     * @brief gets the with item of the with statement.
     * @return WithItem 
     */
```
```rust
pub fn getWithItem(self: WithStatement) -> WithItem;
```
## WithStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: WithStatement) -> string;
```
## WithStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: WithStatement) -> Location;
```
## WithStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *WithStatement;
```
## WithStatement::is\<T\>

```rust
pub fn is<T>(self: WithStatement) -> bool;
```
## WithStatement::to\<T\>

```rust
pub fn to<T>(self: WithStatement) -> <any>;
```
## WithStatement::key\_neq

```rust
pub fn key_neq(self: WithStatement, object: <any>) -> bool;
```
## WithStatement::key\_eq

```rust
pub fn key_eq(self: WithStatement, object: <any>) -> bool;
```
## WithStatement::to\_set

```rust
pub fn to_set(self: WithStatement) -> *WithStatement;
```
