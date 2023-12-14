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

```rust
pub fn __all__(db: JavascriptDB) -> *File;
```
## File::is\<T\>

```rust
pub fn is<T>(self: File) -> bool;
```
## File::to\<T\>

```rust
pub fn to<T>(self: File) -> <any>;
```
## File::key\_neq

```rust
pub fn key_neq(self: File, object: <any>) -> bool;
```
## File::key\_eq

```rust
pub fn key_eq(self: File, object: <any>) -> bool;
```
## File::to\_set

```rust
pub fn to_set(self: File) -> *File;
```
