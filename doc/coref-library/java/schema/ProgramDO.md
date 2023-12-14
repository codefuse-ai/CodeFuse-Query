# ProgramDO

Primary key: `program_hash_id: int`

```rust
schema ProgramDO {
  absolute_prefix_path: string,
  @primary program_hash_id: int,
}
```
## ProgramDO::getAbsolutePrefixPath

```rust
/**
     * @brief gets the absolute prefix path of this element.
     * @return string
     */
```
```rust
pub fn getAbsolutePrefixPath(self: ProgramDO) -> string;
```
## ProgramDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ProgramDO;
```
## ProgramDO::is\<T\>

```rust
pub fn is<T>(self: ProgramDO) -> bool;
```
## ProgramDO::to\<T\>

```rust
pub fn to<T>(self: ProgramDO) -> <any>;
```
## ProgramDO::key\_neq

```rust
pub fn key_neq(self: ProgramDO, object: <any>) -> bool;
```
## ProgramDO::key\_eq

```rust
pub fn key_eq(self: ProgramDO, object: <any>) -> bool;
```
## ProgramDO::to\_set

```rust
pub fn to_set(self: ProgramDO) -> *ProgramDO;
```
