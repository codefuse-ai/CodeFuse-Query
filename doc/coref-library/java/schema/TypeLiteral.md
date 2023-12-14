# TypeLiteral

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema TypeLiteral extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## TypeLiteral::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: TypeLiteral) -> string;
```
## TypeLiteral::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: TypeLiteral) -> Statement;
```
## TypeLiteral::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: TypeLiteral) -> NumberOfLines;
```
## TypeLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TypeLiteral;
```
## TypeLiteral::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: TypeLiteral) -> Location;
```
## TypeLiteral::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: TypeLiteral) -> int;
```
## TypeLiteral::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: TypeLiteral) -> ElementParent;
```
## TypeLiteral::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: TypeLiteral) -> int;
```
## TypeLiteral::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: TypeLiteral) -> Callable;
```
## TypeLiteral::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: TypeLiteral) -> int;
```
## TypeLiteral::getValue

```java
/**
* @brief gets the value of the element.
* @return string 
*/
```
```rust
pub fn getValue(self: TypeLiteral) -> string;
```
## TypeLiteral::getType

```java
/**
* @brief gets the reference type of the element.
* @return Type 
*/
```
```rust
pub fn getType(self: TypeLiteral) -> Type;
```
## TypeLiteral::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: TypeLiteral) -> *ElementParent;
```
## TypeLiteral::getTypeElement

```java
/**
* @brief gets the type element of the element.
* @return TypeElement 
*/
```
```rust
pub fn getTypeElement(self: TypeLiteral) -> TypeElement;
```
