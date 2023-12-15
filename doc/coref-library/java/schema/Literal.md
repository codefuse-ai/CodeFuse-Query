# Literal

Inherit from [Expression](./Expression.md)

Primary key: `element_hash_id: int`

```rust
schema Literal extends Expression {
  printable_text: string,
  index_order: int,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int
}
```
## Literal::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Literal) -> *ElementParent;
```
## Literal::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: Literal) -> string;
```
## Literal::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: Literal) -> Statement;
```
## Literal::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: Literal) -> NumberOfLines;
```
## Literal::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: Literal) -> ElementParent;
```
## Literal::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Literal) -> int;
```
## Literal::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Literal;
```
## Literal::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Literal) -> int;
```
## Literal::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Literal) -> Location;
```
## Literal::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: Literal) -> Callable;
```
## Literal::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: Literal) -> int;
```
## Literal::getValueType

```java
/**
* @brief gets the type of the Literal value.
* @return string
*/
```
```rust
pub fn getValueType(self: Literal) -> Type;
```
## Literal::getValue

```java
/**
* @brief gets the value of the Literal.
* @return string
*/
```
```rust
pub fn getValue(self: Literal) -> string;
```
## Literal::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: Literal) -> string;
```
