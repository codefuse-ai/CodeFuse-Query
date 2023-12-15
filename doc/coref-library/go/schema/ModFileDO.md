# ModFileDO

Primary key: `oid: int`

```rust
schema ModFileDO {
  go_version: string,
  name: string,
  path: string,
  @primary oid: int
}
```
## ModFileDO::getGoVersion

```java
/**
* @brief gets the go version of this element.
* @return string
*/
```
```rust
pub fn getGoVersion(self: ModFileDO) -> string;
```
## ModFileDO::getPath

```java
/**
* @brief gets the path of this element.
* @return string
*/
```
```rust
pub fn getPath(self: ModFileDO) -> string;
```
## ModFileDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ModFileDO) -> string;
```
## ModFileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ModFileDO;
```
