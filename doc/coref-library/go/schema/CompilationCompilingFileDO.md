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

```java
/**
* @brief gets the file of this element.
* @return int
*/
```
```rust
pub fn getFile(self: CompilationCompilingFileDO) -> int;
```
## CompilationCompilingFileDO::getNum

```java
/**
* @brief gets the num of this element.
* @return int
*/
```
```rust
pub fn getNum(self: CompilationCompilingFileDO) -> int;
```
## CompilationCompilingFileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *CompilationCompilingFileDO;
```
