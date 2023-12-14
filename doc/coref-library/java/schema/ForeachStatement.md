# ForeachStatement

Primary key: `element_hash_id: int`

```rust
schema ForeachStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ForeachStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: ForeachStatement) -> ElementParent;
```
## ForeachStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ForeachStatement) -> int;
```
## ForeachStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ForeachStatement) -> Callable;
```
## ForeachStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ForeachStatement) -> int;
```
## ForeachStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ForeachStatement) -> string;
```
## ForeachStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: ForeachStatement) -> *Statement;
```
## ForeachStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ForeachStatement) -> *ElementParent;
```
## ForeachStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ForeachStatement) -> Statement;
```
## ForeachStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ForeachStatement) -> string;
```
## ForeachStatement::getBody

```rust
/**
     * @brief gets the body of this for loop.
     * @return Statement 
     */
```
```rust
pub fn getBody(self: ForeachStatement) -> Statement;
```
## ForeachStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: ForeachStatement) -> *Statement;
```
## ForeachStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ForeachStatement) -> NumberOfLines;
```
## ForeachStatement::getIterationParameter

```rust
/**
     * @brief gets the iteration parameter of this foreach loop.
     * @return Parameter 
     */
```
```rust
pub fn getIterationParameter(self: ForeachStatement) -> Parameter;
```
## ForeachStatement::getIteratedValue

```rust
/**
     * @brief gets the expression over which the foreach loop iterates.
     * @return Expression 
     */
```
```rust
pub fn getIteratedValue(self: ForeachStatement) -> Expression;
```
## ForeachStatement::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: ForeachStatement) -> Location;
```
## ForeachStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ForeachStatement) -> int;
```
## ForeachStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ForeachStatement;
```
## ForeachStatement::is\<T\>

```rust
pub fn is<T>(self: ForeachStatement) -> bool;
```
## ForeachStatement::to\<T\>

```rust
pub fn to<T>(self: ForeachStatement) -> <any>;
```
## ForeachStatement::key\_neq

```rust
pub fn key_neq(self: ForeachStatement, object: <any>) -> bool;
```
## ForeachStatement::key\_eq

```rust
pub fn key_eq(self: ForeachStatement, object: <any>) -> bool;
```
## ForeachStatement::to\_set

```rust
pub fn to_set(self: ForeachStatement) -> *ForeachStatement;
```
