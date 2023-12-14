# ObjectTypeDO

Primary key: `object: int`

```rust
schema ObjectTypeDO {
  tp: int,
  @primary object: int,
}
```
## ObjectTypeDO::getTp

```rust
/**
     * @brief gets the tp of this element.
     * @return int
     */
```
```rust
pub fn getTp(self: ObjectTypeDO) -> int;
```
## ObjectTypeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ObjectTypeDO;
```
## ObjectTypeDO::is\<T\>

```rust
pub fn is<T>(self: ObjectTypeDO) -> bool;
```
## ObjectTypeDO::to\<T\>

```rust
pub fn to<T>(self: ObjectTypeDO) -> <any>;
```
## ObjectTypeDO::key\_neq

```rust
pub fn key_neq(self: ObjectTypeDO, object: <any>) -> bool;
```
## ObjectTypeDO::key\_eq

```rust
pub fn key_eq(self: ObjectTypeDO, object: <any>) -> bool;
```
## ObjectTypeDO::to\_set

```rust
pub fn to_set(self: ObjectTypeDO) -> *ObjectTypeDO;
```
