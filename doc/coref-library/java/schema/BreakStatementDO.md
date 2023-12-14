# BreakStatementDO

Primary key: `element_hash_id: int`

```rust
schema BreakStatementDO {
  exited_statement_hash_id: int,
  @primary element_hash_id: int,
}
```
## BreakStatementDO::getExitedStatementHashId

```java
/**
* @brief gets the exited statement hash id of this element.
* @return int
*/
```
```rust
pub fn getExitedStatementHashId(self: BreakStatementDO) -> int;
```
## BreakStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *BreakStatementDO;
```
