# Location

Primary key: `oid: int`

```rust
schema Location {
  @primary oid: int,
  start_column_number: int,
  end_line_number: int,
  start_line_number: int,
  end_column_number: int,
  token_start_offset: int,
  token_end_offset: int,
}
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
pub fn __all__(db: GoDB) -> *Location;
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
## Location::getTokenStartOffset

```java
/**
* @brief gets the token start offset of this element.
* @return int
*/
```
```rust
pub fn getTokenStartOffset(self: Location) -> int;
```
## Location::getTokenEndOffset

```java
/**
* @brief gets the token end offset of this element.
* @return int
*/
```
```rust
pub fn getTokenEndOffset(self: Location) -> int;
```
