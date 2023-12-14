# AnnotationAccessArgumentWithoutNameDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationAccessArgumentWithoutNameDO {
  printable_text: string,
  index_order: int,
  argument_value_hash_id: int,
  @primary element_hash_id: int,
  location_hash_id: int,
  annotation_access_hash_id: int,
}
```
## AnnotationAccessArgumentWithoutNameDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AnnotationAccessArgumentWithoutNameDO) -> string;
```
## AnnotationAccessArgumentWithoutNameDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: AnnotationAccessArgumentWithoutNameDO) -> int;
```
## AnnotationAccessArgumentWithoutNameDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AnnotationAccessArgumentWithoutNameDO) -> int;
```
## AnnotationAccessArgumentWithoutNameDO::getArgumentValueHashId

```rust
/**
     * @brief gets the argument value hash id of this element.
     * @return int
     */
```
```rust
pub fn getArgumentValueHashId(self: AnnotationAccessArgumentWithoutNameDO) -> int;
```
## AnnotationAccessArgumentWithoutNameDO::getAnnotationAccessHashId

```rust
/**
     * @brief gets the annotation access hash id of this element.
     * @return int
     */
```
```rust
pub fn getAnnotationAccessHashId(self: AnnotationAccessArgumentWithoutNameDO) -> int;
```
## AnnotationAccessArgumentWithoutNameDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationAccessArgumentWithoutNameDO;
```
## AnnotationAccessArgumentWithoutNameDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationAccessArgumentWithoutNameDO) -> bool;
```
## AnnotationAccessArgumentWithoutNameDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationAccessArgumentWithoutNameDO) -> <any>;
```
## AnnotationAccessArgumentWithoutNameDO::key\_neq

```rust
pub fn key_neq(self: AnnotationAccessArgumentWithoutNameDO, object: <any>) -> bool;
```
## AnnotationAccessArgumentWithoutNameDO::key\_eq

```rust
pub fn key_eq(self: AnnotationAccessArgumentWithoutNameDO, object: <any>) -> bool;
```
## AnnotationAccessArgumentWithoutNameDO::to\_set

```rust
pub fn to_set(self: AnnotationAccessArgumentWithoutNameDO) -> *AnnotationAccessArgumentWithoutNameDO;
```
