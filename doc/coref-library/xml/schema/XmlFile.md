# XmlFile

Primary key: `id: int`

```rust
schema XmlFile {
  @primary id: int,
  file_name: string,
  relative_path: string,
}
```
## XmlFile::getFileName

```rust
/**
     * @brief gets the name of the file.
     * @return string 
     */
```
```rust
pub fn getFileName(self: XmlFile) -> string;
```
## XmlFile::getRelativePath

```rust
/**
     * @brief gets the relative path of the file.
     * @return string 
     */
```
```rust
pub fn getRelativePath(self: XmlFile) -> string;
```
## XmlFile::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlFile;
```
## XmlFile::is\<T\>

```rust
pub fn is<T>(self: XmlFile) -> bool;
```
## XmlFile::to\<T\>

```rust
pub fn to<T>(self: XmlFile) -> <any>;
```
## XmlFile::key\_neq

```rust
pub fn key_neq(self: XmlFile, object: <any>) -> bool;
```
## XmlFile::key\_eq

```rust
pub fn key_eq(self: XmlFile, object: <any>) -> bool;
```
## XmlFile::to\_set

```rust
pub fn to_set(self: XmlFile) -> *XmlFile;
```
