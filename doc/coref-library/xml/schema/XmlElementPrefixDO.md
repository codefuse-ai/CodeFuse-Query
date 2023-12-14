# XmlElementPrefixDO

Primary key: `id: int`

```rust
schema XmlElementPrefixDO {
  parent_id: int,
  location_id: int,
  @primary id: int,
  name: string,
}
```
## XmlElementPrefixDO::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlElementPrefixDO) -> int;
```
## XmlElementPrefixDO::getParentId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentId(self: XmlElementPrefixDO) -> int;
```
## XmlElementPrefixDO::getName

```rust
/**
     * @brief gets the name of the element.
     * @return string 
     */
```
```rust
pub fn getName(self: XmlElementPrefixDO) -> string;
```
## XmlElementPrefixDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlElementPrefixDO;
```
## XmlElementPrefixDO::is\<T\>

```rust
pub fn is<T>(self: XmlElementPrefixDO) -> bool;
```
## XmlElementPrefixDO::to\<T\>

```rust
pub fn to<T>(self: XmlElementPrefixDO) -> <any>;
```
## XmlElementPrefixDO::key\_neq

```rust
pub fn key_neq(self: XmlElementPrefixDO, object: <any>) -> bool;
```
## XmlElementPrefixDO::key\_eq

```rust
pub fn key_eq(self: XmlElementPrefixDO, object: <any>) -> bool;
```
## XmlElementPrefixDO::to\_set

```rust
pub fn to_set(self: XmlElementPrefixDO) -> *XmlElementPrefixDO;
```
