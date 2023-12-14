# RaiseStatementDO

Primary key: `element_oid: int`

```rust
schema RaiseStatementDO {
  @primary element_oid: int,
}
```
## RaiseStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *RaiseStatementDO;
```
## RaiseStatementDO::is\<T\>

```rust
pub fn is<T>(self: RaiseStatementDO) -> bool;
```
## RaiseStatementDO::to\<T\>

```rust
pub fn to<T>(self: RaiseStatementDO) -> <any>;
```
## RaiseStatementDO::key\_neq

```rust
pub fn key_neq(self: RaiseStatementDO, object: <any>) -> bool;
```
## RaiseStatementDO::key\_eq

```rust
pub fn key_eq(self: RaiseStatementDO, object: <any>) -> bool;
```
## RaiseStatementDO::to\_set

```rust
pub fn to_set(self: RaiseStatementDO) -> *RaiseStatementDO;
```
