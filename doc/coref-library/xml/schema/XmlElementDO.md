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

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlElementDO) -> int;
```
## XmlElementDO::getIndex

```rust
/**
     * @brief gets the index of the element.
     * @return int 
     */
```
```rust
pub fn getIndex(self: XmlElementDO) -> int;
```
## XmlElementDO::getParentId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentId(self: XmlElementDO) -> int;
```
## XmlElementDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlElementDO;
```
## XmlElementDO::is\<T\>

```rust
pub fn is<T>(self: XmlElementDO) -> bool;
```
## XmlElementDO::to\<T\>

```rust
pub fn to<T>(self: XmlElementDO) -> <any>;
```
## XmlElementDO::key\_neq

```rust
pub fn key_neq(self: XmlElementDO, object: <any>) -> bool;
```
## XmlElementDO::key\_eq

```rust
pub fn key_eq(self: XmlElementDO, object: <any>) -> bool;
```
## XmlElementDO::to\_set

```rust
pub fn to_set(self: XmlElementDO) -> *XmlElementDO;
```
