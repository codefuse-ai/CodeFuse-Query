# NodeCommentDO

Primary key: `oid: int`

```rust
schema NodeCommentDO {
  type: int,
  comment_oid: int,
  node_oid: int,
  @primary oid: int,
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

```rust
pub fn __all__(db: JavascriptDB) -> *NodeCommentDO;
```
## NodeCommentDO::is\<T\>

```rust
pub fn is<T>(self: NodeCommentDO) -> bool;
```
## NodeCommentDO::to\<T\>

```rust
pub fn to<T>(self: NodeCommentDO) -> <any>;
```
## NodeCommentDO::key\_neq

```rust
pub fn key_neq(self: NodeCommentDO, object: <any>) -> bool;
```
## NodeCommentDO::key\_eq

```rust
pub fn key_eq(self: NodeCommentDO, object: <any>) -> bool;
```
## NodeCommentDO::to\_set

```rust
pub fn to_set(self: NodeCommentDO) -> *NodeCommentDO;
```
