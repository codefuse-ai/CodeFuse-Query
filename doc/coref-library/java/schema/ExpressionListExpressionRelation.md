# ExpressionListExpressionRelation

Primary key: `expression_hash_id: int`

```rust
schema ExpressionListExpressionRelation {
  expression_list_hash_id: int,
  @primary expression_hash_id: int,
  position: int,
}
```
## ExpressionListExpressionRelation::getExpressionHashId

```rust
/**
     * @brief gets the expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getExpressionHashId(self: ExpressionListExpressionRelation) -> int;
```
## ExpressionListExpressionRelation::getExpressionListHashId

```rust
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

```rust
pub fn __all__(db: JavaDB) -> *ExpressionListExpressionRelation;
```
## ExpressionListExpressionRelation::is\<T\>

```rust
pub fn is<T>(self: ExpressionListExpressionRelation) -> bool;
```
## ExpressionListExpressionRelation::to\<T\>

```rust
pub fn to<T>(self: ExpressionListExpressionRelation) -> <any>;
```
## ExpressionListExpressionRelation::key\_neq

```rust
pub fn key_neq(self: ExpressionListExpressionRelation, object: <any>) -> bool;
```
## ExpressionListExpressionRelation::key\_eq

```rust
pub fn key_eq(self: ExpressionListExpressionRelation, object: <any>) -> bool;
```
## ExpressionListExpressionRelation::to\_set

```rust
pub fn to_set(self: ExpressionListExpressionRelation) -> *ExpressionListExpressionRelation;
```
