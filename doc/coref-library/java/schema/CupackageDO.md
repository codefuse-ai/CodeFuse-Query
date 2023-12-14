# CupackageDO

Primary key: `file_hash_id: int`

```rust
schema CupackageDO {
  package_hash_id: int,
  @primary file_hash_id: int,
}
```
## CupackageDO::getPackageHashId

```rust
/**
     * @brief gets the package hash id of this element.
     * @return int
     */
```
```rust
pub fn getPackageHashId(self: CupackageDO) -> int;
```
## CupackageDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CupackageDO;
```
## CupackageDO::is\<T\>

```rust
pub fn is<T>(self: CupackageDO) -> bool;
```
## CupackageDO::to\<T\>

```rust
pub fn to<T>(self: CupackageDO) -> <any>;
```
## CupackageDO::key\_neq

```rust
pub fn key_neq(self: CupackageDO, object: <any>) -> bool;
```
## CupackageDO::key\_eq

```rust
pub fn key_eq(self: CupackageDO, object: <any>) -> bool;
```
## CupackageDO::to\_set

```rust
pub fn to_set(self: CupackageDO) -> *CupackageDO;
```
