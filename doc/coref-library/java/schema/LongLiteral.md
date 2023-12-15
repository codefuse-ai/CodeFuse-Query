# LongLiteral

Inherit from [Literal](./Literal.md)

Primary key: `element_hash_id: int`

```rust
schema LongLiteral extends Literal {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string
}
```
## LongLiteral::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: LongLiteral) -> string;
```
## LongLiteral::getValue

```java
/**
* @brief gets the value of the Literal.
* @return string
*/
```
```rust
pub fn getValue(self: LongLiteral) -> string;
```
## LongLiteral::getValueType

```java
/**
* @brief gets the type of the Literal value.
* @return string
*/
```
```rust
pub fn getValueType(self: LongLiteral) -> Type;
```
## LongLiteral::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: LongLiteral) -> Callable;
```
## LongLiteral::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: LongLiteral) -> int;
```
## LongLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LongLiteral;
```
## LongLiteral::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: LongLiteral) -> int;
```
## LongLiteral::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: LongLiteral) -> Location;
```
## LongLiteral::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: LongLiteral) -> int;
```
## LongLiteral::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: LongLiteral) -> ElementParent;
```
## LongLiteral::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: LongLiteral) -> Statement;
```
## LongLiteral::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: LongLiteral) -> string;
```
## LongLiteral::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: LongLiteral) -> NumberOfLines;
```
## LongLiteral::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: LongLiteral) -> *ElementParent;
```
