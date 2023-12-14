# ThrowStatementDO

Primary key: `element_hash_id: int`

```rust
schema ThrowStatementDO {
  block_hash_id: int,
  exception_hash_id: int,
  @primary element_hash_id: int,
}
```
## ThrowStatementDO::getExceptionHashId

```rust
/**
     * @brief gets the exception hash id of this element.
     * @return int
     */
```
```rust
pub fn getExceptionHashId(self: ThrowStatementDO) -> int;
```
## ThrowStatementDO::getBlockHashId

```rust
/**
     * @brief gets the block hash id of this element.
     * @return int
     */
```
```rust
pub fn getBlockHashId(self: ThrowStatementDO) -> int;
```
## ThrowStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ThrowStatementDO;
```
## ThrowStatementDO::is\<T\>

```rust
pub fn is<T>(self: ThrowStatementDO) -> bool;
```
## ThrowStatementDO::to\<T\>

```rust
pub fn to<T>(self: ThrowStatementDO) -> <any>;
```
## ThrowStatementDO::key\_neq

```rust
pub fn key_neq(self: ThrowStatementDO, object: <any>) -> bool;
```
## ThrowStatementDO::key\_eq

```rust
pub fn key_eq(self: ThrowStatementDO, object: <any>) -> bool;
```
## ThrowStatementDO::to\_set

```rust
pub fn to_set(self: ThrowStatementDO) -> *ThrowStatementDO;
```
