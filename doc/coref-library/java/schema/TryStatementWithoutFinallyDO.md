# TryStatementWithoutFinallyDO

Primary key: `element_hash_id: int`

```rust
schema TryStatementWithoutFinallyDO {
  try_block_hash_id: int,
  @primary element_hash_id: int,
}
```
## TryStatementWithoutFinallyDO::getTryBlockHashId

```rust
/**
     * @brief gets the try block hash id of this element.
     * @return int
     */
```
```rust
pub fn getTryBlockHashId(self: TryStatementWithoutFinallyDO) -> int;
```
## TryStatementWithoutFinallyDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *TryStatementWithoutFinallyDO;
```
## TryStatementWithoutFinallyDO::is\<T\>

```rust
pub fn is<T>(self: TryStatementWithoutFinallyDO) -> bool;
```
## TryStatementWithoutFinallyDO::to\<T\>

```rust
pub fn to<T>(self: TryStatementWithoutFinallyDO) -> <any>;
```
## TryStatementWithoutFinallyDO::key\_neq

```rust
pub fn key_neq(self: TryStatementWithoutFinallyDO, object: <any>) -> bool;
```
## TryStatementWithoutFinallyDO::key\_eq

```rust
pub fn key_eq(self: TryStatementWithoutFinallyDO, object: <any>) -> bool;
```
## TryStatementWithoutFinallyDO::to\_set

```rust
pub fn to_set(self: TryStatementWithoutFinallyDO) -> *TryStatementWithoutFinallyDO;
```
