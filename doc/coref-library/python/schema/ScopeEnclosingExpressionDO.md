# ScopeEnclosingExpressionDO

Primary key: `expression_oid: int`

```rust
schema ScopeEnclosingExpressionDO {
  scope_oid: int,
  @primary expression_oid: int
}
```
## ScopeEnclosingExpressionDO::getScopeOid

```java
/**
* @brief gets the scope oid of this element.
* @return int
*/
```
```rust
pub fn getScopeOid(self: ScopeEnclosingExpressionDO) -> int;
```
## ScopeEnclosingExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ScopeEnclosingExpressionDO;
```
