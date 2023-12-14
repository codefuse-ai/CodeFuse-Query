# ContinueStatementDO

Primary key: `element_oid: int`

```rust
schema ContinueStatementDO {
  @primary element_oid: int,
}
```
## ContinueStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ContinueStatementDO;
```
## ContinueStatementDO::is\<T\>

```rust
pub fn is<T>(self: ContinueStatementDO) -> bool;
```
## ContinueStatementDO::to\<T\>

```rust
pub fn to<T>(self: ContinueStatementDO) -> <any>;
```
## ContinueStatementDO::key\_neq

```rust
pub fn key_neq(self: ContinueStatementDO, object: <any>) -> bool;
```
## ContinueStatementDO::key\_eq

```rust
pub fn key_eq(self: ContinueStatementDO, object: <any>) -> bool;
```
## ContinueStatementDO::to\_set

```rust
pub fn to_set(self: ContinueStatementDO) -> *ContinueStatementDO;
```
