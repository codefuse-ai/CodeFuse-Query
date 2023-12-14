# IntegerLiteralDO

Primary key: `element_hash_id: int`

```rust
schema IntegerLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## IntegerLiteralDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: IntegerLiteralDO) -> string;
```
## IntegerLiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *IntegerLiteralDO;
```
## IntegerLiteralDO::is\<T\>

```rust
pub fn is<T>(self: IntegerLiteralDO) -> bool;
```
## IntegerLiteralDO::to\<T\>

```rust
pub fn to<T>(self: IntegerLiteralDO) -> <any>;
```
## IntegerLiteralDO::key\_neq

```rust
pub fn key_neq(self: IntegerLiteralDO, object: <any>) -> bool;
```
## IntegerLiteralDO::key\_eq

```rust
pub fn key_eq(self: IntegerLiteralDO, object: <any>) -> bool;
```
## IntegerLiteralDO::to\_set

```rust
pub fn to_set(self: IntegerLiteralDO) -> *IntegerLiteralDO;
```
