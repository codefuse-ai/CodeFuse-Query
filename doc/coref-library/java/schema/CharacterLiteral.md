# CharacterLiteral

Inherit from [Literal](./Literal.md)

Primary key: `element_hash_id: int`

```rust
schema CharacterLiteral extends Literal {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string
}
```
## CharacterLiteral::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: CharacterLiteral) -> string;
```
## CharacterLiteral::getValue

```java
/**
* @brief gets the value of the Literal.
* @return string
*/
```
```rust
pub fn getValue(self: CharacterLiteral) -> string;
```
## CharacterLiteral::getValueType

```java
/**
* @brief gets the type of the Literal value.
* @return string
*/
```
```rust
pub fn getValueType(self: CharacterLiteral) -> Type;
```
## CharacterLiteral::getEnclosingCallable

```java
/**
* @brief gets the callable in which this expression occurs.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: CharacterLiteral) -> Callable;
```
## CharacterLiteral::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: CharacterLiteral) -> int;
```
## CharacterLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CharacterLiteral;
```
## CharacterLiteral::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: CharacterLiteral) -> int;
```
## CharacterLiteral::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: CharacterLiteral) -> Location;
```
## CharacterLiteral::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: CharacterLiteral) -> int;
```
## CharacterLiteral::getParent

```java
/**
* @brief gets the parent of the expression.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: CharacterLiteral) -> ElementParent;
```
## CharacterLiteral::getEnclosingStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getEnclosingStatement(self: CharacterLiteral) -> Statement;
```
## CharacterLiteral::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: CharacterLiteral) -> string;
```
## CharacterLiteral::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: CharacterLiteral) -> NumberOfLines;
```
## CharacterLiteral::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: CharacterLiteral) -> *ElementParent;
```
