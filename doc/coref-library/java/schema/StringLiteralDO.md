# StringLiteralDO

Primary key: `element_hash_id: int`

```rust
schema StringLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## StringLiteralDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: StringLiteralDO) -> string;
```
## StringLiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *StringLiteralDO;
```
## StringLiteralDO::is\<T\>

```rust
pub fn is<T>(self: StringLiteralDO) -> bool;
```
## StringLiteralDO::to\<T\>

```rust
pub fn to<T>(self: StringLiteralDO) -> <any>;
```
## StringLiteralDO::key\_neq

```rust
pub fn key_neq(self: StringLiteralDO, object: <any>) -> bool;
```
## StringLiteralDO::key\_eq

```rust
pub fn key_eq(self: StringLiteralDO, object: <any>) -> bool;
```
## StringLiteralDO::to\_set

```rust
pub fn to_set(self: StringLiteralDO) -> *StringLiteralDO;
```
