# PkgDO

Primary key: `oid: int`

```rust
schema PkgDO {
  scope: int,
  name: string,
  path: string,
  @primary oid: int,
}
```
## PkgDO::getScope

```rust
/**
     * @brief gets the scope of this element.
     * @return int
     */
```
```rust
pub fn getScope(self: PkgDO) -> int;
```
## PkgDO::getPath

```rust
/**
     * @brief gets the path of this element.
     * @return string
     */
```
```rust
pub fn getPath(self: PkgDO) -> string;
```
## PkgDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: PkgDO) -> string;
```
## PkgDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *PkgDO;
```
## PkgDO::is\<T\>

```rust
pub fn is<T>(self: PkgDO) -> bool;
```
## PkgDO::to\<T\>

```rust
pub fn to<T>(self: PkgDO) -> <any>;
```
## PkgDO::key\_neq

```rust
pub fn key_neq(self: PkgDO, object: <any>) -> bool;
```
## PkgDO::key\_eq

```rust
pub fn key_eq(self: PkgDO, object: <any>) -> bool;
```
## PkgDO::to\_set

```rust
pub fn to_set(self: PkgDO) -> *PkgDO;
```
