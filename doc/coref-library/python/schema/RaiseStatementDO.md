# RaiseStatementDO

Primary key: `element_oid: int`

```rust
schema RaiseStatementDO {
  @primary element_oid: int
}
```
## RaiseStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *RaiseStatementDO;
```
