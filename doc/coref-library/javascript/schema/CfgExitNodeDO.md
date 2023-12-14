# CfgExitNodeDO

Primary key: `oid: int`

```rust
schema CfgExitNodeDO {
  ast_node_oid: int,
  @primary oid: int,
}
```
## CfgExitNodeDO::getAstNodeOid

```rust
pub fn getAstNodeOid(self: CfgExitNodeDO) -> int;
```
## CfgExitNodeDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CfgExitNodeDO;
```
## CfgExitNodeDO::is\<T\>

```rust
pub fn is<T>(self: CfgExitNodeDO) -> bool;
```
## CfgExitNodeDO::to\<T\>

```rust
pub fn to<T>(self: CfgExitNodeDO) -> <any>;
```
## CfgExitNodeDO::key\_neq

```rust
pub fn key_neq(self: CfgExitNodeDO, object: <any>) -> bool;
```
## CfgExitNodeDO::key\_eq

```rust
pub fn key_eq(self: CfgExitNodeDO, object: <any>) -> bool;
```
## CfgExitNodeDO::to\_set

```rust
pub fn to_set(self: CfgExitNodeDO) -> *CfgExitNodeDO;
```
