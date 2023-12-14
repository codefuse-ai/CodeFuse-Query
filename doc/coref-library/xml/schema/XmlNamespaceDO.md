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

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlNamespaceDO) -> int;
```
## XmlNamespaceDO::getUrl

```rust
/**
     * @brief gets the url of the element.
     * @return string 
     */
```
```rust
pub fn getUrl(self: XmlNamespaceDO) -> string;
```
## XmlNamespaceDO::getPrefixName

```rust
/**
     * @brief gets the prefix name of the element.
     * @return string 
     */
```
```rust
pub fn getPrefixName(self: XmlNamespaceDO) -> string;
```
## XmlNamespaceDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlNamespaceDO;
```
## XmlNamespaceDO::is\<T\>

```rust
pub fn is<T>(self: XmlNamespaceDO) -> bool;
```
## XmlNamespaceDO::to\<T\>

```rust
pub fn to<T>(self: XmlNamespaceDO) -> <any>;
```
## XmlNamespaceDO::key\_neq

```rust
pub fn key_neq(self: XmlNamespaceDO, object: <any>) -> bool;
```
## XmlNamespaceDO::key\_eq

```rust
pub fn key_eq(self: XmlNamespaceDO, object: <any>) -> bool;
```
## XmlNamespaceDO::to\_set

```rust
pub fn to_set(self: XmlNamespaceDO) -> *XmlNamespaceDO;
```
