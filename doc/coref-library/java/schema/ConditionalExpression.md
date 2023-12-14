# ConditionalExpression

Primary key: `element_hash_id: int`

```rust
schema ConditionalExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ConditionalExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ConditionalExpression) -> *ElementParent;
```
## ConditionalExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ConditionalExpression) -> string;
```
## ConditionalExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ConditionalExpression) -> Statement;
```
## ConditionalExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ConditionalExpression) -> ElementParent;
```
## ConditionalExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ConditionalExpression) -> NumberOfLines;
```
## ConditionalExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ConditionalExpression;
```
## ConditionalExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ConditionalExpression) -> Location;
```
## ConditionalExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ConditionalExpression) -> Callable;
```
## ConditionalExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ConditionalExpression) -> string;
```
## ConditionalExpression::getFalseExpression

```java
/**
* @brief gets the false expression of the conditional expression if the condition is false.
* @return Expression 
*/
```
```rust
pub fn getFalseExpression(self: ConditionalExpression) -> Expression;
```
## ConditionalExpression::getCondition

```java
/**
* @brief gets the condition of the conditional expression.
* @return Expression 
*/
```
```rust
pub fn getCondition(self: ConditionalExpression) -> Expression;
```
## ConditionalExpression::getTrueExpression

```java
/**
* @brief gets the true expression of the conditional expression if the condition is true.
* @return Expression 
*/
```
```rust
pub fn getTrueExpression(self: ConditionalExpression) -> Expression;
```
