# ClassInitializer

Inherit from [ClassInitializerDO](./ClassInitializerDO.md)

Primary key: `element_hash_id: int`

```rust
schema ClassInitializer extends ClassInitializerDO {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int
}
```
## ClassInitializer::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ClassInitializer) -> string;
```
## ClassInitializer::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ClassInitializer) -> int;
```
## ClassInitializer::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ClassInitializer) -> int;
```
## ClassInitializer::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ClassInitializer) -> Location;
```
## ClassInitializer::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ClassInitializer) -> ElementParent;
```
## ClassInitializer::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ClassInitializer) -> *ElementParent;
```
## ClassInitializer::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ClassInitializer;
```
