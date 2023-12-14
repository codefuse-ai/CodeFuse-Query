# ContinueStatementDO

Primary key: `element_hash_id: int`

```rust
schema ContinueStatementDO {
  continued_statement_hash_id: int,
  @primary element_hash_id: int,
}
```
## ContinueStatementDO::getContinuedStatementHashId

```java
/**
* @brief gets the continued statement hash id of this element.
* @return int
*/
```
```rust
pub fn getContinuedStatementHashId(self: ContinueStatementDO) -> int;
```
## ContinueStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ContinueStatementDO;
```
