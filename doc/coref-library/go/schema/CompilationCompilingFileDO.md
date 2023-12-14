# CompilationCompilingFileDO

Primary key: `oid: int`

```rust
schema CompilationCompilingFileDO {
  file: int,
  num: int,
  @primary oid: int,
}
```
## CompilationCompilingFileDO::getFile

```rust
/**
     * @brief gets the file of this element.
     * @return int
     */
```
```rust
pub fn getFile(self: CompilationCompilingFileDO) -> int;
```
## CompilationCompilingFileDO::getNum

```rust
/**
     * @brief gets the num of this element.
     * @return int
     */
```
```rust
pub fn getNum(self: CompilationCompilingFileDO) -> int;
```
## CompilationCompilingFileDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *CompilationCompilingFileDO;
```
## CompilationCompilingFileDO::is\<T\>

```rust
pub fn is<T>(self: CompilationCompilingFileDO) -> bool;
```
## CompilationCompilingFileDO::to\<T\>

```rust
pub fn to<T>(self: CompilationCompilingFileDO) -> <any>;
```
## CompilationCompilingFileDO::key\_neq

```rust
pub fn key_neq(self: CompilationCompilingFileDO, object: <any>) -> bool;
```
## CompilationCompilingFileDO::key\_eq

```rust
pub fn key_eq(self: CompilationCompilingFileDO, object: <any>) -> bool;
```
## CompilationCompilingFileDO::to\_set

```rust
pub fn to_set(self: CompilationCompilingFileDO) -> *CompilationCompilingFileDO;
```
