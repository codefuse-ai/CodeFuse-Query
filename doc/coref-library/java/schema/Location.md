# Location

Inherit from [LocationDO](./LocationDO.md)

Primary key: `element_hash_id: int`

```rust
schema Location extends LocationDO {
  @primary element_hash_id: int,
  file_hash_id: int,
  end_line_number: int,
  end_column_number: int,
  start_line_number: int,
  start_column_number: int,
}
```
## Location::getFileHashId

```java
/**
* @brief gets the file hash id of this element.
* @return int
*/
```
```rust
pub fn getFileHashId(self: Location) -> int;
```
## Location::getStartLineNumber

```java
/**
* @brief gets the start line number of this element.
* @return int
*/
```
```rust
pub fn getStartLineNumber(self: Location) -> int;
```
## Location::getStartColumnNumber

```java
/**
* @brief gets the start column number of this element.
* @return int
*/
```
```rust
pub fn getStartColumnNumber(self: Location) -> int;
```
## Location::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Location;
```
## Location::getEndLineNumber

```java
/**
* @brief gets the end line number of this element.
* @return int
*/
```
```rust
pub fn getEndLineNumber(self: Location) -> int;
```
## Location::getEndColumnNumber

```java
/**
* @brief gets the end column number of this element.
* @return int
*/
```
```rust
pub fn getEndColumnNumber(self: Location) -> int;
```
## Location::getFile

```java
/**
* @brief gets the file information for the location
* @return File 
*/
```
```rust
pub fn getFile(self: Location) -> File;
```
