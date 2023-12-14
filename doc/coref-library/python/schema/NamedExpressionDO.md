# NamedExpressionDO

Primary key: `element_oid: int`

```rust
schema NamedExpressionDO {
  value_oid: int,
  target_oid: int,
  @primary element_oid: int,
}
```
## NamedExpressionDO::getValueOid

```rust
/**
     * @brief gets the value oid of this element.
     * @return int
     */
```
```rust
pub fn getValueOid(self: NamedExpressionDO) -> int;
```
## NamedExpressionDO::getTargetOid

```rust
/**
     * @brief gets the target oid of this element.
     * @return int
     */
```
```rust
pub fn getTargetOid(self: NamedExpressionDO) -> int;
```
## NamedExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *NamedExpressionDO;
```
## NamedExpressionDO::is\<T\>

```rust
pub fn is<T>(self: NamedExpressionDO) -> bool;
```
## NamedExpressionDO::to\<T\>

```rust
pub fn to<T>(self: NamedExpressionDO) -> <any>;
```
## NamedExpressionDO::key\_neq

```rust
pub fn key_neq(self: NamedExpressionDO, object: <any>) -> bool;
```
## NamedExpressionDO::key\_eq

```rust
pub fn key_eq(self: NamedExpressionDO, object: <any>) -> bool;
```
## NamedExpressionDO::to\_set

```rust
pub fn to_set(self: NamedExpressionDO) -> *NamedExpressionDO;
```
