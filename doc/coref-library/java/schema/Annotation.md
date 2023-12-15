# Annotation

Inherit from [AnnotationDo](./AnnotationDo.md)

Primary key: `id: int`

```rust
schema Annotation extends AnnotationDo {
  @primary id: int
}
```
## Annotation::getName

```java
/**
* @brief gets the name for the element.
* @return string
*/
```
```rust
pub fn getName(self: Annotation) -> string;
```
## Annotation::getPrintableText

```java
/**
* @brief gets the name for the element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Annotation) -> string;
```
## Annotation::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Annotation) -> Location;
```
## Annotation::getParentHashId

```java
/**
* @brief gets the parent id of the element.
* @return int 
*/
```
```rust
pub fn getParentHashId(self: Annotation) -> int;
```
## Annotation::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: Annotation) -> ElementParent;
```
## Annotation::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Annotation) -> *ElementParent;
```
## Annotation::getAnnotationArgument

```java
/**
* @brief gets an argument of the annotation, if any.
* @return AnnotationAccessArgument 
*/
```
```rust
pub fn getAnnotationArgument(self: Annotation) -> *AnnotationAccessArgument;
```
## Annotation::getAnnotationDeclaration

```java
/**
* @brief gets the declaration of the element, if any.
* @return AnnotationDeclaration 
*/
```
```rust
pub fn getAnnotationDeclaration(self: Annotation) -> AnnotationDeclaration;
```
## Annotation::getAnnotatedMethod

```java
/**
* @brief gets the annotated method of the annotation.
* @return Method 
*/
```
```rust
pub fn getAnnotatedMethod(self: Annotation) -> Method;
```
## Annotation::getAnnotatedClass

```java
/**
* @brief gets the annotated class of the annotation.
* @return Class 
*/
```
```rust
pub fn getAnnotatedClass(self: Annotation) -> Class;
```
## Annotation::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Annotation;
```
