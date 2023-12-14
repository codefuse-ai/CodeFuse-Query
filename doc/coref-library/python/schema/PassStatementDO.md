# PassStatementDO

Primary key: `element_oid: int`

```rust
schema PassStatementDO {
  @primary element_oid: int,
}
```
## PassStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *PassStatementDO;
```
## PassStatementDO::is\<T\>

```rust
pub fn is<T>(self: PassStatementDO) -> bool;
```
## PassStatementDO::to\<T\>

```rust
pub fn to<T>(self: PassStatementDO) -> <any>;
```
## PassStatementDO::key\_neq

```rust
pub fn key_neq(self: PassStatementDO, object: <any>) -> bool;
```
## PassStatementDO::key\_eq

```rust
pub fn key_eq(self: PassStatementDO, object: <any>) -> bool;
```
## PassStatementDO::to\_set

```rust
pub fn to_set(self: PassStatementDO) -> *PassStatementDO;
```
