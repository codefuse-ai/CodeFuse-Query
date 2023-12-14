# FloatingPointLiteralDO

Primary key: `element_hash_id: int`

```rust
schema FloatingPointLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## FloatingPointLiteralDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: FloatingPointLiteralDO) -> string;
```
## FloatingPointLiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *FloatingPointLiteralDO;
```
## FloatingPointLiteralDO::is\<T\>

```rust
pub fn is<T>(self: FloatingPointLiteralDO) -> bool;
```
## FloatingPointLiteralDO::to\<T\>

```rust
pub fn to<T>(self: FloatingPointLiteralDO) -> <any>;
```
## FloatingPointLiteralDO::key\_neq

```rust
pub fn key_neq(self: FloatingPointLiteralDO, object: <any>) -> bool;
```
## FloatingPointLiteralDO::key\_eq

```rust
pub fn key_eq(self: FloatingPointLiteralDO, object: <any>) -> bool;
```
## FloatingPointLiteralDO::to\_set

```rust
pub fn to_set(self: FloatingPointLiteralDO) -> *FloatingPointLiteralDO;
```
