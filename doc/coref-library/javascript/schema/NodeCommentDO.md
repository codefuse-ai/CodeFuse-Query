# NodeCommentDO

Primary key: `oid: int`

```rust
schema NodeCommentDO {
  type: int,
  comment_oid: int,
  node_oid: int,
  @primary oid: int
}
```
## NodeCommentDO::getType

```rust
pub fn getType(self: NodeCommentDO) -> int;
```
## NodeCommentDO::getCommentOid

```rust
pub fn getCommentOid(self: NodeCommentDO) -> int;
```
## NodeCommentDO::getNodeOid

```rust
pub fn getNodeOid(self: NodeCommentDO) -> int;
```
## NodeCommentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NodeCommentDO;
```
