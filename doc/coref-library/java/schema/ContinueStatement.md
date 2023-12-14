# ContinueStatement

Primary key: `element_hash_id: int`

```rust
schema ContinueStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ContinueStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ContinueStatement) -> NumberOfLines;
```
## ContinueStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: ContinueStatement) -> ElementParent;
```
## ContinueStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ContinueStatement) -> int;
```
## ContinueStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ContinueStatement) -> int;
```
## ContinueStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ContinueStatement) -> Callable;
```
## ContinueStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ContinueStatement) -> string;
```
## ContinueStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: ContinueStatement) -> *Statement;
```
## ContinueStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ContinueStatement) -> *ElementParent;
```
## ContinueStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ContinueStatement) -> Statement;
```
## ContinueStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: ContinueStatement) -> *Statement;
```
## ContinueStatement::getStatement

```rust
/**
     * @brief gets the continued statement.
     * @return Statement 
     */
```
```rust
pub fn getStatement(self: ContinueStatement) -> Statement;
```
## ContinueStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ContinueStatement) -> string;
```
## ContinueStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: ContinueStatement) -> Location;
```
## ContinueStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ContinueStatement) -> int;
```
## ContinueStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ContinueStatement;
```
## ContinueStatement::is\<T\>

```rust
pub fn is<T>(self: ContinueStatement) -> bool;
```
## ContinueStatement::to\<T\>

```rust
pub fn to<T>(self: ContinueStatement) -> <any>;
```
## ContinueStatement::key\_neq

```rust
pub fn key_neq(self: ContinueStatement, object: <any>) -> bool;
```
## ContinueStatement::key\_eq

```rust
pub fn key_eq(self: ContinueStatement, object: <any>) -> bool;
```
## ContinueStatement::to\_set

```rust
pub fn to_set(self: ContinueStatement) -> *ContinueStatement;
```
