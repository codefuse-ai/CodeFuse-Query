# UnaryOpExpressionDO

Primary key: `element_oid: int`

```rust
schema UnaryOpExpressionDO {
  operand_oid: int,
  op_code: string,
  @primary element_oid: int,
}
```
## UnaryOpExpressionDO::getOperandOid

```rust
/**
     * @brief gets the operand oid of this element.
     * @return int
     */
```
```rust
pub fn getOperandOid(self: UnaryOpExpressionDO) -> int;
```
## UnaryOpExpressionDO::getOpCode

```rust
/**
     * @brief gets the op code of this element.
     * @return string
     */
```
```rust
pub fn getOpCode(self: UnaryOpExpressionDO) -> string;
```
## UnaryOpExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *UnaryOpExpressionDO;
```
## UnaryOpExpressionDO::is\<T\>

```rust
pub fn is<T>(self: UnaryOpExpressionDO) -> bool;
```
## UnaryOpExpressionDO::to\<T\>

```rust
pub fn to<T>(self: UnaryOpExpressionDO) -> <any>;
```
## UnaryOpExpressionDO::key\_neq

```rust
pub fn key_neq(self: UnaryOpExpressionDO, object: <any>) -> bool;
```
## UnaryOpExpressionDO::key\_eq

```rust
pub fn key_eq(self: UnaryOpExpressionDO, object: <any>) -> bool;
```
## UnaryOpExpressionDO::to\_set

```rust
pub fn to_set(self: UnaryOpExpressionDO) -> *UnaryOpExpressionDO;
```
