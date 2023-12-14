# BooleanLiteralDO

Primary key: `element_hash_id: int`

```rust
schema BooleanLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## BooleanLiteralDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: BooleanLiteralDO) -> string;
```
## BooleanLiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *BooleanLiteralDO;
```
## BooleanLiteralDO::is\<T\>

```rust
pub fn is<T>(self: BooleanLiteralDO) -> bool;
```
## BooleanLiteralDO::to\<T\>

```rust
pub fn to<T>(self: BooleanLiteralDO) -> <any>;
```
## BooleanLiteralDO::key\_neq

```rust
pub fn key_neq(self: BooleanLiteralDO, object: <any>) -> bool;
```
## BooleanLiteralDO::key\_eq

```rust
pub fn key_eq(self: BooleanLiteralDO, object: <any>) -> bool;
```
## BooleanLiteralDO::to\_set

```rust
pub fn to_set(self: BooleanLiteralDO) -> *BooleanLiteralDO;
```
