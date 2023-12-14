# PolyadicExpressionDO

Primary key: `element_hash_id: int`

```rust
schema PolyadicExpressionDO {
  opcode: string,
  size: int,
  @primary element_hash_id: int,
}
```
## PolyadicExpressionDO::getOpcode

```rust
/**
     * @brief gets the opcode of this element.
     * @return string
     */
```
```rust
pub fn getOpcode(self: PolyadicExpressionDO) -> string;
```
## PolyadicExpressionDO::getSize

```rust
/**
     * @brief gets the size of this element.
     * @return int
     */
```
```rust
pub fn getSize(self: PolyadicExpressionDO) -> int;
```
## PolyadicExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *PolyadicExpressionDO;
```
## PolyadicExpressionDO::is\<T\>

```rust
pub fn is<T>(self: PolyadicExpressionDO) -> bool;
```
## PolyadicExpressionDO::to\<T\>

```rust
pub fn to<T>(self: PolyadicExpressionDO) -> <any>;
```
## PolyadicExpressionDO::key\_neq

```rust
pub fn key_neq(self: PolyadicExpressionDO, object: <any>) -> bool;
```
## PolyadicExpressionDO::key\_eq

```rust
pub fn key_eq(self: PolyadicExpressionDO, object: <any>) -> bool;
```
## PolyadicExpressionDO::to\_set

```rust
pub fn to_set(self: PolyadicExpressionDO) -> *PolyadicExpressionDO;
```
