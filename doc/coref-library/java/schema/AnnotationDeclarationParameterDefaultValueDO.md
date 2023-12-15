# AnnotationDeclarationParameterDefaultValueDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclarationParameterDefaultValueDO {
  default_value: string,
  @primary element_hash_id: int
}
```
## AnnotationDeclarationParameterDefaultValueDO::getDefaultValue

```java
/**
* @brief gets the default value of this element.
* @return string
*/
```
```rust
pub fn getDefaultValue(self: AnnotationDeclarationParameterDefaultValueDO) -> string;
```
## AnnotationDeclarationParameterDefaultValueDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationParameterDefaultValueDO;
```
