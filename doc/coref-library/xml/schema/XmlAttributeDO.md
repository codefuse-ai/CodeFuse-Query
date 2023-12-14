# XmlAttributeDO

Primary key: `id: int`

```rust
schema XmlAttributeDO {
  @primary id: int,
  value: string,
  name: string,
  index_order: int,
  location_id: int,
  element_id: int,
}
```
## XmlAttributeDO::getElementId

```java
/**
* @brief gets the element id of the attribute.
* @return int 
*/
```
```rust
pub fn getElementId(self: XmlAttributeDO) -> int;
```
## XmlAttributeDO::getIndex

```java
/**
* @brief gets the index of the element.
* @return int 
*/
```
```rust
pub fn getIndex(self: XmlAttributeDO) -> int;
```
## XmlAttributeDO::getValue

```java
/**
* @brief gets the value of the attribute.
* @return string 
*/
```
```rust
pub fn getValue(self: XmlAttributeDO) -> string;
```
## XmlAttributeDO::getName

```java
/**
* @brief gets the name of the attribute.
* @return string 
*/
```
```rust
pub fn getName(self: XmlAttributeDO) -> string;
```
## XmlAttributeDO::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlAttributeDO) -> int;
```
## XmlAttributeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlAttributeDO;
```
