# ScopeEnclosingExpressionDO

Primary key: `expression_oid: int`

```rust
schema ScopeEnclosingExpressionDO {
  scope_oid: int,
  @primary expression_oid: int,
}
```
## ScopeEnclosingExpressionDO::getScopeOid

```rust
/**
     * @brief gets the scope oid of this element.
     * @return int
     */
```
```rust
pub fn getScopeOid(self: ScopeEnclosingExpressionDO) -> int;
```
## ScopeEnclosingExpressionDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ScopeEnclosingExpressionDO;
```
## ScopeEnclosingExpressionDO::is\<T\>

```rust
pub fn is<T>(self: ScopeEnclosingExpressionDO) -> bool;
```
## ScopeEnclosingExpressionDO::to\<T\>

```rust
pub fn to<T>(self: ScopeEnclosingExpressionDO) -> <any>;
```
## ScopeEnclosingExpressionDO::key\_neq

```rust
pub fn key_neq(self: ScopeEnclosingExpressionDO, object: <any>) -> bool;
```
## ScopeEnclosingExpressionDO::key\_eq

```rust
pub fn key_eq(self: ScopeEnclosingExpressionDO, object: <any>) -> bool;
```
## ScopeEnclosingExpressionDO::to\_set

```rust
pub fn to_set(self: ScopeEnclosingExpressionDO) -> *ScopeEnclosingExpressionDO;
```
