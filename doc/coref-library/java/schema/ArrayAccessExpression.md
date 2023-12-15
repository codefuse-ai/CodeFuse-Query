# ArrayAccessExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema ArrayAccessExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int
}
```
## ArrayAccessExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ArrayAccessExpression) -> string;
```
## ArrayAccessExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ArrayAccessExpression) -> Statement;
```
## ArrayAccessExpression::getArrayExpression

```java
/**
* @brief gets the array that is accessed in the array access
* @return Expression 
*/
```
```rust
pub fn getArrayExpression(self: ArrayAccessExpression) -> Expression;
```
## ArrayAccessExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ArrayAccessExpression) -> int;
```
## ArrayAccessExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ArrayAccessExpression) -> ElementParent;
```
## ArrayAccessExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ArrayAccessExpression) -> NumberOfLines;
```
## ArrayAccessExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ArrayAccessExpression;
```
## ArrayAccessExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ArrayAccessExpression) -> Location;
```
## ArrayAccessExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ArrayAccessExpression) -> int;
```
## ArrayAccessExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ArrayAccessExpression) -> Callable;
```
## ArrayAccessExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ArrayAccessExpression) -> int;
```
## ArrayAccessExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ArrayAccessExpression) -> *ElementParent;
```
## ArrayAccessExpression::getIndexExpression

```java
/**
* @brief gets the index expression of the array access expression.
* @return Expression 
*/
```
```rust
pub fn getIndexExpression(self: ArrayAccessExpression) -> Expression;
```
## ArrayAccessExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ArrayAccessExpression) -> string;
```
