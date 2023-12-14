# AnnotationAccessArgumentWithNameDO

Primary key: `element_hash_id: int`

```rust
schema AnnotationAccessArgumentWithNameDO {
  printable_text: string,
  index_order: int,
  argument_value_hash_id: int,
  type_hash_id: int,
  @primary element_hash_id: int,
  location_hash_id: int,
  annotation_access_hash_id: int,
}
```
## AnnotationAccessArgumentWithNameDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: AnnotationAccessArgumentWithNameDO) -> string;
```
## AnnotationAccessArgumentWithNameDO::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: AnnotationAccessArgumentWithNameDO) -> int;
```
## AnnotationAccessArgumentWithNameDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnnotationAccessArgumentWithNameDO) -> int;
```
## AnnotationAccessArgumentWithNameDO::getArgumentValueHashId

```java
/**
* @brief gets the argument value hash id of this element.
* @return int
*/
```
```rust
pub fn getArgumentValueHashId(self: AnnotationAccessArgumentWithNameDO) -> int;
```
## AnnotationAccessArgumentWithNameDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnnotationAccessArgumentWithNameDO;
```
## AnnotationAccessArgumentWithNameDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: AnnotationAccessArgumentWithNameDO) -> int;
```
## AnnotationAccessArgumentWithNameDO::getAnnotationAccessHashId

```java
/**
* @brief gets the annotation access hash id of this element.
* @return int
*/
```
```rust
pub fn getAnnotationAccessHashId(self: AnnotationAccessArgumentWithNameDO) -> int;
```
