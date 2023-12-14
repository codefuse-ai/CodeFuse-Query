# ThisAccessExpressionDO

Primary key: `element_hash_id: int`

```rust
schema ThisAccessExpressionDO {
  @primary element_hash_id: int,
}
```
## ThisAccessExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ThisAccessExpressionDO;
```
## ThisAccessExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ThisAccessExpressionDO) -> bool;
```
## ThisAccessExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ThisAccessExpressionDO) -> <any>;
```
## ThisAccessExpressionDO::key\_neq

```rust
pub fn key_neq(self: ThisAccessExpressionDO, object: <any>) -> bool;
```
## ThisAccessExpressionDO::key\_eq

```rust
pub fn key_eq(self: ThisAccessExpressionDO, object: <any>) -> bool;
```
## ThisAccessExpressionDO::to\_set

```rust
pub fn to_set(self: ThisAccessExpressionDO) -> *ThisAccessExpressionDO;
```
