# XmlNamespaceDO

Primary key: `id: int`

```rust
schema XmlNamespaceDO {
  prefix_name: string,
  location_id: int,
  url: string,
  @primary id: int,
}
```
## XmlNamespaceDO::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlNamespaceDO) -> int;
```
## XmlNamespaceDO::getUrl

```java
/**
* @brief gets the url of the element.
* @return string 
*/
```
```rust
pub fn getUrl(self: XmlNamespaceDO) -> string;
```
## XmlNamespaceDO::getPrefixName

```java
/**
* @brief gets the prefix name of the element.
* @return string 
*/
```
```rust
pub fn getPrefixName(self: XmlNamespaceDO) -> string;
```
## XmlNamespaceDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlNamespaceDO;
```
