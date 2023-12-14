# ImportStatementDO

Primary key: `element_oid: int`

```rust
schema ImportStatementDO {
  @primary element_oid: int,
}
```
## ImportStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ImportStatementDO;
```
## ImportStatementDO::is\<T\>

```rust
pub fn is<T>(self: ImportStatementDO) -> bool;
```
## ImportStatementDO::to\<T\>

```rust
pub fn to<T>(self: ImportStatementDO) -> <any>;
```
## ImportStatementDO::key\_neq

```rust
pub fn key_neq(self: ImportStatementDO, object: <any>) -> bool;
```
## ImportStatementDO::key\_eq

```rust
pub fn key_eq(self: ImportStatementDO, object: <any>) -> bool;
```
## ImportStatementDO::to\_set

```rust
pub fn to_set(self: ImportStatementDO) -> *ImportStatementDO;
```
