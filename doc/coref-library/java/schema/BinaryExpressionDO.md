# BinaryExpressionDO

Primary key: `element_hash_id: int`

```rust
schema BinaryExpressionDO {
  opcode: string,
  rhs_hash_id: int,
  lhs_hash_id: int,
  @primary element_hash_id: int
}
```
## BinaryExpressionDO::getOpcode

```java
/**
* @brief gets the opcode of this element.
* @return string
*/
```
```rust
pub fn getOpcode(self: BinaryExpressionDO) -> string;
```
## BinaryExpressionDO::getRhsHashId

```java
/**
* @brief gets the rhs hash id of this element.
* @return int
*/
```
```rust
pub fn getRhsHashId(self: BinaryExpressionDO) -> int;
```
## BinaryExpressionDO::getLhsHashId

```java
/**
* @brief gets the lhs hash id of this element.
* @return int
*/
```
```rust
pub fn getLhsHashId(self: BinaryExpressionDO) -> int;
```
## BinaryExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *BinaryExpressionDO;
```
