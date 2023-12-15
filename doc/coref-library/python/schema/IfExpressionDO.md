# IfExpressionDO

Primary key: `element_oid: int`

```rust
schema IfExpressionDO {
  @primary element_oid: int
}
```
## IfExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *IfExpressionDO;
```
