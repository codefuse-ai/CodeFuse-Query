# Mod

Primary key: `oid: int`

```rust
schema Mod {
  @primary oid: int,
  path: string,
  name: string,
  go_version: string,
}
```
## Mod::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Mod) -> string;
```
## Mod::getModDepsCount

```rust
pub fn getModDepsCount(self: Mod) -> int;
```
## Mod::getPath

```rust
/**
     * @brief gets the path of this element.
     * @return string
     */
```
```rust
pub fn getPath(self: Mod) -> string;
```
## Mod::getGoVersion

```rust
/**
     * @brief gets the go version of this element.
     * @return string
     */
```
```rust
pub fn getGoVersion(self: Mod) -> string;
```
## Mod::getARequire

```rust
pub fn getARequire(self: Mod) -> string;
```
## Mod::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *Mod;
```
## Mod::is\<T\>

```rust
pub fn is<T>(self: Mod) -> bool;
```
## Mod::to\<T\>

```rust
pub fn to<T>(self: Mod) -> <any>;
```
## Mod::key\_neq

```rust
pub fn key_neq(self: Mod, object: <any>) -> bool;
```
## Mod::key\_eq

```rust
pub fn key_eq(self: Mod, object: <any>) -> bool;
```
## Mod::to\_set

```rust
pub fn to_set(self: Mod) -> *Mod;
```
