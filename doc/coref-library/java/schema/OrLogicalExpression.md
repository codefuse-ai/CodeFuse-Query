# OrLogicalExpression

Primary key: `element_hash_id: int`

```rust
schema OrLogicalExpression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## OrLogicalExpression::getOperand

```java
/**
* @brief gets an operand of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getOperand(self: OrLogicalExpression) -> *Expression;
```
## OrLogicalExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: OrLogicalExpression) -> Statement;
```
## OrLogicalExpression::getRightOperandExpression

```java
/**
* @brief gets the operand on the right-hand side of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getRightOperandExpression(self: OrLogicalExpression) -> Expression;
```
## OrLogicalExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getLeftOperandExpression

```java
/**
* @brief gets the operand on the left-hand side of the binary expression.
* @return Expression 
*/
```
```rust
pub fn getLeftOperandExpression(self: OrLogicalExpression) -> Expression;
```
## OrLogicalExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: OrLogicalExpression) -> NumberOfLines;
```
## OrLogicalExpression::getOpcode

```java
/**
* @brief gets the opcode of the binary expression
* @return string 
*/
```
```rust
pub fn getOpcode(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: OrLogicalExpression) -> Callable;
```
## OrLogicalExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *OrLogicalExpression;
```
## OrLogicalExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: OrLogicalExpression) -> Location;
```
## OrLogicalExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: OrLogicalExpression) -> int;
```
## OrLogicalExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: OrLogicalExpression) -> ElementParent;
```
## OrLogicalExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: OrLogicalExpression) -> string;
```
## OrLogicalExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: OrLogicalExpression) -> *ElementParent;
```
