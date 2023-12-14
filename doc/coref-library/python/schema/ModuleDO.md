# ModuleDO

Primary key: `element_oid: int`

```rust
schema ModuleDO {
  location_oid: int,
  name: string,
  file_oid: int,
  @primary element_oid: int,
}
```
## ModuleDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ModuleDO) -> int;
```
## ModuleDO::getFileOid

```rust
/**
     * @brief gets the file oid of this element.
     * @return int
     */
```
```rust
pub fn getFileOid(self: ModuleDO) -> int;
```
## ModuleDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ModuleDO) -> string;
```
## ModuleDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ModuleDO;
```
## ModuleDO::is\<T\>

```rust
pub fn is<T>(self: ModuleDO) -> bool;
```
## ModuleDO::to\<T\>

```rust
pub fn to<T>(self: ModuleDO) -> <any>;
```
## ModuleDO::key\_neq

```rust
pub fn key_neq(self: ModuleDO, object: <any>) -> bool;
```
## ModuleDO::key\_eq

```rust
pub fn key_eq(self: ModuleDO, object: <any>) -> bool;
```
## ModuleDO::to\_set

```rust
pub fn to_set(self: ModuleDO) -> *ModuleDO;
```
