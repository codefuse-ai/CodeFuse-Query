# LocationDO

Primary key: `oid: int`

```rust
schema LocationDO {
  token_end_offset: int,
  token_start_offset: int,
  start_line_number: int,
  end_column_number: int,
  end_line_number: int,
  start_column_number: int,
  @primary oid: int
}
```
## LocationDO::getTokenEndOffset

```java
/**
* @brief gets the token end offset of this element.
* @return int
*/
```
```rust
pub fn getTokenEndOffset(self: LocationDO) -> int;
```
## LocationDO::getTokenStartOffset

```java
/**
* @brief gets the token start offset of this element.
* @return int
*/
```
```rust
pub fn getTokenStartOffset(self: LocationDO) -> int;
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
pub fn __all__(db: GoDB) -> *LocationDO;
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
