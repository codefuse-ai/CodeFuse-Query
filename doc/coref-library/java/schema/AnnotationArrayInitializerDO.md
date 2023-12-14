# AnnotationArrayInitializerDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationArrayInitializerDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## AnnotationArrayInitializerDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnnotationArrayInitializerDO) -> int;
```
## AnnotationArrayInitializerDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AnnotationArrayInitializerDO) -> string;
```
## AnnotationArrayInitializerDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: AnnotationArrayInitializerDO) -> int;
```
## AnnotationArrayInitializerDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationArrayInitializerDO;
```
