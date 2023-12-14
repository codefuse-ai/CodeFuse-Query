# MethodAccessExpressionWithTypeDO

Primary key: `element_hash_id: int`

```rust
schema MethodAccessExpressionWithTypeDO {
  argument_list_hash_id: int,
  referen_method_hash_id: int,
  type_hash_id: int,
  @primary element_hash_id: int,
}
```
## MethodAccessExpressionWithTypeDO::getArgumentListHashId

```rust
/**
     * @brief gets the argument list hash id of this element.
     * @return int
     */
```
```rust
pub fn getArgumentListHashId(self: MethodAccessExpressionWithTypeDO) -> int;
```
## MethodAccessExpressionWithTypeDO::getReferenMethodHashId

```rust
/**
     * @brief gets the referen method hash id of this element.
     * @return int
     */
```
```rust
pub fn getReferenMethodHashId(self: MethodAccessExpressionWithTypeDO) -> int;
```
## MethodAccessExpressionWithTypeDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: MethodAccessExpressionWithTypeDO) -> int;
```
## MethodAccessExpressionWithTypeDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *MethodAccessExpressionWithTypeDO;
```
## MethodAccessExpressionWithTypeDO::is\<T\>

```rust
pub fn is<T>(self: MethodAccessExpressionWithTypeDO) -> bool;
```
## MethodAccessExpressionWithTypeDO::to\<T\>

```rust
pub fn to<T>(self: MethodAccessExpressionWithTypeDO) -> <any>;
```
## MethodAccessExpressionWithTypeDO::key\_neq

```rust
pub fn key_neq(self: MethodAccessExpressionWithTypeDO, object: <any>) -> bool;
```
## MethodAccessExpressionWithTypeDO::key\_eq

```rust
pub fn key_eq(self: MethodAccessExpressionWithTypeDO, object: <any>) -> bool;
```
## MethodAccessExpressionWithTypeDO::to\_set

```rust
pub fn to_set(self: MethodAccessExpressionWithTypeDO) -> *MethodAccessExpressionWithTypeDO;
```
