# ModuleDO

Primary key: `element_oid: int`

```rust
schema ModuleDO {
  location_oid: int,
  name: string,
  file_oid: int,
  @primary element_oid: int
}
```
## ModuleDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ModuleDO) -> int;
```
## ModuleDO::getFileOid

```java
/**
* @brief gets the file oid of this element.
* @return int
*/
```
```rust
pub fn getFileOid(self: ModuleDO) -> int;
```
## ModuleDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ModuleDO) -> string;
```
## ModuleDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ModuleDO;
```
