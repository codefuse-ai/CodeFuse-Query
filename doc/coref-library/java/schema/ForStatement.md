# ForStatement

Primary key: `element_hash_id: int`

```rust
schema ForStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
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
     * @return StatementParent 
     */
```
```rust
pub fn getParent(self: ForStatement) -> ElementParent;
```
## ForStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ForStatement) -> int;
```
## ForStatement::getEnclosingCallable

```rust
/**
     * @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
     * @return Callable 
     */
```
```rust
pub fn getEnclosingCallable(self: ForStatement) -> Callable;
```
## ForStatement::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ForStatement) -> int;
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
## ForStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ForStatement) -> *ElementParent;
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
## ForStatement::getAEnclosingStatement

```rust
/**
     * @brief gets the transitive statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getAEnclosingStatement(self: ForStatement) -> *Statement;
```
## ForStatement::getBody

```rust
/**
     * @brief gets the body of this for loop, usually a block statement.
     * @return Statement 
     */
```
```rust
pub fn getBody(self: ForStatement) -> Statement;
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
## ForStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ForStatement) -> int;
```
## ForStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ForStatement;
```
## ForStatement::getUpdate

```rust
/**
     * @brief gets the update statement of this for loop.
     * @return Statement 
     */
```
```rust
pub fn getUpdate(self: ForStatement) -> Statement;
```
## ForStatement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ForStatement) -> string;
```
## ForStatement::getInitialization

```rust
/**
     * @brief gets the initializer statement of the for loop, this maybe an assignment statement or a local variable declaration statement.
     * @return Statement 
     */
```
```rust
pub fn getInitialization(self: ForStatement) -> Statement;
```
## ForStatement::getCondition

```rust
/**
     * @brief gets the boolean condition of this for loop.
     * @return Expression 
     */
```
```rust
pub fn getCondition(self: ForStatement) -> Expression;
```
## ForStatement::getTrueSuccessor

```rust
/**
     * @brief gets the statement that is executed whenever the condition of this branch statement evaluates to true.
     * @return Statement 
     */
```
```rust
pub fn getTrueSuccessor(self: ForStatement) -> Statement;
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
