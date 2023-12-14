# ThrowStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema ThrowStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ThrowStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ThrowStatement) -> NumberOfLines;
```
## ThrowStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: ThrowStatement) -> ElementParent;
```
## ThrowStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ThrowStatement) -> int;
```
## ThrowStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ThrowStatement) -> Callable;
```
## ThrowStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ThrowStatement) -> int;
```
## ThrowStatement::getResult

```java
/**
* @brief description
* @return Expression 
*/
```
```rust
pub fn getResult(self: ThrowStatement) -> ElementParent;
```
## ThrowStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ThrowStatement) -> string;
```
## ThrowStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: ThrowStatement) -> *Statement;
```
## ThrowStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ThrowStatement) -> *ElementParent;
```
## ThrowStatement::getException

```java
/**
* @brief gets the body of the throwStatement.
* @return Expression 
*/
```
```rust
pub fn getException(self: ThrowStatement) -> Expression;
```
## ThrowStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ThrowStatement) -> Statement;
```
## ThrowStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: ThrowStatement) -> *Statement;
```
## ThrowStatement::getBlock

```java
/**
* @brief gets the body of the throwStatement.
* @return CodeBlock 
*/
```
```rust
pub fn getBlock(self: ThrowStatement) -> CodeBlock;
```
## ThrowStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ThrowStatement) -> string;
```
## ThrowStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ThrowStatement) -> Location;
```
## ThrowStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ThrowStatement) -> int;
```
## ThrowStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ThrowStatement;
```
