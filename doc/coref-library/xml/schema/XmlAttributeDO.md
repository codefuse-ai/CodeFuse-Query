# XmlAttributeDO

Primary key: `id: int`

```rust
schema XmlAttributeDO {
  @primary id: int,
  value: string,
  name: string,
  index_order: int,
  location_id: int,
  element_id: int,
}
```
## XmlAttributeDO::getElementId

```rust
/**
     * @brief gets the element id of the attribute.
     * @return int 
     */
```
```rust
pub fn getElementId(self: XmlAttributeDO) -> int;
```
## XmlAttributeDO::getIndex

```rust
/**
     * @brief gets the index of the element.
     * @return int 
     */
```
```rust
pub fn getIndex(self: XmlAttributeDO) -> int;
```
## XmlAttributeDO::getValue

```rust
/**
     * @brief gets the value of the attribute.
     * @return string 
     */
```
```rust
pub fn getValue(self: XmlAttributeDO) -> string;
```
## XmlAttributeDO::getName

```rust
/**
     * @brief gets the name of the attribute.
     * @return string 
     */
```
```rust
pub fn getName(self: XmlAttributeDO) -> string;
```
## XmlAttributeDO::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlAttributeDO) -> int;
```
## XmlAttributeDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlAttributeDO;
```
## XmlAttributeDO::is\<T\>

```rust
pub fn is<T>(self: XmlAttributeDO) -> bool;
```
## XmlAttributeDO::to\<T\>

```rust
pub fn to<T>(self: XmlAttributeDO) -> <any>;
```
## XmlAttributeDO::key\_neq

```rust
pub fn key_neq(self: XmlAttributeDO, object: <any>) -> bool;
```
## XmlAttributeDO::key\_eq

```rust
pub fn key_eq(self: XmlAttributeDO, object: <any>) -> bool;
```
## XmlAttributeDO::to\_set

```rust
pub fn to_set(self: XmlAttributeDO) -> *XmlAttributeDO;
```
