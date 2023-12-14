# Module

Primary key: `element_oid: int`

```rust
schema Module {
  @primary element_oid: int,
  file_oid: int,
  name: string,
  location_oid: int,
}
```
## Module::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Module) -> string;
```
## Module::getFileOid

```rust
/**
     * @brief gets the file oid of this element.
     * @return int
     */
```
```rust
pub fn getFileOid(self: Module) -> int;
```
## Module::getParent

```rust
/**
     * @brief gets the file which contains the module.
     * @return File 
     */
```
```rust
pub fn getParent(self: Module) -> File;
```
## Module::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Module) -> int;
```
## Module::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Module) -> Location;
```
## Module::getNumberOfLines

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getNumberOfLines(self: Module) -> NumberOfLines;
```
## Module::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Module;
```
## Module::is\<T\>

```rust
pub fn is<T>(self: Module) -> bool;
```
## Module::to\<T\>

```rust
pub fn to<T>(self: Module) -> <any>;
```
## Module::key\_neq

```rust
pub fn key_neq(self: Module, object: <any>) -> bool;
```
## Module::key\_eq

```rust
pub fn key_eq(self: Module, object: <any>) -> bool;
```
## Module::to\_set

```rust
pub fn to_set(self: Module) -> *Module;
```
