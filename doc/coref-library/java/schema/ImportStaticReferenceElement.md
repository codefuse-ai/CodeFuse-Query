# ImportStaticReferenceElement

Primary key: `element_hash_id: int`

```rust
schema ImportStaticReferenceElement {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
}
```
## ImportStaticReferenceElement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ImportStaticReferenceElement) -> string;
```
## ImportStaticReferenceElement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ImportStaticReferenceElement) -> int;
```
## ImportStaticReferenceElement::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ImportStaticStatement 
     */
```
```rust
pub fn getParent(self: ImportStaticReferenceElement) -> ImportStaticStatement;
```
## ImportStaticReferenceElement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ImportStaticReferenceElement) -> int;
```
## ImportStaticReferenceElement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ImportStaticReferenceElement) -> Location;
```
## ImportStaticReferenceElement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ImportStaticReferenceElement) -> *ElementParent;
```
## ImportStaticReferenceElement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ImportStaticReferenceElement;
```
## ImportStaticReferenceElement::is\<T\>

```rust
pub fn is<T>(self: ImportStaticReferenceElement) -> bool;
```
## ImportStaticReferenceElement::to\<T\>

```rust
pub fn to<T>(self: ImportStaticReferenceElement) -> <any>;
```
## ImportStaticReferenceElement::key\_neq

```rust
pub fn key_neq(self: ImportStaticReferenceElement, object: <any>) -> bool;
```
## ImportStaticReferenceElement::key\_eq

```rust
pub fn key_eq(self: ImportStaticReferenceElement, object: <any>) -> bool;
```
## ImportStaticReferenceElement::to\_set

```rust
pub fn to_set(self: ImportStaticReferenceElement) -> *ImportStaticReferenceElement;
```
