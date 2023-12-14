# MethodReferenceExpression

Primary key: `element_hash_id: int`

```rust
schema MethodReferenceExpression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## MethodReferenceExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: MethodReferenceExpression) -> *ElementParent;
```
## MethodReferenceExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: MethodReferenceExpression) -> string;
```
## MethodReferenceExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: MethodReferenceExpression) -> Statement;
```
## MethodReferenceExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: MethodReferenceExpression) -> int;
```
## MethodReferenceExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: MethodReferenceExpression) -> ElementParent;
```
## MethodReferenceExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *MethodReferenceExpression;
```
## MethodReferenceExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: MethodReferenceExpression) -> int;
```
## MethodReferenceExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: MethodReferenceExpression) -> Location;
```
## MethodReferenceExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: MethodReferenceExpression) -> int;
```
## MethodReferenceExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: MethodReferenceExpression) -> Callable;
```
## MethodReferenceExpression::getMethod

```java
/**
* @brief gets the method of the call.
* @return Method 
*/
```
```rust
pub fn getMethod(self: MethodReferenceExpression) -> Method;
```
## MethodReferenceExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: MethodReferenceExpression) -> NumberOfLines;
```
## MethodReferenceExpression::getReference

```java
/**
* @brief gets the reference expression of the element.
* @return ReferenceExpression 
*/
```
```rust
pub fn getReference(self: MethodReferenceExpression) -> ReferenceExpression;
```
## MethodReferenceExpression::getCallable

```java
/**
* @brief gets the callable of the call.
* @return Callable 
*/
```
```rust
pub fn getCallable(self: MethodReferenceExpression) -> Callable;
```
## MethodReferenceExpression::getConstructor

```java
/**
* @brief gets the constructor of the call.
* @return Constructor 
*/
```
```rust
pub fn getConstructor(self: MethodReferenceExpression) -> Constructor;
```
## MethodReferenceExpression::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: MethodReferenceExpression) -> Type;
```
