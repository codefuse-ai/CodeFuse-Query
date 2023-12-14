# UnaryExpressionDO

Primary key: `element_hash_id: int`

```rust
schema UnaryExpressionDO {
  opcode: string,
  is_postfix: int,
  operand_hash_id: int,
  @primary element_hash_id: int,
}
```
## UnaryExpressionDO::getOpcode

```rust
/**
     * @brief gets the opcode of this element.
     * @return string
     */
```
```rust
pub fn getOpcode(self: UnaryExpressionDO) -> string;
```
## UnaryExpressionDO::getIsPostfix

```rust
/**
     * @brief examine the expression is postfix or prefix, 1 means postfix expression.
     * @return int
     */
```
```rust
pub fn getIsPostfix(self: UnaryExpressionDO) -> int;
```
## UnaryExpressionDO::getOperandHashId

```rust
/**
     * @brief gets the operand hash id of this element.
     * @return int
     */
```
```rust
pub fn getOperandHashId(self: UnaryExpressionDO) -> int;
```
## UnaryExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *UnaryExpressionDO;
```
## UnaryExpressionDO::is\<T\>

```rust
pub fn is<T>(self: UnaryExpressionDO) -> bool;
```
## UnaryExpressionDO::to\<T\>

```rust
pub fn to<T>(self: UnaryExpressionDO) -> <any>;
```
## UnaryExpressionDO::key\_neq

```rust
pub fn key_neq(self: UnaryExpressionDO, object: <any>) -> bool;
```
## UnaryExpressionDO::key\_eq

```rust
pub fn key_eq(self: UnaryExpressionDO, object: <any>) -> bool;
```
## UnaryExpressionDO::to\_set

```rust
pub fn to_set(self: UnaryExpressionDO) -> *UnaryExpressionDO;
```
