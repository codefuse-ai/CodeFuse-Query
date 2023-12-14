# JavadocDataToken

Inherit from [JavadocDataTokenDO](./JavadocDataTokenDO.md)

Primary key: `element_hash_id: int`

```rust
schema JavadocDataToken extends JavadocDataTokenDO {
  @primary element_hash_id: int,
  value: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
}
```
## JavadocDataToken::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: JavadocDataToken) -> int;
```
## JavadocDataToken::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: JavadocDataToken) -> int;
```
## JavadocDataToken::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: JavadocDataToken) -> *ElementParent;
```
## JavadocDataToken::getComment

```java
/**
* @brief gets the doc comment in which the element is contained, if any.
* @return JavadocComment 
*/
```
```rust
pub fn getComment(self: JavadocDataToken) -> JavadocComment;
```
## JavadocDataToken::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: JavadocDataToken) -> string;
```
## JavadocDataToken::getJavaDocTag

```java
/**
* @brief gets the doc tag in which the element is contained, if any.
* @return JavadocTag 
*/
```
```rust
pub fn getJavaDocTag(self: JavadocDataToken) -> JavadocTag;
```
## JavadocDataToken::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: JavadocDataToken) -> ElementParent;
```
## JavadocDataToken::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: JavadocDataToken) -> int;
```
## JavadocDataToken::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: JavadocDataToken) -> Location;
```
## JavadocDataToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *JavadocDataToken;
```
