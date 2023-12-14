# AnnotatedRelationDO

Primary key: `annotation_hash_id: int`

```rust
schema AnnotatedRelationDO {
  annotated_item_hash_id: int,
  @primary annotation_hash_id: int,
}
```
## AnnotatedRelationDO::getAnnotatedItemHashId

```java
/**
* @brief gets the annotated item hash id of this element.
* @return int
*/
```
```rust
pub fn getAnnotatedItemHashId(self: AnnotatedRelationDO) -> int;
```
## AnnotatedRelationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotatedRelationDO;
```
