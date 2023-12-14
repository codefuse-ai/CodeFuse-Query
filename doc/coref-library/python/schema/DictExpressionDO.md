# DictExpressionDO

Primary key: `element_oid: int`

```rust
schema DictExpressionDO {
  size: int,
  @primary element_oid: int,
}
```
## DictExpressionDO::getSize

```java
/**
* @brief gets the size of this element.
* @return int
*/
```
```rust
pub fn getSize(self: DictExpressionDO) -> int;
```
## DictExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *DictExpressionDO;
```
