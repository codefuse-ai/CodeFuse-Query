# NameExpressionDO

Primary key: `element_oid: int`

```rust
schema NameExpressionDO {
  ctx_type: string,
  @primary element_oid: int,
}
```
## NameExpressionDO::getCtxType

```rust
/**
     * @brief gets the ctx type of this element.
     * @return string
     */
```
```rust
pub fn getCtxType(self: NameExpressionDO) -> string;
```
## NameExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *NameExpressionDO;
```
## NameExpressionDO::is\<T\>

```rust
pub fn is<T>(self: NameExpressionDO) -> bool;
```
## NameExpressionDO::to\<T\>

```rust
pub fn to<T>(self: NameExpressionDO) -> <any>;
```
## NameExpressionDO::key\_neq

```rust
pub fn key_neq(self: NameExpressionDO, object: <any>) -> bool;
```
## NameExpressionDO::key\_eq

```rust
pub fn key_eq(self: NameExpressionDO, object: <any>) -> bool;
```
## NameExpressionDO::to\_set

```rust
pub fn to_set(self: NameExpressionDO) -> *NameExpressionDO;
```
