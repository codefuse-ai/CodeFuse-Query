# MatchStatementDO

Primary key: `element_oid: int`

```rust
schema MatchStatementDO {
  subject_oid: int,
  @primary element_oid: int
}
```
## MatchStatementDO::getSubjectOid

```java
/**
* @brief gets the subject oid of this element.
* @return int
*/
```
```rust
pub fn getSubjectOid(self: MatchStatementDO) -> int;
```
## MatchStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *MatchStatementDO;
```
