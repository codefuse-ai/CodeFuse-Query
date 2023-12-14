# CallExpressionDO

Primary key: `element_oid: int`

```rust
schema CallExpressionDO {
  expr_func_oid: int,
  @primary element_oid: int,
}
```
## CallExpressionDO::getExprFuncOid

```rust
/**
     * @brief gets the expr func oid of this element.
     * @return int
     */
```
```rust
pub fn getExprFuncOid(self: CallExpressionDO) -> int;
```
## CallExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *CallExpressionDO;
```
## CallExpressionDO::is\<T\>

```rust
pub fn is<T>(self: CallExpressionDO) -> bool;
```
## CallExpressionDO::to\<T\>

```rust
pub fn to<T>(self: CallExpressionDO) -> <any>;
```
## CallExpressionDO::key\_neq

```rust
pub fn key_neq(self: CallExpressionDO, object: <any>) -> bool;
```
## CallExpressionDO::key\_eq

```rust
pub fn key_eq(self: CallExpressionDO, object: <any>) -> bool;
```
## CallExpressionDO::to\_set

```rust
pub fn to_set(self: CallExpressionDO) -> *CallExpressionDO;
```
