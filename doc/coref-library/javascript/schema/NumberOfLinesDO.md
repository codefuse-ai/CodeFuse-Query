# NumberOfLinesDO

Primary key: `location_oid: int`

```rust
schema NumberOfLinesDO {
  code_lines: int,
  lines: int,
  comment_lines: int,
  @primary location_oid: int
}
```
## NumberOfLinesDO::getCommentLines

```rust
pub fn getCommentLines(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::getCodeLines

```rust
pub fn getCodeLines(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::getLines

```rust
pub fn getLines(self: NumberOfLinesDO) -> int;
```
## NumberOfLinesDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NumberOfLinesDO;
```
