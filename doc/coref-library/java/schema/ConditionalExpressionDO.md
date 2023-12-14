# ConditionalExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ConditionalExpressionDO {
  then_part_hash_id: int,
  else_part_hash_id: int,
  condition_expression_hash_id: int,
  @primary element_hash_id: int,
}
```
## ConditionalExpressionDO::getElsePartHashId

```rust
/**
     * @brief gets the expression id which is the result used when the condition is false.
     * @return int
     */
```
```rust
pub fn getElsePartHashId(self: ConditionalExpressionDO) -> int;
```
## ConditionalExpressionDO::getThenPartHashId

```rust
/**
     * @brief gets the expression id which is the result used when the condition is true.
     * @return int
     */
```
```rust
pub fn getThenPartHashId(self: ConditionalExpressionDO) -> int;
```
## ConditionalExpressionDO::getConditionExpressionHashId

```rust
/**
     * @brief gets the condition expression hash id of this element.
     * @return int
     */
```
```rust
pub fn getConditionExpressionHashId(self: ConditionalExpressionDO) -> int;
```
## ConditionalExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ConditionalExpressionDO;
```
## ConditionalExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ConditionalExpressionDO) -> bool;
```
## ConditionalExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ConditionalExpressionDO) -> <any>;
```
## ConditionalExpressionDO::key\_neq

```rust
pub fn key_neq(self: ConditionalExpressionDO, object: <any>) -> bool;
```
## ConditionalExpressionDO::key\_eq

```rust
pub fn key_eq(self: ConditionalExpressionDO, object: <any>) -> bool;
```
## ConditionalExpressionDO::to\_set

```rust
pub fn to_set(self: ConditionalExpressionDO) -> *ConditionalExpressionDO;
```
