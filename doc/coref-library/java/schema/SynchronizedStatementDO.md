# SynchronizedStatementDO

Primary key: `element_hash_id: int`

```rust
schema SynchronizedStatementDO {
  lock_expression_hash_id: int,
  body_declaration_hash_id: int,
  @primary element_hash_id: int,
}
```
## SynchronizedStatementDO::getLockExpressionHashId

```rust
/**
     * @brief gets the lock expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getLockExpressionHashId(self: SynchronizedStatementDO) -> int;
```
## SynchronizedStatementDO::getBodyDeclarationHashId

```rust
/**
     * @brief gets the body declaration hash id of this element.
     * @return int
     */
```
```rust
pub fn getBodyDeclarationHashId(self: SynchronizedStatementDO) -> int;
```
## SynchronizedStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SynchronizedStatementDO;
```
## SynchronizedStatementDO::is\<T\>

```rust
pub fn is<T>(self: SynchronizedStatementDO) -> bool;
```
## SynchronizedStatementDO::to\<T\>

```rust
pub fn to<T>(self: SynchronizedStatementDO) -> <any>;
```
## SynchronizedStatementDO::key\_neq

```rust
pub fn key_neq(self: SynchronizedStatementDO, object: <any>) -> bool;
```
## SynchronizedStatementDO::key\_eq

```rust
pub fn key_eq(self: SynchronizedStatementDO, object: <any>) -> bool;
```
## SynchronizedStatementDO::to\_set

```rust
pub fn to_set(self: SynchronizedStatementDO) -> *SynchronizedStatementDO;
```
