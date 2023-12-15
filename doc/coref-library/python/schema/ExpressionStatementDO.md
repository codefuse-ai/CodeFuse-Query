# ExpressionStatementDO

Primary key: `element_oid: int`

```rust
schema ExpressionStatementDO {
  value_oid: int,
  @primary element_oid: int
}
```
## ExpressionStatementDO::getValueOid

```java
/**
* @brief gets the value oid of this element.
* @return int
*/
```
```rust
pub fn getValueOid(self: ExpressionStatementDO) -> int;
```
## ExpressionStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ExpressionStatementDO;
```
