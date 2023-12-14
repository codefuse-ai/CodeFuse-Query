# XmlElement

Inherit from [XmlElementDO](./XmlElementDO.md)

Primary key: `id: int`

```rust
schema XmlElement extends XmlElementDO {
  @primary id: int,
  location_id: int,
  parent_id: int,
  index_order: int,
}
```
## XmlElement::getParentId

```java
/**
* @brief gets the parent id of the element.
* @return int
*/
```
```rust
pub fn getParentId(self: XmlElement) -> int;
```
## XmlElement::getIndex

```java
/**
* @brief gets the index of the element.
* @return int 
*/
```
```rust
pub fn getIndex(self: XmlElement) -> int;
```
## XmlElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlElement;
```
## XmlElement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: XmlElement) -> Location;
```
## XmlElement::getCharacter

```java
/**
* @brief gets the xml character of the element, if any.
* @return XmlCharacter 
*/
```
```rust
pub fn getCharacter(self: XmlElement) -> *XmlCharacter;
```
## XmlElement::getName

```java
/**
* @brief gets the element's name with the prefix.
* @return string 
*/
```
```rust
pub fn getName(self: XmlElement) -> string;
```
## XmlElement::getValueByAttributeName

```java
/**
* @brief gets the attribute's value by a given attribute name.
* @return string
*/
```
```rust
pub fn getValueByAttributeName(self: XmlElement, name: string) -> *string;
```
## XmlElement::getElementPrefix

```java
/**
* @brief gets the prefix of the element
* @return string 
*/
```
```rust
pub fn getElementPrefix(self: XmlElement) -> string;
```
## XmlElement::getAttribute

```java
/**
* @brief gets the attribute of the element, if any.
* @return XmlAttribute 
*/
```
```rust
pub fn getAttribute(self: XmlElement) -> *XmlAttribute;
```
## XmlElement::getElementName

```java
/**
* @brief gets the element name.
* @return string 
*/
```
```rust
pub fn getElementName(self: XmlElement) -> string;
```
## XmlElement::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlElement) -> int;
```
## XmlElement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return XmlElement 
*/
```
```rust
pub fn getAnAncestor(self: XmlElement) -> *XmlElement;
```
## XmlElement::getAChild

```java
/**
* @brief gets a child element of the element.
* @return XmlElement 
*/
```
```rust
pub fn getAChild(self: XmlElement) -> *XmlElement;
```
## XmlElement::getParent

```java
/**
* @brief gets the parent of the element.
* @return XmlElement 
*/
```
```rust
pub fn getParent(self: XmlElement) -> XmlElement;
```
