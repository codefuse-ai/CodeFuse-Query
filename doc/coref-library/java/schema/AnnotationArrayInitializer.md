# AnnotationArrayInitializer

Primary key: `element_hash_id: int`

```rust
schema AnnotationArrayInitializer {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
}
```
## AnnotationArrayInitializer::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AnnotationArrayInitializer) -> string;
```
## AnnotationArrayInitializer::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AnnotationArrayInitializer) -> int;
```
## AnnotationArrayInitializer::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: AnnotationArrayInitializer) -> AnnotationAccessArgument;
```
## AnnotationArrayInitializer::getInitializerValue

```rust
/**
     * @brief gets the initializer value for the element.
     * @return Expression
     */
```
```rust
pub fn getInitializerValue(self: AnnotationArrayInitializer) -> *Expression;
```
## AnnotationArrayInitializer::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: AnnotationArrayInitializer) -> int;
```
## AnnotationArrayInitializer::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AnnotationArrayInitializer) -> Location;
```
## AnnotationArrayInitializer::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: AnnotationArrayInitializer) -> *ElementParent;
```
## AnnotationArrayInitializer::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationArrayInitializer;
```
## AnnotationArrayInitializer::is\<T\>

```rust
pub fn is<T>(self: AnnotationArrayInitializer) -> bool;
```
## AnnotationArrayInitializer::to\<T\>

```rust
pub fn to<T>(self: AnnotationArrayInitializer) -> <any>;
```
## AnnotationArrayInitializer::key\_neq

```rust
pub fn key_neq(self: AnnotationArrayInitializer, object: <any>) -> bool;
```
## AnnotationArrayInitializer::key\_eq

```rust
pub fn key_eq(self: AnnotationArrayInitializer, object: <any>) -> bool;
```
## AnnotationArrayInitializer::to\_set

```rust
pub fn to_set(self: AnnotationArrayInitializer) -> *AnnotationArrayInitializer;
```
