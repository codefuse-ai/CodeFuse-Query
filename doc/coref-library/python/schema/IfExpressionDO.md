# IfExpressionDO

Primary key: `element_oid: int`

```rust
schema IfExpressionDO {
  @primary element_oid: int,
}
```
## IfExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *IfExpressionDO;
```
## IfExpressionDO::is\<T\>

```rust
pub fn is<T>(self: IfExpressionDO) -> bool;
```
## IfExpressionDO::to\<T\>

```rust
pub fn to<T>(self: IfExpressionDO) -> <any>;
```
## IfExpressionDO::key\_neq

```rust
pub fn key_neq(self: IfExpressionDO, object: <any>) -> bool;
```
## IfExpressionDO::key\_eq

```rust
pub fn key_eq(self: IfExpressionDO, object: <any>) -> bool;
```
## IfExpressionDO::to\_set

```rust
pub fn to_set(self: IfExpressionDO) -> *IfExpressionDO;
```
