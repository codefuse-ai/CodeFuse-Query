# BaseTypeDO

Primary key: `oid: int`

```rust
schema BaseTypeDO {
  tp: int,
  ptr: int,
  @primary oid: int,
}
```
## BaseTypeDO::getTp

```rust
/**
     * @brief gets the tp of this element.
     * @return int
     */
```
```rust
pub fn getTp(self: BaseTypeDO) -> int;
```
## BaseTypeDO::getPtr

```rust
/**
     * @brief gets the ptr of this element.
     * @return int
     */
```
```rust
pub fn getPtr(self: BaseTypeDO) -> int;
```
## BaseTypeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *BaseTypeDO;
```
## BaseTypeDO::is\<T\>

```rust
pub fn is<T>(self: BaseTypeDO) -> bool;
```
## BaseTypeDO::to\<T\>

```rust
pub fn to<T>(self: BaseTypeDO) -> <any>;
```
## BaseTypeDO::key\_neq

```rust
pub fn key_neq(self: BaseTypeDO, object: <any>) -> bool;
```
## BaseTypeDO::key\_eq

```rust
pub fn key_eq(self: BaseTypeDO, object: <any>) -> bool;
```
## BaseTypeDO::to\_set

```rust
pub fn to_set(self: BaseTypeDO) -> *BaseTypeDO;
```
