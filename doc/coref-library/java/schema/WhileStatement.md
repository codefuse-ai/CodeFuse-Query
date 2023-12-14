# WhileStatement

Primary key: `element_hash_id: int`

```rust
schema WhileStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
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
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: WhileStatement) -> ElementParent;
```
## WhileStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: WhileStatement) -> int;
```
## WhileStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: WhileStatement) -> Callable;
```
## WhileStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: WhileStatement) -> int;
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
## WhileStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: WhileStatement) -> *ElementParent;
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
## WhileStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: WhileStatement) -> *Statement;
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
## WhileStatement::getBody

```rust
/**
     * @brief gets the body of this while loop.
     * @return Statement 
     */
```
```rust
pub fn getBody(self: WhileStatement) -> Statement;
```
## WhileStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: WhileStatement) -> string;
```
## WhileStatement::getCondition

```rust
/**
     * @brief gets the boolean condition of this while loop.
     * @return Expression 
     */
```
```rust
pub fn getCondition(self: WhileStatement) -> Expression;
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
## WhileStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: WhileStatement) -> int;
```
## WhileStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *WhileStatement;
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
