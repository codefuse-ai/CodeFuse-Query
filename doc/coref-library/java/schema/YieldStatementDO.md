# YieldStatementDO

Primary key: `element_hash_id: int`

```rust
schema YieldStatementDO {
  enclosing_expression_hash_id: int,
  expression_hash_id: int,
  @primary element_hash_id: int,
}
```
## YieldStatementDO::getEnclosingExpressionHashId

```rust
/**
     * @brief gets the enclosing expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getEnclosingExpressionHashId(self: YieldStatementDO) -> int;
```
## YieldStatementDO::getExpressionHashId

```rust
/**
     * @brief gets the expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getExpressionHashId(self: YieldStatementDO) -> int;
```
## YieldStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *YieldStatementDO;
```
## YieldStatementDO::is\<T\>

```rust
pub fn is<T>(self: YieldStatementDO) -> bool;
```
## YieldStatementDO::to\<T\>

```rust
pub fn to<T>(self: YieldStatementDO) -> <any>;
```
## YieldStatementDO::key\_neq

```rust
pub fn key_neq(self: YieldStatementDO, object: <any>) -> bool;
```
## YieldStatementDO::key\_eq

```rust
pub fn key_eq(self: YieldStatementDO, object: <any>) -> bool;
```
## YieldStatementDO::to\_set

```rust
pub fn to_set(self: YieldStatementDO) -> *YieldStatementDO;
```
