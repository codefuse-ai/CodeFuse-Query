# ThisExpressionWithQualifierDO

Primary key: `element_hash_id: int`

```rust
schema ThisExpressionWithQualifierDO {
  qualifier_hash_id: int,
  @primary element_hash_id: int,
}
```
## ThisExpressionWithQualifierDO::getQualifierHashId

```java
/**
* @brief gets the qualifier hash id of this element.
* @return int
*/
```
```rust
pub fn getQualifierHashId(self: ThisExpressionWithQualifierDO) -> int;
```
## ThisExpressionWithQualifierDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ThisExpressionWithQualifierDO;
```
