# AnnotationCanNotResolvedDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationCanNotResolvedDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int
}
```
## AnnotationCanNotResolvedDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AnnotationCanNotResolvedDO) -> string;
```
## AnnotationCanNotResolvedDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnnotationCanNotResolvedDO) -> int;
```
## AnnotationCanNotResolvedDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: AnnotationCanNotResolvedDO) -> int;
```
## AnnotationCanNotResolvedDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: AnnotationCanNotResolvedDO) -> string;
```
## AnnotationCanNotResolvedDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationCanNotResolvedDO;
```
