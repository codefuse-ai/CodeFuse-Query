# FileData

Inherit from [FileDataDO](./FileDataDO.md)

Primary key: `oid: int`

```rust
schema FileData extends FileDataDO {
  @primary oid: int,
  file_id: int,
  type: int,
  content: string,
}
```
## FileData::getFileId

```java
/**
* @brief gets the file id of this element.
* @return int
*/
```
```rust
pub fn getFileId(self: FileData) -> int;
```
## FileData::getContent

```java
/**
* @brief gets the content of this element.
* @return string
*/
```
```rust
pub fn getContent(self: FileData) -> string;
```
## FileData::getFile

```rust
pub fn getFile(self: FileData) -> File;
```
## FileData::getType

```java
/**
* @brief gets the type of this element.
* @return int
*/
```
```rust
pub fn getType(self: FileData) -> int;
```
## FileData::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *FileData;
```
