# MethodReferenceExpressionDO

Primary key: `element_hash_id: int`

```rust
schema MethodReferenceExpressionDO {
  is_constructor: int,
  @primary element_hash_id: int,
}
```
## MethodReferenceExpressionDO::isConstructor

```rust
/**
     * @brief gets the is constructor of this element.
     * @return int
     */
```
```rust
pub fn isConstructor(self: MethodReferenceExpressionDO) -> int;
```
## MethodReferenceExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *MethodReferenceExpressionDO;
```
## MethodReferenceExpressionDO::is\<T\>

```rust
pub fn is<T>(self: MethodReferenceExpressionDO) -> bool;
```
## MethodReferenceExpressionDO::to\<T\>

```rust
pub fn to<T>(self: MethodReferenceExpressionDO) -> <any>;
```
## MethodReferenceExpressionDO::key\_neq

```rust
pub fn key_neq(self: MethodReferenceExpressionDO, object: <any>) -> bool;
```
## MethodReferenceExpressionDO::key\_eq

```rust
pub fn key_eq(self: MethodReferenceExpressionDO, object: <any>) -> bool;
```
## MethodReferenceExpressionDO::to\_set

```rust
pub fn to_set(self: MethodReferenceExpressionDO) -> *MethodReferenceExpressionDO;
```
