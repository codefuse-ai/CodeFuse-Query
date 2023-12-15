# AnnotationArrayInitializer

Inherit from [AnnotationArrayInitializerDO](./AnnotationArrayInitializerDO.md)

Primary key: `element_hash_id: int`

```rust
schema AnnotationArrayInitializer extends AnnotationArrayInitializerDO {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int
}
```
## AnnotationArrayInitializer::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AnnotationArrayInitializer) -> string;
```
## AnnotationArrayInitializer::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnnotationArrayInitializer) -> int;
```
## AnnotationArrayInitializer::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: AnnotationArrayInitializer) -> AnnotationAccessArgument;
```
## AnnotationArrayInitializer::getInitializerValue

```java
/**
* @brief gets the initializer value for the element.
* @return Expression
*/
```
```rust
pub fn getInitializerValue(self: AnnotationArrayInitializer) -> *Expression;
```
## AnnotationArrayInitializer::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: AnnotationArrayInitializer) -> int;
```
## AnnotationArrayInitializer::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AnnotationArrayInitializer) -> Location;
```
## AnnotationArrayInitializer::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: AnnotationArrayInitializer) -> *ElementParent;
```
## AnnotationArrayInitializer::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationArrayInitializer;
```
