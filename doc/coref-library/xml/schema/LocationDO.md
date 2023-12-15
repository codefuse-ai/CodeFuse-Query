# LocationDO

Primary key: `id: int`

```rust
schema LocationDO {
  file_id: int,
  start_line_number: int,
  end_column_number: int,
  end_line_number: int,
  start_column_number: int,
  @primary id: int
}
```
## LocationDO::getEndColumnNumber

```java
/**
* @brief gets the end column number of the location element.
* @return int 
*/
```
```rust
pub fn getEndColumnNumber(self: LocationDO) -> int;
```
## LocationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *LocationDO;
```
## LocationDO::getEndLineNumber

```java
/**
* @brief gets the end line number of the location element.
* @return int 
*/
```
```rust
pub fn getEndLineNumber(self: LocationDO) -> int;
```
## LocationDO::getStartColumnNumber

```java
/**
* @brief gets the start column number of the location element.
* @return int 
*/
```
```rust
pub fn getStartColumnNumber(self: LocationDO) -> int;
```
## LocationDO::getFileId

```java
/**
* @brief gets the file id of the location element.
* @return int
*/
```
```rust
pub fn getFileId(self: LocationDO) -> int;
```
## LocationDO::getStartLineNumber

```java
/**
* @brief gets the start line number of the location element.
* @return int 
*/
```
```rust
pub fn getStartLineNumber(self: LocationDO) -> int;
```
