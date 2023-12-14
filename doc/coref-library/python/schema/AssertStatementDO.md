# AssertStatementDO

Primary key: `element_oid: int`

```rust
schema AssertStatementDO {
  assert_condition_oid: int,
  @primary element_oid: int,
}
```
## AssertStatementDO::getAssertConditionOid

```rust
/**
     * @brief gets the assert condition oid of this element.
     * @return int
     */
```
```rust
pub fn getAssertConditionOid(self: AssertStatementDO) -> int;
```
## AssertStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AssertStatementDO;
```
## AssertStatementDO::is\<T\>

```rust
pub fn is<T>(self: AssertStatementDO) -> bool;
```
## AssertStatementDO::to\<T\>

```rust
pub fn to<T>(self: AssertStatementDO) -> <any>;
```
## AssertStatementDO::key\_neq

```rust
pub fn key_neq(self: AssertStatementDO, object: <any>) -> bool;
```
## AssertStatementDO::key\_eq

```rust
pub fn key_eq(self: AssertStatementDO, object: <any>) -> bool;
```
## AssertStatementDO::to\_set

```rust
pub fn to_set(self: AssertStatementDO) -> *AssertStatementDO;
```
