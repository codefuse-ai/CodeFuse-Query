# TryStatementDO

Primary key: `element_oid: int`

```rust
schema TryStatementDO {
  @primary element_oid: int
}
```
## TryStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *TryStatementDO;
```
