# AnnotationDeclarationParameter

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclarationParameter {
  annotation_declaration_hash_id: int,
  printable_text: string,
  parameter_value_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
  type_hash_id: int,
}
```
## AnnotationDeclarationParameter::getAnnotationDeclarationHashId

```rust
/**
     * @brief gets the annotation declaration hash id of this element.
     * @return int
     */
```
```rust
pub fn getAnnotationDeclarationHashId(self: AnnotationDeclarationParameter) -> int;
```
## AnnotationDeclarationParameter::getParameterValueHashId

```rust
/**
     * @brief gets the parameter value hash id of this element.
     * @return int
     */
```
```rust
pub fn getParameterValueHashId(self: AnnotationDeclarationParameter) -> int;
```
## AnnotationDeclarationParameter::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AnnotationDeclarationParameter) -> string;
```
## AnnotationDeclarationParameter::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AnnotationDeclarationParameter) -> Location;
```
## AnnotationDeclarationParameter::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AnnotationDeclarationParameter) -> int;
```
## AnnotationDeclarationParameter::getIdentifier

```rust
/**
     * @brief gets the Identifier for this element.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: AnnotationDeclarationParameter) -> Identifier;
```
## AnnotationDeclarationParameter::getAnnotationDeclaration

```rust
/**
     * @brief gets the annotation declaration.
     * @return AnnotationDeclaration 
     */
```
```rust
pub fn getAnnotationDeclaration(self: AnnotationDeclarationParameter) -> AnnotationDeclaration;
```
## AnnotationDeclarationParameter::getType

```rust
/**
     * @brief gets the reference type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: AnnotationDeclarationParameter) -> Type;
```
## AnnotationDeclarationParameter::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: AnnotationDeclarationParameter) -> int;
```
## AnnotationDeclarationParameter::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationParameter;
```
## AnnotationDeclarationParameter::is\<T\>

```rust
pub fn is<T>(self: AnnotationDeclarationParameter) -> bool;
```
## AnnotationDeclarationParameter::to\<T\>

```rust
pub fn to<T>(self: AnnotationDeclarationParameter) -> <any>;
```
## AnnotationDeclarationParameter::key\_neq

```rust
pub fn key_neq(self: AnnotationDeclarationParameter, object: <any>) -> bool;
```
## AnnotationDeclarationParameter::key\_eq

```rust
pub fn key_eq(self: AnnotationDeclarationParameter, object: <any>) -> bool;
```
## AnnotationDeclarationParameter::to\_set

```rust
pub fn to_set(self: AnnotationDeclarationParameter) -> *AnnotationDeclarationParameter;
```
