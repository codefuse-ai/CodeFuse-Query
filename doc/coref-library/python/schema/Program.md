# Program

Primary key: `program_oid: int`

```rust
schema Program {
  @primary program_oid: int,
  absolute_prefix_path: string,
}
```
## Program::getAbsolutePrefixPath

```rust
/**
     * @brief gets the absolute prefix path of this element.
     * @return string
     */
```
```rust
pub fn getAbsolutePrefixPath(self: Program) -> string;
```
## Program::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Program;
```
## Program::is\<T\>

```rust
pub fn is<T>(self: Program) -> bool;
```
## Program::to\<T\>

```rust
pub fn to<T>(self: Program) -> <any>;
```
## Program::key\_neq

```rust
pub fn key_neq(self: Program, object: <any>) -> bool;
```
## Program::key\_eq

```rust
pub fn key_eq(self: Program, object: <any>) -> bool;
```
## Program::to\_set

```rust
pub fn to_set(self: Program) -> *Program;
```
