# NumberOfLineDO

Primary key: `oid: int`

```rust
schema NumberOfLineDO {
  number_of_comment_lines: int,
  number_of_code_lines: int,
  number_of_total_lines: int,
  @primary oid: int
}
```
## NumberOfLineDO::getNumberOfCommentLines

```java
/**
* @brief gets the number of comment lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfCommentLines(self: NumberOfLineDO) -> int;
```
## NumberOfLineDO::getNumberOfCodeLines

```java
/**
* @brief gets the number of code lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfCodeLines(self: NumberOfLineDO) -> int;
```
## NumberOfLineDO::getNumberOfTotalLines

```java
/**
* @brief gets the number of total lines of this element.
* @return int
*/
```
```rust
pub fn getNumberOfTotalLines(self: NumberOfLineDO) -> int;
```
## NumberOfLineDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *NumberOfLineDO;
```
