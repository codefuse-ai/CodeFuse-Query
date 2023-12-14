# ArrayInitializer

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema ArrayInitializer extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ArrayInitializer::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ArrayInitializer) -> *ElementParent;
```
## ArrayInitializer::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ArrayInitializer) -> string;
```
## ArrayInitializer::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: ArrayInitializer) -> Statement;
```
## ArrayInitializer::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ArrayInitializer) -> int;
```
## ArrayInitializer::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ArrayInitializer) -> ElementParent;
```
## ArrayInitializer::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: ArrayInitializer) -> NumberOfLines;
```
## ArrayInitializer::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ArrayInitializer;
```
## ArrayInitializer::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ArrayInitializer) -> int;
```
## ArrayInitializer::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ArrayInitializer) -> Location;
```
## ArrayInitializer::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: ArrayInitializer) -> Callable;
```
## ArrayInitializer::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ArrayInitializer) -> int;
```
## ArrayInitializer::getInitializerExpression

```java
/**
* @brief gets the initializer expression.
* @return ArrayInitializerExpression 
*/
```
```rust
pub fn getInitializerExpression(self: ArrayInitializer) -> int;
```
## ArrayInitializer::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ArrayInitializer) -> string;
```
