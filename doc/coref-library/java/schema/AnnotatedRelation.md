# AnnotatedRelation

Inherit from [AnnotatedRelationDO](./AnnotatedRelationDO.md)

Primary key: `annotation_hash_id: int`

```rust
schema AnnotatedRelation extends AnnotatedRelationDO {
  @primary annotation_hash_id: int,
  annotated_item_hash_id: int,
}
```
## AnnotatedRelation::getAnnotatedElement

```java
/**
* @brief gets the annotated element, like class, method, field and so on.
* @return ExpressionParent 
*/
```
```rust
pub fn getAnnotatedElement(self: AnnotatedRelation) -> ExpressionParent;
```
## AnnotatedRelation::getAnnotation

```java
/**
* @brief gets the Annotation of the annotated relation.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: AnnotatedRelation) -> Annotation;
```
## AnnotatedRelation::getAnnotatedItemHashId

```java
/**
* @brief gets the annotated item hash id of this element.
* @return int
*/
```
```rust
pub fn getAnnotatedItemHashId(self: AnnotatedRelation) -> int;
```
## AnnotatedRelation::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotatedRelation;
```
