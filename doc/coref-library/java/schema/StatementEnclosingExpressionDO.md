# StatementEnclosingExpressionDO

Primary key: `expression_hash_id: int`

```rust
schema StatementEnclosingExpressionDO {
  statement_hash_id: int,
  @primary expression_hash_id: int,
}
```
## StatementEnclosingExpressionDO::getStatementHashId

```java
/**
* @brief gets the statement hash id of this element.
* @return int
*/
```
```rust
pub fn getStatementHashId(self: StatementEnclosingExpressionDO) -> int;
```
## StatementEnclosingExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *StatementEnclosingExpressionDO;
```
