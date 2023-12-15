# ArrayInitializerExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ArrayInitializerExpressionDO {
  type_hash_id: int,
  @primary element_hash_id: int
}
```
## ArrayInitializerExpressionDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: ArrayInitializerExpressionDO) -> int;
```
## ArrayInitializerExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ArrayInitializerExpressionDO;
```
