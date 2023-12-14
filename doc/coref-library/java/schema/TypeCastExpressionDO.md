# TypeCastExpressionDO

Primary key: `element_hash_id: int`

```rust
schema TypeCastExpressionDO {
  cast_expression_hash_id: int,
  @primary element_hash_id: int,
}
```
## TypeCastExpressionDO::getCastExpressionHashId

```rust
/**
     * @brief gets the cast expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getCastExpressionHashId(self: TypeCastExpressionDO) -> int;
```
## TypeCastExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TypeCastExpressionDO;
```
## TypeCastExpressionDO::is\<T\>

```rust
pub fn is<T>(self: TypeCastExpressionDO) -> bool;
```
## TypeCastExpressionDO::to\<T\>

```rust
pub fn to<T>(self: TypeCastExpressionDO) -> <any>;
```
## TypeCastExpressionDO::key\_neq

```rust
pub fn key_neq(self: TypeCastExpressionDO, object: <any>) -> bool;
```
## TypeCastExpressionDO::key\_eq

```rust
pub fn key_eq(self: TypeCastExpressionDO, object: <any>) -> bool;
```
## TypeCastExpressionDO::to\_set

```rust
pub fn to_set(self: TypeCastExpressionDO) -> *TypeCastExpressionDO;
```
