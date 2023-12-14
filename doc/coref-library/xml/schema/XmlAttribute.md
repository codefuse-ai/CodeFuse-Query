# XmlAttribute

Inherit from [XmlAttributeDO](./XmlAttributeDO.md)

Primary key: `id: int`

```rust
schema XmlAttribute extends XmlAttributeDO {
  index_order: int,
  name: string,
  @primary id: int,
  value: string,
  element_id: int,
  location_id: int,
}
```
## XmlAttribute::getName

```java
/**
* @brief gets the name of the attribute.
* @return string 
*/
```
```rust
pub fn getName(self: XmlAttribute) -> string;
```
## XmlAttribute::getValue

```java
/**
* @brief gets the value of the attribute.
* @return string 
*/
```
```rust
pub fn getValue(self: XmlAttribute) -> string;
```
## XmlAttribute::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: XmlAttribute) -> Location;
```
## XmlAttribute::getElementId

```java
/**
* @brief gets the element id of the attribute.
* @return int 
*/
```
```rust
pub fn getElementId(self: XmlAttribute) -> int;
```
## XmlAttribute::getIndex

```java
/**
* @brief gets the index of the element.
* @return int 
*/
```
```rust
pub fn getIndex(self: XmlAttribute) -> int;
```
## XmlAttribute::getXmlElement

```java
/**
* @brief gets the xml element of the attribute
* @return XmlElement 
*/
```
```rust
pub fn getXmlElement(self: XmlAttribute) -> XmlElement;
```
## XmlAttribute::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlAttribute) -> int;
```
## XmlAttribute::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlAttribute;
```
