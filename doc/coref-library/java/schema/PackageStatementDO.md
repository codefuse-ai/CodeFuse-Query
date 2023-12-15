# PackageStatementDO

Primary key: `element_hash_id: int`

```rust
schema PackageStatementDO {
  parent_hash_id: int,
  package_hash_id: int,
  location_hash_id: int,
  qualified_name: string,
  @primary element_hash_id: int
}
```
## PackageStatementDO::getPackageHashId

```java
/**
* @brief gets the package hash id of this element.
* @return int
*/
```
```rust
pub fn getPackageHashId(self: PackageStatementDO) -> int;
```
## PackageStatementDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: PackageStatementDO) -> int;
```
## PackageStatementDO::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: PackageStatementDO) -> string;
```
## PackageStatementDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: PackageStatementDO) -> int;
```
## PackageStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *PackageStatementDO;
```
