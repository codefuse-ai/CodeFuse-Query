# AnnotationAccessArgumentWithoutNameDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationAccessArgumentWithoutNameDO {
  printable_text: string,
  index_order: int,
  argument_value_hash_id: int,
  @primary element_hash_id: int,
  location_hash_id: int,
  annotation_access_hash_id: int,
}
```
## AnnotationAccessArgumentWithoutNameDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AnnotationAccessArgumentWithoutNameDO) -> string;
```
## AnnotationAccessArgumentWithoutNameDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: AnnotationAccessArgumentWithoutNameDO) -> int;
```
## AnnotationAccessArgumentWithoutNameDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnnotationAccessArgumentWithoutNameDO) -> int;
```
## AnnotationAccessArgumentWithoutNameDO::getArgumentValueHashId

```java
/**
* @brief gets the argument value hash id of this element.
* @return int
*/
```
```rust
pub fn getArgumentValueHashId(self: AnnotationAccessArgumentWithoutNameDO) -> int;
```
## AnnotationAccessArgumentWithoutNameDO::getAnnotationAccessHashId

```java
/**
* @brief gets the annotation access hash id of this element.
* @return int
*/
```
```rust
pub fn getAnnotationAccessHashId(self: AnnotationAccessArgumentWithoutNameDO) -> int;
```
## AnnotationAccessArgumentWithoutNameDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationAccessArgumentWithoutNameDO;
```
