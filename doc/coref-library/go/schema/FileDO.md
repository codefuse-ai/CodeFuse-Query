# FileDO

Primary key: `oid: int`

```rust
schema FileDO {
  sha256_sum: string,
  md5_sum: string,
  name: string,
  pkg_oid: int,
  @primary oid: int,
}
```
## FileDO::getSha256Sum

```java
/**
* @brief gets the sha256 sum of this element.
* @return string
*/
```
```rust
pub fn getSha256Sum(self: FileDO) -> string;
```
## FileDO::getMd5Sum

```java
/**
* @brief gets the md5 sum of this element.
* @return string
*/
```
```rust
pub fn getMd5Sum(self: FileDO) -> string;
```
## FileDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: FileDO) -> string;
```
## FileDO::getPkgOid

```java
/**
* @brief gets the pkg oid of this element.
* @return int
*/
```
```rust
pub fn getPkgOid(self: FileDO) -> int;
```
## FileDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *FileDO;
```
