# AnnotationCanResolvedDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationCanResolvedDO {
  parent_hash_id: int,
  printable_text: string,
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  annotation_declaration_hash_id: int,
}
```
## AnnotationCanResolvedDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: AnnotationCanResolvedDO) -> int;
```
## AnnotationCanResolvedDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AnnotationCanResolvedDO) -> string;
```
## AnnotationCanResolvedDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AnnotationCanResolvedDO) -> int;
```
## AnnotationCanResolvedDO::getAnnotationDeclarationHashId

```rust
/**
     * @brief gets the annotation declaration hash id of this element.
     * @return int
     */
```
```rust
pub fn getAnnotationDeclarationHashId(self: AnnotationCanResolvedDO) -> int;
```
## AnnotationCanResolvedDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: AnnotationCanResolvedDO) -> string;
```
## AnnotationCanResolvedDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationCanResolvedDO;
```
## AnnotationCanResolvedDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationCanResolvedDO) -> bool;
```
## AnnotationCanResolvedDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationCanResolvedDO) -> <any>;
```
## AnnotationCanResolvedDO::key\_neq

```rust
pub fn key_neq(self: AnnotationCanResolvedDO, object: <any>) -> bool;
```
## AnnotationCanResolvedDO::key\_eq

```rust
pub fn key_eq(self: AnnotationCanResolvedDO, object: <any>) -> bool;
```
## AnnotationCanResolvedDO::to\_set

```rust
pub fn to_set(self: AnnotationCanResolvedDO) -> *AnnotationCanResolvedDO;
```
