# YieldExpressionDO

Primary key: `element_oid: int`

```rust
schema YieldExpressionDO {
  @primary element_oid: int,
}
```
## YieldExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *YieldExpressionDO;
```
## YieldExpressionDO::is\<T\>

```rust
pub fn is<T>(self: YieldExpressionDO) -> bool;
```
## YieldExpressionDO::to\<T\>

```rust
pub fn to<T>(self: YieldExpressionDO) -> <any>;
```
## YieldExpressionDO::key\_neq

```rust
pub fn key_neq(self: YieldExpressionDO, object: <any>) -> bool;
```
## YieldExpressionDO::key\_eq

```rust
pub fn key_eq(self: YieldExpressionDO, object: <any>) -> bool;
```
## YieldExpressionDO::to\_set

```rust
pub fn to_set(self: YieldExpressionDO) -> *YieldExpressionDO;
```
