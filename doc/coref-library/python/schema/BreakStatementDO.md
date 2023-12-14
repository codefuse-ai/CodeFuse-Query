# BreakStatementDO

Primary key: `element_oid: int`

```rust
schema BreakStatementDO {
  @primary element_oid: int,
}
```
## BreakStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *BreakStatementDO;
```
