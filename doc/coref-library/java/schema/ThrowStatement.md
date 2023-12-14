# ThrowStatement

Primary key: `element_hash_id: int`

```rust
schema ThrowStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ThrowStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ThrowStatement) -> NumberOfLines;
```
## ThrowStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: ThrowStatement) -> ElementParent;
```
## ThrowStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ThrowStatement) -> int;
```
## ThrowStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ThrowStatement) -> Callable;
```
## ThrowStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ThrowStatement) -> int;
```
## ThrowStatement::getResult

```rust
/**
     * @brief description
     * @return Expression 
     */
```
```rust
pub fn getResult(self: ThrowStatement) -> ElementParent;
```
## ThrowStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ThrowStatement) -> string;
```
## ThrowStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: ThrowStatement) -> *Statement;
```
## ThrowStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ThrowStatement) -> *ElementParent;
```
## ThrowStatement::getException

```rust
/**
     * @brief gets the body of the throwStatement.
     * @return Expression 
     */
```
```rust
pub fn getException(self: ThrowStatement) -> Expression;
```
## ThrowStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ThrowStatement) -> Statement;
```
## ThrowStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: ThrowStatement) -> *Statement;
```
## ThrowStatement::getBlock

```rust
/**
     * @brief gets the body of the throwStatement.
     * @return CodeBlock 
     */
```
```rust
pub fn getBlock(self: ThrowStatement) -> CodeBlock;
```
## ThrowStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ThrowStatement) -> string;
```
## ThrowStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: ThrowStatement) -> Location;
```
## ThrowStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ThrowStatement) -> int;
```
## ThrowStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ThrowStatement;
```
## ThrowStatement::is\<T\>

```rust
pub fn is<T>(self: ThrowStatement) -> bool;
```
## ThrowStatement::to\<T\>

```rust
pub fn to<T>(self: ThrowStatement) -> <any>;
```
## ThrowStatement::key\_neq

```rust
pub fn key_neq(self: ThrowStatement, object: <any>) -> bool;
```
## ThrowStatement::key\_eq

```rust
pub fn key_eq(self: ThrowStatement, object: <any>) -> bool;
```
## ThrowStatement::to\_set

```rust
pub fn to_set(self: ThrowStatement) -> *ThrowStatement;
```
