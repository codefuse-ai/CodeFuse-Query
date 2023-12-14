# ExpressionStatementDO

Primary key: `element_hash_id: int`

```rust
schema ExpressionStatementDO {
  expression_hash_id: int,
  @primary element_hash_id: int,
}
```
## ExpressionStatementDO::getExpressionHashId

```rust
/**
     * @brief gets the expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getExpressionHashId(self: ExpressionStatementDO) -> int;
```
## ExpressionStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ExpressionStatementDO;
```
## ExpressionStatementDO::is\<T\>

```rust
pub fn is<T>(self: ExpressionStatementDO) -> bool;
```
## ExpressionStatementDO::to\<T\>

```rust
pub fn to<T>(self: ExpressionStatementDO) -> <any>;
```
## ExpressionStatementDO::key\_neq

```rust
pub fn key_neq(self: ExpressionStatementDO, object: <any>) -> bool;
```
## ExpressionStatementDO::key\_eq

```rust
pub fn key_eq(self: ExpressionStatementDO, object: <any>) -> bool;
```
## ExpressionStatementDO::to\_set

```rust
pub fn to_set(self: ExpressionStatementDO) -> *ExpressionStatementDO;
```
