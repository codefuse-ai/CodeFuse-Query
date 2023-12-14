# AnnotationDeclarationParameterDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclarationParameterDO {
  type_hash_id: int,
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parameter_value_hash_id: int,
  annotation_declaration_hash_id: int,
}
```
## AnnotationDeclarationParameterDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: AnnotationDeclarationParameterDO) -> string;
```
## AnnotationDeclarationParameterDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AnnotationDeclarationParameterDO) -> int;
```
## AnnotationDeclarationParameterDO::getParameterValueHashId

```rust
/**
     * @brief gets the parameter value hash id of this element.
     * @return int
     */
```
```rust
pub fn getParameterValueHashId(self: AnnotationDeclarationParameterDO) -> int;
```
## AnnotationDeclarationParameterDO::getAnnotationDeclarationHashId

```rust
/**
     * @brief gets the annotation declaration hash id of this element.
     * @return int
     */
```
```rust
pub fn getAnnotationDeclarationHashId(self: AnnotationDeclarationParameterDO) -> int;
```
## AnnotationDeclarationParameterDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: AnnotationDeclarationParameterDO) -> int;
```
## AnnotationDeclarationParameterDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationParameterDO;
```
## AnnotationDeclarationParameterDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationDeclarationParameterDO) -> bool;
```
## AnnotationDeclarationParameterDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationDeclarationParameterDO) -> <any>;
```
## AnnotationDeclarationParameterDO::key\_neq

```rust
pub fn key_neq(self: AnnotationDeclarationParameterDO, object: <any>) -> bool;
```
## AnnotationDeclarationParameterDO::key\_eq

```rust
pub fn key_eq(self: AnnotationDeclarationParameterDO, object: <any>) -> bool;
```
## AnnotationDeclarationParameterDO::to\_set

```rust
pub fn to_set(self: AnnotationDeclarationParameterDO) -> *AnnotationDeclarationParameterDO;
```
