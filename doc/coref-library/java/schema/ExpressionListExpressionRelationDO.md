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

```rust
/**
     * @brief gets the expression list hash id of this element.
     * @return int
     */
```
```rust
pub fn getExpressionListHashId(self: ExpressionListExpressionRelationDO) -> int;
```
## ExpressionListExpressionRelationDO::getExpressionHashId

```rust
/**
     * @brief gets the expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getExpressionHashId(self: ExpressionListExpressionRelationDO) -> int;
```
## ExpressionListExpressionRelationDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ExpressionListExpressionRelationDO;
```
## ExpressionListExpressionRelationDO::is\<T\>

```rust
pub fn is<T>(self: ExpressionListExpressionRelationDO) -> bool;
```
## ExpressionListExpressionRelationDO::to\<T\>

```rust
pub fn to<T>(self: ExpressionListExpressionRelationDO) -> <any>;
```
## ExpressionListExpressionRelationDO::key\_neq

```rust
pub fn key_neq(self: ExpressionListExpressionRelationDO, object: <any>) -> bool;
```
## ExpressionListExpressionRelationDO::key\_eq

```rust
pub fn key_eq(self: ExpressionListExpressionRelationDO, object: <any>) -> bool;
```
## ExpressionListExpressionRelationDO::to\_set

```rust
pub fn to_set(self: ExpressionListExpressionRelationDO) -> *ExpressionListExpressionRelationDO;
```
