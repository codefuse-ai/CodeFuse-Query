# ArrayAccessExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ArrayAccessExpressionDO {
  array_expression_hash_id: int,
  index_expression_hash_id: int,
  @primary element_hash_id: int
}
```
## ArrayAccessExpressionDO::getIndexExpressionHashId

```java
/**
* @brief gets the index expression hash id of this element.
* @return int
*/
```
```rust
pub fn getIndexExpressionHashId(self: ArrayAccessExpressionDO) -> int;
```
## ArrayAccessExpressionDO::getArrayExpressionHashId

```java
/**
* @brief gets the array expression hash id of this element.
* @return int
*/
```
```rust
pub fn getArrayExpressionHashId(self: ArrayAccessExpressionDO) -> int;
```
## ArrayAccessExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ArrayAccessExpressionDO;
```
