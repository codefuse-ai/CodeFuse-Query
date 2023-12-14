# ReferenceExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ReferenceExpressionDO {
  @primary element_hash_id: int,
}
```
## ReferenceExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ReferenceExpressionDO;
```
## ReferenceExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ReferenceExpressionDO) -> bool;
```
## ReferenceExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ReferenceExpressionDO) -> <any>;
```
## ReferenceExpressionDO::key\_neq

```rust
pub fn key_neq(self: ReferenceExpressionDO, object: <any>) -> bool;
```
## ReferenceExpressionDO::key\_eq

```rust
pub fn key_eq(self: ReferenceExpressionDO, object: <any>) -> bool;
```
## ReferenceExpressionDO::to\_set

```rust
pub fn to_set(self: ReferenceExpressionDO) -> *ReferenceExpressionDO;
```
