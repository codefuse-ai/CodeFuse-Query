# ForStatementDO

Primary key: `element_oid: int`

```rust
schema ForStatementDO {
  @primary element_oid: int
}
```
## ForStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ForStatementDO;
```
