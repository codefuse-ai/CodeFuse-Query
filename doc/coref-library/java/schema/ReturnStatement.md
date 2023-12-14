# ReturnStatement

Primary key: `element_hash_id: int`

```rust
schema ReturnStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
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
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: ReturnStatement) -> ElementParent;
```
## ReturnStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ReturnStatement) -> int;
```
## ReturnStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ReturnStatement) -> int;
```
## ReturnStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ReturnStatement) -> Callable;
```
## ReturnStatement::getResult

```rust
/**
     * @brief gets the return result of the statement.
     * @return Expression 
     */
```
```rust
pub fn getResult(self: ReturnStatement) -> Expression;
```
## ReturnStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ReturnStatement) -> string;
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
## ReturnStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ReturnStatement) -> *ElementParent;
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
## ReturnStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: ReturnStatement) -> *Statement;
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
## ReturnStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ReturnStatement) -> int;
```
## ReturnStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReturnStatement;
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
