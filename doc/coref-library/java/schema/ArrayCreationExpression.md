# ArrayCreationExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema ArrayCreationExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ArrayCreationExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ArrayCreationExpression) -> string;
```
## ArrayCreationExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ArrayCreationExpression) -> Statement;
```
## ArrayCreationExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ArrayCreationExpression) -> int;
```
## ArrayCreationExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ArrayCreationExpression) -> ElementParent;
```
## ArrayCreationExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ArrayCreationExpression) -> NumberOfLines;
```
## ArrayCreationExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ArrayCreationExpression;
```
## ArrayCreationExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ArrayCreationExpression) -> Location;
```
## ArrayCreationExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ArrayCreationExpression) -> int;
```
## ArrayCreationExpression::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: ArrayCreationExpression) -> Type;
```
## ArrayCreationExpression::getInitializerExpression

```java
/**
* @brief gets the initializer expression of the array creation expression.
* @return ArrayInitializerExpression
*/
```
```rust
pub fn getInitializerExpression(self: ArrayCreationExpression) -> ArrayInitializerExpression;
```
## ArrayCreationExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ArrayCreationExpression) -> int;
```
## ArrayCreationExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ArrayCreationExpression) -> Callable;
```
## ArrayCreationExpression::getAnInitializer

```java
/**
* @brief gets the initializer of the array creation expression.
* @return ArrayInitializer
*/
```
```rust
pub fn getAnInitializer(self: ArrayCreationExpression) -> *ArrayInitializer;
```
## ArrayCreationExpression::getDimension

```java
/**
* @brief gets the dimension of the array creation expression.
* @return Expression 
*/
```
```rust
pub fn getDimension(self: ArrayCreationExpression, idx: int) -> Expression;
```
## ArrayCreationExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ArrayCreationExpression) -> *ElementParent;
```
## ArrayCreationExpression::countArrayDimension

```java
/**
* @brief counts the number of the array dimension of the array creation expression, 0 means it is an empty array.
* @return int 
*/
```
```rust
pub fn countArrayDimension(self: ArrayCreationExpression) -> int;
```
## ArrayCreationExpression::getADimension

```java
/**
* @brief gets a dimension of the array creation expression.
* @return Expression 
*/
```
```rust
pub fn getADimension(self: ArrayCreationExpression) -> *Expression;
```
