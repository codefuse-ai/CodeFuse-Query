# LambdaExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema LambdaExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## LambdaExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: LambdaExpression) -> *ElementParent;
```
## LambdaExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: LambdaExpression) -> string;
```
## LambdaExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: LambdaExpression) -> int;
```
## LambdaExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: LambdaExpression) -> ElementParent;
```
## LambdaExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LambdaExpression;
```
## LambdaExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: LambdaExpression) -> Location;
```
## LambdaExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: LambdaExpression) -> int;
```
## LambdaExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: LambdaExpression) -> Callable;
```
## LambdaExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: LambdaExpression) -> int;
```
## LambdaExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: LambdaExpression) -> NumberOfLines;
```
## LambdaExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: LambdaExpression) -> string;
```
## LambdaExpression::getBody

```java
/**
* @brief gets the element representing lambda expression body, a code block or an expression.
* @return ElementParent 
*/
```
```rust
pub fn getBody(self: LambdaExpression) -> ElementParent;
```
## LambdaExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: LambdaExpression) -> Statement;
```
## LambdaExpression::getParameter

```java
/**
* @brief gets the parameter of the lambda expression.
* @return Parameter 
*/
```
```rust
pub fn getParameter(self: LambdaExpression) -> *Parameter;
```
