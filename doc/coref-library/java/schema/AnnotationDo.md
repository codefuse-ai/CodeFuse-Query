# AnnotationDo

Primary key: `id: int`

```rust
schema AnnotationDo {
  @primary id: int,
}
```
## AnnotationDo::getAnnotationDeclaration

```java
/**
* @brief gets the declaration of the element, if any.
* @return AnnotationDeclaration 
*/
```
```rust
pub fn getAnnotationDeclaration(self: AnnotationDo) -> AnnotationDeclaration;
```
## AnnotationDo::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: AnnotationDo) -> *ElementParent;
```
## AnnotationDo::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: AnnotationDo) -> ElementParent;
```
## AnnotationDo::getParentHashId

```java
/**
* @brief gets the parent id of the element.
* @return int 
*/
```
```rust
pub fn getParentHashId(self: AnnotationDo) -> int;
```
## AnnotationDo::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AnnotationDo) -> Location;
```
## AnnotationDo::getPrintableText

```java
/**
* @brief gets the name for the element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: AnnotationDo) -> string;
```
## AnnotationDo::getName

```java
/**
* @brief gets the name for the element.
* @return string
*/
```
```rust
pub fn getName(self: AnnotationDo) -> string;
```
## AnnotationDo::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDo;
```
