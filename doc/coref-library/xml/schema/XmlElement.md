# XmlElement

Primary key: `id: int`

```rust
schema XmlElement {
  @primary id: int,
  location_id: int,
  parent_id: int,
  index_order: int,
}
```
## XmlElement::getParentId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentId(self: XmlElement) -> int;
```
## XmlElement::getIndex

```rust
/**
     * @brief gets the index of the element.
     * @return int 
     */
```
```rust
pub fn getIndex(self: XmlElement) -> int;
```
## XmlElement::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlElement;
```
## XmlElement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: XmlElement) -> Location;
```
## XmlElement::getCharacter

```rust
/**
     * @brief gets the xml character of the element, if any.
     * @return XmlCharacter 
     */
```
```rust
pub fn getCharacter(self: XmlElement) -> *XmlCharacter;
```
## XmlElement::getName

```rust
/**
     * @brief gets the element's name with the prefix.
     * @return string 
     */
```
```rust
pub fn getName(self: XmlElement) -> string;
```
## XmlElement::getValueByAttributeName

```rust
/**
     * @brief gets the attribute's value by a given attribute name.
     * @return string
     */
```
```rust
pub fn getValueByAttributeName(self: XmlElement, name: string) -> *string;
```
## XmlElement::getElementPrefix

```rust
/**
     * @brief gets the prefix of the element
     * @return string 
     */
```
```rust
pub fn getElementPrefix(self: XmlElement) -> string;
```
## XmlElement::getAttribute

```rust
/**
     * @brief gets the attribute of the element, if any.
     * @return XmlAttribute 
     */
```
```rust
pub fn getAttribute(self: XmlElement) -> *XmlAttribute;
```
## XmlElement::getElementName

```rust
/**
     * @brief gets the element name.
     * @return string 
     */
```
```rust
pub fn getElementName(self: XmlElement) -> string;
```
## XmlElement::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlElement) -> int;
```
## XmlElement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return XmlElement 
     */
```
```rust
pub fn getAnAncestor(self: XmlElement) -> *XmlElement;
```
## XmlElement::getAChild

```rust
/**
     * @brief gets a child element of the element.
     * @return XmlElement 
     */
```
```rust
pub fn getAChild(self: XmlElement) -> *XmlElement;
```
## XmlElement::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return XmlElement 
     */
```
```rust
pub fn getParent(self: XmlElement) -> XmlElement;
```
## XmlElement::is\<T\>

```rust
pub fn is<T>(self: XmlElement) -> bool;
```
## XmlElement::to\<T\>

```rust
pub fn to<T>(self: XmlElement) -> <any>;
```
## XmlElement::key\_neq

```rust
pub fn key_neq(self: XmlElement, object: <any>) -> bool;
```
## XmlElement::key\_eq

```rust
pub fn key_eq(self: XmlElement, object: <any>) -> bool;
```
## XmlElement::to\_set

```rust
pub fn to_set(self: XmlElement) -> *XmlElement;
```
