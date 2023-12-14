# FileData

Primary key: `oid: int`

```rust
schema FileData {
  @primary oid: int,
  file_id: int,
  type: int,
  content: string,
}
```
## FileData::getFileId

```rust
/**
     * @brief gets the file id of this element.
     * @return int
     */
```
```rust
pub fn getFileId(self: FileData) -> int;
```
## FileData::getContent

```rust
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

```rust
/**
     * @brief gets the type of this element.
     * @return int
     */
```
```rust
pub fn getType(self: FileData) -> int;
```
## FileData::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *FileData;
```
## FileData::is\<T\>

```rust
pub fn is<T>(self: FileData) -> bool;
```
## FileData::to\<T\>

```rust
pub fn to<T>(self: FileData) -> <any>;
```
## FileData::key\_neq

```rust
pub fn key_neq(self: FileData, object: <any>) -> bool;
```
## FileData::key\_eq

```rust
pub fn key_eq(self: FileData, object: <any>) -> bool;
```
## FileData::to\_set

```rust
pub fn to_set(self: FileData) -> *FileData;
```
