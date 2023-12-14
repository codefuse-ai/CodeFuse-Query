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

```java
/**
* @brief gets the annotation declaration hash id of this element.
* @return int
*/
```
```rust
pub fn getAnnotationDeclarationHashId(self: AnnotationDeclarationParameter) -> int;
```
## AnnotationDeclarationParameter::getParameterValueHashId

```java
/**
* @brief gets the parameter value hash id of this element.
* @return int
*/
```
```rust
pub fn getParameterValueHashId(self: AnnotationDeclarationParameter) -> int;
```
## AnnotationDeclarationParameter::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AnnotationDeclarationParameter) -> string;
```
## AnnotationDeclarationParameter::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AnnotationDeclarationParameter) -> Location;
```
## AnnotationDeclarationParameter::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnnotationDeclarationParameter) -> int;
```
## AnnotationDeclarationParameter::getIdentifier

```java
/**
* @brief gets the Identifier for this element.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: AnnotationDeclarationParameter) -> Identifier;
```
## AnnotationDeclarationParameter::getAnnotationDeclaration

```java
/**
* @brief gets the annotation declaration.
* @return AnnotationDeclaration 
*/
```
```rust
pub fn getAnnotationDeclaration(self: AnnotationDeclarationParameter) -> AnnotationDeclaration;
```
## AnnotationDeclarationParameter::getType

```java
/**
* @brief gets the reference type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: AnnotationDeclarationParameter) -> Type;
```
## AnnotationDeclarationParameter::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: AnnotationDeclarationParameter) -> int;
```
## AnnotationDeclarationParameter::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationParameter;
```
