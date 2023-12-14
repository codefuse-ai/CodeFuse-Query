# NewExpression

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema NewExpression extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## NewExpression::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: NewExpression) -> *ElementParent;
```
## NewExpression::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: NewExpression) -> string;
```
## NewExpression::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: NewExpression) -> Statement;
```
## NewExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NewExpression;
```
## NewExpression::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: NewExpression) -> Location;
```
## NewExpression::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: NewExpression) -> int;
```
## NewExpression::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: NewExpression) -> ElementParent;
```
## NewExpression::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: NewExpression) -> int;
```
## NewExpression::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: NewExpression) -> Callable;
```
## NewExpression::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: NewExpression) -> int;
```
## NewExpression::getAnonymousClass

```java
/**
* @brief gets the created anonymous class instance.
* @return AnonymousClass 
*/
```
```rust
pub fn getAnonymousClass(self: NewExpression) -> AnonymousClass;
```
## NewExpression::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: NewExpression) -> NumberOfLines;
```
## NewExpression::getReference

```java
/**
* @brief gets the created class instance.
* @return ReferenceElement 
*/
```
```rust
pub fn getReference(self: NewExpression) -> ReferenceElement;
```
## NewExpression::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: NewExpression) -> Type;
```
