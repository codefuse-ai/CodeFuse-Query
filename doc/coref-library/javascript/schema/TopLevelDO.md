# TopLevelDO

Primary key: `oid: int`

```rust
schema TopLevelDO {
  location_oid: int,
  kind: int,
  @primary oid: int,
}
```
## TopLevelDO::getLocationOid

```rust
pub fn getLocationOid(self: TopLevelDO) -> int;
```
## TopLevelDO::getKind

```rust
pub fn getKind(self: TopLevelDO) -> int;
```
## TopLevelDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TopLevelDO;
```
## TopLevelDO::is\<T\>

```rust
pub fn is<T>(self: TopLevelDO) -> bool;
```
## TopLevelDO::to\<T\>

```rust
pub fn to<T>(self: TopLevelDO) -> <any>;
```
## TopLevelDO::key\_neq

```rust
pub fn key_neq(self: TopLevelDO, object: <any>) -> bool;
```
## TopLevelDO::key\_eq

```rust
pub fn key_eq(self: TopLevelDO, object: <any>) -> bool;
```
## TopLevelDO::to\_set

```rust
pub fn to_set(self: TopLevelDO) -> *TopLevelDO;
```
