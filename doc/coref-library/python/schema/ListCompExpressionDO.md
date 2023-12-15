# ListCompExpressionDO

Primary key: `element_oid: int`

```rust
schema ListCompExpressionDO {
  elt_oid: int,
  generator_size: int,
  @primary element_oid: int
}
```
## ListCompExpressionDO::getGeneratorSize

```java
/**
* @brief gets the generator size of this element.
* @return int
*/
```
```rust
pub fn getGeneratorSize(self: ListCompExpressionDO) -> int;
```
## ListCompExpressionDO::getEltOid

```java
/**
* @brief gets the elt oid of this element.
* @return int
*/
```
```rust
pub fn getEltOid(self: ListCompExpressionDO) -> int;
```
## ListCompExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ListCompExpressionDO;
```
