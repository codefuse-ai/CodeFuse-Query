# TypeElement

Inherit from [TypeElementDO](./TypeElementDO.md)

Primary key: `element_hash_id: int`

```rust
schema TypeElement extends TypeElementDO {
  @primary element_hash_id: int,
  reference_type_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int
}
```
## TypeElement::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: TypeElement) -> string;
```
## TypeElement::getReferenceTypeHashId

```java
/**
* @brief gets the reference type hash id of this element.
* @return int
*/
```
```rust
pub fn getReferenceTypeHashId(self: TypeElement) -> int;
```
## TypeElement::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: TypeElement) -> int;
```
## TypeElement::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: TypeElement) -> int;
```
## TypeElement::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location 
*/
```
```rust
pub fn getLocation(self: TypeElement) -> Location;
```
## TypeElement::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: TypeElement) -> ElementParent;
```
## TypeElement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: TypeElement) -> *ElementParent;
```
## TypeElement::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: TypeElement) -> Type;
```
## TypeElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TypeElement;
```
