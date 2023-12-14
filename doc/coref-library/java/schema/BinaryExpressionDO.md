# BinaryExpressionDO

Primary key: `element_hash_id: int`

```rust
schema BinaryExpressionDO {
  opcode: string,
  rhs_hash_id: int,
  lhs_hash_id: int,
  @primary element_hash_id: int,
}
```
## BinaryExpressionDO::getOpcode

```rust
/**
     * @brief gets the opcode of this element.
     * @return string
     */
```
```rust
pub fn getOpcode(self: BinaryExpressionDO) -> string;
```
## BinaryExpressionDO::getRhsHashId

```rust
/**
     * @brief gets the rhs hash id of this element.
     * @return int
     */
```
```rust
pub fn getRhsHashId(self: BinaryExpressionDO) -> int;
```
## BinaryExpressionDO::getLhsHashId

```rust
/**
     * @brief gets the lhs hash id of this element.
     * @return int
     */
```
```rust
pub fn getLhsHashId(self: BinaryExpressionDO) -> int;
```
## BinaryExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *BinaryExpressionDO;
```
## BinaryExpressionDO::is\<T\>

```rust
pub fn is<T>(self: BinaryExpressionDO) -> bool;
```
## BinaryExpressionDO::to\<T\>

```rust
pub fn to<T>(self: BinaryExpressionDO) -> <any>;
```
## BinaryExpressionDO::key\_neq

```rust
pub fn key_neq(self: BinaryExpressionDO, object: <any>) -> bool;
```
## BinaryExpressionDO::key\_eq

```rust
pub fn key_eq(self: BinaryExpressionDO, object: <any>) -> bool;
```
## BinaryExpressionDO::to\_set

```rust
pub fn to_set(self: BinaryExpressionDO) -> *BinaryExpressionDO;
```
