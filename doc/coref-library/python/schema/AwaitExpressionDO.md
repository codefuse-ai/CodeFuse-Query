# AwaitExpressionDO

Primary key: `element_oid: int`

```rust
schema AwaitExpressionDO {
  expr_value_oid: int,
  @primary element_oid: int,
}
```
## AwaitExpressionDO::getExprValueOid

```rust
/**
     * @brief gets the expr value oid of this element.
     * @return int
     */
```
```rust
pub fn getExprValueOid(self: AwaitExpressionDO) -> int;
```
## AwaitExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AwaitExpressionDO;
```
## AwaitExpressionDO::is\<T\>

```rust
pub fn is<T>(self: AwaitExpressionDO) -> bool;
```
## AwaitExpressionDO::to\<T\>

```rust
pub fn to<T>(self: AwaitExpressionDO) -> <any>;
```
## AwaitExpressionDO::key\_neq

```rust
pub fn key_neq(self: AwaitExpressionDO, object: <any>) -> bool;
```
## AwaitExpressionDO::key\_eq

```rust
pub fn key_eq(self: AwaitExpressionDO, object: <any>) -> bool;
```
## AwaitExpressionDO::to\_set

```rust
pub fn to_set(self: AwaitExpressionDO) -> *AwaitExpressionDO;
```
