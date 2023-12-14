# AnnotatedRelationDO

Primary key: `annotation_hash_id: int`

```rust
schema AnnotatedRelationDO {
  annotated_item_hash_id: int,
  @primary annotation_hash_id: int,
}
```
## AnnotatedRelationDO::getAnnotatedItemHashId

```rust
/**
     * @brief gets the annotated item hash id of this element.
     * @return int
     */
```
```rust
pub fn getAnnotatedItemHashId(self: AnnotatedRelationDO) -> int;
```
## AnnotatedRelationDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotatedRelationDO;
```
## AnnotatedRelationDO::is\<T\>

```rust
pub fn is<T>(self: AnnotatedRelationDO) -> bool;
```
## AnnotatedRelationDO::to\<T\>

```rust
pub fn to<T>(self: AnnotatedRelationDO) -> <any>;
```
## AnnotatedRelationDO::key\_neq

```rust
pub fn key_neq(self: AnnotatedRelationDO, object: <any>) -> bool;
```
## AnnotatedRelationDO::key\_eq

```rust
pub fn key_eq(self: AnnotatedRelationDO, object: <any>) -> bool;
```
## AnnotatedRelationDO::to\_set

```rust
pub fn to_set(self: AnnotatedRelationDO) -> *AnnotatedRelationDO;
```
