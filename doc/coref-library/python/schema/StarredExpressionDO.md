# StarredExpressionDO

Primary key: `element_oid: int`

```rust
schema StarredExpressionDO {
  ctx: string,
  @primary element_oid: int,
}
```
## StarredExpressionDO::getCtx

```java
/**
* @brief gets the ctx of this element.
* @return string
*/
```
```rust
pub fn getCtx(self: StarredExpressionDO) -> string;
```
## StarredExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *StarredExpressionDO;
```
