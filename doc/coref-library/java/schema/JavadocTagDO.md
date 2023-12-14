# JavadocTagDO

Primary key: `element_hash_id: int`

```rust
schema JavadocTagDO {
  index_order: int,
  location_hash_id: int,
  @primary element_hash_id: int,
  name: string,
  containing_comment_hash_id: int,
  value: string,
}
```
## JavadocTagDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: JavadocTagDO) -> int;
```
## JavadocTagDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: JavadocTagDO) -> int;
```
## JavadocTagDO::getContainingCommentHashId

```java
/**
* @brief gets the containing comment hash id of this element.
* @return int
*/
```
```rust
pub fn getContainingCommentHashId(self: JavadocTagDO) -> int;
```
## JavadocTagDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: JavadocTagDO) -> string;
```
## JavadocTagDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: JavadocTagDO) -> string;
```
## JavadocTagDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *JavadocTagDO;
```
