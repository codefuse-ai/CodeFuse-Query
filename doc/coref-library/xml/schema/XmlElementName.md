# XmlElementName

Primary key: `id: int`

```rust
schema XmlElementName {
  name: string,
  @primary id: int,
  location_id: int,
  parent_id: int,
}
```
## XmlElementName::getName

```rust
/**
     * @brief gets the name of the element.
     * @return string 
     */
```
```rust
pub fn getName(self: XmlElementName) -> string;
```
## XmlElementName::getParentId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentId(self: XmlElementName) -> int;
```
## XmlElementName::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlElementName;
```
## XmlElementName::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlElementName) -> int;
```
## XmlElementName::getParent

```rust
/**
     * @brief gets the xml element of the element.
     * @return XmlElement 
     */
```
```rust
pub fn getParent(self: XmlElementName) -> XmlElement;
```
## XmlElementName::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: XmlElementName) -> Location;
```
## XmlElementName::is\<T\>

```rust
pub fn is<T>(self: XmlElementName) -> bool;
```
## XmlElementName::to\<T\>

```rust
pub fn to<T>(self: XmlElementName) -> <any>;
```
## XmlElementName::key\_neq

```rust
pub fn key_neq(self: XmlElementName, object: <any>) -> bool;
```
## XmlElementName::key\_eq

```rust
pub fn key_eq(self: XmlElementName, object: <any>) -> bool;
```
## XmlElementName::to\_set

```rust
pub fn to_set(self: XmlElementName) -> *XmlElementName;
```
