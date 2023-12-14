# DictExpressionDO

Primary key: `element_oid: int`

```rust
schema DictExpressionDO {
  size: int,
  @primary element_oid: int,
}
```
## DictExpressionDO::getSize

```rust
/**
     * @brief gets the size of this element.
     * @return int
     */
```
```rust
pub fn getSize(self: DictExpressionDO) -> int;
```
## DictExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *DictExpressionDO;
```
## DictExpressionDO::is\<T\>

```rust
pub fn is<T>(self: DictExpressionDO) -> bool;
```
## DictExpressionDO::to\<T\>

```rust
pub fn to<T>(self: DictExpressionDO) -> <any>;
```
## DictExpressionDO::key\_neq

```rust
pub fn key_neq(self: DictExpressionDO, object: <any>) -> bool;
```
## DictExpressionDO::key\_eq

```rust
pub fn key_eq(self: DictExpressionDO, object: <any>) -> bool;
```
## DictExpressionDO::to\_set

```rust
pub fn to_set(self: DictExpressionDO) -> *DictExpressionDO;
```
