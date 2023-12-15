# AssertStatementDO

Primary key: `element_oid: int`

```rust
schema AssertStatementDO {
  assert_condition_oid: int,
  @primary element_oid: int
}
```
## AssertStatementDO::getAssertConditionOid

```java
/**
* @brief gets the assert condition oid of this element.
* @return int
*/
```
```rust
pub fn getAssertConditionOid(self: AssertStatementDO) -> int;
```
## AssertStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AssertStatementDO;
```
