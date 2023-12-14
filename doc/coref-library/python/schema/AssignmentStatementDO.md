# AssignmentStatementDO

Primary key: `element_oid: int`

```rust
schema AssignmentStatementDO {
  targets_size: int,
  value_oid: int,
  @primary element_oid: int,
}
```
## AssignmentStatementDO::getTargetsSize

```rust
/**
     * @brief gets the targets size of this element.
     * @return int
     */
```
```rust
pub fn getTargetsSize(self: AssignmentStatementDO) -> int;
```
## AssignmentStatementDO::getValueOid

```rust
/**
     * @brief gets the value oid of this element.
     * @return int
     */
```
```rust
pub fn getValueOid(self: AssignmentStatementDO) -> int;
```
## AssignmentStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AssignmentStatementDO;
```
## AssignmentStatementDO::is\<T\>

```rust
pub fn is<T>(self: AssignmentStatementDO) -> bool;
```
## AssignmentStatementDO::to\<T\>

```rust
pub fn to<T>(self: AssignmentStatementDO) -> <any>;
```
## AssignmentStatementDO::key\_neq

```rust
pub fn key_neq(self: AssignmentStatementDO, object: <any>) -> bool;
```
## AssignmentStatementDO::key\_eq

```rust
pub fn key_eq(self: AssignmentStatementDO, object: <any>) -> bool;
```
## AssignmentStatementDO::to\_set

```rust
pub fn to_set(self: AssignmentStatementDO) -> *AssignmentStatementDO;
```
