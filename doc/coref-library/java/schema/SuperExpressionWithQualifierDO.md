# SuperExpressionWithQualifierDO

Primary key: `element_hash_id: int`

```rust
schema SuperExpressionWithQualifierDO {
  qualifier_hash_id: int,
  @primary element_hash_id: int,
}
```
## SuperExpressionWithQualifierDO::getQualifierHashId

```java
/**
* @brief gets the qualifier hash id of this element.
* @return int
*/
```
```rust
pub fn getQualifierHashId(self: SuperExpressionWithQualifierDO) -> int;
```
## SuperExpressionWithQualifierDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *SuperExpressionWithQualifierDO;
```
