# IfStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema IfStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## IfStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: IfStatement) -> NumberOfLines;
```
## IfStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: IfStatement) -> ElementParent;
```
## IfStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: IfStatement) -> int;
```
## IfStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: IfStatement) -> Callable;
```
## IfStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: IfStatement) -> int;
```
## IfStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: IfStatement) -> *Statement;
```
## IfStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: IfStatement) -> *ElementParent;
```
## IfStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: IfStatement) -> Statement;
```
## IfStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: IfStatement) -> *Statement;
```
## IfStatement::getAlternate

```java
/**
* @brief gets the else branch of this if statement.
* @return Statement 
*/
```
```rust
pub fn getAlternate(self: IfStatement) -> Statement;
```
## IfStatement::getConsequent

```java
/**
* @brief get the statement that is executed whenever the condition of this branch evaluates to true.
* @return Statement 
*/
```
```rust
pub fn getConsequent(self: IfStatement) -> Statement;
```
## IfStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: IfStatement) -> string;
```
## IfStatement::getCondition

```java
/**
* @brief gets the boolean condition of this if statement.
* @return Expression 
*/
```
```rust
pub fn getCondition(self: IfStatement) -> Expression;
```
## IfStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: IfStatement) -> string;
```
## IfStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: IfStatement) -> Location;
```
## IfStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: IfStatement) -> int;
```
## IfStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *IfStatement;
```
