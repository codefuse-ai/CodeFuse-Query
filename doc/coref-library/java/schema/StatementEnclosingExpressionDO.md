# StatementEnclosingExpressionDO

Primary key: `expression_hash_id: int`

```rust
schema StatementEnclosingExpressionDO {
  statement_hash_id: int,
  @primary expression_hash_id: int,
}
```
## StatementEnclosingExpressionDO::getStatementHashId

```rust
/**
     * @brief gets the statement hash id of this element.
     * @return int
     */
```
```rust
pub fn getStatementHashId(self: StatementEnclosingExpressionDO) -> int;
```
## StatementEnclosingExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *StatementEnclosingExpressionDO;
```
## StatementEnclosingExpressionDO::is\<T\>

```rust
pub fn is<T>(self: StatementEnclosingExpressionDO) -> bool;
```
## StatementEnclosingExpressionDO::to\<T\>

```rust
pub fn to<T>(self: StatementEnclosingExpressionDO) -> <any>;
```
## StatementEnclosingExpressionDO::key\_neq

```rust
pub fn key_neq(self: StatementEnclosingExpressionDO, object: <any>) -> bool;
```
## StatementEnclosingExpressionDO::key\_eq

```rust
pub fn key_eq(self: StatementEnclosingExpressionDO, object: <any>) -> bool;
```
## StatementEnclosingExpressionDO::to\_set

```rust
pub fn to_set(self: StatementEnclosingExpressionDO) -> *StatementEnclosingExpressionDO;
```
