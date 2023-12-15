# HasLocationDO

Primary key: `oid: int`

```rust
schema HasLocationDO {
  location_id: int,
  location_obj: int,
  @primary oid: int
}
```
## HasLocationDO::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: HasLocationDO) -> int;
```
## HasLocationDO::getLocationObj

```java
/**
* @brief gets the location obj of this element.
* @return int
*/
```
```rust
pub fn getLocationObj(self: HasLocationDO) -> int;
```
## HasLocationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *HasLocationDO;
```
