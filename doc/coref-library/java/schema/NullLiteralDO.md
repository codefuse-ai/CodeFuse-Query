# NullLiteralDO

Primary key: `element_hash_id: int`

```rust
schema NullLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## NullLiteralDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: NullLiteralDO) -> string;
```
## NullLiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NullLiteralDO;
```
## NullLiteralDO::is\<T\>

```rust
pub fn is<T>(self: NullLiteralDO) -> bool;
```
## NullLiteralDO::to\<T\>

```rust
pub fn to<T>(self: NullLiteralDO) -> <any>;
```
## NullLiteralDO::key\_neq

```rust
pub fn key_neq(self: NullLiteralDO, object: <any>) -> bool;
```
## NullLiteralDO::key\_eq

```rust
pub fn key_eq(self: NullLiteralDO, object: <any>) -> bool;
```
## NullLiteralDO::to\_set

```rust
pub fn to_set(self: NullLiteralDO) -> *NullLiteralDO;
```
