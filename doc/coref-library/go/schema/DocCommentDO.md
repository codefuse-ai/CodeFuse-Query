# DocCommentDO

Primary key: `oid: int`

```rust
schema DocCommentDO {
  comment_group_id: int,
  associate_obj: int,
  @primary oid: int,
}
```
## DocCommentDO::getCommentGroupId

```rust
/**
     * @brief gets the comment group id of this element.
     * @return int
     */
```
```rust
pub fn getCommentGroupId(self: DocCommentDO) -> int;
```
## DocCommentDO::getAssociateObj

```rust
/**
     * @brief gets the associate obj of this element.
     * @return int
     */
```
```rust
pub fn getAssociateObj(self: DocCommentDO) -> int;
```
## DocCommentDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *DocCommentDO;
```
## DocCommentDO::is\<T\>

```rust
pub fn is<T>(self: DocCommentDO) -> bool;
```
## DocCommentDO::to\<T\>

```rust
pub fn to<T>(self: DocCommentDO) -> <any>;
```
## DocCommentDO::key\_neq

```rust
pub fn key_neq(self: DocCommentDO, object: <any>) -> bool;
```
## DocCommentDO::key\_eq

```rust
pub fn key_eq(self: DocCommentDO, object: <any>) -> bool;
```
## DocCommentDO::to\_set

```rust
pub fn to_set(self: DocCommentDO) -> *DocCommentDO;
```
