# WhileStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema WhileStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## WhileStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: WhileStatement) -> NumberOfLines;
```
## WhileStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: WhileStatement) -> ElementParent;
```
## WhileStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: WhileStatement) -> int;
```
## WhileStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: WhileStatement) -> Callable;
```
## WhileStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: WhileStatement) -> int;
```
## WhileStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: WhileStatement) -> *Statement;
```
## WhileStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: WhileStatement) -> *ElementParent;
```
## WhileStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: WhileStatement) -> Statement;
```
## WhileStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: WhileStatement) -> *Statement;
```
## WhileStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: WhileStatement) -> string;
```
## WhileStatement::getBody

```java
/**
* @brief gets the body of this while loop.
* @return Statement 
*/
```
```rust
pub fn getBody(self: WhileStatement) -> Statement;
```
## WhileStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: WhileStatement) -> string;
```
## WhileStatement::getCondition

```java
/**
* @brief gets the boolean condition of this while loop.
* @return Expression 
*/
```
```rust
pub fn getCondition(self: WhileStatement) -> Expression;
```
## WhileStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: WhileStatement) -> Location;
```
## WhileStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: WhileStatement) -> int;
```
## WhileStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *WhileStatement;
```
