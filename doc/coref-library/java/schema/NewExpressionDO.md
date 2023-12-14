# NewExpressionDO

Primary key: `element_hash_id: int`

```rust
schema NewExpressionDO {
  type_hash_id: int,
  reference_hash_id: int,
  @primary element_hash_id: int,
}
```
## NewExpressionDO::getReferenceHashId

```java
/**
* @brief gets the reference hash id of this element.
* @return int
*/
```
```rust
pub fn getReferenceHashId(self: NewExpressionDO) -> int;
```
## NewExpressionDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: NewExpressionDO) -> int;
```
## NewExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NewExpressionDO;
```
