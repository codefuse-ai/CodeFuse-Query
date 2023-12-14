# NumberOfLines

Primary key: `element_oid: int`

```rust
schema NumberOfLines {
  @primary element_oid: int,
  number_of_valid_lines: int,
  number_of_total_lines: int,
  number_of_comment_lines: int,
}
```
## NumberOfLines::getNumberOfValidLines

```rust
/**
     * @brief gets the number of valid lines of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfValidLines(self: NumberOfLines) -> int;
```
## NumberOfLines::getNumberOfTotalLines

```rust
/**
     * @brief gets the number of total lines of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfTotalLines(self: NumberOfLines) -> int;
```
## NumberOfLines::getNumberOfCommentLines

```rust
/**
     * @brief gets the number of comment lines of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfCommentLines(self: NumberOfLines) -> int;
```
## NumberOfLines::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *NumberOfLines;
```
## NumberOfLines::is\<T\>

```rust
pub fn is<T>(self: NumberOfLines) -> bool;
```
## NumberOfLines::to\<T\>

```rust
pub fn to<T>(self: NumberOfLines) -> <any>;
```
## NumberOfLines::key\_neq

```rust
pub fn key_neq(self: NumberOfLines, object: <any>) -> bool;
```
## NumberOfLines::key\_eq

```rust
pub fn key_eq(self: NumberOfLines, object: <any>) -> bool;
```
## NumberOfLines::to\_set

```rust
pub fn to_set(self: NumberOfLines) -> *NumberOfLines;
```
