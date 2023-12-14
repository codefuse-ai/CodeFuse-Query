# XmlElementPrefixDO

Primary key: `id: int`

```rust
schema XmlElementPrefixDO {
  parent_id: int,
  location_id: int,
  @primary id: int,
  name: string,
}
```
## XmlElementPrefixDO::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlElementPrefixDO) -> int;
```
## XmlElementPrefixDO::getParentId

```java
/**
* @brief gets the parent id of the element.
* @return int
*/
```
```rust
pub fn getParentId(self: XmlElementPrefixDO) -> int;
```
## XmlElementPrefixDO::getName

```java
/**
* @brief gets the name of the element.
* @return string 
*/
```
```rust
pub fn getName(self: XmlElementPrefixDO) -> string;
```
## XmlElementPrefixDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlElementPrefixDO;
```
