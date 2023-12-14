# AnnotationDeclarationParameterDefaultValueDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclarationParameterDefaultValueDO {
  default_value: string,
  @primary element_hash_id: int,
}
```
## AnnotationDeclarationParameterDefaultValueDO::getDefaultValue

```rust
/**
     * @brief gets the default value of this element.
     * @return string
     */
```
```rust
pub fn getDefaultValue(self: AnnotationDeclarationParameterDefaultValueDO) -> string;
```
## AnnotationDeclarationParameterDefaultValueDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationParameterDefaultValueDO;
```
## AnnotationDeclarationParameterDefaultValueDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationDeclarationParameterDefaultValueDO) -> bool;
```
## AnnotationDeclarationParameterDefaultValueDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationDeclarationParameterDefaultValueDO) -> <any>;
```
## AnnotationDeclarationParameterDefaultValueDO::key\_neq

```rust
pub fn key_neq(self: AnnotationDeclarationParameterDefaultValueDO, object: <any>) -> bool;
```
## AnnotationDeclarationParameterDefaultValueDO::key\_eq

```rust
pub fn key_eq(self: AnnotationDeclarationParameterDefaultValueDO, object: <any>) -> bool;
```
## AnnotationDeclarationParameterDefaultValueDO::to\_set

```rust
pub fn to_set(self: AnnotationDeclarationParameterDefaultValueDO) -> *AnnotationDeclarationParameterDefaultValueDO;
```
