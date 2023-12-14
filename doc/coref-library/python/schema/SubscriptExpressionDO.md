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

```java
/**
* @brief gets the slice oid of this element.
* @return int
*/
```
```rust
pub fn getSliceOid(self: SubscriptExpressionDO) -> int;
```
## SubscriptExpressionDO::getCtx

```java
/**
* @brief gets the ctx of this element.
* @return string
*/
```
```rust
pub fn getCtx(self: SubscriptExpressionDO) -> string;
```
## SubscriptExpressionDO::getValueOid

```java
/**
* @brief gets the value oid of this element.
* @return int
*/
```
```rust
pub fn getValueOid(self: SubscriptExpressionDO) -> int;
```
## SubscriptExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *SubscriptExpressionDO;
```
