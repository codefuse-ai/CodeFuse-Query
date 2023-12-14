# AnnotationCanNotResolvedDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationCanNotResolvedDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## AnnotationCanNotResolvedDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AnnotationCanNotResolvedDO) -> string;
```
## AnnotationCanNotResolvedDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AnnotationCanNotResolvedDO) -> int;
```
## AnnotationCanNotResolvedDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: AnnotationCanNotResolvedDO) -> int;
```
## AnnotationCanNotResolvedDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: AnnotationCanNotResolvedDO) -> string;
```
## AnnotationCanNotResolvedDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationCanNotResolvedDO;
```
## AnnotationCanNotResolvedDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationCanNotResolvedDO) -> bool;
```
## AnnotationCanNotResolvedDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationCanNotResolvedDO) -> <any>;
```
## AnnotationCanNotResolvedDO::key\_neq

```rust
pub fn key_neq(self: AnnotationCanNotResolvedDO, object: <any>) -> bool;
```
## AnnotationCanNotResolvedDO::key\_eq

```rust
pub fn key_eq(self: AnnotationCanNotResolvedDO, object: <any>) -> bool;
```
## AnnotationCanNotResolvedDO::to\_set

```rust
pub fn to_set(self: AnnotationCanNotResolvedDO) -> *AnnotationCanNotResolvedDO;
```
