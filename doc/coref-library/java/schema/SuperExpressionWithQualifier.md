# SuperExpressionWithQualifier

Inherit from [SuperExpression](./SuperExpression.md)

Primary key: `element_hash_id: int`

```rust
schema SuperExpressionWithQualifier extends SuperExpression {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string
}
```
## SuperExpressionWithQualifier::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: SuperExpressionWithQualifier) -> string;
```
## SuperExpressionWithQualifier::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: SuperExpressionWithQualifier) -> int;
```
## SuperExpressionWithQualifier::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: SuperExpressionWithQualifier) -> Callable;
```
## SuperExpressionWithQualifier::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: SuperExpressionWithQualifier) -> NumberOfLines;
```
## SuperExpressionWithQualifier::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: SuperExpressionWithQualifier) -> int;
```
## SuperExpressionWithQualifier::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: SuperExpressionWithQualifier) -> ElementParent;
```
## SuperExpressionWithQualifier::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: SuperExpressionWithQualifier) -> Statement;
```
## SuperExpressionWithQualifier::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SuperExpressionWithQualifier;
```
## SuperExpressionWithQualifier::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: SuperExpressionWithQualifier) -> Location;
```
## SuperExpressionWithQualifier::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: SuperExpressionWithQualifier) -> int;
```
## SuperExpressionWithQualifier::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: SuperExpressionWithQualifier) -> string;
```
## SuperExpressionWithQualifier::getQualifier

```java
/**
* @brief gets the Qualifier of the expression, if any.
* @return ReferenceElement 
*/
```
```rust
pub fn getQualifier(self: SuperExpressionWithQualifier) -> ReferenceElement;
```
## SuperExpressionWithQualifier::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: SuperExpressionWithQualifier) -> *ElementParent;
```
