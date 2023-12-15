# TopLevelDO

Primary key: `oid: int`

```rust
schema TopLevelDO {
  location_oid: int,
  kind: int,
  @primary oid: int
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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TopLevelDO;
```
