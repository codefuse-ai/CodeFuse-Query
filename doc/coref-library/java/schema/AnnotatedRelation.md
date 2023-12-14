# AnnotatedRelation

Primary key: `annotation_hash_id: int`

```rust
schema AnnotatedRelation {
  @primary annotation_hash_id: int,
  annotated_item_hash_id: int,
}
```
## AnnotatedRelation::getAnnotatedElement

```rust
/**
     * @brief gets the annotated element, like class, method, field and so on.
     * @return ExpressionParent 
     */
```
```rust
pub fn getAnnotatedElement(self: AnnotatedRelation) -> ExpressionParent;
```
## AnnotatedRelation::getAnnotation

```rust
/**
     * @brief gets the Annotation of the annotated relation.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: AnnotatedRelation) -> Annotation;
```
## AnnotatedRelation::getAnnotatedItemHashId

```rust
/**
     * @brief gets the annotated item hash id of this element.
     * @return int
     */
```
```rust
pub fn getAnnotatedItemHashId(self: AnnotatedRelation) -> int;
```
## AnnotatedRelation::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotatedRelation;
```
## AnnotatedRelation::is\<T\>

```rust
pub fn is<T>(self: AnnotatedRelation) -> bool;
```
## AnnotatedRelation::to\<T\>

```rust
pub fn to<T>(self: AnnotatedRelation) -> <any>;
```
## AnnotatedRelation::key\_neq

```rust
pub fn key_neq(self: AnnotatedRelation, object: <any>) -> bool;
```
## AnnotatedRelation::key\_eq

```rust
pub fn key_eq(self: AnnotatedRelation, object: <any>) -> bool;
```
## AnnotatedRelation::to\_set

```rust
pub fn to_set(self: AnnotatedRelation) -> *AnnotatedRelation;
```
