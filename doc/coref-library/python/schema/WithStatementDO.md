# WithStatementDO

Primary key: `element_oid: int`

```rust
schema WithStatementDO {
  @primary element_oid: int
}
```
## WithStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *WithStatementDO;
```
