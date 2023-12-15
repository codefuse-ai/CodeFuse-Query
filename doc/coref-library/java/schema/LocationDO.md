# LocationDO

Primary key: `element_hash_id: int`

```rust
schema LocationDO {
  start_column_number: int,
  end_column_number: int,
  start_line_number: int,
  end_line_number: int,
  file_hash_id: int,
  @primary element_hash_id: int
}
```
## LocationDO::getEndColumnNumber

```java
/**
* @brief gets the end column number of this element.
* @return int
*/
```
```rust
pub fn getEndColumnNumber(self: LocationDO) -> int;
```
## LocationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LocationDO;
```
## LocationDO::getEndLineNumber

```java
/**
* @brief gets the end line number of this element.
* @return int
*/
```
```rust
pub fn getEndLineNumber(self: LocationDO) -> int;
```
## LocationDO::getStartColumnNumber

```java
/**
* @brief gets the start column number of this element.
* @return int
*/
```
```rust
pub fn getStartColumnNumber(self: LocationDO) -> int;
```
## LocationDO::getStartLineNumber

```java
/**
* @brief gets the start line number of this element.
* @return int
*/
```
```rust
pub fn getStartLineNumber(self: LocationDO) -> int;
```
## LocationDO::getFileHashId

```java
/**
* @brief gets the file hash id of this element.
* @return int
*/
```
```rust
pub fn getFileHashId(self: LocationDO) -> int;
```
