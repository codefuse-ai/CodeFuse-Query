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

```java
/**
* @brief gets the lock expression hash id of this element.
* @return int
*/
```
```rust
pub fn getLockExpressionHashId(self: SynchronizedStatementDO) -> int;
```
## SynchronizedStatementDO::getBodyDeclarationHashId

```java
/**
* @brief gets the body declaration hash id of this element.
* @return int
*/
```
```rust
pub fn getBodyDeclarationHashId(self: SynchronizedStatementDO) -> int;
```
## SynchronizedStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SynchronizedStatementDO;
```
