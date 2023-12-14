# CommentDO

Primary key: `element_hash_id: int`

```rust
schema CommentDO {
  comment_type: string,
  parent_hash_id: int,
  location_hash_id: int,
  text: string,
  @primary element_hash_id: int,
}
```
## CommentDO::getCommentType

```rust
/**
     * @brief gets the comment type of this element.
     * @return string
     */
```
```rust
pub fn getCommentType(self: CommentDO) -> string;
```
## CommentDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: CommentDO) -> int;
```
## CommentDO::getText

```rust
/**
     * @brief gets the text of this element.
     * @return string
     */
```
```rust
pub fn getText(self: CommentDO) -> string;
```
## CommentDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: CommentDO) -> int;
```
## CommentDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CommentDO;
```
## CommentDO::is\<T\>

```rust
pub fn is<T>(self: CommentDO) -> bool;
```
## CommentDO::to\<T\>

```rust
pub fn to<T>(self: CommentDO) -> <any>;
```
## CommentDO::key\_neq

```rust
pub fn key_neq(self: CommentDO, object: <any>) -> bool;
```
## CommentDO::key\_eq

```rust
pub fn key_eq(self: CommentDO, object: <any>) -> bool;
```
## CommentDO::to\_set

```rust
pub fn to_set(self: CommentDO) -> *CommentDO;
```
