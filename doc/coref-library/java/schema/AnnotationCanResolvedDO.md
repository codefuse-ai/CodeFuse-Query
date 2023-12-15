# AnnotationCanResolvedDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationCanResolvedDO {
  parent_hash_id: int,
  printable_text: string,
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  annotation_declaration_hash_id: int
}
```
## AnnotationCanResolvedDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: AnnotationCanResolvedDO) -> int;
```
## AnnotationCanResolvedDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AnnotationCanResolvedDO) -> string;
```
## AnnotationCanResolvedDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnnotationCanResolvedDO) -> int;
```
## AnnotationCanResolvedDO::getAnnotationDeclarationHashId

```java
/**
* @brief gets the annotation declaration hash id of this element.
* @return int
*/
```
```rust
pub fn getAnnotationDeclarationHashId(self: AnnotationCanResolvedDO) -> int;
```
## AnnotationCanResolvedDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: AnnotationCanResolvedDO) -> string;
```
## AnnotationCanResolvedDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationCanResolvedDO;
```
