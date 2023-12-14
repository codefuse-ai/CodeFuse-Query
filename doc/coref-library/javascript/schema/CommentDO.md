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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CommentDO;
```
