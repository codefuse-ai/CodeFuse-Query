# PolyadicExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema PolyadicExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## PolyadicExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: PolyadicExpression) -> *ElementParent;
```
## PolyadicExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: PolyadicExpression) -> string;
```
## PolyadicExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: PolyadicExpression) -> int;
```
## PolyadicExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: PolyadicExpression) -> ElementParent;
```
## PolyadicExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *PolyadicExpression;
```
## PolyadicExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: PolyadicExpression) -> int;
```
## PolyadicExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: PolyadicExpression) -> Location;
```
## PolyadicExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: PolyadicExpression) -> int;
```
## PolyadicExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: PolyadicExpression) -> Callable;
```
## PolyadicExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: PolyadicExpression) -> string;
```
## PolyadicExpression::getOperandAt

```java
/**
* @brief gets the operand of the element at a given index.
* @return Expression
*/
```
```rust
pub fn getOperandAt(self: PolyadicExpression, index: int) -> Expression;
```
## PolyadicExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: PolyadicExpression) -> Statement;
```
## PolyadicExpression::getOperand

```java
/**
* @brief gets the operand of the element.
* @return Expression
*/
```
```rust
pub fn getOperand(self: PolyadicExpression) -> *Expression;
```
## PolyadicExpression::getOpcode

```java
/**
* @brief gets the opcode of the element.
* @return string
*/
```
```rust
pub fn getOpcode(self: PolyadicExpression) -> string;
```
## PolyadicExpression::getSize

```java
/**
* @brief gets the size of the element.
* @return int
*/
```
```rust
pub fn getSize(self: PolyadicExpression) -> int;
```
