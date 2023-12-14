# IfStatementDO

Primary key: `element_oid: int`

```rust
schema IfStatementDO {
  @primary element_oid: int,
}
```
## IfStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *IfStatementDO;
```
## IfStatementDO::is\<T\>

```rust
pub fn is<T>(self: IfStatementDO) -> bool;
```
## IfStatementDO::to\<T\>

```rust
pub fn to<T>(self: IfStatementDO) -> <any>;
```
## IfStatementDO::key\_neq

```rust
pub fn key_neq(self: IfStatementDO, object: <any>) -> bool;
```
## IfStatementDO::key\_eq

```rust
pub fn key_eq(self: IfStatementDO, object: <any>) -> bool;
```
## IfStatementDO::to\_set

```rust
pub fn to_set(self: IfStatementDO) -> *IfStatementDO;
```
