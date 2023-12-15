# ConstructorInvocationDO

Primary key: `element_hash_id: int`

```rust
schema ConstructorInvocationDO {
  class_reference_hash_id: int,
  @primary element_hash_id: int
}
```
## ConstructorInvocationDO::getClassReferenceHashId

```java
/**
* @brief gets the class reference hash id of this element.
* @return int
*/
```
```rust
pub fn getClassReferenceHashId(self: ConstructorInvocationDO) -> int;
```
## ConstructorInvocationDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ConstructorInvocationDO;
```
