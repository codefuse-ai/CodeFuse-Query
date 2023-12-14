# ClassInitializer

Primary key: `element_hash_id: int`

```rust
schema ClassInitializer {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
}
```
## ClassInitializer::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: ClassInitializer) -> string;
```
## ClassInitializer::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ClassInitializer) -> int;
```
## ClassInitializer::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ClassInitializer) -> int;
```
## ClassInitializer::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ClassInitializer) -> Location;
```
## ClassInitializer::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: ClassInitializer) -> ElementParent;
```
## ClassInitializer::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ClassInitializer) -> *ElementParent;
```
## ClassInitializer::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ClassInitializer;
```
## ClassInitializer::is\<T\>

```rust
pub fn is<T>(self: ClassInitializer) -> bool;
```
## ClassInitializer::to\<T\>

```rust
pub fn to<T>(self: ClassInitializer) -> <any>;
```
## ClassInitializer::key\_neq

```rust
pub fn key_neq(self: ClassInitializer, object: <any>) -> bool;
```
## ClassInitializer::key\_eq

```rust
pub fn key_eq(self: ClassInitializer, object: <any>) -> bool;
```
## ClassInitializer::to\_set

```rust
pub fn to_set(self: ClassInitializer) -> *ClassInitializer;
```
