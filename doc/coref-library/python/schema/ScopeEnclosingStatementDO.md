# ScopeEnclosingStatementDO

Primary key: `statement_oid: int`

```rust
schema ScopeEnclosingStatementDO {
  scope_oid: int,
  @primary statement_oid: int
}
```
## ScopeEnclosingStatementDO::getScopeOid

```java
/**
* @brief gets the scope oid of this element.
* @return int
*/
```
```rust
pub fn getScopeOid(self: ScopeEnclosingStatementDO) -> int;
```
## ScopeEnclosingStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ScopeEnclosingStatementDO;
```
