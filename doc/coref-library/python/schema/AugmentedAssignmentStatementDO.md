# AugmentedAssignmentStatementDO

Primary key: `element_oid: int`

```rust
schema AugmentedAssignmentStatementDO {
  value_expr_oid: int,
  target_expr_oid: int,
  op_code: string,
  @primary element_oid: int
}
```
## AugmentedAssignmentStatementDO::getTargetExprOid

```java
/**
* @brief gets the target expr oid of this element.
* @return int
*/
```
```rust
pub fn getTargetExprOid(self: AugmentedAssignmentStatementDO) -> int;
```
## AugmentedAssignmentStatementDO::getOpCode

```java
/**
* @brief gets the op code of this element.
* @return string
*/
```
```rust
pub fn getOpCode(self: AugmentedAssignmentStatementDO) -> string;
```
## AugmentedAssignmentStatementDO::getValueExprOid

```java
/**
* @brief gets the value expr oid of this element.
* @return int
*/
```
```rust
pub fn getValueExprOid(self: AugmentedAssignmentStatementDO) -> int;
```
## AugmentedAssignmentStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AugmentedAssignmentStatementDO;
```
