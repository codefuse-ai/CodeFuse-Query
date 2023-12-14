# CallableEnclosingStatementDO

Primary key: `statement_hash_id: int`

```rust
schema CallableEnclosingStatementDO {
  callable_hash_id: int,
  @primary statement_hash_id: int,
}
```
## CallableEnclosingStatementDO::getCallableHashId

```rust
/**
     * @brief gets the callable hash id of this element.
     * @return int
     */
```
```rust
pub fn getCallableHashId(self: CallableEnclosingStatementDO) -> int;
```
## CallableEnclosingStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CallableEnclosingStatementDO;
```
## CallableEnclosingStatementDO::is\<T\>

```rust
pub fn is<T>(self: CallableEnclosingStatementDO) -> bool;
```
## CallableEnclosingStatementDO::to\<T\>

```rust
pub fn to<T>(self: CallableEnclosingStatementDO) -> <any>;
```
## CallableEnclosingStatementDO::key\_neq

```rust
pub fn key_neq(self: CallableEnclosingStatementDO, object: <any>) -> bool;
```
## CallableEnclosingStatementDO::key\_eq

```rust
pub fn key_eq(self: CallableEnclosingStatementDO, object: <any>) -> bool;
```
## CallableEnclosingStatementDO::to\_set

```rust
pub fn to_set(self: CallableEnclosingStatementDO) -> *CallableEnclosingStatementDO;
```
