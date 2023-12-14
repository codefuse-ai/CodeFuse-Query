# AssignmentExpression

Primary key: `element_hash_id: int`

```rust
schema AssignmentExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## AssignmentExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: AssignmentExpression) -> *ElementParent;
```
## AssignmentExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AssignmentExpression) -> string;
```
## AssignmentExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: AssignmentExpression) -> ElementParent;
```
## AssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AssignmentExpression;
```
## AssignmentExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AssignmentExpression) -> Location;
```
## AssignmentExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: AssignmentExpression) -> Callable;
```
## AssignmentExpression::getOpcode

```java
/**
* @brief gets the opcode of the binary expression
* @return string 
*/
```
```rust
pub fn getOpcode(self: AssignmentExpression) -> string;
```
## AssignmentExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: AssignmentExpression) -> NumberOfLines;
```
## AssignmentExpression::getDestination

```java
/**
* @brief gets the operand on the left-hand side of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getDestination(self: AssignmentExpression) -> Expression;
```
## AssignmentExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: AssignmentExpression) -> Statement;
```
## AssignmentExpression::getSource

```java
/**
* @brief gets the operand on the right-hand side of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getSource(self: AssignmentExpression) -> Expression;
```
## AssignmentExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: AssignmentExpression) -> string;
```
