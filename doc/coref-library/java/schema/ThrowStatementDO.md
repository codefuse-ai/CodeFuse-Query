# ThrowStatementDO

Primary key: `element_hash_id: int`

```rust
schema ThrowStatementDO {
  block_hash_id: int,
  exception_hash_id: int,
  @primary element_hash_id: int
}
```
## ThrowStatementDO::getExceptionHashId

```java
/**
* @brief gets the exception hash id of this element.
* @return int
*/
```
```rust
pub fn getExceptionHashId(self: ThrowStatementDO) -> int;
```
## ThrowStatementDO::getBlockHashId

```java
/**
* @brief gets the block hash id of this element.
* @return int
*/
```
```rust
pub fn getBlockHashId(self: ThrowStatementDO) -> int;
```
## ThrowStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ThrowStatementDO;
```
