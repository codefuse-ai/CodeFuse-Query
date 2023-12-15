# NumberOfLinesDO

Primary key: `element_oid: int`

```rust
schema NumberOfLinesDO {
  number_of_comment_lines: int,
  number_of_total_lines: int,
  number_of_valid_lines: int,
  @primary element_oid: int
}
```
## NumberOfLinesDO::getNumberOfValidLines

```java
/**
* @brief gets the number of valid lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfValidLines(self: NumberOfLinesDO) -> int;
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
## NumberOfLinesDO::getNumberOfTotalLines

```java
/**
* @brief gets the number of total lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfTotalLines(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *NumberOfLinesDO;
```
