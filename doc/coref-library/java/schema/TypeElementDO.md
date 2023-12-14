# TypeElementDO

Primary key: `element_hash_id: int`

```rust
schema TypeElementDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  reference_type_hash_id: int,
  @primary element_hash_id: int,
}
```
## TypeElementDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: TypeElementDO) -> int;
```
## TypeElementDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: TypeElementDO) -> string;
```
## TypeElementDO::getReferenceTypeHashId

```java
/**
* @brief gets the reference type hash id of this element.
* @return int
*/
```
```rust
pub fn getReferenceTypeHashId(self: TypeElementDO) -> int;
```
## TypeElementDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: TypeElementDO) -> int;
```
## TypeElementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TypeElementDO;
```
