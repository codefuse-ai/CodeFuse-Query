# ReferenceListDO

Primary key: `element_hash_id: int`

```rust
schema ReferenceListDO {
  printable_text: string,
  parent_hash_id: int,
  role: string,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## ReferenceListDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ReferenceListDO) -> string;
```
## ReferenceListDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ReferenceListDO) -> int;
```
## ReferenceListDO::getRole

```java
/**
* @brief gets the role of this element.
* @return string
*/
```
```rust
pub fn getRole(self: ReferenceListDO) -> string;
```
## ReferenceListDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ReferenceListDO) -> int;
```
## ReferenceListDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceListDO;
```
