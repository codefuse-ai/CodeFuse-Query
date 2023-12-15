# NameExpressionDO

Primary key: `element_oid: int`

```rust
schema NameExpressionDO {
  ctx_type: string,
  @primary element_oid: int
}
```
## NameExpressionDO::getCtxType

```java
/**
* @brief gets the ctx type of this element.
* @return string
*/
```
```rust
pub fn getCtxType(self: NameExpressionDO) -> string;
```
## NameExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *NameExpressionDO;
```
