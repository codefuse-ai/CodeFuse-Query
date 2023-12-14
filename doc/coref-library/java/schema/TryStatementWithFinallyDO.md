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

```rust
/**
     * @brief gets the finally block hash id of this element.
     * @return int
     */
```
```rust
pub fn getFinallyBlockHashId(self: TryStatementWithFinallyDO) -> int;
```
## TryStatementWithFinallyDO::getTryBlockHashId

```rust
/**
     * @brief gets the try block hash id of this element.
     * @return int
     */
```
```rust
pub fn getTryBlockHashId(self: TryStatementWithFinallyDO) -> int;
```
## TryStatementWithFinallyDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TryStatementWithFinallyDO;
```
## TryStatementWithFinallyDO::is\<T\>

```rust
pub fn is<T>(self: TryStatementWithFinallyDO) -> bool;
```
## TryStatementWithFinallyDO::to\<T\>

```rust
pub fn to<T>(self: TryStatementWithFinallyDO) -> <any>;
```
## TryStatementWithFinallyDO::key\_neq

```rust
pub fn key_neq(self: TryStatementWithFinallyDO, object: <any>) -> bool;
```
## TryStatementWithFinallyDO::key\_eq

```rust
pub fn key_eq(self: TryStatementWithFinallyDO, object: <any>) -> bool;
```
## TryStatementWithFinallyDO::to\_set

```rust
pub fn to_set(self: TryStatementWithFinallyDO) -> *TryStatementWithFinallyDO;
```
