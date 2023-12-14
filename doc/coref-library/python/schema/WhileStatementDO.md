# WhileStatementDO

Primary key: `element_oid: int`

```rust
schema WhileStatementDO {
  @primary element_oid: int,
}
```
## WhileStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *WhileStatementDO;
```
## WhileStatementDO::is\<T\>

```rust
pub fn is<T>(self: WhileStatementDO) -> bool;
```
## WhileStatementDO::to\<T\>

```rust
pub fn to<T>(self: WhileStatementDO) -> <any>;
```
## WhileStatementDO::key\_neq

```rust
pub fn key_neq(self: WhileStatementDO, object: <any>) -> bool;
```
## WhileStatementDO::key\_eq

```rust
pub fn key_eq(self: WhileStatementDO, object: <any>) -> bool;
```
## WhileStatementDO::to\_set

```rust
pub fn to_set(self: WhileStatementDO) -> *WhileStatementDO;
```
