# CommentGroupDO

Primary key: `oid: int`

```rust
schema CommentGroupDO {
  file_id: int,
  idx: int,
  parent: int,
  @primary oid: int,
}
```
## CommentGroupDO::getIdx

```rust
/**
     * @brief gets the idx of this element.
     * @return int
     */
```
```rust
pub fn getIdx(self: CommentGroupDO) -> int;
```
## CommentGroupDO::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return int
     */
```
```rust
pub fn getParent(self: CommentGroupDO) -> int;
```
## CommentGroupDO::getFileId

```rust
/**
     * @brief gets the file id of this element.
     * @return int
     */
```
```rust
pub fn getFileId(self: CommentGroupDO) -> int;
```
## CommentGroupDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *CommentGroupDO;
```
## CommentGroupDO::is\<T\>

```rust
pub fn is<T>(self: CommentGroupDO) -> bool;
```
## CommentGroupDO::to\<T\>

```rust
pub fn to<T>(self: CommentGroupDO) -> <any>;
```
## CommentGroupDO::key\_neq

```rust
pub fn key_neq(self: CommentGroupDO, object: <any>) -> bool;
```
## CommentGroupDO::key\_eq

```rust
pub fn key_eq(self: CommentGroupDO, object: <any>) -> bool;
```
## CommentGroupDO::to\_set

```rust
pub fn to_set(self: CommentGroupDO) -> *CommentGroupDO;
```
