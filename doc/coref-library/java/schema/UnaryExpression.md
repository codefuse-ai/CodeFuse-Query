# UnaryExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema UnaryExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## UnaryExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: UnaryExpression) -> *ElementParent;
```
## UnaryExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: UnaryExpression) -> string;
```
## UnaryExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: UnaryExpression) -> int;
```
## UnaryExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: UnaryExpression) -> ElementParent;
```
## UnaryExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *UnaryExpression;
```
## UnaryExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: UnaryExpression) -> int;
```
## UnaryExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: UnaryExpression) -> Location;
```
## UnaryExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: UnaryExpression) -> NumberOfLines;
```
## UnaryExpression::getOpcode

```java
/**
* @brief gets the opcode of the unary expression
* @return string 
*/
```
```rust
pub fn getOpcode(self: UnaryExpression) -> string;
```
## UnaryExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: UnaryExpression) -> Callable;
```
## UnaryExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: UnaryExpression) -> int;
```
## UnaryExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: UnaryExpression) -> Statement;
```
## UnaryExpression::getOperand

```java
/**
* @brief gets the operand expression of the unary expression.
* @return Expression 
*/
```
```rust
pub fn getOperand(self: UnaryExpression) -> Expression;
```
## UnaryExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: UnaryExpression) -> string;
```
