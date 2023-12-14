# PackageStatementDO

Primary key: `element_hash_id: int`

```rust
schema PackageStatementDO {
  parent_hash_id: int,
  package_hash_id: int,
  location_hash_id: int,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## PackageStatementDO::getPackageHashId

```rust
/**
     * @brief gets the package hash id of this element.
     * @return int
     */
```
```rust
pub fn getPackageHashId(self: PackageStatementDO) -> int;
```
## PackageStatementDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: PackageStatementDO) -> int;
```
## PackageStatementDO::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: PackageStatementDO) -> string;
```
## PackageStatementDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: PackageStatementDO) -> int;
```
## PackageStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *PackageStatementDO;
```
## PackageStatementDO::is\<T\>

```rust
pub fn is<T>(self: PackageStatementDO) -> bool;
```
## PackageStatementDO::to\<T\>

```rust
pub fn to<T>(self: PackageStatementDO) -> <any>;
```
## PackageStatementDO::key\_neq

```rust
pub fn key_neq(self: PackageStatementDO, object: <any>) -> bool;
```
## PackageStatementDO::key\_eq

```rust
pub fn key_eq(self: PackageStatementDO, object: <any>) -> bool;
```
## PackageStatementDO::to\_set

```rust
pub fn to_set(self: PackageStatementDO) -> *PackageStatementDO;
```
