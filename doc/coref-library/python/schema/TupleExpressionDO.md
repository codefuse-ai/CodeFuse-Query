# TupleExpressionDO

Primary key: `element_oid: int`

```rust
schema TupleExpressionDO {
  ctx: string,
  elt_size: int,
  @primary element_oid: int,
}
```
## TupleExpressionDO::getCtx

```rust
/**
     * @brief gets the ctx of this element.
     * @return string
     */
```
```rust
pub fn getCtx(self: TupleExpressionDO) -> string;
```
## TupleExpressionDO::getEltSize

```rust
/**
     * @brief gets the elt size of this element.
     * @return int
     */
```
```rust
pub fn getEltSize(self: TupleExpressionDO) -> int;
```
## TupleExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *TupleExpressionDO;
```
## TupleExpressionDO::is\<T\>

```rust
pub fn is<T>(self: TupleExpressionDO) -> bool;
```
## TupleExpressionDO::to\<T\>

```rust
pub fn to<T>(self: TupleExpressionDO) -> <any>;
```
## TupleExpressionDO::key\_neq

```rust
pub fn key_neq(self: TupleExpressionDO, object: <any>) -> bool;
```
## TupleExpressionDO::key\_eq

```rust
pub fn key_eq(self: TupleExpressionDO, object: <any>) -> bool;
```
## TupleExpressionDO::to\_set

```rust
pub fn to_set(self: TupleExpressionDO) -> *TupleExpressionDO;
```
