# NumberOfLinesDO

Primary key: `location_oid: int`

```rust
schema NumberOfLinesDO {
  code_lines: int,
  lines: int,
  comment_lines: int,
  @primary location_oid: int,
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

```rust
pub fn __all__(db: JavascriptDB) -> *NumberOfLinesDO;
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
