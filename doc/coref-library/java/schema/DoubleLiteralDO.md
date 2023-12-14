# DoubleLiteralDO

Primary key: `element_hash_id: int`

```rust
schema DoubleLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## DoubleLiteralDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: DoubleLiteralDO) -> string;
```
## DoubleLiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *DoubleLiteralDO;
```
## DoubleLiteralDO::is\<T\>

```rust
pub fn is<T>(self: DoubleLiteralDO) -> bool;
```
## DoubleLiteralDO::to\<T\>

```rust
pub fn to<T>(self: DoubleLiteralDO) -> <any>;
```
## DoubleLiteralDO::key\_neq

```rust
pub fn key_neq(self: DoubleLiteralDO, object: <any>) -> bool;
```
## DoubleLiteralDO::key\_eq

```rust
pub fn key_eq(self: DoubleLiteralDO, object: <any>) -> bool;
```
## DoubleLiteralDO::to\_set

```rust
pub fn to_set(self: DoubleLiteralDO) -> *DoubleLiteralDO;
```
