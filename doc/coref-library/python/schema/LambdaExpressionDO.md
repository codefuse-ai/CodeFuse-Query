# LambdaExpressionDO

Primary key: `element_oid: int`

```rust
schema LambdaExpressionDO {
  @primary element_oid: int,
}
```
## LambdaExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *LambdaExpressionDO;
```
