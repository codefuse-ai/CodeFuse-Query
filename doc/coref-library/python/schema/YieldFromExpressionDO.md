# YieldFromExpressionDO

Primary key: `element_oid: int`

```rust
schema YieldFromExpressionDO {
  value: int,
  @primary element_oid: int,
}
```
## YieldFromExpressionDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return int
     */
```
```rust
pub fn getValue(self: YieldFromExpressionDO) -> int;
```
## YieldFromExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *YieldFromExpressionDO;
```
## YieldFromExpressionDO::is\<T\>

```rust
pub fn is<T>(self: YieldFromExpressionDO) -> bool;
```
## YieldFromExpressionDO::to\<T\>

```rust
pub fn to<T>(self: YieldFromExpressionDO) -> <any>;
```
## YieldFromExpressionDO::key\_neq

```rust
pub fn key_neq(self: YieldFromExpressionDO, object: <any>) -> bool;
```
## YieldFromExpressionDO::key\_eq

```rust
pub fn key_eq(self: YieldFromExpressionDO, object: <any>) -> bool;
```
## YieldFromExpressionDO::to\_set

```rust
pub fn to_set(self: YieldFromExpressionDO) -> *YieldFromExpressionDO;
```
