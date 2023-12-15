# CompareExpressionDO

Primary key: `element_oid: int`

```rust
schema CompareExpressionDO {
  left_expr_oid: int,
  @primary element_oid: int
}
```
## CompareExpressionDO::getLeftExprOid

```java
/**
* @brief gets the left expr oid of this element.
* @return int
*/
```
```rust
pub fn getLeftExprOid(self: CompareExpressionDO) -> int;
```
## CompareExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *CompareExpressionDO;
```
