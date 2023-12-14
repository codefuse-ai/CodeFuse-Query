# CommentDO

Primary key: `oid: int`

```rust
schema CommentDO {
  comment_type: int,
  parent: int,
  index: int,
  debug_info: string,
  file_id: int,
  @primary oid: int,
}
```
## CommentDO::getDebugInfo

```rust
/**
     * @brief gets the debug info of this element.
     * @return string
     */
```
```rust
pub fn getDebugInfo(self: CommentDO) -> string;
```
## CommentDO::getIndex

```rust
/**
     * @brief gets the index of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: CommentDO) -> int;
```
## CommentDO::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return int
     */
```
```rust
pub fn getParent(self: CommentDO) -> int;
```
## CommentDO::getCommentType

```rust
/**
     * @brief gets the comment type of this element.
     * @return int
     */
```
```rust
pub fn getCommentType(self: CommentDO) -> int;
```
## CommentDO::getFileId

```rust
/**
     * @brief gets the file id of this element.
     * @return int
     */
```
```rust
pub fn getFileId(self: CommentDO) -> int;
```
## CommentDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *CommentDO;
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
