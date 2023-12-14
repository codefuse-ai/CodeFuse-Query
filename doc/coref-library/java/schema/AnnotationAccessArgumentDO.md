# AnnotationAccessArgumentDO

Primary key: `id: int`

```rust
schema AnnotationAccessArgumentDO {
  @primary id: int,
}
```
## AnnotationAccessArgumentDO::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: AnnotationAccessArgumentDO) -> *ElementParent;
```
## AnnotationAccessArgumentDO::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: AnnotationAccessArgumentDO) -> ElementParent;
```
## AnnotationAccessArgumentDO::getType

```rust
/**
     * @brief gets the type for the element.
     * @return int
     */
```
```rust
pub fn getType(self: AnnotationAccessArgumentDO) -> int;
```
## AnnotationAccessArgumentDO::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AnnotationAccessArgumentDO) -> Location;
```
## AnnotationAccessArgumentDO::getAnnotation

```rust
/**
     * @brief gets the annotation for the element.
     * @return Annotation
     */
```
```rust
pub fn getAnnotation(self: AnnotationAccessArgumentDO) -> Annotation;
```
## AnnotationAccessArgumentDO::getPrintableText

```rust
/**
     * @brief gets the printable text for the element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: AnnotationAccessArgumentDO) -> string;
```
## AnnotationAccessArgumentDO::getArgumentValueHashId

```rust
/**
     * @brief gets the printable text for the element.
     * @return int
     */
```
```rust
pub fn getArgumentValueHashId(self: AnnotationAccessArgumentDO) -> int;
```
## AnnotationAccessArgumentDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationAccessArgumentDO;
```
## AnnotationAccessArgumentDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationAccessArgumentDO) -> bool;
```
## AnnotationAccessArgumentDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationAccessArgumentDO) -> <any>;
```
## AnnotationAccessArgumentDO::key\_neq

```rust
pub fn key_neq(self: AnnotationAccessArgumentDO, object: <any>) -> bool;
```
## AnnotationAccessArgumentDO::key\_eq

```rust
pub fn key_eq(self: AnnotationAccessArgumentDO, object: <any>) -> bool;
```
## AnnotationAccessArgumentDO::to\_set

```rust
pub fn to_set(self: AnnotationAccessArgumentDO) -> *AnnotationAccessArgumentDO;
```
