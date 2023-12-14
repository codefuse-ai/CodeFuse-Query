# JavadocTagValueDO

Primary key: `element_hash_id: int`

```rust
schema JavadocTagValueDO {
  parent_hash_id: int,
  location_hash_id: int,
  value: string,
  @primary element_hash_id: int,
}
```
## JavadocTagValueDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: JavadocTagValueDO) -> int;
```
## JavadocTagValueDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: JavadocTagValueDO) -> string;
```
## JavadocTagValueDO::getParentHashId

```java
/**
* @brief gets the containing comment hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: JavadocTagValueDO) -> int;
```
## JavadocTagValueDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *JavadocTagValueDO;
```
