# PassStatementDO

Primary key: `element_oid: int`

```rust
schema PassStatementDO {
  @primary element_oid: int,
}
```
## PassStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *PassStatementDO;
```
