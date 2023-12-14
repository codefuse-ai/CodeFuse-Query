# ForeachStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema ForeachStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ForeachStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: ForeachStatement) -> ElementParent;
```
## ForeachStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ForeachStatement) -> int;
```
## ForeachStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ForeachStatement) -> Callable;
```
## ForeachStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ForeachStatement) -> int;
```
## ForeachStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ForeachStatement) -> string;
```
## ForeachStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: ForeachStatement) -> *Statement;
```
## ForeachStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ForeachStatement) -> *ElementParent;
```
## ForeachStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ForeachStatement) -> Statement;
```
## ForeachStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ForeachStatement) -> string;
```
## ForeachStatement::getBody

```java
/**
* @brief gets the body of this for loop.
* @return Statement 
*/
```
```rust
pub fn getBody(self: ForeachStatement) -> Statement;
```
## ForeachStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: ForeachStatement) -> *Statement;
```
## ForeachStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ForeachStatement) -> NumberOfLines;
```
## ForeachStatement::getIterationParameter

```java
/**
* @brief gets the iteration parameter of this foreach loop.
* @return Parameter 
*/
```
```rust
pub fn getIterationParameter(self: ForeachStatement) -> Parameter;
```
## ForeachStatement::getIteratedValue

```java
/**
* @brief gets the expression over which the foreach loop iterates.
* @return Expression 
*/
```
```rust
pub fn getIteratedValue(self: ForeachStatement) -> Expression;
```
## ForeachStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ForeachStatement) -> Location;
```
## ForeachStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ForeachStatement) -> int;
```
## ForeachStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ForeachStatement;
```
