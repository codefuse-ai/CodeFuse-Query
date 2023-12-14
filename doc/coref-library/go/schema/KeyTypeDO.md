# KeyTypeDO

Primary key: `oid: int`

```rust
schema KeyTypeDO {
  tp: int,
  map: int,
  @primary oid: int,
}
```
## KeyTypeDO::getTp

```rust
/**
     * @brief gets the tp of this element.
     * @return int
     */
```
```rust
pub fn getTp(self: KeyTypeDO) -> int;
```
## KeyTypeDO::getMap

```rust
/**
     * @brief gets the map of this element.
     * @return int
     */
```
```rust
pub fn getMap(self: KeyTypeDO) -> int;
```
## KeyTypeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *KeyTypeDO;
```
## KeyTypeDO::is\<T\>

```rust
pub fn is<T>(self: KeyTypeDO) -> bool;
```
## KeyTypeDO::to\<T\>

```rust
pub fn to<T>(self: KeyTypeDO) -> <any>;
```
## KeyTypeDO::key\_neq

```rust
pub fn key_neq(self: KeyTypeDO, object: <any>) -> bool;
```
## KeyTypeDO::key\_eq

```rust
pub fn key_eq(self: KeyTypeDO, object: <any>) -> bool;
```
## KeyTypeDO::to\_set

```rust
pub fn to_set(self: KeyTypeDO) -> *KeyTypeDO;
```
