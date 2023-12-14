# SetExpressionDO

Primary key: `element_oid: int`

```rust
schema SetExpressionDO {
  elt_size: int,
  @primary element_oid: int,
}
```
## SetExpressionDO::getEltSize

```rust
/**
     * @brief gets the elt size of this element.
     * @return int
     */
```
```rust
pub fn getEltSize(self: SetExpressionDO) -> int;
```
## SetExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *SetExpressionDO;
```
## SetExpressionDO::is\<T\>

```rust
pub fn is<T>(self: SetExpressionDO) -> bool;
```
## SetExpressionDO::to\<T\>

```rust
pub fn to<T>(self: SetExpressionDO) -> <any>;
```
## SetExpressionDO::key\_neq

```rust
pub fn key_neq(self: SetExpressionDO, object: <any>) -> bool;
```
## SetExpressionDO::key\_eq

```rust
pub fn key_eq(self: SetExpressionDO, object: <any>) -> bool;
```
## SetExpressionDO::to\_set

```rust
pub fn to_set(self: SetExpressionDO) -> *SetExpressionDO;
```
