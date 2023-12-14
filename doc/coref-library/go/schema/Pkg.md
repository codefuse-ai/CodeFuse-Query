# Pkg

Primary key: `oid: int`

```rust
schema Pkg {
  @primary oid: int,
  path: string,
  name: string,
  scope: int,
}
```
## Pkg::getPath

```rust
/**
     * @brief gets the path of this element.
     * @return string
     */
```
```rust
pub fn getPath(self: Pkg) -> string;
```
## Pkg::getScope

```rust
/**
     * @brief gets the scope of this element.
     * @return int
     */
```
```rust
pub fn getScope(self: Pkg) -> int;
```
## Pkg::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Pkg) -> string;
```
## Pkg::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *Pkg;
```
## Pkg::is\<T\>

```rust
pub fn is<T>(self: Pkg) -> bool;
```
## Pkg::to\<T\>

```rust
pub fn to<T>(self: Pkg) -> <any>;
```
## Pkg::key\_neq

```rust
pub fn key_neq(self: Pkg, object: <any>) -> bool;
```
## Pkg::key\_eq

```rust
pub fn key_eq(self: Pkg, object: <any>) -> bool;
```
## Pkg::to\_set

```rust
pub fn to_set(self: Pkg) -> *Pkg;
```
