# AssertStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema AssertStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## AssertStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: AssertStatement) -> NumberOfLines;
```
## AssertStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: AssertStatement) -> ElementParent;
```
## AssertStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: AssertStatement) -> int;
```
## AssertStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: AssertStatement) -> Callable;
```
## AssertStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: AssertStatement) -> int;
```
## AssertStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: AssertStatement) -> *Statement;
```
## AssertStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: AssertStatement) -> *ElementParent;
```
## AssertStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: AssertStatement) -> Statement;
```
## AssertStatement::getAssertDescription

```java
/**
* @brief gets the description expression of the assert statement.
* @return Expression 
*/
```
```rust
pub fn getAssertDescription(self: AssertStatement) -> Expression;
```
## AssertStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: AssertStatement) -> *Statement;
```
## AssertStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AssertStatement) -> string;
```
## AssertStatement::getCondition

```java
/**
* @brief gets the boolean expression of the assert statement.
* @return Expression 
*/
```
```rust
pub fn getCondition(self: AssertStatement) -> Expression;
```
## AssertStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: AssertStatement) -> string;
```
## AssertStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AssertStatement) -> Location;
```
## AssertStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AssertStatement) -> int;
```
## AssertStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AssertStatement;
```
