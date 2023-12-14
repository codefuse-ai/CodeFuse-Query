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

```java
/**
* @brief gets the right expr oid of this element.
* @return int
*/
```
```rust
pub fn getRightExprOid(self: BinOpExpressionDO) -> int;
```
## BinOpExpressionDO::getOpcode

```java
/**
* @brief gets the opcode of this element.
* @return int
*/
```
```rust
pub fn getOpcode(self: BinOpExpressionDO) -> int;
```
## BinOpExpressionDO::getLeftExprOid

```java
/**
* @brief gets the left expr oid of this element.
* @return int
*/
```
```rust
pub fn getLeftExprOid(self: BinOpExpressionDO) -> int;
```
## BinOpExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *BinOpExpressionDO;
```
