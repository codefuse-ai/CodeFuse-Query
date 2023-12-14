# StatementEnclosingExpression

Primary key: `expression_hash_id: int`

```rust
schema StatementEnclosingExpression {
  @primary expression_hash_id: int,
  statement_hash_id: int,
}
```
## StatementEnclosingExpression::getStatement

```rust
/**
     * @brief gets the statement which encloses the expression.
     * @return Statement 
     */
```
```rust
pub fn getStatement(self: StatementEnclosingExpression) -> Statement;
```
## StatementEnclosingExpression::getStatementHashId

```rust
/**
     * @brief gets the statement hash id of this element.
     * @return int
     */
```
```rust
pub fn getStatementHashId(self: StatementEnclosingExpression) -> int;
```
## StatementEnclosingExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *StatementEnclosingExpression;
```
## StatementEnclosingExpression::is\<T\>

```rust
pub fn is<T>(self: StatementEnclosingExpression) -> bool;
```
## StatementEnclosingExpression::to\<T\>

```rust
pub fn to<T>(self: StatementEnclosingExpression) -> <any>;
```
## StatementEnclosingExpression::key\_neq

```rust
pub fn key_neq(self: StatementEnclosingExpression, object: <any>) -> bool;
```
## StatementEnclosingExpression::key\_eq

```rust
pub fn key_eq(self: StatementEnclosingExpression, object: <any>) -> bool;
```
## StatementEnclosingExpression::to\_set

```rust
pub fn to_set(self: StatementEnclosingExpression) -> *StatementEnclosingExpression;
```
