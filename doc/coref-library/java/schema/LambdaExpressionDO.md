# LambdaExpressionDO

Primary key: `element_hash_id: int`

```rust
schema LambdaExpressionDO {
  is_value_compatible: int,
  is_void_compatible: int,
  parameter_list_hash_id: int,
  body_hash_id: int,
  @primary element_hash_id: int
}
```
## LambdaExpressionDO::getIsVoidCompatible

```java
/**
* @brief gets the is void compatible of this element.
* @return int
*/
```
```rust
pub fn getIsVoidCompatible(self: LambdaExpressionDO) -> int;
```
## LambdaExpressionDO::getParameterListHashId

```java
/**
* @brief gets the parameter list hash id of this element.
* @return int
*/
```
```rust
pub fn getParameterListHashId(self: LambdaExpressionDO) -> int;
```
## LambdaExpressionDO::getIsValueCompatible

```java
/**
* @brief gets the is value compatible of this element.
* @return int
*/
```
```rust
pub fn getIsValueCompatible(self: LambdaExpressionDO) -> int;
```
## LambdaExpressionDO::getBodyHashId

```java
/**
* @brief gets the body hash id of this element.
* @return int
*/
```
```rust
pub fn getBodyHashId(self: LambdaExpressionDO) -> int;
```
## LambdaExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LambdaExpressionDO;
```
