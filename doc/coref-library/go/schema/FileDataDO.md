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

```java
/**
* @brief gets the content of this element.
* @return string
*/
```
```rust
pub fn getContent(self: FileDataDO) -> string;
```
## FileDataDO::getFileId

```java
/**
* @brief gets the file id of this element.
* @return int
*/
```
```rust
pub fn getFileId(self: FileDataDO) -> int;
```
## FileDataDO::getType

```java
/**
* @brief gets the type of this element.
* @return int
*/
```
```rust
pub fn getType(self: FileDataDO) -> int;
```
## FileDataDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *FileDataDO;
```
