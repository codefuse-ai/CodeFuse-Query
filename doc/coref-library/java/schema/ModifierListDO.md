# ModifierListDO

Primary key: `element_hash_id: int`

```rust
schema ModifierListDO {
  parent_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## ModifierListDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: ModifierListDO) -> int;
```
## ModifierListDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ModifierListDO) -> int;
```
## ModifierListDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ModifierListDO;
```
