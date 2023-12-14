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

```java
/**
* @brief gets the relative path of the file.
* @return string 
*/
```
```rust
pub fn getRelativePath(self: XmlFileDO) -> string;
```
## XmlFileDO::getFileName

```java
/**
* @brief gets the name of the file.
* @return string 
*/
```
```rust
pub fn getFileName(self: XmlFileDO) -> string;
```
## XmlFileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlFileDO;
```
