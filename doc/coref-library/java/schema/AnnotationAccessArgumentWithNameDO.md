# AnnotationAccessArgumentWithNameDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationAccessArgumentWithNameDO {
  printable_text: string,
  index_order: int,
  argument_value_hash_id: int,
  type_hash_id: int,
  @primary element_hash_id: int,
  location_hash_id: int,
  annotation_access_hash_id: int,
}
```
## AnnotationAccessArgumentWithNameDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AnnotationAccessArgumentWithNameDO) -> string;
```
## AnnotationAccessArgumentWithNameDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: AnnotationAccessArgumentWithNameDO) -> int;
```
## AnnotationAccessArgumentWithNameDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AnnotationAccessArgumentWithNameDO) -> int;
```
## AnnotationAccessArgumentWithNameDO::getArgumentValueHashId

```rust
/**
     * @brief gets the argument value hash id of this element.
     * @return int
     */
```
```rust
pub fn getArgumentValueHashId(self: AnnotationAccessArgumentWithNameDO) -> int;
```
## AnnotationAccessArgumentWithNameDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationAccessArgumentWithNameDO;
```
## AnnotationAccessArgumentWithNameDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: AnnotationAccessArgumentWithNameDO) -> int;
```
## AnnotationAccessArgumentWithNameDO::getAnnotationAccessHashId

```rust
/**
     * @brief gets the annotation access hash id of this element.
     * @return int
     */
```
```rust
pub fn getAnnotationAccessHashId(self: AnnotationAccessArgumentWithNameDO) -> int;
```
## AnnotationAccessArgumentWithNameDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationAccessArgumentWithNameDO) -> bool;
```
## AnnotationAccessArgumentWithNameDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationAccessArgumentWithNameDO) -> <any>;
```
## AnnotationAccessArgumentWithNameDO::key\_neq

```rust
pub fn key_neq(self: AnnotationAccessArgumentWithNameDO, object: <any>) -> bool;
```
## AnnotationAccessArgumentWithNameDO::key\_eq

```rust
pub fn key_eq(self: AnnotationAccessArgumentWithNameDO, object: <any>) -> bool;
```
## AnnotationAccessArgumentWithNameDO::to\_set

```rust
pub fn to_set(self: AnnotationAccessArgumentWithNameDO) -> *AnnotationAccessArgumentWithNameDO;
```
