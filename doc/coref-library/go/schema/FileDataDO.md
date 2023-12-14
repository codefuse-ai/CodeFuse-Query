# FileDataDO

Primary key: `oid: int`

```rust
schema FileDataDO {
  content: string,
  type: int,
  file_id: int,
  @primary oid: int,
}
```
## FileDataDO::getContent

```rust
/**
     * @brief gets the content of this element.
     * @return string
     */
```
```rust
pub fn getContent(self: FileDataDO) -> string;
```
## FileDataDO::getFileId

```rust
/**
     * @brief gets the file id of this element.
     * @return int
     */
```
```rust
pub fn getFileId(self: FileDataDO) -> int;
```
## FileDataDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return int
     */
```
```rust
pub fn getType(self: FileDataDO) -> int;
```
## FileDataDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *FileDataDO;
```
## FileDataDO::is\<T\>

```rust
pub fn is<T>(self: FileDataDO) -> bool;
```
## FileDataDO::to\<T\>

```rust
pub fn to<T>(self: FileDataDO) -> <any>;
```
## FileDataDO::key\_neq

```rust
pub fn key_neq(self: FileDataDO, object: <any>) -> bool;
```
## FileDataDO::key\_eq

```rust
pub fn key_eq(self: FileDataDO, object: <any>) -> bool;
```
## FileDataDO::to\_set

```rust
pub fn to_set(self: FileDataDO) -> *FileDataDO;
```
