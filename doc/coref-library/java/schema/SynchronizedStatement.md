# SynchronizedStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema SynchronizedStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## SynchronizedStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: SynchronizedStatement) -> NumberOfLines;
```
## SynchronizedStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: SynchronizedStatement) -> ElementParent;
```
## SynchronizedStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: SynchronizedStatement) -> int;
```
## SynchronizedStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: SynchronizedStatement) -> int;
```
## SynchronizedStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: SynchronizedStatement) -> Callable;
```
## SynchronizedStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: SynchronizedStatement) -> string;
```
## SynchronizedStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: SynchronizedStatement) -> *Statement;
```
## SynchronizedStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: SynchronizedStatement) -> *ElementParent;
```
## SynchronizedStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: SynchronizedStatement) -> Statement;
```
## SynchronizedStatement::getLockExpression

```java
/**
* @brief gets the expression on which the statement synchronizes.
* @return Expression 
*/
```
```rust
pub fn getLockExpression(self: SynchronizedStatement) -> Expression;
```
## SynchronizedStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: SynchronizedStatement) -> *Statement;
```
## SynchronizedStatement::getBody

```java
/**
* @brief gets the body of this synchronized statement
* @return Statement 
*/
```
```rust
pub fn getBody(self: SynchronizedStatement) -> Statement;
```
## SynchronizedStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: SynchronizedStatement) -> string;
```
## SynchronizedStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: SynchronizedStatement) -> Location;
```
## SynchronizedStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: SynchronizedStatement) -> int;
```
## SynchronizedStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SynchronizedStatement;
```
