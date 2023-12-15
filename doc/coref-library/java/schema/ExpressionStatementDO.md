# ExpressionStatementDO

Primary key: `element_hash_id: int`

```rust
schema ExpressionStatementDO {
  expression_hash_id: int,
  @primary element_hash_id: int
}
```
## ExpressionStatementDO::getExpressionHashId

```java
/**
* @brief gets the expression hash id of this element.
* @return int
*/
```
```rust
pub fn getExpressionHashId(self: ExpressionStatementDO) -> int;
```
## ExpressionStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ExpressionStatementDO;
```
