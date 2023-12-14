# CupackageDO

Primary key: `file_hash_id: int`

```rust
schema CupackageDO {
  package_hash_id: int,
  @primary file_hash_id: int,
}
```
## CupackageDO::getPackageHashId

```java
/**
* @brief gets the package hash id of this element.
* @return int
*/
```
```rust
pub fn getPackageHashId(self: CupackageDO) -> int;
```
## CupackageDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CupackageDO;
```
