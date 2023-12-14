# YieldStatementDO

Primary key: `element_hash_id: int`

```rust
schema YieldStatementDO {
  enclosing_expression_hash_id: int,
  expression_hash_id: int,
  @primary element_hash_id: int,
}
```
## YieldStatementDO::getEnclosingExpressionHashId

```java
/**
* @brief gets the enclosing expression hash id of this element.
* @return int
*/
```
```rust
pub fn getEnclosingExpressionHashId(self: YieldStatementDO) -> int;
```
## YieldStatementDO::getExpressionHashId

```java
/**
* @brief gets the expression hash id of this element.
* @return int
*/
```
```rust
pub fn getExpressionHashId(self: YieldStatementDO) -> int;
```
## YieldStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *YieldStatementDO;
```
