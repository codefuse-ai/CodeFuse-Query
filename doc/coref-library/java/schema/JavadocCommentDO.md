# JavadocCommentDO

Primary key: `element_hash_id: int`

```rust
schema JavadocCommentDO {
  parent_hash_id: int,
  documentable_hash_id: int,
  location_hash_id: int,
  text: string,
  @primary element_hash_id: int
}
```
## JavadocCommentDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: JavadocCommentDO) -> int;
```
## JavadocCommentDO::getText

```java
/**
* @brief gets the text of this element.
* @return string
*/
```
```rust
pub fn getText(self: JavadocCommentDO) -> string;
```
## JavadocCommentDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: JavadocCommentDO) -> int;
```
## JavadocCommentDO::getDocumentableHashId

```java
/**
* @brief gets the documentable hash id of this element.
* @return int
*/
```
```rust
pub fn getDocumentableHashId(self: JavadocCommentDO) -> int;
```
## JavadocCommentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *JavadocCommentDO;
```
