# FormattedValueExpressionDO

Primary key: `element_oid: int`

```rust
schema FormattedValueExpressionDO {
  value_oid: int,
  @primary element_oid: int
}
```
## FormattedValueExpressionDO::getValueOid

```java
/**
* @brief gets the value oid of this element.
* @return int
*/
```
```rust
pub fn getValueOid(self: FormattedValueExpressionDO) -> int;
```
## FormattedValueExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *FormattedValueExpressionDO;
```
