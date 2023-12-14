# BreakStatementDO

Primary key: `element_hash_id: int`

```rust
schema BreakStatementDO {
  exited_statement_hash_id: int,
  @primary element_hash_id: int,
}
```
## BreakStatementDO::getExitedStatementHashId

```rust
/**
     * @brief gets the exited statement hash id of this element.
     * @return int
     */
```
```rust
pub fn getExitedStatementHashId(self: BreakStatementDO) -> int;
```
## BreakStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *BreakStatementDO;
```
## BreakStatementDO::is\<T\>

```rust
pub fn is<T>(self: BreakStatementDO) -> bool;
```
## BreakStatementDO::to\<T\>

```rust
pub fn to<T>(self: BreakStatementDO) -> <any>;
```
## BreakStatementDO::key\_neq

```rust
pub fn key_neq(self: BreakStatementDO, object: <any>) -> bool;
```
## BreakStatementDO::key\_eq

```rust
pub fn key_eq(self: BreakStatementDO, object: <any>) -> bool;
```
## BreakStatementDO::to\_set

```rust
pub fn to_set(self: BreakStatementDO) -> *BreakStatementDO;
```
