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

```java
/**
* @brief gets the number of valid lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfLinesOfCode(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::getNumberOfLines

```java
/**
* @brief gets the number of total lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfLines(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::getNumberOfCommentLines

```java
/**
* @brief gets the number of comment lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfCommentLines(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NumberOfLinesDO;
```
