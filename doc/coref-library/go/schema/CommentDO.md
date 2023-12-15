# CommentDO

Primary key: `oid: int`

```rust
schema CommentDO {
  comment_type: int,
  parent: int,
  index: int,
  debug_info: string,
  file_id: int,
  @primary oid: int
}
```
## CommentDO::getDebugInfo

```java
/**
* @brief gets the debug info of this element.
* @return string
*/
```
```rust
pub fn getDebugInfo(self: CommentDO) -> string;
```
## CommentDO::getIndex

```java
/**
* @brief gets the index of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: CommentDO) -> int;
```
## CommentDO::getParent

```java
/**
* @brief gets the parent of this element.
* @return int
*/
```
```rust
pub fn getParent(self: CommentDO) -> int;
```
## CommentDO::getCommentType

```java
/**
* @brief gets the comment type of this element.
* @return int
*/
```
```rust
pub fn getCommentType(self: CommentDO) -> int;
```
## CommentDO::getFileId

```java
/**
* @brief gets the file id of this element.
* @return int
*/
```
```rust
pub fn getFileId(self: CommentDO) -> int;
```
## CommentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *CommentDO;
```
