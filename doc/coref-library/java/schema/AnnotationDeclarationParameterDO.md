# AnnotationDeclarationParameterDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclarationParameterDO {
  type_hash_id: int,
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parameter_value_hash_id: int,
  annotation_declaration_hash_id: int
}
```
## AnnotationDeclarationParameterDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AnnotationDeclarationParameterDO) -> string;
```
## AnnotationDeclarationParameterDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnnotationDeclarationParameterDO) -> int;
```
## AnnotationDeclarationParameterDO::getParameterValueHashId

```java
/**
* @brief gets the parameter value hash id of this element.
* @return int
*/
```
```rust
pub fn getParameterValueHashId(self: AnnotationDeclarationParameterDO) -> int;
```
## AnnotationDeclarationParameterDO::getAnnotationDeclarationHashId

```java
/**
* @brief gets the annotation declaration hash id of this element.
* @return int
*/
```
```rust
pub fn getAnnotationDeclarationHashId(self: AnnotationDeclarationParameterDO) -> int;
```
## AnnotationDeclarationParameterDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: AnnotationDeclarationParameterDO) -> int;
```
## AnnotationDeclarationParameterDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationParameterDO;
```
