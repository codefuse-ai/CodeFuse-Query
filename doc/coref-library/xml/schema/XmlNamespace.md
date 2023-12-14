# XmlNamespace

Primary key: `id: int`

```rust
schema XmlNamespace {
  @primary id: int,
  url: string,
  location_id: int,
  prefix_name: string,
}
```
## XmlNamespace::getPrefixName

```rust
/**
     * @brief gets the prefix name of the element.
     * @return string 
     */
```
```rust
pub fn getPrefixName(self: XmlNamespace) -> string;
```
## XmlNamespace::getUrl

```rust
/**
     * @brief gets the url of the element.
     * @return string 
     */
```
```rust
pub fn getUrl(self: XmlNamespace) -> string;
```
## XmlNamespace::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: XmlNamespace) -> Location;
```
## XmlNamespace::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlNamespace;
```
## XmlNamespace::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlNamespace) -> int;
```
## XmlNamespace::getXmlElement

```rust
/**
     * @brief gets the belonged xml element of the element.
     * @return XmlElement 
     */
```
```rust
pub fn getXmlElement(self: XmlNamespace) -> XmlElement;
```
## XmlNamespace::getName

```rust
/**
     * @brief gets the name for the element.
     * @return string
     */
```
```rust
pub fn getName(self: XmlNamespace) -> string;
```
## XmlNamespace::is\<T\>

```rust
pub fn is<T>(self: XmlNamespace) -> bool;
```
## XmlNamespace::to\<T\>

```rust
pub fn to<T>(self: XmlNamespace) -> <any>;
```
## XmlNamespace::key\_neq

```rust
pub fn key_neq(self: XmlNamespace, object: <any>) -> bool;
```
## XmlNamespace::key\_eq

```rust
pub fn key_eq(self: XmlNamespace, object: <any>) -> bool;
```
## XmlNamespace::to\_set

```rust
pub fn to_set(self: XmlNamespace) -> *XmlNamespace;
```
