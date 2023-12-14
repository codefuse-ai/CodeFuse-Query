# Location

Primary key: `element_oid: int`

```rust
schema Location {
  @primary element_oid: int,
  file_oid: int,
  end_column_number: int,
  start_line_number: int,
  start_column_number: int,
  end_line_number: int,
}
```
## Location::getFileOid

```rust
/**
     * @brief gets the file oid of this element.
     * @return int
     */
```
```rust
pub fn getFileOid(self: Location) -> int;
```
## Location::getStartLineNumber

```rust
/**
     * @brief gets the start line number of this element.
     * @return int
     */
```
```rust
pub fn getStartLineNumber(self: Location) -> int;
```
## Location::getStartColumnNumber

```rust
/**
     * @brief gets the start column number of this element.
     * @return int
     */
```
```rust
pub fn getStartColumnNumber(self: Location) -> int;
```
## Location::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Location;
```
## Location::getEndLineNumber

```rust
/**
     * @brief gets the end line number of this element.
     * @return int
     */
```
```rust
pub fn getEndLineNumber(self: Location) -> int;
```
## Location::getEndColumnNumber

```rust
/**
     * @brief gets the end column number of this element.
     * @return int
     */
```
```rust
pub fn getEndColumnNumber(self: Location) -> int;
```
## Location::getFile

```rust
/**
     * @brief gets the file information for the location
     * @return File 
     */
```
```rust
pub fn getFile(self: Location) -> File;
```
## Location::is\<T\>

```rust
pub fn is<T>(self: Location) -> bool;
```
## Location::to\<T\>

```rust
pub fn to<T>(self: Location) -> <any>;
```
## Location::key\_neq

```rust
pub fn key_neq(self: Location, object: <any>) -> bool;
```
## Location::key\_eq

```rust
pub fn key_eq(self: Location, object: <any>) -> bool;
```
## Location::to\_set

```rust
pub fn to_set(self: Location) -> *Location;
```
