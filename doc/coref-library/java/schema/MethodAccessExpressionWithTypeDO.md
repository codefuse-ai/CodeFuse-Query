# MethodAccessExpressionWithTypeDO

Primary key: `element_hash_id: int`

```rust
schema MethodAccessExpressionWithTypeDO {
  argument_list_hash_id: int,
  referen_method_hash_id: int,
  type_hash_id: int,
  @primary element_hash_id: int
}
```
## MethodAccessExpressionWithTypeDO::getArgumentListHashId

```java
/**
* @brief gets the argument list hash id of this element.
* @return int
*/
```
```rust
pub fn getArgumentListHashId(self: MethodAccessExpressionWithTypeDO) -> int;
```
## MethodAccessExpressionWithTypeDO::getReferenMethodHashId

```java
/**
* @brief gets the referen method hash id of this element.
* @return int
*/
```
```rust
pub fn getReferenMethodHashId(self: MethodAccessExpressionWithTypeDO) -> int;
```
## MethodAccessExpressionWithTypeDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: MethodAccessExpressionWithTypeDO) -> int;
```
## MethodAccessExpressionWithTypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *MethodAccessExpressionWithTypeDO;
```
