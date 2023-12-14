# SuperAccessExpressionDO

Primary key: `element_hash_id: int`

```rust
schema SuperAccessExpressionDO {
  @primary element_hash_id: int,
}
```
## SuperAccessExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SuperAccessExpressionDO;
```
## SuperAccessExpressionDO::is\<T\>

```rust
pub fn is<T>(self: SuperAccessExpressionDO) -> bool;
```
## SuperAccessExpressionDO::to\<T\>

```rust
pub fn to<T>(self: SuperAccessExpressionDO) -> <any>;
```
## SuperAccessExpressionDO::key\_neq

```rust
pub fn key_neq(self: SuperAccessExpressionDO, object: <any>) -> bool;
```
## SuperAccessExpressionDO::key\_eq

```rust
pub fn key_eq(self: SuperAccessExpressionDO, object: <any>) -> bool;
```
## SuperAccessExpressionDO::to\_set

```rust
pub fn to_set(self: SuperAccessExpressionDO) -> *SuperAccessExpressionDO;
```
