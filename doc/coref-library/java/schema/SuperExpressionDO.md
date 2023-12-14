# SuperExpressionDO

Primary key: `element_hash_id: int`

```rust
schema SuperExpressionDO {
  @primary element_hash_id: int,
}
```
## SuperExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SuperExpressionDO;
```
## SuperExpressionDO::is\<T\>

```rust
pub fn is<T>(self: SuperExpressionDO) -> bool;
```
## SuperExpressionDO::to\<T\>

```rust
pub fn to<T>(self: SuperExpressionDO) -> <any>;
```
## SuperExpressionDO::key\_neq

```rust
pub fn key_neq(self: SuperExpressionDO, object: <any>) -> bool;
```
## SuperExpressionDO::key\_eq

```rust
pub fn key_eq(self: SuperExpressionDO, object: <any>) -> bool;
```
## SuperExpressionDO::to\_set

```rust
pub fn to_set(self: SuperExpressionDO) -> *SuperExpressionDO;
```
