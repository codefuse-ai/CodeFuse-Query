# CfgEntryNodeDO

Primary key: `oid: int`

```rust
schema CfgEntryNodeDO {
  ast_node_oid: int,
  @primary oid: int
}
```
## CfgEntryNodeDO::getAstNodeOid

```rust
pub fn getAstNodeOid(self: CfgEntryNodeDO) -> int;
```
## CfgEntryNodeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CfgEntryNodeDO;
```
