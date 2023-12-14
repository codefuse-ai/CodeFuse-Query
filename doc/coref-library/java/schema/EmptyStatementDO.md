# EmptyStatementDO

Primary key: `element_hash_id: int`

```rust
schema EmptyStatementDO {
  @primary element_hash_id: int,
}
```
## EmptyStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *EmptyStatementDO;
```
