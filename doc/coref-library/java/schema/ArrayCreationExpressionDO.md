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

```java
/**
* @brief gets the number of array dimension of this element.
* @return int
*/
```
```rust
pub fn getNumberOfArrayDimension(self: ArrayCreationExpressionDO) -> int;
```
## ArrayCreationExpressionDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: ArrayCreationExpressionDO) -> int;
```
## ArrayCreationExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ArrayCreationExpressionDO;
```
