# ReturnStatementDO

Primary key: `element_hash_id: int`

```rust
schema ReturnStatementDO {
  return_expression_hash_id: int,
  @primary element_hash_id: int,
}
```
## ReturnStatementDO::getReturnExpressionHashId

```java
/**
* @brief gets the return expression hash id of this element.
* @return int
*/
```
```rust
pub fn getReturnExpressionHashId(self: ReturnStatementDO) -> int;
```
## ReturnStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ReturnStatementDO;
```
