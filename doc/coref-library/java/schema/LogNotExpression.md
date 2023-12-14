# LogNotExpression

Primary key: `element_hash_id: int`

```rust
schema LogNotExpression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## LogNotExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: LogNotExpression) -> string;
```
## LogNotExpression::getOperand

```java
/**
* @brief gets the operand expression of the unary expression.
* @return Expression 
*/
```
```rust
pub fn getOperand(self: LogNotExpression) -> Expression;
```
## LogNotExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: LogNotExpression) -> Statement;
```
## LogNotExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: LogNotExpression) -> Callable;
```
## LogNotExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: LogNotExpression) -> int;
```
## LogNotExpression::getOpcode

```java
/**
* @brief gets the opcode of the unary expression
* @return string 
*/
```
```rust
pub fn getOpcode(self: LogNotExpression) -> string;
```
## LogNotExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: LogNotExpression) -> NumberOfLines;
```
## LogNotExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LogNotExpression;
```
## LogNotExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: LogNotExpression) -> Location;
```
## LogNotExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: LogNotExpression) -> int;
```
## LogNotExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: LogNotExpression) -> int;
```
## LogNotExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: LogNotExpression) -> ElementParent;
```
## LogNotExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: LogNotExpression) -> string;
```
## LogNotExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: LogNotExpression) -> *ElementParent;
```
