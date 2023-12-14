# AnnotationDeclarationDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclarationDO {
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## AnnotationDeclarationDO::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: AnnotationDeclarationDO) -> string;
```
## AnnotationDeclarationDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationDO;
```
## AnnotationDeclarationDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationDeclarationDO) -> bool;
```
## AnnotationDeclarationDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationDeclarationDO) -> <any>;
```
## AnnotationDeclarationDO::key\_neq

```rust
pub fn key_neq(self: AnnotationDeclarationDO, object: <any>) -> bool;
```
## AnnotationDeclarationDO::key\_eq

```rust
pub fn key_eq(self: AnnotationDeclarationDO, object: <any>) -> bool;
```
## AnnotationDeclarationDO::to\_set

```rust
pub fn to_set(self: AnnotationDeclarationDO) -> *AnnotationDeclarationDO;
```
