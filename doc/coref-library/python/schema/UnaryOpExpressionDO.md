# UnaryOpExpressionDO

Primary key: `element_oid: int`

```rust
schema UnaryOpExpressionDO {
  operand_oid: int,
  op_code: string,
  @primary element_oid: int
}
```
## UnaryOpExpressionDO::getOperandOid

```java
/**
* @brief gets the operand oid of this element.
* @return int
*/
```
```rust
pub fn getOperandOid(self: UnaryOpExpressionDO) -> int;
```
## UnaryOpExpressionDO::getOpCode

```java
/**
* @brief gets the op code of this element.
* @return string
*/
```
```rust
pub fn getOpCode(self: UnaryOpExpressionDO) -> string;
```
## UnaryOpExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *UnaryOpExpressionDO;
```
