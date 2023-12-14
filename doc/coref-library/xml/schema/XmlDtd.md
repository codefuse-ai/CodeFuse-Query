# XmlDtd

Primary key: `id: int`

```rust
schema XmlDtd {
  @primary id: int,
  location_id: int,
  root: string,
  public_id: string,
  system_id: string,
}
```
## XmlDtd::getRoot

```rust
/**
     * @brief gets the root of the element.
     * @return string 
     */
```
```rust
pub fn getRoot(self: XmlDtd) -> string;
```
## XmlDtd::getPublicId

```rust
/**
     * @brief gets the public id (which is a string) of the element.
     * @return string 
     */
```
```rust
pub fn getPublicId(self: XmlDtd) -> string;
```
## XmlDtd::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: XmlDtd) -> Location;
```
## XmlDtd::getSystemId

```rust
/**
     * @brief gets the system id (which is a string) of the element.
     * @return string 
     */
```
```rust
pub fn getSystemId(self: XmlDtd) -> string;
```
## XmlDtd::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlDtd) -> int;
```
## XmlDtd::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlDtd;
```
## XmlDtd::is\<T\>

```rust
pub fn is<T>(self: XmlDtd) -> bool;
```
## XmlDtd::to\<T\>

```rust
pub fn to<T>(self: XmlDtd) -> <any>;
```
## XmlDtd::key\_neq

```rust
pub fn key_neq(self: XmlDtd, object: <any>) -> bool;
```
## XmlDtd::key\_eq

```rust
pub fn key_eq(self: XmlDtd, object: <any>) -> bool;
```
## XmlDtd::to\_set

```rust
pub fn to_set(self: XmlDtd) -> *XmlDtd;
```
