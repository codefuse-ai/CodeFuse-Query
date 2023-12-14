# XmlElementNameDO

Primary key: `id: int`

```rust
schema XmlElementNameDO {
  parent_id: int,
  location_id: int,
  @primary id: int,
  name: string,
}
```
## XmlElementNameDO::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlElementNameDO) -> int;
```
## XmlElementNameDO::getParentId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentId(self: XmlElementNameDO) -> int;
```
## XmlElementNameDO::getName

```rust
/**
     * @brief gets the name of the element.
     * @return string 
     */
```
```rust
pub fn getName(self: XmlElementNameDO) -> string;
```
## XmlElementNameDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlElementNameDO;
```
## XmlElementNameDO::is\<T\>

```rust
pub fn is<T>(self: XmlElementNameDO) -> bool;
```
## XmlElementNameDO::to\<T\>

```rust
pub fn to<T>(self: XmlElementNameDO) -> <any>;
```
## XmlElementNameDO::key\_neq

```rust
pub fn key_neq(self: XmlElementNameDO, object: <any>) -> bool;
```
## XmlElementNameDO::key\_eq

```rust
pub fn key_eq(self: XmlElementNameDO, object: <any>) -> bool;
```
## XmlElementNameDO::to\_set

```rust
pub fn to_set(self: XmlElementNameDO) -> *XmlElementNameDO;
```
