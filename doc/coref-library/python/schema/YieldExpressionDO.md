# YieldExpressionDO

Primary key: `element_oid: int`

```rust
schema YieldExpressionDO {
  @primary element_oid: int,
}
```
## YieldExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *YieldExpressionDO;
```
