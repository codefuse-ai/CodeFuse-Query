# NumberOfLines

Primary key: `location_oid: int`

```rust
schema NumberOfLines {
  @primary location_oid: int,
  comment_lines: int,
  lines: int,
  code_lines: int,
}
```
## NumberOfLines::getCommentLines

```rust
pub fn getCommentLines(self: NumberOfLines) -> int;
```
## NumberOfLines::getLines

```rust
pub fn getLines(self: NumberOfLines) -> int;
```
## NumberOfLines::getCodeLines

```rust
pub fn getCodeLines(self: NumberOfLines) -> int;
```
## NumberOfLines::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NumberOfLines;
```
