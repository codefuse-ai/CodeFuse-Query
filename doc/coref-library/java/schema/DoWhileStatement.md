# DoWhileStatement

Primary key: `element_hash_id: int`

```rust
schema DoWhileStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## DoWhileStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: DoWhileStatement) -> NumberOfLines;
```
## DoWhileStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: DoWhileStatement) -> ElementParent;
```
## DoWhileStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: DoWhileStatement) -> Callable;
```
## DoWhileStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: DoWhileStatement) -> *Statement;
```
## DoWhileStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: DoWhileStatement) -> *ElementParent;
```
## DoWhileStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: DoWhileStatement) -> Statement;
```
## DoWhileStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: DoWhileStatement) -> *Statement;
```
## DoWhileStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: DoWhileStatement) -> string;
```
## DoWhileStatement::getBody

```rust
/**
     * @brief gets the body of this while loop.
     * @return Statement 
     */
```
```rust
pub fn getBody(self: DoWhileStatement) -> Statement;
```
## DoWhileStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: DoWhileStatement) -> string;
```
## DoWhileStatement::getCondition

```rust
/**
     * @brief gets the boolean condition of this do-while loop.
     * @return Expression 
     */
```
```rust
pub fn getCondition(self: DoWhileStatement) -> Expression;
```
## DoWhileStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: DoWhileStatement) -> Location;
```
## DoWhileStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: DoWhileStatement) -> int;
```
## DoWhileStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *DoWhileStatement;
```
## DoWhileStatement::is\<T\>

```rust
pub fn is<T>(self: DoWhileStatement) -> bool;
```
## DoWhileStatement::to\<T\>

```rust
pub fn to<T>(self: DoWhileStatement) -> <any>;
```
## DoWhileStatement::key\_neq

```rust
pub fn key_neq(self: DoWhileStatement, object: <any>) -> bool;
```
## DoWhileStatement::key\_eq

```rust
pub fn key_eq(self: DoWhileStatement, object: <any>) -> bool;
```
## DoWhileStatement::to\_set

```rust
pub fn to_set(self: DoWhileStatement) -> *DoWhileStatement;
```
