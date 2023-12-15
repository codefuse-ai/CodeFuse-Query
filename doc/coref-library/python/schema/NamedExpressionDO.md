# NamedExpressionDO

Primary key: `element_oid: int`

```rust
schema NamedExpressionDO {
  value_oid: int,
  target_oid: int,
  @primary element_oid: int
}
```
## NamedExpressionDO::getValueOid

```java
/**
* @brief gets the value oid of this element.
* @return int
*/
```
```rust
pub fn getValueOid(self: NamedExpressionDO) -> int;
```
## NamedExpressionDO::getTargetOid

```java
/**
* @brief gets the target oid of this element.
* @return int
*/
```
```rust
pub fn getTargetOid(self: NamedExpressionDO) -> int;
```
## NamedExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *NamedExpressionDO;
```
