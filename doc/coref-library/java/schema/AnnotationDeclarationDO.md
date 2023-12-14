# AnnotationDeclarationDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationDeclarationDO {
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## AnnotationDeclarationDO::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: AnnotationDeclarationDO) -> string;
```
## AnnotationDeclarationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDeclarationDO;
```
