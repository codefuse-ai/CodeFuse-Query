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

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ModifierListDO) -> int;
```
## ModifierListDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ModifierListDO) -> int;
```
## ModifierListDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ModifierListDO;
```
## ModifierListDO::is\<T\>

```rust
pub fn is<T>(self: ModifierListDO) -> bool;
```
## ModifierListDO::to\<T\>

```rust
pub fn to<T>(self: ModifierListDO) -> <any>;
```
## ModifierListDO::key\_neq

```rust
pub fn key_neq(self: ModifierListDO, object: <any>) -> bool;
```
## ModifierListDO::key\_eq

```rust
pub fn key_eq(self: ModifierListDO, object: <any>) -> bool;
```
## ModifierListDO::to\_set

```rust
pub fn to_set(self: ModifierListDO) -> *ModifierListDO;
```
