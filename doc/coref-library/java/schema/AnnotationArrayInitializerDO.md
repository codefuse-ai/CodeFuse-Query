# AnnotationArrayInitializerDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationArrayInitializerDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## AnnotationArrayInitializerDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AnnotationArrayInitializerDO) -> int;
```
## AnnotationArrayInitializerDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AnnotationArrayInitializerDO) -> string;
```
## AnnotationArrayInitializerDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: AnnotationArrayInitializerDO) -> int;
```
## AnnotationArrayInitializerDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationArrayInitializerDO;
```
## AnnotationArrayInitializerDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationArrayInitializerDO) -> bool;
```
## AnnotationArrayInitializerDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationArrayInitializerDO) -> <any>;
```
## AnnotationArrayInitializerDO::key\_neq

```rust
pub fn key_neq(self: AnnotationArrayInitializerDO, object: <any>) -> bool;
```
## AnnotationArrayInitializerDO::key\_eq

```rust
pub fn key_eq(self: AnnotationArrayInitializerDO, object: <any>) -> bool;
```
## AnnotationArrayInitializerDO::to\_set

```rust
pub fn to_set(self: AnnotationArrayInitializerDO) -> *AnnotationArrayInitializerDO;
```
