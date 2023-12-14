# Location

Inherit from [LocationDO](./LocationDO.md)

Primary key: `id: int`

```rust
schema Location extends LocationDO {
  @primary id: int,
  start_line_number: int,
  end_column_number: int,
  start_column_number: int,
  end_line_number: int,
  file_id: int,
}
```
## Location::getStartLineNumber

```java
/**
* @brief gets the start line number of the location element.
* @return int 
*/
```
```rust
pub fn getStartLineNumber(self: Location) -> int;
```
## Location::getFileId

```java
/**
* @brief gets the file id of the location element.
* @return int
*/
```
```rust
pub fn getFileId(self: Location) -> int;
```
## Location::getStartColumnNumber

```java
/**
* @brief gets the start column number of the location element.
* @return int 
*/
```
```rust
pub fn getStartColumnNumber(self: Location) -> int;
```
## Location::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *Location;
```
## Location::getEndLineNumber

```java
/**
* @brief gets the end line number of the location element.
* @return int 
*/
```
```rust
pub fn getEndLineNumber(self: Location) -> int;
```
## Location::getEndColumnNumber

```java
/**
* @brief gets the end column number of the location element.
* @return int 
*/
```
```rust
pub fn getEndColumnNumber(self: Location) -> int;
```
## Location::getFile

```java
/**
* @brief gets the file of the location.
* @return XmlFile 
*/
```
```rust
pub fn getFile(self: Location) -> XmlFile;
```
