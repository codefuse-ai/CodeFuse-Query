# BinaryExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema BinaryExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## BinaryExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: BinaryExpression) -> *ElementParent;
```
## BinaryExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: BinaryExpression) -> string;
```
## BinaryExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: BinaryExpression) -> int;
```
## BinaryExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: BinaryExpression) -> ElementParent;
```
## BinaryExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *BinaryExpression;
```
## BinaryExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: BinaryExpression) -> int;
```
## BinaryExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: BinaryExpression) -> Location;
```
## BinaryExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: BinaryExpression) -> int;
```
## BinaryExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: BinaryExpression) -> Callable;
```
## BinaryExpression::getOpcode

```java
/**
* @brief gets the opcode of the binary expression
* @return string 
*/
```
```rust
pub fn getOpcode(self: BinaryExpression) -> string;
```
## BinaryExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: BinaryExpression) -> NumberOfLines;
```
## BinaryExpression::getLeftOperandExpression

```java
/**
* @brief gets the operand on the left-hand side of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getLeftOperandExpression(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: BinaryExpression) -> string;
```
## BinaryExpression::getRightOperandExpression

```java
/**
* @brief gets the operand on the right-hand side of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getRightOperandExpression(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: BinaryExpression) -> Statement;
```
## BinaryExpression::getOperand

```java
/**
* @brief gets an operand of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getOperand(self: BinaryExpression) -> *Expression;
```
