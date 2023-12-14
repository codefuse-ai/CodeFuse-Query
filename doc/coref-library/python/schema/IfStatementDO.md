# IfStatementDO

Primary key: `element_oid: int`

```rust
schema IfStatementDO {
  @primary element_oid: int,
}
```
## IfStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *IfStatementDO;
```
