# CommentDO

Primary key: `oid: int`

```rust
schema CommentDO {
  location_oid: int,
  kind: int,
  @primary oid: int,
}
```
## CommentDO::getLocationOid

```rust
pub fn getLocationOid(self: CommentDO) -> int;
```
## CommentDO::getKind

```rust
pub fn getKind(self: CommentDO) -> int;
```
## CommentDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CommentDO;
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
