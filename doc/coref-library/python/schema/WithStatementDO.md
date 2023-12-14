# WithStatementDO

Primary key: `element_oid: int`

```rust
schema WithStatementDO {
  @primary element_oid: int,
}
```
## WithStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *WithStatementDO;
```
## WithStatementDO::is\<T\>

```rust
pub fn is<T>(self: WithStatementDO) -> bool;
```
## WithStatementDO::to\<T\>

```rust
pub fn to<T>(self: WithStatementDO) -> <any>;
```
## WithStatementDO::key\_neq

```rust
pub fn key_neq(self: WithStatementDO, object: <any>) -> bool;
```
## WithStatementDO::key\_eq

```rust
pub fn key_eq(self: WithStatementDO, object: <any>) -> bool;
```
## WithStatementDO::to\_set

```rust
pub fn to_set(self: WithStatementDO) -> *WithStatementDO;
```
