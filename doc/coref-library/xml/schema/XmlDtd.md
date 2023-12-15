# XmlDtd

Inherit from [XmlDtdDO](./XmlDtdDO.md)

Primary key: `id: int`

```rust
schema XmlDtd extends XmlDtdDO {
  @primary id: int,
  location_id: int,
  root: string,
  public_id: string,
  system_id: string
}
```
## XmlDtd::getRoot

```java
/**
* @brief gets the root of the element.
* @return string 
*/
```
```rust
pub fn getRoot(self: XmlDtd) -> string;
```
## XmlDtd::getPublicId

```java
/**
* @brief gets the public id (which is a string) of the element.
* @return string 
*/
```
```rust
pub fn getPublicId(self: XmlDtd) -> string;
```
## XmlDtd::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: XmlDtd) -> Location;
```
## XmlDtd::getSystemId

```java
/**
* @brief gets the system id (which is a string) of the element.
* @return string 
*/
```
```rust
pub fn getSystemId(self: XmlDtd) -> string;
```
## XmlDtd::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlDtd) -> int;
```
## XmlDtd::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlDtd;
```
