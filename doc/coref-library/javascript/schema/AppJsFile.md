# AppJsFile

Primary key: `oid: int`

```rust
schema AppJsFile {
  location_oid: int,
  relative_path: string,
  name: string,
  extension: string,
  @primary oid: int,
}
```
## AppJsFile::getLocationOid

```rust
pub fn getLocationOid(self: AppJsFile) -> int;
```
## AppJsFile::getRelativePath

```rust
pub fn getRelativePath(self: AppJsFile) -> string;
```
## AppJsFile::getExtension

```rust
pub fn getExtension(self: AppJsFile) -> string;
```
## AppJsFile::getName

```rust
pub fn getName(self: AppJsFile) -> string;
```
## AppJsFile::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AppJsFile;
```
## AppJsFile::is\<T\>

```rust
pub fn is<T>(self: AppJsFile) -> bool;
```
## AppJsFile::to\<T\>

```rust
pub fn to<T>(self: AppJsFile) -> <any>;
```
## AppJsFile::key\_neq

```rust
pub fn key_neq(self: AppJsFile, object: <any>) -> bool;
```
## AppJsFile::key\_eq

```rust
pub fn key_eq(self: AppJsFile, object: <any>) -> bool;
```
## AppJsFile::to\_set

```rust
pub fn to_set(self: AppJsFile) -> *AppJsFile;
```
