# JumpStatement

Primary key: `element_hash_id: int`

```rust
schema JumpStatement {
  type: string,
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## JumpStatement::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: JumpStatement) -> NumberOfLines;
```
## JumpStatement::getTargetLabel

```java
/**
* @brief gets the labeled statement that the break or continue statement refers to.
* @return LabeledStatement 
*/
```
```rust
pub fn getTargetLabel(self: JumpStatement) -> LabeledStatement;
```
## JumpStatement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: JumpStatement) -> string;
```
## JumpStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: JumpStatement) -> *ElementParent;
```
## JumpStatement::getAChild

```java
/**
* @brief gets a child of this statement.
* @return Statement 
*/
```
```rust
pub fn getAChild(self: JumpStatement) -> *Statement;
```
## JumpStatement::getAEnclosingStatement

```java
/**
* @brief gets the transitive statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getAEnclosingStatement(self: JumpStatement) -> *Statement;
```
## JumpStatement::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: JumpStatement) -> string;
```
## JumpStatement::getEnclosingCallable

```java
/**
* @brief gets the immediately enclosing callable (method or constructor) whose body contains this statement.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: JumpStatement) -> Callable;
```
## JumpStatement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: JumpStatement) -> int;
```
## JumpStatement::getEnclosingTarget

```rust
pub fn getEnclosingTarget(self: JumpStatement) -> Statement;
```
## JumpStatement::getParent

```java
/**
* @brief gets the parent element of the statement
* @return StatementParent 
*/
```
```rust
pub fn getParent(self: JumpStatement) -> ElementParent;
```
## JumpStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: JumpStatement) -> int;
```
## JumpStatement::getLabelTarget

```java
/**
* @brief gets the statement of the labeled statement.
* @return Statement 
*/
```
```rust
pub fn getLabelTarget(self: JumpStatement) -> Statement;
```
## JumpStatement::getEnclosingStatement

```java
/**
* @brief gets the statement containing this statement.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: JumpStatement) -> Statement;
```
## JumpStatement::getTarget

```java
/**
* @brief description
* @return StatementParent 
*/
```
```rust
pub fn getTarget(self: JumpStatement) -> StatementParent;
```
## JumpStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: JumpStatement) -> Location;
```
## JumpStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: JumpStatement) -> int;
```
## JumpStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *JumpStatement;
```
