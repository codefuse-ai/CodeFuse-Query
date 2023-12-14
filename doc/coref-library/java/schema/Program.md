# Program

Inherit from [ProgramDO](./ProgramDO.md)

Primary key: `program_hash_id: int`

```rust
schema Program extends ProgramDO {
  @primary program_hash_id: int,
  absolute_prefix_path: string,
}
```
## Program::getAbsolutePrefixPath

```java
/**
* @brief gets the absolute prefix path of this element.
* @return string
*/
```
```rust
pub fn getAbsolutePrefixPath(self: Program) -> string;
```
## Program::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Program;
```
