# ConditionalStatement

Inherit from [Statement](./Statement.md)

Primary key: `element_hash_id: int`

```rust
schema ConditionalStatement extends Statement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ConditionalStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ConditionalStatement) -> NumberOfLines;
```
## ConditionalStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: ConditionalStatement) -> ElementParent;
```
## ConditionalStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ConditionalStatement) -> int;
```
## ConditionalStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ConditionalStatement) -> Callable;
```
## ConditionalStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ConditionalStatement) -> int;
```
## ConditionalStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: ConditionalStatement) -> *Statement;
```
## ConditionalStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ConditionalStatement) -> *ElementParent;
```
## ConditionalStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ConditionalStatement) -> Statement;
```
## ConditionalStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: ConditionalStatement) -> *Statement;
```
## ConditionalStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ConditionalStatement) -> string;
```
## ConditionalStatement::getCondition

```java
/**
* @brief gets the boolean condition of the conditional statement.
* @return Expression 
*/
```
```rust
pub fn getCondition(self: ConditionalStatement) -> Expression;
```
## ConditionalStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ConditionalStatement) -> string;
```
## ConditionalStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ConditionalStatement) -> Location;
```
## ConditionalStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ConditionalStatement) -> int;
```
## ConditionalStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ConditionalStatement;
```
