# XmlElementNameDO

Primary key: `id: int`

```rust
schema XmlElementNameDO {
  parent_id: int,
  location_id: int,
  @primary id: int,
  name: string,
}
```
## XmlElementNameDO::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlElementNameDO) -> int;
```
## XmlElementNameDO::getParentId

```java
/**
* @brief gets the parent id of the element.
* @return int
*/
```
```rust
pub fn getParentId(self: XmlElementNameDO) -> int;
```
## XmlElementNameDO::getName

```java
/**
* @brief gets the name of the element.
* @return string 
*/
```
```rust
pub fn getName(self: XmlElementNameDO) -> string;
```
## XmlElementNameDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlElementNameDO;
```
