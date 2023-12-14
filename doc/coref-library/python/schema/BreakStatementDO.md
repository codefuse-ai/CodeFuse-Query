# BreakStatementDO

Primary key: `element_oid: int`

```rust
schema BreakStatementDO {
  @primary element_oid: int,
}
```
## BreakStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *BreakStatementDO;
```
## BreakStatementDO::is\<T\>

```rust
pub fn is<T>(self: BreakStatementDO) -> bool;
```
## BreakStatementDO::to\<T\>

```rust
pub fn to<T>(self: BreakStatementDO) -> <any>;
```
## BreakStatementDO::key\_neq

```rust
pub fn key_neq(self: BreakStatementDO, object: <any>) -> bool;
```
## BreakStatementDO::key\_eq

```rust
pub fn key_eq(self: BreakStatementDO, object: <any>) -> bool;
```
## BreakStatementDO::to\_set

```rust
pub fn to_set(self: BreakStatementDO) -> *BreakStatementDO;
```
