# MethodReferenceExpressionDO

Primary key: `element_hash_id: int`

```rust
schema MethodReferenceExpressionDO {
  is_constructor: int,
  @primary element_hash_id: int
}
```
## MethodReferenceExpressionDO::isConstructor

```java
/**
* @brief gets the is constructor of this element.
* @return int
*/
```
```rust
pub fn isConstructor(self: MethodReferenceExpressionDO) -> int;
```
## MethodReferenceExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *MethodReferenceExpressionDO;
```
