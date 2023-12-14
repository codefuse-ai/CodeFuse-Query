# ReferenceElement

Primary key: `element_hash_id: int`

```rust
schema ReferenceElement {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
}
```
## ReferenceElement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ReferenceElement) -> string;
```
## ReferenceElement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ReferenceElement) -> int;
```
## ReferenceElement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ReferenceElement) -> int;
```
## ReferenceElement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: ReferenceElement) -> Location;
```
## ReferenceElement::getDefinition

```java
/**
* @brief gets the definition of the reference element, usually Class or Interface.
* @return ElementParent 
*/
```
```rust
pub fn getDefinition(self: ReferenceElement) -> ElementParent;
```
## ReferenceElement::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: ReferenceElement) -> ElementParent;
```
## ReferenceElement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ReferenceElement) -> *ElementParent;
```
## ReferenceElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceElement;
```
