# YieldFromExpressionDO

Primary key: `element_oid: int`

```rust
schema YieldFromExpressionDO {
  value: int,
  @primary element_oid: int
}
```
## YieldFromExpressionDO::getValue

```java
/**
* @brief gets the value of this element.
* @return int
*/
```
```rust
pub fn getValue(self: YieldFromExpressionDO) -> int;
```
## YieldFromExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *YieldFromExpressionDO;
```
