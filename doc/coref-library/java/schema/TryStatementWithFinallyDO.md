# TryStatementWithFinallyDO

Primary key: `element_hash_id: int`

```rust
schema TryStatementWithFinallyDO {
  try_block_hash_id: int,
  finally_block_hash_id: int,
  @primary element_hash_id: int,
}
```
## TryStatementWithFinallyDO::getFinallyBlockHashId

```java
/**
* @brief gets the finally block hash id of this element.
* @return int
*/
```
```rust
pub fn getFinallyBlockHashId(self: TryStatementWithFinallyDO) -> int;
```
## TryStatementWithFinallyDO::getTryBlockHashId

```java
/**
* @brief gets the try block hash id of this element.
* @return int
*/
```
```rust
pub fn getTryBlockHashId(self: TryStatementWithFinallyDO) -> int;
```
## TryStatementWithFinallyDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TryStatementWithFinallyDO;
```
