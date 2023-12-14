# StatementEnclosingExpression

Primary key: `expression_hash_id: int`

```rust
schema StatementEnclosingExpression {
  @primary expression_hash_id: int,
  statement_hash_id: int,
}
```
## StatementEnclosingExpression::getStatement

```java
/**
* @brief gets the statement which encloses the expression.
* @return Statement 
*/
```
```rust
pub fn getStatement(self: StatementEnclosingExpression) -> Statement;
```
## StatementEnclosingExpression::getStatementHashId

```java
/**
* @brief gets the statement hash id of this element.
* @return int
*/
```
```rust
pub fn getStatementHashId(self: StatementEnclosingExpression) -> int;
```
## StatementEnclosingExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *StatementEnclosingExpression;
```
