# AppJsFile

Inherit from [File](./File.md)

Primary key: `oid: int`

```rust
schema AppJsFile extends File {
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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AppJsFile;
```
