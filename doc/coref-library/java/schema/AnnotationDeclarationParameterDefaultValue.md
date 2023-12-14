# AnnotationDeclarationParameterDefaultValue

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclarationParameterDefaultValue {
  @primary element_hash_id: int,
  default_value: string,
}
```
## AnnotationDeclarationParameterDefaultValue::getDefaultValue

```rust
/**
     * @brief gets the default value of this element.
     * @return string
     */
```
```rust
pub fn getDefaultValue(self: AnnotationDeclarationParameterDefaultValue) -> string;
```
## AnnotationDeclarationParameterDefaultValue::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AnnotationDeclarationParameterDefaultValue) -> Location;
```
## AnnotationDeclarationParameterDefaultValue::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationParameterDefaultValue;
```
## AnnotationDeclarationParameterDefaultValue::is\<T\>

```rust
pub fn is<T>(self: AnnotationDeclarationParameterDefaultValue) -> bool;
```
## AnnotationDeclarationParameterDefaultValue::to\<T\>

```rust
pub fn to<T>(self: AnnotationDeclarationParameterDefaultValue) -> <any>;
```
## AnnotationDeclarationParameterDefaultValue::key\_neq

```rust
pub fn key_neq(self: AnnotationDeclarationParameterDefaultValue, object: <any>) -> bool;
```
## AnnotationDeclarationParameterDefaultValue::key\_eq

```rust
pub fn key_eq(self: AnnotationDeclarationParameterDefaultValue, object: <any>) -> bool;
```
## AnnotationDeclarationParameterDefaultValue::to\_set

```rust
pub fn to_set(self: AnnotationDeclarationParameterDefaultValue) -> *AnnotationDeclarationParameterDefaultValue;
```
