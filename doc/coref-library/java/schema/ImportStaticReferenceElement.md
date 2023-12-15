# ImportStaticReferenceElement

Inherit from [ImportStaticReferenceElementDO](./ImportStaticReferenceElementDO.md)

Primary key: `element_hash_id: int`

```rust
schema ImportStaticReferenceElement extends ImportStaticReferenceElementDO {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int
}
```
## ImportStaticReferenceElement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ImportStaticReferenceElement) -> string;
```
## ImportStaticReferenceElement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ImportStaticReferenceElement) -> int;
```
## ImportStaticReferenceElement::getParent

```java
/**
* @brief gets the parent of the element.
* @return ImportStaticStatement 
*/
```
```rust
pub fn getParent(self: ImportStaticReferenceElement) -> ImportStaticStatement;
```
## ImportStaticReferenceElement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ImportStaticReferenceElement) -> int;
```
## ImportStaticReferenceElement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ImportStaticReferenceElement) -> Location;
```
## ImportStaticReferenceElement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ImportStaticReferenceElement) -> *ElementParent;
```
## ImportStaticReferenceElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ImportStaticReferenceElement;
```
