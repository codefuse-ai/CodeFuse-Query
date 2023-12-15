# CfgExitNodeDO

Primary key: `oid: int`

```rust
schema CfgExitNodeDO {
  ast_node_oid: int,
  @primary oid: int
}
```
## CfgExitNodeDO::getAstNodeOid

```rust
pub fn getAstNodeOid(self: CfgExitNodeDO) -> int;
```
## CfgExitNodeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CfgExitNodeDO;
```
