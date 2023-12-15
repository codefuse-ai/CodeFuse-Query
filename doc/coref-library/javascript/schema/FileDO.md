# FileDO

Primary key: `oid: int`

```rust
schema FileDO {
  location_oid: int,
  relative_path: string,
  name: string,
  extension: string,
  @primary oid: int
}
```
## FileDO::getLocationOid

```rust
pub fn getLocationOid(self: FileDO) -> int;
```
## FileDO::getRelativePath

```rust
pub fn getRelativePath(self: FileDO) -> string;
```
## FileDO::getExtension

```rust
pub fn getExtension(self: FileDO) -> string;
```
## FileDO::getName

```rust
pub fn getName(self: FileDO) -> string;
```
## FileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FileDO;
```
