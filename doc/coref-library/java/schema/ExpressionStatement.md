# ExpressionStatement

Primary key: `element_hash_id: int`

```rust
schema ExpressionStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ExpressionStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ExpressionStatement) -> NumberOfLines;
```
## ExpressionStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: ExpressionStatement) -> ElementParent;
```
## ExpressionStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ExpressionStatement) -> Callable;
```
## ExpressionStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ExpressionStatement) -> string;
```
## ExpressionStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: ExpressionStatement) -> *Statement;
```
## ExpressionStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ExpressionStatement) -> *ElementParent;
```
## ExpressionStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ExpressionStatement) -> Statement;
```
## ExpressionStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: ExpressionStatement) -> *Statement;
```
## ExpressionStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ExpressionStatement) -> string;
```
## ExpressionStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: ExpressionStatement) -> Location;
```
## ExpressionStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getExpression

```rust
/**
     * @brief gets the Expression in statement.
     * @return Expression
     */
```
```rust
pub fn getExpression(self: ExpressionStatement) -> Expression;
```
## ExpressionStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ExpressionStatement;
```
## ExpressionStatement::is\<T\>

```rust
pub fn is<T>(self: ExpressionStatement) -> bool;
```
## ExpressionStatement::to\<T\>

```rust
pub fn to<T>(self: ExpressionStatement) -> <any>;
```
## ExpressionStatement::key\_neq

```rust
pub fn key_neq(self: ExpressionStatement, object: <any>) -> bool;
```
## ExpressionStatement::key\_eq

```rust
pub fn key_eq(self: ExpressionStatement, object: <any>) -> bool;
```
## ExpressionStatement::to\_set

```rust
pub fn to_set(self: ExpressionStatement) -> *ExpressionStatement;
```
