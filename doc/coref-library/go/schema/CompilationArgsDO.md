# CompilationArgsDO

Primary key: `oid: int`

```rust
schema CompilationArgsDO {
  arg: string,
  num: int,
  @primary oid: int,
}
```
## CompilationArgsDO::getArg

```rust
/**
     * @brief gets the arg of this element.
     * @return string
     */
```
```rust
pub fn getArg(self: CompilationArgsDO) -> string;
```
## CompilationArgsDO::getNum

```rust
/**
     * @brief gets the num of this element.
     * @return int
     */
```
```rust
pub fn getNum(self: CompilationArgsDO) -> int;
```
## CompilationArgsDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *CompilationArgsDO;
```
## CompilationArgsDO::is\<T\>

```rust
pub fn is<T>(self: CompilationArgsDO) -> bool;
```
## CompilationArgsDO::to\<T\>

```rust
pub fn to<T>(self: CompilationArgsDO) -> <any>;
```
## CompilationArgsDO::key\_neq

```rust
pub fn key_neq(self: CompilationArgsDO, object: <any>) -> bool;
```
## CompilationArgsDO::key\_eq

```rust
pub fn key_eq(self: CompilationArgsDO, object: <any>) -> bool;
```
## CompilationArgsDO::to\_set

```rust
pub fn to_set(self: CompilationArgsDO) -> *CompilationArgsDO;
```
