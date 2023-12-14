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

```java
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

```java
/**
* @brief gets the path of this element.
* @return string
*/
```
```rust
pub fn getPath(self: Mod) -> string;
```
## Mod::getGoVersion

```java
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

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Mod;
```
