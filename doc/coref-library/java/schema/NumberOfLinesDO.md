# NumberOfLinesDO

Primary key: `element_hash_id: int`

```rust
schema NumberOfLinesDO {
  number_of_valid_lines: int,
  number_of_total_lines: int,
  number_of_comment_lines: int,
  @primary element_hash_id: int,
}
```
## NumberOfLinesDO::getNumberOfLinesOfCode

```rust
/**
     * @brief gets the number of valid lines of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfLinesOfCode(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::getNumberOfLines

```rust
/**
     * @brief gets the number of total lines of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfLines(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::getNumberOfCommentLines

```rust
/**
     * @brief gets the number of comment lines of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfCommentLines(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NumberOfLinesDO;
```
## NumberOfLinesDO::is\<T\>

```rust
pub fn is<T>(self: NumberOfLinesDO) -> bool;
```
## NumberOfLinesDO::to\<T\>

```rust
pub fn to<T>(self: NumberOfLinesDO) -> <any>;
```
## NumberOfLinesDO::key\_neq

```rust
pub fn key_neq(self: NumberOfLinesDO, object: <any>) -> bool;
```
## NumberOfLinesDO::key\_eq

```rust
pub fn key_eq(self: NumberOfLinesDO, object: <any>) -> bool;
```
## NumberOfLinesDO::to\_set

```rust
pub fn to_set(self: NumberOfLinesDO) -> *NumberOfLinesDO;
```
