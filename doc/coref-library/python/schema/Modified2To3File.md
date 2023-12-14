# Modified2To3File

Primary key: `element_oid: int`

```rust
schema Modified2To3File {
  @primary element_oid: int,
  relative_path: string,
}
```
## Modified2To3File::getRelativePath

```rust
/**
     * @brief gets the relative path of this element.
     * @return string
     */
```
```rust
pub fn getRelativePath(self: Modified2To3File) -> string;
```
## Modified2To3File::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Modified2To3File;
```
## Modified2To3File::is\<T\>

```rust
pub fn is<T>(self: Modified2To3File) -> bool;
```
## Modified2To3File::to\<T\>

```rust
pub fn to<T>(self: Modified2To3File) -> <any>;
```
## Modified2To3File::key\_neq

```rust
pub fn key_neq(self: Modified2To3File, object: <any>) -> bool;
```
## Modified2To3File::key\_eq

```rust
pub fn key_eq(self: Modified2To3File, object: <any>) -> bool;
```
## Modified2To3File::to\_set

```rust
pub fn to_set(self: Modified2To3File) -> *Modified2To3File;
```
