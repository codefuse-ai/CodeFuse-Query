# MethodAccessExpressionWithType

Primary key: `element_hash_id: int`

```rust
schema MethodAccessExpressionWithType {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## MethodAccessExpressionWithType::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: MethodAccessExpressionWithType) -> *ElementParent;
```
## MethodAccessExpressionWithType::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: MethodAccessExpressionWithType) -> string;
```
## MethodAccessExpressionWithType::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: MethodAccessExpressionWithType) -> Statement;
```
## MethodAccessExpressionWithType::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: MethodAccessExpressionWithType) -> int;
```
## MethodAccessExpressionWithType::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: MethodAccessExpressionWithType) -> ElementParent;
```
## MethodAccessExpressionWithType::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *MethodAccessExpressionWithType;
```
## MethodAccessExpressionWithType::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: MethodAccessExpressionWithType) -> int;
```
## MethodAccessExpressionWithType::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: MethodAccessExpressionWithType) -> Location;
```
## MethodAccessExpressionWithType::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: MethodAccessExpressionWithType) -> Callable;
```
## MethodAccessExpressionWithType::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: MethodAccessExpressionWithType) -> int;
```
## MethodAccessExpressionWithType::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: MethodAccessExpressionWithType) -> NumberOfLines;
```
## MethodAccessExpressionWithType::getReference

```java
/**
* @brief gets the reference expression of the element.
* @return ReferenceExpression 
*/
```
```rust
pub fn getReference(self: MethodAccessExpressionWithType) -> ReferenceExpression;
```
## MethodAccessExpressionWithType::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: MethodAccessExpressionWithType) -> Type;
```
