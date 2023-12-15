# BreakStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema BreakStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## BreakStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: BreakStatement) -> NumberOfLines;
```
## BreakStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: BreakStatement) -> ElementParent;
```
## BreakStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: BreakStatement) -> int;
```
## BreakStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: BreakStatement) -> int;
```
## BreakStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: BreakStatement) -> Callable;
```
## BreakStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: BreakStatement) -> string;
```
## BreakStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: BreakStatement) -> *Statement;
```
## BreakStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: BreakStatement) -> *ElementParent;
```
## BreakStatement::getExitedStatement

```java
/**
* @brief gets the exited statement of the break statement, if any.
* @return Statement 
*/
```
```rust
pub fn getExitedStatement(self: BreakStatement) -> Statement;
```
## BreakStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: BreakStatement) -> Statement;
```
## BreakStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: BreakStatement) -> *Statement;
```
## BreakStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: BreakStatement) -> string;
```
## BreakStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: BreakStatement) -> Location;
```
## BreakStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: BreakStatement) -> int;
```
## BreakStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *BreakStatement;
```
