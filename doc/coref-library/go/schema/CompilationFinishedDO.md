# CompilationFinishedDO

Primary key: `oid: int`

```rust
schema CompilationFinishedDO {
  cpu_seconds: int,
  elapsed_seconds: int,
  @primary oid: int
}
```
## CompilationFinishedDO::getElapsedSeconds

```java
/**
* @brief gets the elapsed seconds of this element.
* @return int
*/
```
```rust
pub fn getElapsedSeconds(self: CompilationFinishedDO) -> int;
```
## CompilationFinishedDO::getCpuSeconds

```java
/**
* @brief gets the cpu seconds of this element.
* @return int
*/
```
```rust
pub fn getCpuSeconds(self: CompilationFinishedDO) -> int;
```
## CompilationFinishedDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *CompilationFinishedDO;
```
