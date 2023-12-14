# NodeDO

Primary key: `oid: int`

```rust
schema NodeDO {
  location_oid: int,
  index: int,
  parent_oid: int,
  kind: int,
  @primary oid: int,
}
```
## NodeDO::getLocationOid

```rust
pub fn getLocationOid(self: NodeDO) -> int;
```
## NodeDO::getParentOid

```rust
pub fn getParentOid(self: NodeDO) -> int;
```
## NodeDO::getIndex

```rust
pub fn getIndex(self: NodeDO) -> int;
```
## NodeDO::getKind

```rust
pub fn getKind(self: NodeDO) -> int;
```
## NodeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NodeDO;
```
