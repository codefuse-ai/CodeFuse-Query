# NumberOfLines

Inherit from [NumberOfLinesDO](./NumberOfLinesDO.md)

Primary key: `element_oid: int`

```rust
schema NumberOfLines extends NumberOfLinesDO {
  @primary element_oid: int,
  number_of_valid_lines: int,
  number_of_total_lines: int,
  number_of_comment_lines: int
}
```
## NumberOfLines::getNumberOfValidLines

```java
/**
* @brief gets the number of valid lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfValidLines(self: NumberOfLines) -> int;
```
## NumberOfLines::getNumberOfTotalLines

```java
/**
* @brief gets the number of total lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfTotalLines(self: NumberOfLines) -> int;
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
pub fn __all__(db: PythonDB) -> *NumberOfLines;
```
