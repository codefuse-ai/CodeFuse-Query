# CompilationDO

Primary key: `oid: int`

```rust
schema CompilationDO {
  cwd: string,
  @primary oid: int,
}
```
## CompilationDO::getCwd

```java
/**
* @brief gets the cwd of this element.
* @return string
*/
```
```rust
pub fn getCwd(self: CompilationDO) -> string;
```
## CompilationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *CompilationDO;
```
