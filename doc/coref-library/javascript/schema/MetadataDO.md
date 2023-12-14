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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MetadataDO;
```
