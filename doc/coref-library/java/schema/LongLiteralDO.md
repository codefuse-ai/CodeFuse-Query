# LongLiteralDO

Primary key: `element_hash_id: int`

```rust
schema LongLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## LongLiteralDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: LongLiteralDO) -> string;
```
## LongLiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LongLiteralDO;
```
## LongLiteralDO::is\<T\>

```rust
pub fn is<T>(self: LongLiteralDO) -> bool;
```
## LongLiteralDO::to\<T\>

```rust
pub fn to<T>(self: LongLiteralDO) -> <any>;
```
## LongLiteralDO::key\_neq

```rust
pub fn key_neq(self: LongLiteralDO, object: <any>) -> bool;
```
## LongLiteralDO::key\_eq

```rust
pub fn key_eq(self: LongLiteralDO, object: <any>) -> bool;
```
## LongLiteralDO::to\_set

```rust
pub fn to_set(self: LongLiteralDO) -> *LongLiteralDO;
```
