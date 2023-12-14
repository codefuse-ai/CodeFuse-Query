# ForStatementDO

Primary key: `element_oid: int`

```rust
schema ForStatementDO {
  @primary element_oid: int,
}
```
## ForStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ForStatementDO;
```
## ForStatementDO::is\<T\>

```rust
pub fn is<T>(self: ForStatementDO) -> bool;
```
## ForStatementDO::to\<T\>

```rust
pub fn to<T>(self: ForStatementDO) -> <any>;
```
## ForStatementDO::key\_neq

```rust
pub fn key_neq(self: ForStatementDO, object: <any>) -> bool;
```
## ForStatementDO::key\_eq

```rust
pub fn key_eq(self: ForStatementDO, object: <any>) -> bool;
```
## ForStatementDO::to\_set

```rust
pub fn to_set(self: ForStatementDO) -> *ForStatementDO;
```
