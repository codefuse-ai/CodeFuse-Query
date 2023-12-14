# MethodAccessExpressionWithoutTypeDO

Primary key: `element_hash_id: int`

```rust
schema MethodAccessExpressionWithoutTypeDO {
  argument_list_hash_id: int,
  referen_method_hash_id: int,
  @primary element_hash_id: int,
}
```
## MethodAccessExpressionWithoutTypeDO::getArgumentListHashId

```java
/**
* @brief gets the argument list hash id of this element.
* @return int
*/
```
```rust
pub fn getArgumentListHashId(self: MethodAccessExpressionWithoutTypeDO) -> int;
```
## MethodAccessExpressionWithoutTypeDO::getReferenMethodHashId

```java
/**
* @brief gets the referen method hash id of this element.
* @return int
*/
```
```rust
pub fn getReferenMethodHashId(self: MethodAccessExpressionWithoutTypeDO) -> int;
```
## MethodAccessExpressionWithoutTypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *MethodAccessExpressionWithoutTypeDO;
```
