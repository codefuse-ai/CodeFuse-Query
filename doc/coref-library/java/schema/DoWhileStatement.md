# DoWhileStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema DoWhileStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## DoWhileStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: DoWhileStatement) -> NumberOfLines;
```
## DoWhileStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: DoWhileStatement) -> ElementParent;
```
## DoWhileStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: DoWhileStatement) -> Callable;
```
## DoWhileStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: DoWhileStatement) -> *Statement;
```
## DoWhileStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: DoWhileStatement) -> *ElementParent;
```
## DoWhileStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: DoWhileStatement) -> Statement;
```
## DoWhileStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: DoWhileStatement) -> *Statement;
```
## DoWhileStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: DoWhileStatement) -> string;
```
## DoWhileStatement::getBody

```java
/**
* @brief gets the body of this while loop.
* @return Statement 
*/
```
```rust
pub fn getBody(self: DoWhileStatement) -> Statement;
```
## DoWhileStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: DoWhileStatement) -> string;
```
## DoWhileStatement::getCondition

```java
/**
* @brief gets the boolean condition of this do-while loop.
* @return Expression 
*/
```
```rust
pub fn getCondition(self: DoWhileStatement) -> Expression;
```
## DoWhileStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: DoWhileStatement) -> Location;
```
## DoWhileStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: DoWhileStatement) -> int;
```
## DoWhileStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *DoWhileStatement;
```
