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

```java
/**
* @brief gets the idx of this element.
* @return int
*/
```
```rust
pub fn getIdx(self: CommentGroupDO) -> int;
```
## CommentGroupDO::getParent

```java
/**
* @brief gets the parent of this element.
* @return int
*/
```
```rust
pub fn getParent(self: CommentGroupDO) -> int;
```
## CommentGroupDO::getFileId

```java
/**
* @brief gets the file id of this element.
* @return int
*/
```
```rust
pub fn getFileId(self: CommentGroupDO) -> int;
```
## CommentGroupDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *CommentGroupDO;
```
