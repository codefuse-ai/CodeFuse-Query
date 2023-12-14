# DirectoryDO

Primary key: `oid: int`

```rust
schema DirectoryDO {
  location_oid: int,
  relative_path: string,
  name: string,
  @primary oid: int,
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

```rust
pub fn __all__(db: JavascriptDB) -> *DirectoryDO;
```
## DirectoryDO::is\<T\>

```rust
pub fn is<T>(self: DirectoryDO) -> bool;
```
## DirectoryDO::to\<T\>

```rust
pub fn to<T>(self: DirectoryDO) -> <any>;
```
## DirectoryDO::key\_neq

```rust
pub fn key_neq(self: DirectoryDO, object: <any>) -> bool;
```
## DirectoryDO::key\_eq

```rust
pub fn key_eq(self: DirectoryDO, object: <any>) -> bool;
```
## DirectoryDO::to\_set

```rust
pub fn to_set(self: DirectoryDO) -> *DirectoryDO;
```
