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

```java
/**
* @brief gets the ctx of this element.
* @return string
*/
```
```rust
pub fn getCtx(self: ListExpressionDO) -> string;
```
## ListExpressionDO::getEltSize

```java
/**
* @brief gets the elt size of this element.
* @return int
*/
```
```rust
pub fn getEltSize(self: ListExpressionDO) -> int;
```
## ListExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ListExpressionDO;
```
