# ReferenceExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ReferenceExpressionDO {
  @primary element_hash_id: int,
}
```
## ReferenceExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReferenceExpressionDO;
```
