# XmlFile

Inherit from [XmlFileDO](./XmlFileDO.md)

Primary key: `id: int`

```rust
schema XmlFile extends XmlFileDO {
  @primary id: int,
  file_name: string,
  relative_path: string,
}
```
## XmlFile::getFileName

```java
/**
* @brief gets the name of the file.
* @return string 
*/
```
```rust
pub fn getFileName(self: XmlFile) -> string;
```
## XmlFile::getRelativePath

```java
/**
* @brief gets the relative path of the file.
* @return string 
*/
```
```rust
pub fn getRelativePath(self: XmlFile) -> string;
```
## XmlFile::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlFile;
```
