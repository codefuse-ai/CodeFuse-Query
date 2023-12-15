# DirectoryDO

Primary key: `oid: int`

```rust
schema DirectoryDO {
  location_oid: int,
  relative_path: string,
  name: string,
  @primary oid: int
}
```
## DirectoryDO::getLocationOid

```rust
pub fn getLocationOid(self: DirectoryDO) -> int;
```
## DirectoryDO::getRelativePath

```rust
pub fn getRelativePath(self: DirectoryDO) -> string;
```
## DirectoryDO::getName

```rust
pub fn getName(self: DirectoryDO) -> string;
```
## DirectoryDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DirectoryDO;
```
