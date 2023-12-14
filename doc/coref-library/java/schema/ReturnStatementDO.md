# ReturnStatementDO

Primary key: `element_hash_id: int`

```rust
schema ReturnStatementDO {
  return_expression_hash_id: int,
  @primary element_hash_id: int,
}
```
## ReturnStatementDO::getReturnExpressionHashId

```rust
/**
     * @brief gets the return expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getReturnExpressionHashId(self: ReturnStatementDO) -> int;
```
## ReturnStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReturnStatementDO;
```
## ReturnStatementDO::is\<T\>

```rust
pub fn is<T>(self: ReturnStatementDO) -> bool;
```
## ReturnStatementDO::to\<T\>

```rust
pub fn to<T>(self: ReturnStatementDO) -> <any>;
```
## ReturnStatementDO::key\_neq

```rust
pub fn key_neq(self: ReturnStatementDO, object: <any>) -> bool;
```
## ReturnStatementDO::key\_eq

```rust
pub fn key_eq(self: ReturnStatementDO, object: <any>) -> bool;
```
## ReturnStatementDO::to\_set

```rust
pub fn to_set(self: ReturnStatementDO) -> *ReturnStatementDO;
```
