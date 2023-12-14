# LambdaExpressionDO

Primary key: `element_hash_id: int`

```rust
schema LambdaExpressionDO {
  is_value_compatible: int,
  is_void_compatible: int,
  parameter_list_hash_id: int,
  body_hash_id: int,
  @primary element_hash_id: int,
}
```
## LambdaExpressionDO::getIsVoidCompatible

```rust
/**
     * @brief gets the is void compatible of this element.
     * @return int
     */
```
```rust
pub fn getIsVoidCompatible(self: LambdaExpressionDO) -> int;
```
## LambdaExpressionDO::getParameterListHashId

```rust
/**
     * @brief gets the parameter list hash id of this element.
     * @return int
     */
```
```rust
pub fn getParameterListHashId(self: LambdaExpressionDO) -> int;
```
## LambdaExpressionDO::getIsValueCompatible

```rust
/**
     * @brief gets the is value compatible of this element.
     * @return int
     */
```
```rust
pub fn getIsValueCompatible(self: LambdaExpressionDO) -> int;
```
## LambdaExpressionDO::getBodyHashId

```rust
/**
     * @brief gets the body hash id of this element.
     * @return int
     */
```
```rust
pub fn getBodyHashId(self: LambdaExpressionDO) -> int;
```
## LambdaExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LambdaExpressionDO;
```
## LambdaExpressionDO::is\<T\>

```rust
pub fn is<T>(self: LambdaExpressionDO) -> bool;
```
## LambdaExpressionDO::to\<T\>

```rust
pub fn to<T>(self: LambdaExpressionDO) -> <any>;
```
## LambdaExpressionDO::key\_neq

```rust
pub fn key_neq(self: LambdaExpressionDO, object: <any>) -> bool;
```
## LambdaExpressionDO::key\_eq

```rust
pub fn key_eq(self: LambdaExpressionDO, object: <any>) -> bool;
```
## LambdaExpressionDO::to\_set

```rust
pub fn to_set(self: LambdaExpressionDO) -> *LambdaExpressionDO;
```
