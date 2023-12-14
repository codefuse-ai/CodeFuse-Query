# ModuleDO

Primary key: `element_hash_id: int`

```rust
schema ModuleDO {
  name: string,
  @primary element_hash_id: int,
}
```
## ModuleDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ModuleDO) -> string;
```
## ModuleDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ModuleDO;
```
## ModuleDO::is\<T\>

```rust
pub fn is<T>(self: ModuleDO) -> bool;
```
## ModuleDO::to\<T\>

```rust
pub fn to<T>(self: ModuleDO) -> <any>;
```
## ModuleDO::key\_neq

```rust
pub fn key_neq(self: ModuleDO, object: <any>) -> bool;
```
## ModuleDO::key\_eq

```rust
pub fn key_eq(self: ModuleDO, object: <any>) -> bool;
```
## ModuleDO::to\_set

```rust
pub fn to_set(self: ModuleDO) -> *ModuleDO;
```
