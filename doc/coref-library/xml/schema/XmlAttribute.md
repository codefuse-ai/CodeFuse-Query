# XmlAttribute

Primary key: `id: int`

```rust
schema XmlAttribute {
  index_order: int,
  name: string,
  @primary id: int,
  value: string,
  element_id: int,
  location_id: int,
}
```
## XmlAttribute::getName

```rust
/**
     * @brief gets the name of the attribute.
     * @return string 
     */
```
```rust
pub fn getName(self: XmlAttribute) -> string;
```
## XmlAttribute::getValue

```rust
/**
     * @brief gets the value of the attribute.
     * @return string 
     */
```
```rust
pub fn getValue(self: XmlAttribute) -> string;
```
## XmlAttribute::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: XmlAttribute) -> Location;
```
## XmlAttribute::getElementId

```rust
/**
     * @brief gets the element id of the attribute.
     * @return int 
     */
```
```rust
pub fn getElementId(self: XmlAttribute) -> int;
```
## XmlAttribute::getIndex

```rust
/**
     * @brief gets the index of the element.
     * @return int 
     */
```
```rust
pub fn getIndex(self: XmlAttribute) -> int;
```
## XmlAttribute::getXmlElement

```rust
/**
     * @brief gets the xml element of the attribute
     * @return XmlElement 
     */
```
```rust
pub fn getXmlElement(self: XmlAttribute) -> XmlElement;
```
## XmlAttribute::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlAttribute) -> int;
```
## XmlAttribute::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlAttribute;
```
## XmlAttribute::is\<T\>

```rust
pub fn is<T>(self: XmlAttribute) -> bool;
```
## XmlAttribute::to\<T\>

```rust
pub fn to<T>(self: XmlAttribute) -> <any>;
```
## XmlAttribute::key\_neq

```rust
pub fn key_neq(self: XmlAttribute, object: <any>) -> bool;
```
## XmlAttribute::key\_eq

```rust
pub fn key_eq(self: XmlAttribute, object: <any>) -> bool;
```
## XmlAttribute::to\_set

```rust
pub fn to_set(self: XmlAttribute) -> *XmlAttribute;
```
