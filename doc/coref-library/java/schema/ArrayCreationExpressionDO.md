# ArrayCreationExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ArrayCreationExpressionDO {
  type_hash_id: int,
  number_of_array_dimension: int,
  @primary element_hash_id: int,
}
```
## ArrayCreationExpressionDO::getNumberOfArrayDimension

```rust
/**
     * @brief gets the number of array dimension of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfArrayDimension(self: ArrayCreationExpressionDO) -> int;
```
## ArrayCreationExpressionDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: ArrayCreationExpressionDO) -> int;
```
## ArrayCreationExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ArrayCreationExpressionDO;
```
## ArrayCreationExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ArrayCreationExpressionDO) -> bool;
```
## ArrayCreationExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ArrayCreationExpressionDO) -> <any>;
```
## ArrayCreationExpressionDO::key\_neq

```rust
pub fn key_neq(self: ArrayCreationExpressionDO, object: <any>) -> bool;
```
## ArrayCreationExpressionDO::key\_eq

```rust
pub fn key_eq(self: ArrayCreationExpressionDO, object: <any>) -> bool;
```
## ArrayCreationExpressionDO::to\_set

```rust
pub fn to_set(self: ArrayCreationExpressionDO) -> *ArrayCreationExpressionDO;
```
