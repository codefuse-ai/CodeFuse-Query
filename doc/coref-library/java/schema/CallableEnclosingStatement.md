# CallableEnclosingStatement

Primary key: `statement_hash_id: int`

```rust
schema CallableEnclosingStatement {
  @primary statement_hash_id: int,
  callable_hash_id: int,
}
```
## CallableEnclosingStatement::getCallableHashId

```rust
/**
     * @brief gets the callable hash id of this element.
     * @return int
     */
```
```rust
pub fn getCallableHashId(self: CallableEnclosingStatement) -> int;
```
## CallableEnclosingStatement::getEnclosingCallable

```rust
/**
     * @brief gets the enclosing callable of a statement, if any.
     * @return Callable
     */
```
```rust
pub fn getEnclosingCallable(self: CallableEnclosingStatement) -> Callable;
```
## CallableEnclosingStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CallableEnclosingStatement;
```
## CallableEnclosingStatement::is\<T\>

```rust
pub fn is<T>(self: CallableEnclosingStatement) -> bool;
```
## CallableEnclosingStatement::to\<T\>

```rust
pub fn to<T>(self: CallableEnclosingStatement) -> <any>;
```
## CallableEnclosingStatement::key\_neq

```rust
pub fn key_neq(self: CallableEnclosingStatement, object: <any>) -> bool;
```
## CallableEnclosingStatement::key\_eq

```rust
pub fn key_eq(self: CallableEnclosingStatement, object: <any>) -> bool;
```
## CallableEnclosingStatement::to\_set

```rust
pub fn to_set(self: CallableEnclosingStatement) -> *CallableEnclosingStatement;
```
