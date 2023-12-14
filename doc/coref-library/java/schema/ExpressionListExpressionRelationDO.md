# ExpressionListExpressionRelationDO

Primary key: `expression_hash_id: int`

```rust
schema ExpressionListExpressionRelationDO {
  position: int,
  @primary expression_hash_id: int,
  expression_list_hash_id: int,
}
```
## ExpressionListExpressionRelationDO::getPosition

```rust
pub fn getPosition(self: ExpressionListExpressionRelationDO) -> int;
```
## ExpressionListExpressionRelationDO::getExpressionListHashId

```java
/**
* @brief gets the expression list hash id of this element.
* @return int
*/
```
```rust
pub fn getExpressionListHashId(self: ExpressionListExpressionRelationDO) -> int;
```
## ExpressionListExpressionRelationDO::getExpressionHashId

```java
/**
* @brief gets the expression hash id of this element.
* @return int
*/
```
```rust
pub fn getExpressionHashId(self: ExpressionListExpressionRelationDO) -> int;
```
## ExpressionListExpressionRelationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ExpressionListExpressionRelationDO;
```
