# Annotation

Primary key: `id: int`

```rust
schema Annotation {
  @primary id: int,
}
```
## Annotation::getName

```rust
/**
     * @brief gets the name for the element.
     * @return string
     */
```
```rust
pub fn getName(self: Annotation) -> string;
```
## Annotation::getPrintableText

```rust
/**
     * @brief gets the name for the element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Annotation) -> string;
```
## Annotation::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Annotation) -> Location;
```
## Annotation::getParentHashId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int 
     */
```
```rust
pub fn getParentHashId(self: Annotation) -> int;
```
## Annotation::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: Annotation) -> ElementParent;
```
## Annotation::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Annotation) -> *ElementParent;
```
## Annotation::getAnnotationArgument

```rust
/**
     * @brief gets an argument of the annotation, if any.
     * @return AnnotationAccessArgument 
     */
```
```rust
pub fn getAnnotationArgument(self: Annotation) -> *AnnotationAccessArgument;
```
## Annotation::getAnnotationDeclaration

```rust
/**
     * @brief gets the declaration of the element, if any.
     * @return AnnotationDeclaration 
     */
```
```rust
pub fn getAnnotationDeclaration(self: Annotation) -> AnnotationDeclaration;
```
## Annotation::getAnnotatedMethod

```rust
/**
     * @brief gets the annotated method of the annotation.
     * @return Method 
     */
```
```rust
pub fn getAnnotatedMethod(self: Annotation) -> Method;
```
## Annotation::getAnnotatedClass

```rust
/**
     * @brief gets the annotated class of the annotation.
     * @return Class 
     */
```
```rust
pub fn getAnnotatedClass(self: Annotation) -> Class;
```
## Annotation::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Annotation;
```
## Annotation::is\<T\>

```rust
pub fn is<T>(self: Annotation) -> bool;
```
## Annotation::to\<T\>

```rust
pub fn to<T>(self: Annotation) -> <any>;
```
## Annotation::key\_neq

```rust
pub fn key_neq(self: Annotation, object: <any>) -> bool;
```
## Annotation::key\_eq

```rust
pub fn key_eq(self: Annotation, object: <any>) -> bool;
```
## Annotation::to\_set

```rust
pub fn to_set(self: Annotation) -> *Annotation;
```
