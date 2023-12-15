# ExpressionStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema ExpressionStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## ExpressionStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ExpressionStatement) -> NumberOfLines;
```
## ExpressionStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: ExpressionStatement) -> ElementParent;
```
## ExpressionStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ExpressionStatement) -> Callable;
```
## ExpressionStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ExpressionStatement) -> string;
```
## ExpressionStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: ExpressionStatement) -> *Statement;
```
## ExpressionStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ExpressionStatement) -> *ElementParent;
```
## ExpressionStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ExpressionStatement) -> Statement;
```
## ExpressionStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: ExpressionStatement) -> *Statement;
```
## ExpressionStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ExpressionStatement) -> string;
```
## ExpressionStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ExpressionStatement) -> Location;
```
## ExpressionStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getExpression

```java
/**
* @brief gets the Expression in statement.
* @return Expression
*/
```
```rust
pub fn getExpression(self: ExpressionStatement) -> Expression;
```
## ExpressionStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ExpressionStatement;
```
