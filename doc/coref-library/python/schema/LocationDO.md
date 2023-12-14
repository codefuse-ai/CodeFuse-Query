# LocationDO

Primary key: `element_oid: int`

```rust
schema LocationDO {
  end_line_number: int,
  start_column_number: int,
  end_column_number: int,
  start_line_number: int,
  file_oid: int,
  @primary element_oid: int,
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
pub fn __all__(db: PythonDB) -> *LocationDO;
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
## LocationDO::getFileOid

```java
/**
* @brief gets the file oid of this element.
* @return int
*/
```
```rust
pub fn getFileOid(self: LocationDO) -> int;
```
