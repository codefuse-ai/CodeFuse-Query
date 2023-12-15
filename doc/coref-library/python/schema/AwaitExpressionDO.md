# AwaitExpressionDO

Primary key: `element_oid: int`

```rust
schema AwaitExpressionDO {
  expr_value_oid: int,
  @primary element_oid: int
}
```
## AwaitExpressionDO::getExprValueOid

```java
/**
* @brief gets the expr value oid of this element.
* @return int
*/
```
```rust
pub fn getExprValueOid(self: AwaitExpressionDO) -> int;
```
## AwaitExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AwaitExpressionDO;
```
