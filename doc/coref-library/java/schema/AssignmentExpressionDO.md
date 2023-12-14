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

```rust
/**
     * @brief gets the operation token of the assignment.
     * @return string
     */
```
```rust
pub fn getOpcode(self: AssignmentExpressionDO) -> string;
```
## AssignmentExpressionDO::getRhsHashId

```rust
/**
     * @brief gets the expression id on the right side of the assignment.
     * @return int
     */
```
```rust
pub fn getRhsHashId(self: AssignmentExpressionDO) -> int;
```
## AssignmentExpressionDO::getLhsHashId

```rust
/**
     * @brief gets the expression id on the left side of the assignment.
     * @return int
     */
```
```rust
pub fn getLhsHashId(self: AssignmentExpressionDO) -> int;
```
## AssignmentExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AssignmentExpressionDO;
```
## AssignmentExpressionDO::is\<T\>

```rust
pub fn is<T>(self: AssignmentExpressionDO) -> bool;
```
## AssignmentExpressionDO::to\<T\>

```rust
pub fn to<T>(self: AssignmentExpressionDO) -> <any>;
```
## AssignmentExpressionDO::key\_neq

```rust
pub fn key_neq(self: AssignmentExpressionDO, object: <any>) -> bool;
```
## AssignmentExpressionDO::key\_eq

```rust
pub fn key_eq(self: AssignmentExpressionDO, object: <any>) -> bool;
```
## AssignmentExpressionDO::to\_set

```rust
pub fn to_set(self: AssignmentExpressionDO) -> *AssignmentExpressionDO;
```
