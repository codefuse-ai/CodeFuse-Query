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

```rust
/**
     * @brief gets the end column number of this element.
     * @return int
     */
```
```rust
pub fn getEndColumnNumber(self: LocationDO) -> int;
```
## LocationDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *LocationDO;
```
## LocationDO::getEndLineNumber

```rust
/**
     * @brief gets the end line number of this element.
     * @return int
     */
```
```rust
pub fn getEndLineNumber(self: LocationDO) -> int;
```
## LocationDO::getStartColumnNumber

```rust
/**
     * @brief gets the start column number of this element.
     * @return int
     */
```
```rust
pub fn getStartColumnNumber(self: LocationDO) -> int;
```
## LocationDO::getStartLineNumber

```rust
/**
     * @brief gets the start line number of this element.
     * @return int
     */
```
```rust
pub fn getStartLineNumber(self: LocationDO) -> int;
```
## LocationDO::getFileOid

```rust
/**
     * @brief gets the file oid of this element.
     * @return int
     */
```
```rust
pub fn getFileOid(self: LocationDO) -> int;
```
## LocationDO::is\<T\>

```rust
pub fn is<T>(self: LocationDO) -> bool;
```
## LocationDO::to\<T\>

```rust
pub fn to<T>(self: LocationDO) -> <any>;
```
## LocationDO::key\_neq

```rust
pub fn key_neq(self: LocationDO, object: <any>) -> bool;
```
## LocationDO::key\_eq

```rust
pub fn key_eq(self: LocationDO, object: <any>) -> bool;
```
## LocationDO::to\_set

```rust
pub fn to_set(self: LocationDO) -> *LocationDO;
```
