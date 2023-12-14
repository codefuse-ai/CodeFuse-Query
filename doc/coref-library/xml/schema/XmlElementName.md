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

```java
/**
* @brief gets the name of the element.
* @return string 
*/
```
```rust
pub fn getName(self: XmlElementName) -> string;
```
## XmlElementName::getParentId

```java
/**
* @brief gets the parent id of the element.
* @return int
*/
```
```rust
pub fn getParentId(self: XmlElementName) -> int;
```
## XmlElementName::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlElementName;
```
## XmlElementName::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlElementName) -> int;
```
## XmlElementName::getParent

```java
/**
* @brief gets the xml element of the element.
* @return XmlElement 
*/
```
```rust
pub fn getParent(self: XmlElementName) -> XmlElement;
```
## XmlElementName::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: XmlElementName) -> Location;
```
