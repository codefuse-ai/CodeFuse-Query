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

```rust
/**
     * @brief gets the argument list hash id of this element.
     * @return int
     */
```
```rust
pub fn getArgumentListHashId(self: MethodAccessExpressionWithoutTypeDO) -> int;
```
## MethodAccessExpressionWithoutTypeDO::getReferenMethodHashId

```rust
/**
     * @brief gets the referen method hash id of this element.
     * @return int
     */
```
```rust
pub fn getReferenMethodHashId(self: MethodAccessExpressionWithoutTypeDO) -> int;
```
## MethodAccessExpressionWithoutTypeDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *MethodAccessExpressionWithoutTypeDO;
```
## MethodAccessExpressionWithoutTypeDO::is\<T\>

```rust
pub fn is<T>(self: MethodAccessExpressionWithoutTypeDO) -> bool;
```
## MethodAccessExpressionWithoutTypeDO::to\<T\>

```rust
pub fn to<T>(self: MethodAccessExpressionWithoutTypeDO) -> <any>;
```
## MethodAccessExpressionWithoutTypeDO::key\_neq

```rust
pub fn key_neq(self: MethodAccessExpressionWithoutTypeDO, object: <any>) -> bool;
```
## MethodAccessExpressionWithoutTypeDO::key\_eq

```rust
pub fn key_eq(self: MethodAccessExpressionWithoutTypeDO, object: <any>) -> bool;
```
## MethodAccessExpressionWithoutTypeDO::to\_set

```rust
pub fn to_set(self: MethodAccessExpressionWithoutTypeDO) -> *MethodAccessExpressionWithoutTypeDO;
```
