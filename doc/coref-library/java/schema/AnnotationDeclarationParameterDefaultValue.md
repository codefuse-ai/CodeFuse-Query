# AnnotationDeclarationParameterDefaultValue

Inherit from [AnnotationDeclarationParameterDefaultValueDO](./AnnotationDeclarationParameterDefaultValueDO.md)

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclarationParameterDefaultValue extends AnnotationDeclarationParameterDefaultValueDO {
  @primary element_hash_id: int,
  default_value: string
}
```
## AnnotationDeclarationParameterDefaultValue::getDefaultValue

```java
/**
* @brief gets the default value of this element.
* @return string
*/
```
```rust
pub fn getDefaultValue(self: AnnotationDeclarationParameterDefaultValue) -> string;
```
## AnnotationDeclarationParameterDefaultValue::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AnnotationDeclarationParameterDefaultValue) -> Location;
```
## AnnotationDeclarationParameterDefaultValue::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationParameterDefaultValue;
```
