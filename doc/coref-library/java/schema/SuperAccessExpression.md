# SuperAccessExpression

Primary key: `element_hash_id: int`

```rust
schema SuperAccessExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## SuperAccessExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: SuperAccessExpression) -> *ElementParent;
```
## SuperAccessExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: SuperAccessExpression) -> string;
```
## SuperAccessExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: SuperAccessExpression) -> Statement;
```
## SuperAccessExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: SuperAccessExpression) -> int;
```
## SuperAccessExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: SuperAccessExpression) -> ElementParent;
```
## SuperAccessExpression::getMethod

```rust
pub fn getMethod(self: SuperAccessExpression) -> Method;
```
## SuperAccessExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: SuperAccessExpression) -> NumberOfLines;
```
## SuperAccessExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SuperAccessExpression;
```
## SuperAccessExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: SuperAccessExpression) -> int;
```
## SuperAccessExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: SuperAccessExpression) -> Location;
```
## SuperAccessExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: SuperAccessExpression) -> int;
```
## SuperAccessExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: SuperAccessExpression) -> Callable;
```
## SuperAccessExpression::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: SuperAccessExpression) -> string;
```
