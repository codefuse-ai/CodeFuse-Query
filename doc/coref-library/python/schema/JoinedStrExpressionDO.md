# JoinedStrExpressionDO

Primary key: `element_oid: int`

```rust
schema JoinedStrExpressionDO {
  size: int,
  @primary element_oid: int,
}
```
## JoinedStrExpressionDO::getSize

```java
/**
* @brief gets the size of this element.
* @return int
*/
```
```rust
pub fn getSize(self: JoinedStrExpressionDO) -> int;
```
## JoinedStrExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *JoinedStrExpressionDO;
```
