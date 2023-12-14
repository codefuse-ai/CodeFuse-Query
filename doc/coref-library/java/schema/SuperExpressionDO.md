# SuperExpressionDO

Primary key: `element_hash_id: int`

```rust
schema SuperExpressionDO {
  @primary element_hash_id: int,
}
```
## SuperExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SuperExpressionDO;
```
