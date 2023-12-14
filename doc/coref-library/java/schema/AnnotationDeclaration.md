# AnnotationDeclaration

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclaration {
  @primary element_hash_id: int,
  qualified_name: string,
}
```
## AnnotationDeclaration::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: AnnotationDeclaration) -> string;
```
## AnnotationDeclaration::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AnnotationDeclaration) -> Location;
```
## AnnotationDeclaration::getIdentifier

```java
/**
* @brief gets the Identifier of the annotation declaration element.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: AnnotationDeclaration) -> Identifier;
```
## AnnotationDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclaration;
```
