# ListExpressionDO

Primary key: `element_oid: int`

```rust
schema ListExpressionDO {
  ctx: string,
  elt_size: int,
  @primary element_oid: int,
}
```
## ListExpressionDO::getCtx

```rust
/**
     * @brief gets the ctx of this element.
     * @return string
     */
```
```rust
pub fn getCtx(self: ListExpressionDO) -> string;
```
## ListExpressionDO::getEltSize

```rust
/**
     * @brief gets the elt size of this element.
     * @return int
     */
```
```rust
pub fn getEltSize(self: ListExpressionDO) -> int;
```
## ListExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ListExpressionDO;
```
## ListExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ListExpressionDO) -> bool;
```
## ListExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ListExpressionDO) -> <any>;
```
## ListExpressionDO::key\_neq

```rust
pub fn key_neq(self: ListExpressionDO, object: <any>) -> bool;
```
## ListExpressionDO::key\_eq

```rust
pub fn key_eq(self: ListExpressionDO, object: <any>) -> bool;
```
## ListExpressionDO::to\_set

```rust
pub fn to_set(self: ListExpressionDO) -> *ListExpressionDO;
```
