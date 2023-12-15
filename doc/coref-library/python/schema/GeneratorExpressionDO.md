# GeneratorExpressionDO

Primary key: `element_oid: int`

```rust
schema GeneratorExpressionDO {
  elt_oid: int,
  @primary element_oid: int
}
```
## GeneratorExpressionDO::getEltOid

```java
/**
* @brief gets the elt oid of this element.
* @return int
*/
```
```rust
pub fn getEltOid(self: GeneratorExpressionDO) -> int;
```
## GeneratorExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *GeneratorExpressionDO;
```
