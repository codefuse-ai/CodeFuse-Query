# Package

Primary key: `id: int`

```rust
schema Package {
  qualified_name: string,
  @primary id: int
}
```
## Package::getPackageName

```java
/**
* @brief gets the name of the package.
* @return string 
*/
```
```rust
pub fn getPackageName(self: Package) -> string;
```
## Package::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Package;
```
