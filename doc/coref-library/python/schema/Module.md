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

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Module) -> string;
```
## Module::getFileOid

```java
/**
* @brief gets the file oid of this element.
* @return int
*/
```
```rust
pub fn getFileOid(self: Module) -> int;
```
## Module::getParent

```java
/**
* @brief gets the file which contains the module.
* @return File 
*/
```
```rust
pub fn getParent(self: Module) -> File;
```
## Module::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: Module) -> int;
```
## Module::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Module) -> Location;
```
## Module::getNumberOfLines

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getNumberOfLines(self: Module) -> NumberOfLines;
```
## Module::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Module;
```
