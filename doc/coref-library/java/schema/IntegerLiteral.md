# IntegerLiteral

Inherit from [Literal](./Literal.md)

Primary key: `element_hash_id: int`

```rust
schema IntegerLiteral extends Literal {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string
}
```
## IntegerLiteral::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: IntegerLiteral) -> string;
```
## IntegerLiteral::getValue

```java
/**
* @brief gets the value of the Literal.
* @return string
*/
```
```rust
pub fn getValue(self: IntegerLiteral) -> string;
```
## IntegerLiteral::getValueType

```java
/**
* @brief gets the type of the Literal value.
* @return string
*/
```
```rust
pub fn getValueType(self: IntegerLiteral) -> Type;
```
## IntegerLiteral::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: IntegerLiteral) -> Callable;
```
## IntegerLiteral::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: IntegerLiteral) -> int;
```
## IntegerLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *IntegerLiteral;
```
## IntegerLiteral::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: IntegerLiteral) -> int;
```
## IntegerLiteral::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: IntegerLiteral) -> Location;
```
## IntegerLiteral::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: IntegerLiteral) -> int;
```
## IntegerLiteral::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: IntegerLiteral) -> ElementParent;
```
## IntegerLiteral::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: IntegerLiteral) -> Statement;
```
## IntegerLiteral::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: IntegerLiteral) -> string;
```
## IntegerLiteral::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: IntegerLiteral) -> NumberOfLines;
```
## IntegerLiteral::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: IntegerLiteral) -> *ElementParent;
```
