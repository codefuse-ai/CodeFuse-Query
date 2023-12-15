# CallExpressionDO

Primary key: `element_oid: int`

```rust
schema CallExpressionDO {
  expr_func_oid: int,
  @primary element_oid: int
}
```
## CallExpressionDO::getExprFuncOid

```java
/**
* @brief gets the expr func oid of this element.
* @return int
*/
```
```rust
pub fn getExprFuncOid(self: CallExpressionDO) -> int;
```
## CallExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *CallExpressionDO;
```
