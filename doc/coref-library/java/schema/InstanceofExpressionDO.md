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

```rust
/**
     * @brief gets the check type hash id of this element.
     * @return int
     */
```
```rust
pub fn getCheckTypeHashId(self: InstanceofExpressionDO) -> int;
```
## InstanceofExpressionDO::getOperandHashId

```rust
/**
     * @brief gets the operand hash id of this element.
     * @return int
     */
```
```rust
pub fn getOperandHashId(self: InstanceofExpressionDO) -> int;
```
## InstanceofExpressionDO::getPatternHashId

```rust
/**
     * @brief gets the pattern hash id of this element.
     * @return int
     */
```
```rust
pub fn getPatternHashId(self: InstanceofExpressionDO) -> int;
```
## InstanceofExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *InstanceofExpressionDO;
```
## InstanceofExpressionDO::is\<T\>

```rust
pub fn is<T>(self: InstanceofExpressionDO) -> bool;
```
## InstanceofExpressionDO::to\<T\>

```rust
pub fn to<T>(self: InstanceofExpressionDO) -> <any>;
```
## InstanceofExpressionDO::key\_neq

```rust
pub fn key_neq(self: InstanceofExpressionDO, object: <any>) -> bool;
```
## InstanceofExpressionDO::key\_eq

```rust
pub fn key_eq(self: InstanceofExpressionDO, object: <any>) -> bool;
```
## InstanceofExpressionDO::to\_set

```rust
pub fn to_set(self: InstanceofExpressionDO) -> *InstanceofExpressionDO;
```
