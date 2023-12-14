# SynchronizedStatement

Primary key: `element_hash_id: int`

```rust
schema SynchronizedStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## SynchronizedStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: SynchronizedStatement) -> NumberOfLines;
```
## SynchronizedStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: SynchronizedStatement) -> ElementParent;
```
## SynchronizedStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: SynchronizedStatement) -> int;
```
## SynchronizedStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: SynchronizedStatement) -> int;
```
## SynchronizedStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: SynchronizedStatement) -> Callable;
```
## SynchronizedStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: SynchronizedStatement) -> string;
```
## SynchronizedStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: SynchronizedStatement) -> *Statement;
```
## SynchronizedStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: SynchronizedStatement) -> *ElementParent;
```
## SynchronizedStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: SynchronizedStatement) -> Statement;
```
## SynchronizedStatement::getLockExpression

```rust
/**
     * @brief gets the expression on which the statement synchronizes.
     * @return Expression 
     */
```
```rust
pub fn getLockExpression(self: SynchronizedStatement) -> Expression;
```
## SynchronizedStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: SynchronizedStatement) -> *Statement;
```
## SynchronizedStatement::getBody

```rust
/**
     * @brief gets the body of this synchronized statement
     * @return Statement 
     */
```
```rust
pub fn getBody(self: SynchronizedStatement) -> Statement;
```
## SynchronizedStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: SynchronizedStatement) -> string;
```
## SynchronizedStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: SynchronizedStatement) -> Location;
```
## SynchronizedStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: SynchronizedStatement) -> int;
```
## SynchronizedStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SynchronizedStatement;
```
## SynchronizedStatement::is\<T\>

```rust
pub fn is<T>(self: SynchronizedStatement) -> bool;
```
## SynchronizedStatement::to\<T\>

```rust
pub fn to<T>(self: SynchronizedStatement) -> <any>;
```
## SynchronizedStatement::key\_neq

```rust
pub fn key_neq(self: SynchronizedStatement, object: <any>) -> bool;
```
## SynchronizedStatement::key\_eq

```rust
pub fn key_eq(self: SynchronizedStatement, object: <any>) -> bool;
```
## SynchronizedStatement::to\_set

```rust
pub fn to_set(self: SynchronizedStatement) -> *SynchronizedStatement;
```
