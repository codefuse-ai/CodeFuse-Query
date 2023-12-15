# ForStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema ForStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## ForStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ForStatement) -> NumberOfLines;
```
## ForStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: ForStatement) -> ElementParent;
```
## ForStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ForStatement) -> int;
```
## ForStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ForStatement) -> Callable;
```
## ForStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ForStatement) -> int;
```
## ForStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: ForStatement) -> *Statement;
```
## ForStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ForStatement) -> *ElementParent;
```
## ForStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ForStatement) -> Statement;
```
## ForStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: ForStatement) -> *Statement;
```
## ForStatement::getBody

```java
/**
* @brief gets the body of this for loop, usually a block statement.
* @return Statement 
*/
```
```rust
pub fn getBody(self: ForStatement) -> Statement;
```
## ForStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ForStatement) -> string;
```
## ForStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ForStatement) -> Location;
```
## ForStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ForStatement) -> int;
```
## ForStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ForStatement;
```
## ForStatement::getUpdate

```java
/**
* @brief gets the update statement of this for loop.
* @return Statement 
*/
```
```rust
pub fn getUpdate(self: ForStatement) -> Statement;
```
## ForStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ForStatement) -> string;
```
## ForStatement::getInitialization

```java
/**
* @brief gets the initializer statement of the for loop, this maybe an assignment statement or a local variable declaration statement.
* @return Statement 
*/
```
```rust
pub fn getInitialization(self: ForStatement) -> Statement;
```
## ForStatement::getCondition

```java
/**
* @brief gets the boolean condition of this for loop.
* @return Expression 
*/
```
```rust
pub fn getCondition(self: ForStatement) -> Expression;
```
## ForStatement::getTrueSuccessor

```java
/**
* @brief gets the statement that is executed whenever the condition of this branch statement evaluates to true.
* @return Statement 
*/
```
```rust
pub fn getTrueSuccessor(self: ForStatement) -> Statement;
```
