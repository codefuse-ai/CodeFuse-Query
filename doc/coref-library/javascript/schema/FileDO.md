# FileDO

Primary key: `oid: int`

```rust
schema FileDO {
  location_oid: int,
  relative_path: string,
  name: string,
  extension: string,
  @primary oid: int,
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

```rust
pub fn __all__(db: JavascriptDB) -> *FileDO;
```
## FileDO::is\<T\>

```rust
pub fn is<T>(self: FileDO) -> bool;
```
## FileDO::to\<T\>

```rust
pub fn to<T>(self: FileDO) -> <any>;
```
## FileDO::key\_neq

```rust
pub fn key_neq(self: FileDO, object: <any>) -> bool;
```
## FileDO::key\_eq

```rust
pub fn key_eq(self: FileDO, object: <any>) -> bool;
```
## FileDO::to\_set

```rust
pub fn to_set(self: FileDO) -> *FileDO;
```
