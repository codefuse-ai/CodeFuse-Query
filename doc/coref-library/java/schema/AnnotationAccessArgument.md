# AnnotationAccessArgument

Primary key: `id: int`

```rust
schema AnnotationAccessArgument {
  @primary id: int,
}
```
## AnnotationAccessArgument::getArgumentValueHashId

```java
/**
* @brief gets the printable text for the element.
* @return int
*/
```
```rust
pub fn getArgumentValueHashId(self: AnnotationAccessArgument) -> int;
```
## AnnotationAccessArgument::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: AnnotationAccessArgument) -> ElementParent;
```
## AnnotationAccessArgument::getPrintableText

```java
/**
* @brief gets the printable text for the element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: AnnotationAccessArgument) -> string;
```
## AnnotationAccessArgument::getAnnotationArgumentName

```java
/**
* @brief gets the argument name, the default name is value.
* @return string 
*/
```
```rust
pub fn getAnnotationArgumentName(self: AnnotationAccessArgument) -> string;
```
## AnnotationAccessArgument::getType

```java
/**
* @brief gets the type for the element.
* @return int
*/
```
```rust
pub fn getType(self: AnnotationAccessArgument) -> int;
```
## AnnotationAccessArgument::getAnnotationArgumentValue4

```rust
pub fn getAnnotationArgumentValue4(self: AnnotationAccessArgument) -> string;
```
## AnnotationAccessArgument::getAnnotatedClass

```java
/**
* @brief gets the annotated class of the annotation argument.
* @return Class 
*/
```
```rust
pub fn getAnnotatedClass(self: AnnotationAccessArgument) -> Class;
```
## AnnotationAccessArgument::getAnnotationArgumentValue

```java
/**
* @brief gets the argument value, for example, a string literal, an identifier, an array initializer or a type literal.
* @return string 
*/
```
```rust
pub fn getAnnotationArgumentValue(self: AnnotationAccessArgument) -> string;
```
## AnnotationAccessArgument::getArgumentAnnotation

```java
/**
* @brief gets the argument value as an annotation.
* @return Annotation 
*/
```
```rust
pub fn getArgumentAnnotation(self: AnnotationAccessArgument) -> Annotation;
```
## AnnotationAccessArgument::getAnnotation

```java
/**
* @brief gets the annotation for the element.
* @return Annotation
*/
```
```rust
pub fn getAnnotation(self: AnnotationAccessArgument) -> Annotation;
```
## AnnotationAccessArgument::getAnnotatedMethod

```java
/**
* @brief gets the annotated method of the annotation argument.
* @return Method 
*/
```
```rust
pub fn getAnnotatedMethod(self: AnnotationAccessArgument) -> Method;
```
## AnnotationAccessArgument::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: AnnotationAccessArgument) -> *ElementParent;
```
## AnnotationAccessArgument::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AnnotationAccessArgument) -> Location;
```
## AnnotationAccessArgument::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationAccessArgument;
```
