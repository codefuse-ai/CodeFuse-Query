# CfgEntryNodeDO

Primary key: `oid: int`

```rust
schema CfgEntryNodeDO {
  ast_node_oid: int,
  @primary oid: int,
}
```
## CfgEntryNodeDO::getAstNodeOid

```rust
pub fn getAstNodeOid(self: CfgEntryNodeDO) -> int;
```
## CfgEntryNodeDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CfgEntryNodeDO;
```
## CfgEntryNodeDO::is\<T\>

```rust
pub fn is<T>(self: CfgEntryNodeDO) -> bool;
```
## CfgEntryNodeDO::to\<T\>

```rust
pub fn to<T>(self: CfgEntryNodeDO) -> <any>;
```
## CfgEntryNodeDO::key\_neq

```rust
pub fn key_neq(self: CfgEntryNodeDO, object: <any>) -> bool;
```
## CfgEntryNodeDO::key\_eq

```rust
pub fn key_eq(self: CfgEntryNodeDO, object: <any>) -> bool;
```
## CfgEntryNodeDO::to\_set

```rust
pub fn to_set(self: CfgEntryNodeDO) -> *CfgEntryNodeDO;
```
