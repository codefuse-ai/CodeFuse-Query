# TryStatementWithoutFinallyDO

Primary key: `element_hash_id: int`

```rust
schema TryStatementWithoutFinallyDO {
  try_block_hash_id: int,
  @primary element_hash_id: int,
}
```
## TryStatementWithoutFinallyDO::getTryBlockHashId

```java
/**
* @brief gets the try block hash id of this element.
* @return int
*/
```
```rust
pub fn getTryBlockHashId(self: TryStatementWithoutFinallyDO) -> int;
```
## TryStatementWithoutFinallyDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TryStatementWithoutFinallyDO;
```
