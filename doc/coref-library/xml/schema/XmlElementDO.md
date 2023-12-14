# XmlElementDO

Primary key: `id: int`

```rust
schema XmlElementDO {
  index_order: int,
  parent_id: int,
  location_id: int,
  @primary id: int,
}
```
## XmlElementDO::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlElementDO) -> int;
```
## XmlElementDO::getIndex

```java
/**
* @brief gets the index of the element.
* @return int 
*/
```
```rust
pub fn getIndex(self: XmlElementDO) -> int;
```
## XmlElementDO::getParentId

```java
/**
* @brief gets the parent id of the element.
* @return int
*/
```
```rust
pub fn getParentId(self: XmlElementDO) -> int;
```
## XmlElementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlElementDO;
```
