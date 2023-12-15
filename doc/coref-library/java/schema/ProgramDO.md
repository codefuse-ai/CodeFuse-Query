# ProgramDO

Primary key: `program_hash_id: int`

```rust
schema ProgramDO {
  absolute_prefix_path: string,
  @primary program_hash_id: int
}
```
## ProgramDO::getAbsolutePrefixPath

```java
/**
* @brief gets the absolute prefix path of this element.
* @return string
*/
```
```rust
pub fn getAbsolutePrefixPath(self: ProgramDO) -> string;
```
## ProgramDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ProgramDO;
```
