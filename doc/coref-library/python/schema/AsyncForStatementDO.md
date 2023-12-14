# AsyncForStatementDO

Primary key: `element_oid: int`

```rust
schema AsyncForStatementDO {
  @primary element_oid: int,
}
```
## AsyncForStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AsyncForStatementDO;
```
## AsyncForStatementDO::is\<T\>

```rust
pub fn is<T>(self: AsyncForStatementDO) -> bool;
```
## AsyncForStatementDO::to\<T\>

```rust
pub fn to<T>(self: AsyncForStatementDO) -> <any>;
```
## AsyncForStatementDO::key\_neq

```rust
pub fn key_neq(self: AsyncForStatementDO, object: <any>) -> bool;
```
## AsyncForStatementDO::key\_eq

```rust
pub fn key_eq(self: AsyncForStatementDO, object: <any>) -> bool;
```
## AsyncForStatementDO::to\_set

```rust
pub fn to_set(self: AsyncForStatementDO) -> *AsyncForStatementDO;
```
