# TypeCastExpressionDO

Primary key: `element_hash_id: int`

```rust
schema TypeCastExpressionDO {
  cast_expression_hash_id: int,
  @primary element_hash_id: int
}
```
## TypeCastExpressionDO::getCastExpressionHashId

```java
/**
* @brief gets the cast expression hash id of this element.
* @return int
*/
```
```rust
pub fn getCastExpressionHashId(self: TypeCastExpressionDO) -> int;
```
## TypeCastExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TypeCastExpressionDO;
```
