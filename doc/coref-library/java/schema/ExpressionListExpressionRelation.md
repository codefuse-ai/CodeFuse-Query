# ExpressionListExpressionRelation

Inherit from [ExpressionListExpressionRelationDO](./ExpressionListExpressionRelationDO.md)

Primary key: `expression_hash_id: int`

```rust
schema ExpressionListExpressionRelation extends ExpressionListExpressionRelationDO {
  expression_list_hash_id: int,
  @primary expression_hash_id: int,
  position: int,
}
```
## ExpressionListExpressionRelation::getExpressionHashId

```java
/**
* @brief gets the expression hash id of this element.
* @return int
*/
```
```rust
pub fn getExpressionHashId(self: ExpressionListExpressionRelation) -> int;
```
## ExpressionListExpressionRelation::getExpressionListHashId

```java
/**
* @brief gets the expression list hash id of this element.
* @return int
*/
```
```rust
pub fn getExpressionListHashId(self: ExpressionListExpressionRelation) -> int;
```
## ExpressionListExpressionRelation::getPosition

```rust
pub fn getPosition(self: ExpressionListExpressionRelation) -> int;
```
## ExpressionListExpressionRelation::getExpressionList

```rust
pub fn getExpressionList(self: ExpressionListExpressionRelation) -> ExpressionList;
```
## ExpressionListExpressionRelation::getExpression

```rust
pub fn getExpression(self: ExpressionListExpressionRelation) -> Expression;
```
## ExpressionListExpressionRelation::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ExpressionListExpressionRelation;
```
