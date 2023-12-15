# CallableEnclosingExpressionDO

Primary key: `expression_hash_id: int`

```rust
schema CallableEnclosingExpressionDO {
  callable_hash_id: int,
  @primary expression_hash_id: int
}
```
## CallableEnclosingExpressionDO::getCallableHashId

```java
/**
* @brief gets the callable hash id of this element.
* @return int
*/
```
```rust
pub fn getCallableHashId(self: CallableEnclosingExpressionDO) -> int;
```
## CallableEnclosingExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CallableEnclosingExpressionDO;
```
