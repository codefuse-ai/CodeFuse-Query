# SetExpressionDO

Primary key: `element_oid: int`

```rust
schema SetExpressionDO {
  elt_size: int,
  @primary element_oid: int,
}
```
## SetExpressionDO::getEltSize

```java
/**
* @brief gets the elt size of this element.
* @return int
*/
```
```rust
pub fn getEltSize(self: SetExpressionDO) -> int;
```
## SetExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *SetExpressionDO;
```
