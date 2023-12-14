# XmlFileDO

Primary key: `id: int`

```rust
schema XmlFileDO {
  relative_path: string,
  file_name: string,
  @primary id: int,
}
```
## XmlFileDO::getRelativePath

```rust
/**
     * @brief gets the relative path of the file.
     * @return string 
     */
```
```rust
pub fn getRelativePath(self: XmlFileDO) -> string;
```
## XmlFileDO::getFileName

```rust
/**
     * @brief gets the name of the file.
     * @return string 
     */
```
```rust
pub fn getFileName(self: XmlFileDO) -> string;
```
## XmlFileDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlFileDO;
```
## XmlFileDO::is\<T\>

```rust
pub fn is<T>(self: XmlFileDO) -> bool;
```
## XmlFileDO::to\<T\>

```rust
pub fn to<T>(self: XmlFileDO) -> <any>;
```
## XmlFileDO::key\_neq

```rust
pub fn key_neq(self: XmlFileDO, object: <any>) -> bool;
```
## XmlFileDO::key\_eq

```rust
pub fn key_eq(self: XmlFileDO, object: <any>) -> bool;
```
## XmlFileDO::to\_set

```rust
pub fn to_set(self: XmlFileDO) -> *XmlFileDO;
```
