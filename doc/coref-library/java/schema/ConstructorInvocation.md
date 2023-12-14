# ConstructorInvocation

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema ConstructorInvocation extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ConstructorInvocation::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ConstructorInvocation) -> string;
```
## ConstructorInvocation::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ConstructorInvocation) -> Statement;
```
## ConstructorInvocation::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ConstructorInvocation) -> int;
```
## ConstructorInvocation::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ConstructorInvocation) -> ElementParent;
```
## ConstructorInvocation::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ConstructorInvocation;
```
## ConstructorInvocation::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ConstructorInvocation) -> int;
```
## ConstructorInvocation::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ConstructorInvocation) -> Location;
```
## ConstructorInvocation::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ConstructorInvocation) -> int;
```
## ConstructorInvocation::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ConstructorInvocation) -> Callable;
```
## ConstructorInvocation::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ConstructorInvocation) -> NumberOfLines;
```
## ConstructorInvocation::getReference

```java
/**
* @brief gets the reference element of the expression
* @return ReferenceElement 
*/
```
```rust
pub fn getReference(self: ConstructorInvocation) -> ReferenceElement;
```
## ConstructorInvocation::getConstructor

```java
/**
* @brief gets the constructor of the expression
* @return Constructor 
*/
```
```rust
pub fn getConstructor(self: ConstructorInvocation) -> Constructor;
```
## ConstructorInvocation::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ConstructorInvocation) -> string;
```
## ConstructorInvocation::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ConstructorInvocation) -> *ElementParent;
```
## ConstructorInvocation::getExpressionList

```java
/**
* @brief gets the argument of the expression
* @return ExpressionList 
*/
```
```rust
pub fn getExpressionList(self: ConstructorInvocation) -> ExpressionList;
```
