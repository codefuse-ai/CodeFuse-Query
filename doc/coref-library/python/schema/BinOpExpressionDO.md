# BinOpExpressionDO

Primary key: `element_oid: int`

```rust
schema BinOpExpressionDO {
  right_expr_oid: int,
  opcode: int,
  left_expr_oid: int,
  @primary element_oid: int,
}
```
## BinOpExpressionDO::getRightExprOid

```rust
/**
     * @brief gets the right expr oid of this element.
     * @return int
     */
```
```rust
pub fn getRightExprOid(self: BinOpExpressionDO) -> int;
```
## BinOpExpressionDO::getOpcode

```rust
/**
     * @brief gets the opcode of this element.
     * @return int
     */
```
```rust
pub fn getOpcode(self: BinOpExpressionDO) -> int;
```
## BinOpExpressionDO::getLeftExprOid

```rust
/**
     * @brief gets the left expr oid of this element.
     * @return int
     */
```
```rust
pub fn getLeftExprOid(self: BinOpExpressionDO) -> int;
```
## BinOpExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *BinOpExpressionDO;
```
## BinOpExpressionDO::is\<T\>

```rust
pub fn is<T>(self: BinOpExpressionDO) -> bool;
```
## BinOpExpressionDO::to\<T\>

```rust
pub fn to<T>(self: BinOpExpressionDO) -> <any>;
```
## BinOpExpressionDO::key\_neq

```rust
pub fn key_neq(self: BinOpExpressionDO, object: <any>) -> bool;
```
## BinOpExpressionDO::key\_eq

```rust
pub fn key_eq(self: BinOpExpressionDO, object: <any>) -> bool;
```
## BinOpExpressionDO::to\_set

```rust
pub fn to_set(self: BinOpExpressionDO) -> *BinOpExpressionDO;
```
