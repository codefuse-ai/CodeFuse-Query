# CompilationDO

Primary key: `oid: int`

```rust
schema CompilationDO {
  cwd: string,
  @primary oid: int,
}
```
## CompilationDO::getCwd

```rust
/**
     * @brief gets the cwd of this element.
     * @return string
     */
```
```rust
pub fn getCwd(self: CompilationDO) -> string;
```
## CompilationDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *CompilationDO;
```
## CompilationDO::is\<T\>

```rust
pub fn is<T>(self: CompilationDO) -> bool;
```
## CompilationDO::to\<T\>

```rust
pub fn to<T>(self: CompilationDO) -> <any>;
```
## CompilationDO::key\_neq

```rust
pub fn key_neq(self: CompilationDO, object: <any>) -> bool;
```
## CompilationDO::key\_eq

```rust
pub fn key_eq(self: CompilationDO, object: <any>) -> bool;
```
## CompilationDO::to\_set

```rust
pub fn to_set(self: CompilationDO) -> *CompilationDO;
```
