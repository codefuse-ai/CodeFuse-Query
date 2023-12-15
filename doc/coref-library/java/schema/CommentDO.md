# CommentDO

Primary key: `element_hash_id: int`

```rust
schema CommentDO {
  comment_type: string,
  parent_hash_id: int,
  location_hash_id: int,
  text: string,
  @primary element_hash_id: int
}
```
## CommentDO::getCommentType

```java
/**
* @brief gets the comment type of this element.
* @return string
*/
```
```rust
pub fn getCommentType(self: CommentDO) -> string;
```
## CommentDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: CommentDO) -> int;
```
## CommentDO::getText

```java
/**
* @brief gets the text of this element.
* @return string
*/
```
```rust
pub fn getText(self: CommentDO) -> string;
```
## CommentDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: CommentDO) -> int;
```
## CommentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CommentDO;
```
