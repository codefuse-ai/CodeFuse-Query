# CompilationFinishedDO

Primary key: `oid: int`

```rust
schema CompilationFinishedDO {
  cpu_seconds: int,
  elapsed_seconds: int,
  @primary oid: int,
}
```
## CompilationFinishedDO::getElapsedSeconds

```rust
/**
     * @brief gets the elapsed seconds of this element.
     * @return int
     */
```
```rust
pub fn getElapsedSeconds(self: CompilationFinishedDO) -> int;
```
## CompilationFinishedDO::getCpuSeconds

```rust
/**
     * @brief gets the cpu seconds of this element.
     * @return int
     */
```
```rust
pub fn getCpuSeconds(self: CompilationFinishedDO) -> int;
```
## CompilationFinishedDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *CompilationFinishedDO;
```
## CompilationFinishedDO::is\<T\>

```rust
pub fn is<T>(self: CompilationFinishedDO) -> bool;
```
## CompilationFinishedDO::to\<T\>

```rust
pub fn to<T>(self: CompilationFinishedDO) -> <any>;
```
## CompilationFinishedDO::key\_neq

```rust
pub fn key_neq(self: CompilationFinishedDO, object: <any>) -> bool;
```
## CompilationFinishedDO::key\_eq

```rust
pub fn key_eq(self: CompilationFinishedDO, object: <any>) -> bool;
```
## CompilationFinishedDO::to\_set

```rust
pub fn to_set(self: CompilationFinishedDO) -> *CompilationFinishedDO;
```
