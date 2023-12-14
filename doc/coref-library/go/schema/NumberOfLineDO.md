# NumberOfLineDO

Primary key: `oid: int`

```rust
schema NumberOfLineDO {
  number_of_comment_lines: int,
  number_of_code_lines: int,
  number_of_total_lines: int,
  @primary oid: int,
}
```
## NumberOfLineDO::getNumberOfCommentLines

```rust
/**
     * @brief gets the number of comment lines of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfCommentLines(self: NumberOfLineDO) -> int;
```
## NumberOfLineDO::getNumberOfCodeLines

```rust
/**
     * @brief gets the number of code lines of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfCodeLines(self: NumberOfLineDO) -> int;
```
## NumberOfLineDO::getNumberOfTotalLines

```rust
/**
     * @brief gets the number of total lines of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfTotalLines(self: NumberOfLineDO) -> int;
```
## NumberOfLineDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *NumberOfLineDO;
```
## NumberOfLineDO::is\<T\>

```rust
pub fn is<T>(self: NumberOfLineDO) -> bool;
```
## NumberOfLineDO::to\<T\>

```rust
pub fn to<T>(self: NumberOfLineDO) -> <any>;
```
## NumberOfLineDO::key\_neq

```rust
pub fn key_neq(self: NumberOfLineDO, object: <any>) -> bool;
```
## NumberOfLineDO::key\_eq

```rust
pub fn key_eq(self: NumberOfLineDO, object: <any>) -> bool;
```
## NumberOfLineDO::to\_set

```rust
pub fn to_set(self: NumberOfLineDO) -> *NumberOfLineDO;
```
