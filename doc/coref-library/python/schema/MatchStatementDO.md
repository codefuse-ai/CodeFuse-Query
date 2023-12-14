# MatchStatementDO

Primary key: `element_oid: int`

```rust
schema MatchStatementDO {
  subject_oid: int,
  @primary element_oid: int,
}
```
## MatchStatementDO::getSubjectOid

```rust
/**
     * @brief gets the subject oid of this element.
     * @return int
     */
```
```rust
pub fn getSubjectOid(self: MatchStatementDO) -> int;
```
## MatchStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *MatchStatementDO;
```
## MatchStatementDO::is\<T\>

```rust
pub fn is<T>(self: MatchStatementDO) -> bool;
```
## MatchStatementDO::to\<T\>

```rust
pub fn to<T>(self: MatchStatementDO) -> <any>;
```
## MatchStatementDO::key\_neq

```rust
pub fn key_neq(self: MatchStatementDO, object: <any>) -> bool;
```
## MatchStatementDO::key\_eq

```rust
pub fn key_eq(self: MatchStatementDO, object: <any>) -> bool;
```
## MatchStatementDO::to\_set

```rust
pub fn to_set(self: MatchStatementDO) -> *MatchStatementDO;
```
