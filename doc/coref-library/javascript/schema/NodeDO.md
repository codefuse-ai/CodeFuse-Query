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

```rust
pub fn __all__(db: JavascriptDB) -> *NodeDO;
```
## NodeDO::is\<T\>

```rust
pub fn is<T>(self: NodeDO) -> bool;
```
## NodeDO::to\<T\>

```rust
pub fn to<T>(self: NodeDO) -> <any>;
```
## NodeDO::key\_neq

```rust
pub fn key_neq(self: NodeDO, object: <any>) -> bool;
```
## NodeDO::key\_eq

```rust
pub fn key_eq(self: NodeDO, object: <any>) -> bool;
```
## NodeDO::to\_set

```rust
pub fn to_set(self: NodeDO) -> *NodeDO;
```
