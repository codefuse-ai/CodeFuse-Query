# LambdaExpressionDO

Primary key: `element_oid: int`

```rust
schema LambdaExpressionDO {
  @primary element_oid: int,
}
```
## LambdaExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *LambdaExpressionDO;
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
