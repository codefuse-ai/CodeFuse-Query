# ScopeEnclosingStatementDO

Primary key: `statement_oid: int`

```rust
schema ScopeEnclosingStatementDO {
  scope_oid: int,
  @primary statement_oid: int,
}
```
## ScopeEnclosingStatementDO::getScopeOid

```rust
/**
     * @brief gets the scope oid of this element.
     * @return int
     */
```
```rust
pub fn getScopeOid(self: ScopeEnclosingStatementDO) -> int;
```
## ScopeEnclosingStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ScopeEnclosingStatementDO;
```
## ScopeEnclosingStatementDO::is\<T\>

```rust
pub fn is<T>(self: ScopeEnclosingStatementDO) -> bool;
```
## ScopeEnclosingStatementDO::to\<T\>

```rust
pub fn to<T>(self: ScopeEnclosingStatementDO) -> <any>;
```
## ScopeEnclosingStatementDO::key\_neq

```rust
pub fn key_neq(self: ScopeEnclosingStatementDO, object: <any>) -> bool;
```
## ScopeEnclosingStatementDO::key\_eq

```rust
pub fn key_eq(self: ScopeEnclosingStatementDO, object: <any>) -> bool;
```
## ScopeEnclosingStatementDO::to\_set

```rust
pub fn to_set(self: ScopeEnclosingStatementDO) -> *ScopeEnclosingStatementDO;
```
