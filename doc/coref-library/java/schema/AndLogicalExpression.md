# AndLogicalExpression

Inherit from [BinaryExpression](./BinaryExpression.md)

Primary key: `element_hash_id: int`

```rust
schema AndLogicalExpression extends BinaryExpression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## AndLogicalExpression::getOperand

```java
/**
* @brief gets an operand of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getOperand(self: AndLogicalExpression) -> *Expression;
```
## AndLogicalExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: AndLogicalExpression) -> Statement;
```
## AndLogicalExpression::getRightOperandExpression

```java
/**
* @brief gets the operand on the right-hand side of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getRightOperandExpression(self: AndLogicalExpression) -> Expression;
```
## AndLogicalExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getLeftOperandExpression

```java
/**
* @brief gets the operand on the left-hand side of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getLeftOperandExpression(self: AndLogicalExpression) -> Expression;
```
## AndLogicalExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: AndLogicalExpression) -> NumberOfLines;
```
## AndLogicalExpression::getOpcode

```java
/**
* @brief gets the opcode of the binary expression
* @return string 
*/
```
```rust
pub fn getOpcode(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: AndLogicalExpression) -> Callable;
```
## AndLogicalExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AndLogicalExpression;
```
## AndLogicalExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AndLogicalExpression) -> Location;
```
## AndLogicalExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: AndLogicalExpression) -> int;
```
## AndLogicalExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: AndLogicalExpression) -> ElementParent;
```
## AndLogicalExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AndLogicalExpression) -> string;
```
## AndLogicalExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: AndLogicalExpression) -> *ElementParent;
```
