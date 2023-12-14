# XmlElementPrefix

Primary key: `id: int`

```rust
schema XmlElementPrefix {
  name: string,
  @primary id: int,
  location_id: int,
  parent_id: int,
}
```
## XmlElementPrefix::getName

```rust
/**
     * @brief gets the name of the element.
     * @return string 
     */
```
```rust
pub fn getName(self: XmlElementPrefix) -> string;
```
## XmlElementPrefix::getParentId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentId(self: XmlElementPrefix) -> int;
```
## XmlElementPrefix::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlElementPrefix;
```
## XmlElementPrefix::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlElementPrefix) -> int;
```
## XmlElementPrefix::getParent

```rust
/**
      * @brief gets the element of the prefix.
      * @return XmlElement 
      */
```
```rust
pub fn getParent(self: XmlElementPrefix) -> XmlElement;
```
## XmlElementPrefix::getLocation

```rust
/**
      * @brief gets the location for the element.
      * @return Location
      */
```
```rust
pub fn getLocation(self: XmlElementPrefix) -> Location;
```
## XmlElementPrefix::is\<T\>

```rust
pub fn is<T>(self: XmlElementPrefix) -> bool;
```
## XmlElementPrefix::to\<T\>

```rust
pub fn to<T>(self: XmlElementPrefix) -> <any>;
```
## XmlElementPrefix::key\_neq

```rust
pub fn key_neq(self: XmlElementPrefix, object: <any>) -> bool;
```
## XmlElementPrefix::key\_eq

```rust
pub fn key_eq(self: XmlElementPrefix, object: <any>) -> bool;
```
## XmlElementPrefix::to\_set

```rust
pub fn to_set(self: XmlElementPrefix) -> *XmlElementPrefix;
```
