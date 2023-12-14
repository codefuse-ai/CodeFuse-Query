# TryStatementDO

Primary key: `element_oid: int`

```rust
schema TryStatementDO {
  @primary element_oid: int,
}
```
## TryStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *TryStatementDO;
```
## TryStatementDO::is\<T\>

```rust
pub fn is<T>(self: TryStatementDO) -> bool;
```
## TryStatementDO::to\<T\>

```rust
pub fn to<T>(self: TryStatementDO) -> <any>;
```
## TryStatementDO::key\_neq

```rust
pub fn key_neq(self: TryStatementDO, object: <any>) -> bool;
```
## TryStatementDO::key\_eq

```rust
pub fn key_eq(self: TryStatementDO, object: <any>) -> bool;
```
## TryStatementDO::to\_set

```rust
pub fn to_set(self: TryStatementDO) -> *TryStatementDO;
```
