# UnaryExpressionDO

Primary key: `element_hash_id: int`

```rust
schema UnaryExpressionDO {
  opcode: string,
  is_postfix: int,
  operand_hash_id: int,
  @primary element_hash_id: int
}
```
## UnaryExpressionDO::getOpcode

```java
/**
* @brief gets the opcode of this element.
* @return string
*/
```
```rust
pub fn getOpcode(self: UnaryExpressionDO) -> string;
```
## UnaryExpressionDO::getIsPostfix

```java
/**
* @brief examine the expression is postfix or prefix, 1 means postfix expression.
* @return int
*/
```
```rust
pub fn getIsPostfix(self: UnaryExpressionDO) -> int;
```
## UnaryExpressionDO::getOperandHashId

```java
/**
* @brief gets the operand hash id of this element.
* @return int
*/
```
```rust
pub fn getOperandHashId(self: UnaryExpressionDO) -> int;
```
## UnaryExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *UnaryExpressionDO;
```
