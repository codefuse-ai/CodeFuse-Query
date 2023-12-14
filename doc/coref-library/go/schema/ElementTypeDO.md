# ElementTypeDO

Primary key: `oid: int`

```rust
schema ElementTypeDO {
  tp: int,
  container: int,
  @primary oid: int,
}
```
## ElementTypeDO::getTp

```rust
/**
     * @brief gets the tp of this element.
     * @return int
     */
```
```rust
pub fn getTp(self: ElementTypeDO) -> int;
```
## ElementTypeDO::getContainer

```rust
/**
     * @brief gets the container of this element.
     * @return int
     */
```
```rust
pub fn getContainer(self: ElementTypeDO) -> int;
```
## ElementTypeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ElementTypeDO;
```
## ElementTypeDO::is\<T\>

```rust
pub fn is<T>(self: ElementTypeDO) -> bool;
```
## ElementTypeDO::to\<T\>

```rust
pub fn to<T>(self: ElementTypeDO) -> <any>;
```
## ElementTypeDO::key\_neq

```rust
pub fn key_neq(self: ElementTypeDO, object: <any>) -> bool;
```
## ElementTypeDO::key\_eq

```rust
pub fn key_eq(self: ElementTypeDO, object: <any>) -> bool;
```
## ElementTypeDO::to\_set

```rust
pub fn to_set(self: ElementTypeDO) -> *ElementTypeDO;
```
