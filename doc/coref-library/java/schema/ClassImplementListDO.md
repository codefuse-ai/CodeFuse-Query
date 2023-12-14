# ClassImplementListDO

Primary key: `element_hash_id: int`

```rust
schema ClassImplementListDO {
  implemented_element_hash_id: int,
  @primary element_hash_id: int,
}
```
## ClassImplementListDO::getImplementedElementHashId

```rust
/**
     * @brief gets the implemented element hash id of this element.
     * @return int
     */
```
```rust
pub fn getImplementedElementHashId(self: ClassImplementListDO) -> int;
```
## ClassImplementListDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ClassImplementListDO;
```
## ClassImplementListDO::is\<T\>

```rust
pub fn is<T>(self: ClassImplementListDO) -> bool;
```
## ClassImplementListDO::to\<T\>

```rust
pub fn to<T>(self: ClassImplementListDO) -> <any>;
```
## ClassImplementListDO::key\_neq

```rust
pub fn key_neq(self: ClassImplementListDO, object: <any>) -> bool;
```
## ClassImplementListDO::key\_eq

```rust
pub fn key_eq(self: ClassImplementListDO, object: <any>) -> bool;
```
## ClassImplementListDO::to\_set

```rust
pub fn to_set(self: ClassImplementListDO) -> *ClassImplementListDO;
```
