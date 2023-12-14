# SubscriptExpressionDO

Primary key: `element_oid: int`

```rust
schema SubscriptExpressionDO {
  ctx: string,
  slice_oid: int,
  value_oid: int,
  @primary element_oid: int,
}
```
## SubscriptExpressionDO::getSliceOid

```rust
/**
     * @brief gets the slice oid of this element.
     * @return int
     */
```
```rust
pub fn getSliceOid(self: SubscriptExpressionDO) -> int;
```
## SubscriptExpressionDO::getCtx

```rust
/**
     * @brief gets the ctx of this element.
     * @return string
     */
```
```rust
pub fn getCtx(self: SubscriptExpressionDO) -> string;
```
## SubscriptExpressionDO::getValueOid

```rust
/**
     * @brief gets the value oid of this element.
     * @return int
     */
```
```rust
pub fn getValueOid(self: SubscriptExpressionDO) -> int;
```
## SubscriptExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *SubscriptExpressionDO;
```
## SubscriptExpressionDO::is\<T\>

```rust
pub fn is<T>(self: SubscriptExpressionDO) -> bool;
```
## SubscriptExpressionDO::to\<T\>

```rust
pub fn to<T>(self: SubscriptExpressionDO) -> <any>;
```
## SubscriptExpressionDO::key\_neq

```rust
pub fn key_neq(self: SubscriptExpressionDO, object: <any>) -> bool;
```
## SubscriptExpressionDO::key\_eq

```rust
pub fn key_eq(self: SubscriptExpressionDO, object: <any>) -> bool;
```
## SubscriptExpressionDO::to\_set

```rust
pub fn to_set(self: SubscriptExpressionDO) -> *SubscriptExpressionDO;
```
