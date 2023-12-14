# AsyncWithStatementDO

Primary key: `element_oid: int`

```rust
schema AsyncWithStatementDO {
  @primary element_oid: int,
}
```
## AsyncWithStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AsyncWithStatementDO;
```
