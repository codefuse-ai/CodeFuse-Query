# AnnotationDeclaration

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclaration {
  @primary element_hash_id: int,
  qualified_name: string,
}
```
## AnnotationDeclaration::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: AnnotationDeclaration) -> string;
```
## AnnotationDeclaration::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AnnotationDeclaration) -> Location;
```
## AnnotationDeclaration::getIdentifier

```rust
/**
     * @brief gets the Identifier of the annotation declaration element.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: AnnotationDeclaration) -> Identifier;
```
## AnnotationDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclaration;
```
## AnnotationDeclaration::is\<T\>

```rust
pub fn is<T>(self: AnnotationDeclaration) -> bool;
```
## AnnotationDeclaration::to\<T\>

```rust
pub fn to<T>(self: AnnotationDeclaration) -> <any>;
```
## AnnotationDeclaration::key\_neq

```rust
pub fn key_neq(self: AnnotationDeclaration, object: <any>) -> bool;
```
## AnnotationDeclaration::key\_eq

```rust
pub fn key_eq(self: AnnotationDeclaration, object: <any>) -> bool;
```
## AnnotationDeclaration::to\_set

```rust
pub fn to_set(self: AnnotationDeclaration) -> *AnnotationDeclaration;
```
