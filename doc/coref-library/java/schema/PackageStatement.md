# PackageStatement

Inherit from [PackageStatementDO](./PackageStatementDO.md)

Primary key: `element_hash_id: int`

```rust
schema PackageStatement extends PackageStatementDO {
  @primary element_hash_id: int,
  qualified_name: string,
  location_hash_id: int,
  package_hash_id: int,
  parent_hash_id: int
}
```
## PackageStatement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: PackageStatement) -> int;
```
## PackageStatement::getContainingFile

```java
/**
* @brief gets the containing file for the element.
* @return File
*/
```
```rust
pub fn getContainingFile(self: PackageStatement) -> File;
```
## PackageStatement::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: PackageStatement) -> string;
```
## PackageStatement::getParent

```java
/**
* @brief gets the declaration statement of the element
* @return Statement 
*/
```
```rust
pub fn getParent(self: PackageStatement) -> ElementParent;
```
## PackageStatement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: PackageStatement) -> int;
```
## PackageStatement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: PackageStatement) -> Location;
```
## PackageStatement::getPackageHashId

```java
/**
* @brief gets the package hash id of this element.
* @return int
*/
```
```rust
pub fn getPackageHashId(self: PackageStatement) -> int;
```
## PackageStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *PackageStatement;
```
## PackageStatement::getPackage

```java
/**
* @brief gets the resolved package for the project.
* @return Package 
*/
```
```rust
pub fn getPackage(self: PackageStatement) -> Package;
```
## PackageStatement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: PackageStatement) -> *ElementParent;
```
