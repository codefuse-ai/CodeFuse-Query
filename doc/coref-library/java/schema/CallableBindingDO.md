# CallableBindingDO

Primary key: `caller_hash_id: int`

```rust
schema CallableBindingDO {
  callee_hash_id: int,
  @primary caller_hash_id: int
}
```
## CallableBindingDO::getCalleeHashId

```java
/**
* @brief gets the target callable id of this call.
* @return int 
*/
```
```rust
pub fn getCalleeHashId(self: CallableBindingDO) -> int;
```
## CallableBindingDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CallableBindingDO;
```
