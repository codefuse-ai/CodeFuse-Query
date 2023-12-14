# StringLiteral

Inherit from [Literal](./Literal.md)

Primary key: `element_hash_id: int`

```rust
schema StringLiteral extends Literal {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
}
```
## StringLiteral::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: StringLiteral) -> string;
```
## StringLiteral::getValue

```java
/**
* @brief gets the value of the Literal.
* @return string
*/
```
```rust
pub fn getValue(self: StringLiteral) -> string;
```
## StringLiteral::getValueType

```java
/**
* @brief gets the type of the Literal value.
* @return string
*/
```
```rust
pub fn getValueType(self: StringLiteral) -> Type;
```
## StringLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *StringLiteral;
```
## StringLiteral::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: StringLiteral) -> int;
```
## StringLiteral::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: StringLiteral) -> Location;
```
## StringLiteral::getRealValue

```rust
pub fn getRealValue(self: StringLiteral) -> string;
```
## StringLiteral::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: StringLiteral) -> int;
```
## StringLiteral::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: StringLiteral) -> ElementParent;
```
## StringLiteral::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: StringLiteral) -> NumberOfLines;
```
## StringLiteral::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: StringLiteral) -> Statement;
```
## StringLiteral::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: StringLiteral) -> int;
```
## StringLiteral::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: StringLiteral) -> Callable;
```
## StringLiteral::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: StringLiteral) -> string;
```
## StringLiteral::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: StringLiteral) -> *ElementParent;
```
