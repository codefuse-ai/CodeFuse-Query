# PackageStatement

Primary key: `element_hash_id: int`

```rust
schema PackageStatement {
  @primary element_hash_id: int,
  qualified_name: string,
  location_hash_id: int,
  package_hash_id: int,
  parent_hash_id: int,
}
```
## PackageStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: PackageStatement) -> int;
```
## PackageStatement::getContainingFile

```rust
/**
     * @brief gets the containing file for the element.
     * @return File
     */
```
```rust
pub fn getContainingFile(self: PackageStatement) -> File;
```
## PackageStatement::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: PackageStatement) -> string;
```
## PackageStatement::getParent

```rust
/**
     * @brief gets the declaration statement of the element
     * @return Statement 
     */
```
```rust
pub fn getParent(self: PackageStatement) -> ElementParent;
```
## PackageStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: PackageStatement) -> int;
```
## PackageStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: PackageStatement) -> Location;
```
## PackageStatement::getPackageHashId

```rust
/**
     * @brief gets the package hash id of this element.
     * @return int
     */
```
```rust
pub fn getPackageHashId(self: PackageStatement) -> int;
```
## PackageStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *PackageStatement;
```
## PackageStatement::getPackage

```rust
/**
     * @brief gets the resolved package for the project.
     * @return Package 
     */
```
```rust
pub fn getPackage(self: PackageStatement) -> Package;
```
## PackageStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: PackageStatement) -> *ElementParent;
```
## PackageStatement::is\<T\>

```rust
pub fn is<T>(self: PackageStatement) -> bool;
```
## PackageStatement::to\<T\>

```rust
pub fn to<T>(self: PackageStatement) -> <any>;
```
## PackageStatement::key\_neq

```rust
pub fn key_neq(self: PackageStatement, object: <any>) -> bool;
```
## PackageStatement::key\_eq

```rust
pub fn key_eq(self: PackageStatement, object: <any>) -> bool;
```
## PackageStatement::to\_set

```rust
pub fn to_set(self: PackageStatement) -> *PackageStatement;
```
