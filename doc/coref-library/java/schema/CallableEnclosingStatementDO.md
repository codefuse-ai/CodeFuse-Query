# CallableEnclosingStatementDO

Primary key: `statement_hash_id: int`

```rust
schema CallableEnclosingStatementDO {
  callable_hash_id: int,
  @primary statement_hash_id: int,
}
```
## CallableEnclosingStatementDO::getCallableHashId

```java
/**
* @brief gets the callable hash id of this element.
* @return int
*/
```
```rust
pub fn getCallableHashId(self: CallableEnclosingStatementDO) -> int;
```
## CallableEnclosingStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CallableEnclosingStatementDO;
```
