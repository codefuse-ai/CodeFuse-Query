# CallableEnclosingExpressionDO

Primary key: `expression_hash_id: int`

```rust
schema CallableEnclosingExpressionDO {
  callable_hash_id: int,
  @primary expression_hash_id: int,
}
```
## CallableEnclosingExpressionDO::getCallableHashId

```rust
/**
     * @brief gets the callable hash id of this element.
     * @return int
     */
```
```rust
pub fn getCallableHashId(self: CallableEnclosingExpressionDO) -> int;
```
## CallableEnclosingExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CallableEnclosingExpressionDO;
```
## CallableEnclosingExpressionDO::is\<T\>

```rust
pub fn is<T>(self: CallableEnclosingExpressionDO) -> bool;
```
## CallableEnclosingExpressionDO::to\<T\>

```rust
pub fn to<T>(self: CallableEnclosingExpressionDO) -> <any>;
```
## CallableEnclosingExpressionDO::key\_neq

```rust
pub fn key_neq(self: CallableEnclosingExpressionDO, object: <any>) -> bool;
```
## CallableEnclosingExpressionDO::key\_eq

```rust
pub fn key_eq(self: CallableEnclosingExpressionDO, object: <any>) -> bool;
```
## CallableEnclosingExpressionDO::to\_set

```rust
pub fn to_set(self: CallableEnclosingExpressionDO) -> *CallableEnclosingExpressionDO;
```
