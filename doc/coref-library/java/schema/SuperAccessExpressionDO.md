# SuperAccessExpressionDO

Primary key: `element_hash_id: int`

```rust
schema SuperAccessExpressionDO {
  @primary element_hash_id: int
}
```
## SuperAccessExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SuperAccessExpressionDO;
```
