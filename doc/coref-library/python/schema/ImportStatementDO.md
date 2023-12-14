# ImportStatementDO

Primary key: `element_oid: int`

```rust
schema ImportStatementDO {
  @primary element_oid: int,
}
```
## ImportStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ImportStatementDO;
```
