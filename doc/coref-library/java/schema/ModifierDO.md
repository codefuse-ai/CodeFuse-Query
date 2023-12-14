# ModifierDO

Primary key: `element_hash_id: int`

```rust
schema ModifierDO {
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## ModifierDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ModifierDO) -> int;
```
## ModifierDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ModifierDO) -> int;
```
## ModifierDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ModifierDO) -> string;
```
## ModifierDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ModifierDO;
```
## ModifierDO::is\<T\>

```rust
pub fn is<T>(self: ModifierDO) -> bool;
```
## ModifierDO::to\<T\>

```rust
pub fn to<T>(self: ModifierDO) -> <any>;
```
## ModifierDO::key\_neq

```rust
pub fn key_neq(self: ModifierDO, object: <any>) -> bool;
```
## ModifierDO::key\_eq

```rust
pub fn key_eq(self: ModifierDO, object: <any>) -> bool;
```
## ModifierDO::to\_set

```rust
pub fn to_set(self: ModifierDO) -> *ModifierDO;
```
