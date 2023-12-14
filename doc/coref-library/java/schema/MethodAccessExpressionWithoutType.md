# MethodAccessExpressionWithoutType

Primary key: `element_hash_id: int`

```rust
schema MethodAccessExpressionWithoutType {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## MethodAccessExpressionWithoutType::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: MethodAccessExpressionWithoutType) -> *ElementParent;
```
## MethodAccessExpressionWithoutType::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: MethodAccessExpressionWithoutType) -> string;
```
## MethodAccessExpressionWithoutType::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: MethodAccessExpressionWithoutType) -> Statement;
```
## MethodAccessExpressionWithoutType::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: MethodAccessExpressionWithoutType) -> int;
```
## MethodAccessExpressionWithoutType::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: MethodAccessExpressionWithoutType) -> ElementParent;
```
## MethodAccessExpressionWithoutType::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *MethodAccessExpressionWithoutType;
```
## MethodAccessExpressionWithoutType::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: MethodAccessExpressionWithoutType) -> int;
```
## MethodAccessExpressionWithoutType::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: MethodAccessExpressionWithoutType) -> Location;
```
## MethodAccessExpressionWithoutType::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: MethodAccessExpressionWithoutType) -> Callable;
```
## MethodAccessExpressionWithoutType::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: MethodAccessExpressionWithoutType) -> int;
```
## MethodAccessExpressionWithoutType::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: MethodAccessExpressionWithoutType) -> NumberOfLines;
```
## MethodAccessExpressionWithoutType::getReference

```java
/**
* @brief gets the reference expression of the element.
* @return ReferenceExpression 
*/
```
```rust
pub fn getReference(self: MethodAccessExpressionWithoutType) -> ReferenceExpression;
```
## MethodAccessExpressionWithoutType::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: MethodAccessExpressionWithoutType) -> string;
```
