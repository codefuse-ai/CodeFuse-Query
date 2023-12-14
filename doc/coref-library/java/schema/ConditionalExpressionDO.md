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

```java
/**
* @brief gets the expression id which is the result used when the condition is false.
* @return int
*/
```
```rust
pub fn getElsePartHashId(self: ConditionalExpressionDO) -> int;
```
## ConditionalExpressionDO::getThenPartHashId

```java
/**
* @brief gets the expression id which is the result used when the condition is true.
* @return int
*/
```
```rust
pub fn getThenPartHashId(self: ConditionalExpressionDO) -> int;
```
## ConditionalExpressionDO::getConditionExpressionHashId

```java
/**
* @brief gets the condition expression hash id of this element.
* @return int
*/
```
```rust
pub fn getConditionExpressionHashId(self: ConditionalExpressionDO) -> int;
```
## ConditionalExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ConditionalExpressionDO;
```
