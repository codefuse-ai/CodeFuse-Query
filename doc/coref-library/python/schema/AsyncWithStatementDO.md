# AsyncWithStatementDO

Primary key: `element_oid: int`

```rust
schema AsyncWithStatementDO {
  @primary element_oid: int,
}
```
## AsyncWithStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AsyncWithStatementDO;
```
## AsyncWithStatementDO::is\<T\>

```rust
pub fn is<T>(self: AsyncWithStatementDO) -> bool;
```
## AsyncWithStatementDO::to\<T\>

```rust
pub fn to<T>(self: AsyncWithStatementDO) -> <any>;
```
## AsyncWithStatementDO::key\_neq

```rust
pub fn key_neq(self: AsyncWithStatementDO, object: <any>) -> bool;
```
## AsyncWithStatementDO::key\_eq

```rust
pub fn key_eq(self: AsyncWithStatementDO, object: <any>) -> bool;
```
## AsyncWithStatementDO::to\_set

```rust
pub fn to_set(self: AsyncWithStatementDO) -> *AsyncWithStatementDO;
```
