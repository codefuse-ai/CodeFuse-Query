# ImportStaticReferenceElementDO

Primary key: `element_hash_id: int`

```rust
schema ImportStaticReferenceElementDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## ImportStaticReferenceElementDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ImportStaticReferenceElementDO) -> int;
```
## ImportStaticReferenceElementDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ImportStaticReferenceElementDO) -> string;
```
## ImportStaticReferenceElementDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ImportStaticReferenceElementDO) -> int;
```
## ImportStaticReferenceElementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ImportStaticReferenceElementDO;
```
