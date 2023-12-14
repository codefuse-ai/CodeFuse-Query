# BooleanLiteral

Inherit from [Literal](./Literal.md)

Primary key: `element_hash_id: int`

```rust
schema BooleanLiteral extends Literal {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## BooleanLiteral::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: BooleanLiteral) -> string;
```
## BooleanLiteral::getValue

```java
/**
* @brief gets the value of the Literal.
* @return string
*/
```
```rust
pub fn getValue(self: BooleanLiteral) -> string;
```
## BooleanLiteral::getValueType

```java
/**
* @brief gets the type of the Literal value.
* @return string
*/
```
```rust
pub fn getValueType(self: BooleanLiteral) -> Type;
```
## BooleanLiteral::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: BooleanLiteral) -> Callable;
```
## BooleanLiteral::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: BooleanLiteral) -> int;
```
## BooleanLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *BooleanLiteral;
```
## BooleanLiteral::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: BooleanLiteral) -> Location;
```
## BooleanLiteral::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: BooleanLiteral) -> ElementParent;
```
## BooleanLiteral::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: BooleanLiteral) -> Statement;
```
## BooleanLiteral::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: BooleanLiteral) -> string;
```
## BooleanLiteral::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: BooleanLiteral) -> NumberOfLines;
```
## BooleanLiteral::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: BooleanLiteral) -> *ElementParent;
```
