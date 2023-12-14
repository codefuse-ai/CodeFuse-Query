# XmlDtdDO

Primary key: `id: int`

```rust
schema XmlDtdDO {
  system_id: string,
  public_id: string,
  root: string,
  location_id: int,
  @primary id: int,
}
```
## XmlDtdDO::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlDtdDO) -> int;
```
## XmlDtdDO::getSystemId

```java
/**
* @brief gets the system id (which is a string) of the element.
* @return string 
*/
```
```rust
pub fn getSystemId(self: XmlDtdDO) -> string;
```
## XmlDtdDO::getPublicId

```java
/**
* @brief gets the public id (which is a string) of the element.
* @return string 
*/
```
```rust
pub fn getPublicId(self: XmlDtdDO) -> string;
```
## XmlDtdDO::getRoot

```java
/**
* @brief gets the root of the element.
* @return string 
*/
```
```rust
pub fn getRoot(self: XmlDtdDO) -> string;
```
## XmlDtdDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlDtdDO;
```
