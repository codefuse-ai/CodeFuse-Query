# JavadocTagValue

Inherit from [JavadocTagValueDO](./JavadocTagValueDO.md)

Primary key: `element_hash_id: int`

```rust
schema JavadocTagValue extends JavadocTagValueDO {
  @primary element_hash_id: int,
  value: string,
  location_hash_id: int,
  parent_hash_id: int
}
```
## JavadocTagValue::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: JavadocTagValue) -> int;
```
## JavadocTagValue::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: JavadocTagValue) -> string;
```
## JavadocTagValue::getJavaDocTag

```java
/**
* @brief gets the doc tag in which the element is contained.
* @return JavadocTag 
*/
```
```rust
pub fn getJavaDocTag(self: JavadocTagValue) -> JavadocTag;
```
## JavadocTagValue::getParentHashId

```java
/**
* @brief gets the containing comment hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: JavadocTagValue) -> int;
```
## JavadocTagValue::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: JavadocTagValue) -> Location;
```
## JavadocTagValue::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: JavadocTagValue) -> *ElementParent;
```
## JavadocTagValue::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *JavadocTagValue;
```
