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

```java
/**
* @brief gets the name of the element.
* @return string 
*/
```
```rust
pub fn getName(self: XmlElementPrefix) -> string;
```
## XmlElementPrefix::getParentId

```java
/**
* @brief gets the parent id of the element.
* @return int
*/
```
```rust
pub fn getParentId(self: XmlElementPrefix) -> int;
```
## XmlElementPrefix::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlElementPrefix;
```
## XmlElementPrefix::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlElementPrefix) -> int;
```
## XmlElementPrefix::getParent

```java
/**
* @brief gets the element of the prefix.
* @return XmlElement 
*/
```
```rust
pub fn getParent(self: XmlElementPrefix) -> XmlElement;
```
## XmlElementPrefix::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: XmlElementPrefix) -> Location;
```
