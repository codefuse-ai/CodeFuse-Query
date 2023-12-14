# Pkg

Inherit from [PkgDO](./PkgDO.md)

Primary key: `oid: int`

```rust
schema Pkg extends PkgDO {
  @primary oid: int,
  path: string,
  name: string,
  scope: int,
}
```
## Pkg::getPath

```java
/**
* @brief gets the path of this element.
* @return string
*/
```
```rust
pub fn getPath(self: Pkg) -> string;
```
## Pkg::getScope

```java
/**
* @brief gets the scope of this element.
* @return int
*/
```
```rust
pub fn getScope(self: Pkg) -> int;
```
## Pkg::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Pkg) -> string;
```
## Pkg::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Pkg;
```
