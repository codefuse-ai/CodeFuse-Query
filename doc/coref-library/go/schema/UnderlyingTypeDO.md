# UnderlyingTypeDO

Primary key: `oid: int`

```rust
schema UnderlyingTypeDO {
  tp: int,
  named: int,
  @primary oid: int,
}
```
## UnderlyingTypeDO::getTp

```rust
/**
     * @brief gets the tp of this element.
     * @return int
     */
```
```rust
pub fn getTp(self: UnderlyingTypeDO) -> int;
```
## UnderlyingTypeDO::getNamed

```rust
/**
     * @brief gets the named of this element.
     * @return int
     */
```
```rust
pub fn getNamed(self: UnderlyingTypeDO) -> int;
```
## UnderlyingTypeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *UnderlyingTypeDO;
```
## UnderlyingTypeDO::is\<T\>

```rust
pub fn is<T>(self: UnderlyingTypeDO) -> bool;
```
## UnderlyingTypeDO::to\<T\>

```rust
pub fn to<T>(self: UnderlyingTypeDO) -> <any>;
```
## UnderlyingTypeDO::key\_neq

```rust
pub fn key_neq(self: UnderlyingTypeDO, object: <any>) -> bool;
```
## UnderlyingTypeDO::key\_eq

```rust
pub fn key_eq(self: UnderlyingTypeDO, object: <any>) -> bool;
```
## UnderlyingTypeDO::to\_set

```rust
pub fn to_set(self: UnderlyingTypeDO) -> *UnderlyingTypeDO;
```
