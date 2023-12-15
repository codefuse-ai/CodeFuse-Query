# AssignmentStatementDO

Primary key: `element_oid: int`

```rust
schema AssignmentStatementDO {
  targets_size: int,
  value_oid: int,
  @primary element_oid: int
}
```
## AssignmentStatementDO::getTargetsSize

```java
/**
* @brief gets the targets size of this element.
* @return int
*/
```
```rust
pub fn getTargetsSize(self: AssignmentStatementDO) -> int;
```
## AssignmentStatementDO::getValueOid

```java
/**
* @brief gets the value oid of this element.
* @return int
*/
```
```rust
pub fn getValueOid(self: AssignmentStatementDO) -> int;
```
## AssignmentStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AssignmentStatementDO;
```
