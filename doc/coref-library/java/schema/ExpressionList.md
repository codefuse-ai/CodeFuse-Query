# ExpressionList

Primary key: `element_hash_id: int`

```rust
schema ExpressionList {
  @primary element_hash_id: int,
  location_hash_id: int,
  parent_hash_id: int,
  size: int,
  printable_text: string,
}
```
## ExpressionList::getSize

```rust
pub fn getSize(self: ExpressionList) -> int;
```
## ExpressionList::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ExpressionList) -> int;
```
## ExpressionList::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ExpressionList) -> string;
```
## ExpressionList::getSubExpression

```rust
pub fn getSubExpression(self: ExpressionList, position: int) -> Expression;
```
## ExpressionList::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ExpressionList) -> ElementParent;
```
## ExpressionList::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ExpressionList) -> int;
```
## ExpressionList::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ExpressionList) -> Location;
```
## ExpressionList::getContainedExpression

```rust
pub fn getContainedExpression(self: ExpressionList) -> Expression;
```
## ExpressionList::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ExpressionList;
```
