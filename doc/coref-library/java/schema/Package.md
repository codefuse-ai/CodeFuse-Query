# Package

Primary key: `id: int`

```rust
schema Package {
  qualified_name: string,
  @primary id: int,
}
```
## Package::getPackageName

```rust
/**
     * @brief gets the name of the package.
     * @return string 
     */
```
```rust
pub fn getPackageName(self: Package) -> string;
```
## Package::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Package;
```
## Package::is\<T\>

```rust
pub fn is<T>(self: Package) -> bool;
```
## Package::to\<T\>

```rust
pub fn to<T>(self: Package) -> <any>;
```
## Package::key\_neq

```rust
pub fn key_neq(self: Package, object: <any>) -> bool;
```
## Package::key\_eq

```rust
pub fn key_eq(self: Package, object: <any>) -> bool;
```
## Package::to\_set

```rust
pub fn to_set(self: Package) -> *Package;
```
