# PkgDO

Primary key: `oid: int`

```rust
schema PkgDO {
  scope: int,
  name: string,
  path: string,
  @primary oid: int
}
```
## PkgDO::getScope

```java
/**
* @brief gets the scope of this element.
* @return int
*/
```
```rust
pub fn getScope(self: PkgDO) -> int;
```
## PkgDO::getPath

```java
/**
* @brief gets the path of this element.
* @return string
*/
```
```rust
pub fn getPath(self: PkgDO) -> string;
```
## PkgDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: PkgDO) -> string;
```
## PkgDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *PkgDO;
```
