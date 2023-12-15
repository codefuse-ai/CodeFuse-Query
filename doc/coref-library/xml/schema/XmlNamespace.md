# XmlNamespace

Inherit from [XmlNamespaceDO](./XmlNamespaceDO.md)

Primary key: `id: int`

```rust
schema XmlNamespace extends XmlNamespaceDO {
  @primary id: int,
  url: string,
  location_id: int,
  prefix_name: string
}
```
## XmlNamespace::getPrefixName

```java
/**
* @brief gets the prefix name of the element.
* @return string 
*/
```
```rust
pub fn getPrefixName(self: XmlNamespace) -> string;
```
## XmlNamespace::getUrl

```java
/**
* @brief gets the url of the element.
* @return string 
*/
```
```rust
pub fn getUrl(self: XmlNamespace) -> string;
```
## XmlNamespace::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: XmlNamespace) -> Location;
```
## XmlNamespace::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlNamespace;
```
## XmlNamespace::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlNamespace) -> int;
```
## XmlNamespace::getXmlElement

```java
/**
* @brief gets the belonged xml element of the element.
* @return XmlElement 
*/
```
```rust
pub fn getXmlElement(self: XmlNamespace) -> XmlElement;
```
## XmlNamespace::getName

```java
/**
* @brief gets the name for the element.
* @return string
*/
```
```rust
pub fn getName(self: XmlNamespace) -> string;
```
