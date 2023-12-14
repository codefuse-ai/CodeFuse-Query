# InstanceofExpressionDO

Primary key: `element_hash_id: int`

```rust
schema InstanceofExpressionDO {
  pattern_hash_id: int,
  check_type_hash_id: int,
  operand_hash_id: int,
  @primary element_hash_id: int,
}
```
## InstanceofExpressionDO::getCheckTypeHashId

```java
/**
* @brief gets the check type hash id of this element.
* @return int
*/
```
```rust
pub fn getCheckTypeHashId(self: InstanceofExpressionDO) -> int;
```
## InstanceofExpressionDO::getOperandHashId

```java
/**
* @brief gets the operand hash id of this element.
* @return int
*/
```
```rust
pub fn getOperandHashId(self: InstanceofExpressionDO) -> int;
```
## InstanceofExpressionDO::getPatternHashId

```java
/**
* @brief gets the pattern hash id of this element.
* @return int
*/
```
```rust
pub fn getPatternHashId(self: InstanceofExpressionDO) -> int;
```
## InstanceofExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *InstanceofExpressionDO;
```
