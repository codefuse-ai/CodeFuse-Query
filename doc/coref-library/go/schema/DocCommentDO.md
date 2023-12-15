# DocCommentDO

Primary key: `oid: int`

```rust
schema DocCommentDO {
  comment_group_id: int,
  associate_obj: int,
  @primary oid: int
}
```
## DocCommentDO::getCommentGroupId

```java
/**
* @brief gets the comment group id of this element.
* @return int
*/
```
```rust
pub fn getCommentGroupId(self: DocCommentDO) -> int;
```
## DocCommentDO::getAssociateObj

```java
/**
* @brief gets the associate obj of this element.
* @return int
*/
```
```rust
pub fn getAssociateObj(self: DocCommentDO) -> int;
```
## DocCommentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *DocCommentDO;
```
