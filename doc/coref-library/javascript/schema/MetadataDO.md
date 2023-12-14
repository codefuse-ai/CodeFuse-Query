# MetadataDO

Primary key: `oid: int`

```rust
schema MetadataDO {
  created_time: string,
  version: string,
  @primary oid: int,
}
```
## MetadataDO::getCreatedTime

```rust
pub fn getCreatedTime(self: MetadataDO) -> string;
```
## MetadataDO::getVersion

```rust
pub fn getVersion(self: MetadataDO) -> string;
```
## MetadataDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MetadataDO;
```
## MetadataDO::is\<T\>

```rust
pub fn is<T>(self: MetadataDO) -> bool;
```
## MetadataDO::to\<T\>

```rust
pub fn to<T>(self: MetadataDO) -> <any>;
```
## MetadataDO::key\_neq

```rust
pub fn key_neq(self: MetadataDO, object: <any>) -> bool;
```
## MetadataDO::key\_eq

```rust
pub fn key_eq(self: MetadataDO, object: <any>) -> bool;
```
## MetadataDO::to\_set

```rust
pub fn to_set(self: MetadataDO) -> *MetadataDO;
```
