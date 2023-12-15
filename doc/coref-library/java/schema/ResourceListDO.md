# ResourceListDO

Primary key: `element_hash_id: int`

```rust
schema ResourceListDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## ResourceListDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ResourceListDO) -> int;
```
## ResourceListDO::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: ResourceListDO) -> string;
```
## ResourceListDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ResourceListDO) -> int;
```
## ResourceListDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ResourceListDO;
```
