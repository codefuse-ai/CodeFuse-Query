# AsyncForStatementDO

Primary key: `element_oid: int`

```rust
schema AsyncForStatementDO {
  @primary element_oid: int
}
```
## AsyncForStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AsyncForStatementDO;
```
