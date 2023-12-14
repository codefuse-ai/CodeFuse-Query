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

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ReferenceElement) -> string;
```
## ReferenceElement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ReferenceElement) -> int;
```
## ReferenceElement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ReferenceElement) -> int;
```
## ReferenceElement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ReferenceElement) -> Location;
```
## ReferenceElement::getDefinition

```rust
/**
     * @brief gets the definition of the reference element, usually Class or Interface.
     * @return ElementParent 
     */
```
```rust
pub fn getDefinition(self: ReferenceElement) -> ElementParent;
```
## ReferenceElement::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ReferenceElement) -> ElementParent;
```
## ReferenceElement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ReferenceElement) -> *ElementParent;
```
## ReferenceElement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceElement;
```
## ReferenceElement::is\<T\>

```rust
pub fn is<T>(self: ReferenceElement) -> bool;
```
## ReferenceElement::to\<T\>

```rust
pub fn to<T>(self: ReferenceElement) -> <any>;
```
## ReferenceElement::key\_neq

```rust
pub fn key_neq(self: ReferenceElement, object: <any>) -> bool;
```
## ReferenceElement::key\_eq

```rust
pub fn key_eq(self: ReferenceElement, object: <any>) -> bool;
```
## ReferenceElement::to\_set

```rust
pub fn to_set(self: ReferenceElement) -> *ReferenceElement;
```
