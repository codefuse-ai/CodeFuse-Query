# ExpressionStatementDO

Primary key: `element_oid: int`

```rust
schema ExpressionStatementDO {
  value_oid: int,
  @primary element_oid: int,
}
```
## ExpressionStatementDO::getValueOid

```rust
/**
     * @brief gets the value oid of this element.
     * @return int
     */
```
```rust
pub fn getValueOid(self: ExpressionStatementDO) -> int;
```
## ExpressionStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ExpressionStatementDO;
```
## ExpressionStatementDO::is\<T\>

```rust
pub fn is<T>(self: ExpressionStatementDO) -> bool;
```
## ExpressionStatementDO::to\<T\>

```rust
pub fn to<T>(self: ExpressionStatementDO) -> <any>;
```
## ExpressionStatementDO::key\_neq

```rust
pub fn key_neq(self: ExpressionStatementDO, object: <any>) -> bool;
```
## ExpressionStatementDO::key\_eq

```rust
pub fn key_eq(self: ExpressionStatementDO, object: <any>) -> bool;
```
## ExpressionStatementDO::to\_set

```rust
pub fn to_set(self: ExpressionStatementDO) -> *ExpressionStatementDO;
```
