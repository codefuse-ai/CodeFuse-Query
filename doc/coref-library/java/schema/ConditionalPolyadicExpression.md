# ConditionalPolyadicExpression

Primary key: `element_hash_id: int`

```rust
schema ConditionalPolyadicExpression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## ConditionalPolyadicExpression::getSize

```java
/**
* @brief gets the size of the element.
* @return int
*/
```
```rust
pub fn getSize(self: ConditionalPolyadicExpression) -> int;
```
## ConditionalPolyadicExpression::getOpcode

```java
/**
* @brief gets the opcode of the element.
* @return string
*/
```
```rust
pub fn getOpcode(self: ConditionalPolyadicExpression) -> string;
```
## ConditionalPolyadicExpression::getOperand

```java
/**
* @brief gets the operand of the element.
* @return Expression
*/
```
```rust
pub fn getOperand(self: ConditionalPolyadicExpression) -> *Expression;
```
## ConditionalPolyadicExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ConditionalPolyadicExpression) -> Statement;
```
## ConditionalPolyadicExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ConditionalPolyadicExpression) -> string;
```
## ConditionalPolyadicExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ConditionalPolyadicExpression) -> Callable;
```
## ConditionalPolyadicExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ConditionalPolyadicExpression) -> int;
```
## ConditionalPolyadicExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ConditionalPolyadicExpression;
```
## ConditionalPolyadicExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ConditionalPolyadicExpression) -> Location;
```
## ConditionalPolyadicExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ConditionalPolyadicExpression) -> int;
```
## ConditionalPolyadicExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ConditionalPolyadicExpression) -> int;
```
## ConditionalPolyadicExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ConditionalPolyadicExpression) -> ElementParent;
```
## ConditionalPolyadicExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ConditionalPolyadicExpression) -> string;
```
## ConditionalPolyadicExpression::getOperandAt

```java
/**
* @brief gets the operand of the element at a given index.
* @return Expression
*/
```
```rust
pub fn getOperandAt(self: ConditionalPolyadicExpression, index: int) -> Expression;
```
## ConditionalPolyadicExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ConditionalPolyadicExpression) -> *ElementParent;
```
