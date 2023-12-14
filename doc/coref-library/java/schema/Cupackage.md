# Cupackage

Primary key: `file_hash_id: int`

```rust
schema Cupackage {
  @primary file_hash_id: int,
  package_hash_id: int,
}
```
## Cupackage::getPackageHashId

```rust
/**
     * @brief gets the package hash id of this element.
     * @return int
     */
```
```rust
pub fn getPackageHashId(self: Cupackage) -> int;
```
## Cupackage::getPackage

```rust
/**
     * @brief gets the package of the element.
     * @return Package 
     */
```
```rust
pub fn getPackage(self: Cupackage) -> Package;
```
## Cupackage::getCompilationUnit

```rust
/**
     * @brief gets the compilation unit.
     * @return File 
     */
```
```rust
pub fn getCompilationUnit(self: Cupackage) -> File;
```
## Cupackage::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Cupackage;
```
## Cupackage::is\<T\>

```rust
pub fn is<T>(self: Cupackage) -> bool;
```
## Cupackage::to\<T\>

```rust
pub fn to<T>(self: Cupackage) -> <any>;
```
## Cupackage::key\_neq

```rust
pub fn key_neq(self: Cupackage, object: <any>) -> bool;
```
## Cupackage::key\_eq

```rust
pub fn key_eq(self: Cupackage, object: <any>) -> bool;
```
## Cupackage::to\_set

```rust
pub fn to_set(self: Cupackage) -> *Cupackage;
```
