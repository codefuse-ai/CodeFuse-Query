# AnnotationAccessArgumentDO

Primary key: `id: int`

```rust
schema AnnotationAccessArgumentDO {
  @primary id: int
}
```
## AnnotationAccessArgumentDO::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: AnnotationAccessArgumentDO) -> *ElementParent;
```
## AnnotationAccessArgumentDO::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: AnnotationAccessArgumentDO) -> ElementParent;
```
## AnnotationAccessArgumentDO::getType

```java
/**
* @brief gets the type for the element.
* @return int
*/
```
```rust
pub fn getType(self: AnnotationAccessArgumentDO) -> int;
```
## AnnotationAccessArgumentDO::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AnnotationAccessArgumentDO) -> Location;
```
## AnnotationAccessArgumentDO::getAnnotation

```java
/**
* @brief gets the annotation for the element.
* @return Annotation
*/
```
```rust
pub fn getAnnotation(self: AnnotationAccessArgumentDO) -> Annotation;
```
## AnnotationAccessArgumentDO::getPrintableText

```java
/**
* @brief gets the printable text for the element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: AnnotationAccessArgumentDO) -> string;
```
## AnnotationAccessArgumentDO::getArgumentValueHashId

```java
/**
* @brief gets the printable text for the element.
* @return int
*/
```
```rust
pub fn getArgumentValueHashId(self: AnnotationAccessArgumentDO) -> int;
```
## AnnotationAccessArgumentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationAccessArgumentDO;
```
