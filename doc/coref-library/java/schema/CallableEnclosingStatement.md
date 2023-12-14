# CallableEnclosingStatement

Inherit from [CallableEnclosingStatementDO](./CallableEnclosingStatementDO.md)

Primary key: `statement_hash_id: int`

```rust
schema CallableEnclosingStatement extends CallableEnclosingStatementDO {
  @primary statement_hash_id: int,
  callable_hash_id: int,
}
```
## CallableEnclosingStatement::getCallableHashId

```java
/**
* @brief gets the callable hash id of this element.
* @return int
*/
```
```rust
pub fn getCallableHashId(self: CallableEnclosingStatement) -> int;
```
## CallableEnclosingStatement::getEnclosingCallable

```java
/**
* @brief gets the enclosing callable of a statement, if any.
* @return Callable
*/
```
```rust
pub fn getEnclosingCallable(self: CallableEnclosingStatement) -> Callable;
```
## CallableEnclosingStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CallableEnclosingStatement;
```
