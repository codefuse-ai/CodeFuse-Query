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

```java
/**
* @brief gets the ctx of this element.
* @return string
*/
```
```rust
pub fn getCtx(self: TupleExpressionDO) -> string;
```
## TupleExpressionDO::getEltSize

```java
/**
* @brief gets the elt size of this element.
* @return int
*/
```
```rust
pub fn getEltSize(self: TupleExpressionDO) -> int;
```
## TupleExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *TupleExpressionDO;
```
