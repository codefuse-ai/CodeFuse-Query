# NumberOfLines

Inherit from [NumberOfLinesDO](./NumberOfLinesDO.md)

Primary key: `element_hash_id: int`

```rust
schema NumberOfLines extends NumberOfLinesDO {
  @primary element_hash_id: int,
  number_of_comment_lines: int,
  number_of_total_lines: int,
  number_of_valid_lines: int
}
```
## NumberOfLines::getNumberOfLines

```java
/**
* @brief gets the number of total lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfLines(self: NumberOfLines) -> int;
```
## NumberOfLines::getNumberOfLinesOfCode

```java
/**
* @brief gets the number of valid lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfLinesOfCode(self: NumberOfLines) -> int;
```
## NumberOfLines::getNumberOfCommentLines

```java
/**
* @brief gets the number of comment lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfCommentLines(self: NumberOfLines) -> int;
```
## NumberOfLines::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NumberOfLines;
```
