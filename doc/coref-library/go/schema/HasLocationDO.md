# HasLocationDO

Primary key: `oid: int`

```rust
schema HasLocationDO {
  location_id: int,
  location_obj: int,
  @primary oid: int,
}
```
## HasLocationDO::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: HasLocationDO) -> int;
```
## HasLocationDO::getLocationObj

```rust
/**
     * @brief gets the location obj of this element.
     * @return int
     */
```
```rust
pub fn getLocationObj(self: HasLocationDO) -> int;
```
## HasLocationDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *HasLocationDO;
```
## HasLocationDO::is\<T\>

```rust
pub fn is<T>(self: HasLocationDO) -> bool;
```
## HasLocationDO::to\<T\>

```rust
pub fn to<T>(self: HasLocationDO) -> <any>;
```
## HasLocationDO::key\_neq

```rust
pub fn key_neq(self: HasLocationDO, object: <any>) -> bool;
```
## HasLocationDO::key\_eq

```rust
pub fn key_eq(self: HasLocationDO, object: <any>) -> bool;
```
## HasLocationDO::to\_set

```rust
pub fn to_set(self: HasLocationDO) -> *HasLocationDO;
```
