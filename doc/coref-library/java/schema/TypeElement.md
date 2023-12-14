# TypeElement

Primary key: `element_hash_id: int`

```rust
schema TypeElement {
  @primary element_hash_id: int,
  reference_type_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
}
```
## TypeElement::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: TypeElement) -> string;
```
## TypeElement::getReferenceTypeHashId

```rust
/**
     * @brief gets the reference type hash id of this element.
     * @return int
     */
```
```rust
pub fn getReferenceTypeHashId(self: TypeElement) -> int;
```
## TypeElement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: TypeElement) -> int;
```
## TypeElement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: TypeElement) -> int;
```
## TypeElement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location 
     */
```
```rust
pub fn getLocation(self: TypeElement) -> Location;
```
## TypeElement::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: TypeElement) -> ElementParent;
```
## TypeElement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: TypeElement) -> *ElementParent;
```
## TypeElement::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: TypeElement) -> Type;
```
## TypeElement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TypeElement;
```
## TypeElement::is\<T\>

```rust
pub fn is<T>(self: TypeElement) -> bool;
```
## TypeElement::to\<T\>

```rust
pub fn to<T>(self: TypeElement) -> <any>;
```
## TypeElement::key\_neq

```rust
pub fn key_neq(self: TypeElement, object: <any>) -> bool;
```
## TypeElement::key\_eq

```rust
pub fn key_eq(self: TypeElement, object: <any>) -> bool;
```
## TypeElement::to\_set

```rust
pub fn to_set(self: TypeElement) -> *TypeElement;
```
