# File

Primary key: `oid: int`

```rust
schema File {
  @primary oid: int,
  extension: string,
  name: string,
  relative_path: string,
  location_oid: int,
}
```
## File::getExtension

```rust
pub fn getExtension(self: File) -> string;
```
## File::getRelativePath

```rust
pub fn getRelativePath(self: File) -> string;
```
## File::getLocationOid

```rust
pub fn getLocationOid(self: File) -> int;
```
## File::getName

```rust
pub fn getName(self: File) -> string;
```
## File::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *File;
```
