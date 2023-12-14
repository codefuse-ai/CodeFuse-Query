# AssignmentExpressionDO

Primary key: `element_hash_id: int`

```rust
schema AssignmentExpressionDO {
  opcode: string,
  rhs_hash_id: int,
  lhs_hash_id: int,
  @primary element_hash_id: int,
}
```
## AssignmentExpressionDO::getOpcode

```java
/**
* @brief gets the operation token of the assignment.
* @return string
*/
```
```rust
pub fn getOpcode(self: AssignmentExpressionDO) -> string;
```
## AssignmentExpressionDO::getRhsHashId

```java
/**
* @brief gets the expression id on the right side of the assignment.
* @return int
*/
```
```rust
pub fn getRhsHashId(self: AssignmentExpressionDO) -> int;
```
## AssignmentExpressionDO::getLhsHashId

```java
/**
* @brief gets the expression id on the left side of the assignment.
* @return int
*/
```
```rust
pub fn getLhsHashId(self: AssignmentExpressionDO) -> int;
```
## AssignmentExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AssignmentExpressionDO;
```
