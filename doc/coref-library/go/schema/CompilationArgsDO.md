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

```java
/**
* @brief gets the arg of this element.
* @return string
*/
```
```rust
pub fn getArg(self: CompilationArgsDO) -> string;
```
## CompilationArgsDO::getNum

```java
/**
* @brief gets the num of this element.
* @return int
*/
```
```rust
pub fn getNum(self: CompilationArgsDO) -> int;
```
## CompilationArgsDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *CompilationArgsDO;
```
