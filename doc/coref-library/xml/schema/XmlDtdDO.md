# XmlDtdDO

Primary key: `id: int`

```rust
schema XmlDtdDO {
  system_id: string,
  public_id: string,
  root: string,
  location_id: int,
  @primary id: int,
}
```
## XmlDtdDO::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlDtdDO) -> int;
```
## XmlDtdDO::getSystemId

```rust
/**
     * @brief gets the system id (which is a string) of the element.
     * @return string 
     */
```
```rust
pub fn getSystemId(self: XmlDtdDO) -> string;
```
## XmlDtdDO::getPublicId

```rust
/**
     * @brief gets the public id (which is a string) of the element.
     * @return string 
     */
```
```rust
pub fn getPublicId(self: XmlDtdDO) -> string;
```
## XmlDtdDO::getRoot

```rust
/**
     * @brief gets the root of the element.
     * @return string 
     */
```
```rust
pub fn getRoot(self: XmlDtdDO) -> string;
```
## XmlDtdDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlDtdDO;
```
## XmlDtdDO::is\<T\>

```rust
pub fn is<T>(self: XmlDtdDO) -> bool;
```
## XmlDtdDO::to\<T\>

```rust
pub fn to<T>(self: XmlDtdDO) -> <any>;
```
## XmlDtdDO::key\_neq

```rust
pub fn key_neq(self: XmlDtdDO, object: <any>) -> bool;
```
## XmlDtdDO::key\_eq

```rust
pub fn key_eq(self: XmlDtdDO, object: <any>) -> bool;
```
## XmlDtdDO::to\_set

```rust
pub fn to_set(self: XmlDtdDO) -> *XmlDtdDO;
```
