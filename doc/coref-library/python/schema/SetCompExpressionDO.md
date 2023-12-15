# SetCompExpressionDO

Primary key: `element_oid: int`

```rust
schema SetCompExpressionDO {
  elt_oid: int,
  generator_size: int,
  @primary element_oid: int
}
```
## SetCompExpressionDO::getGeneratorSize

```java
/**
* @brief gets the generator size of this element.
* @return int
*/
```
```rust
pub fn getGeneratorSize(self: SetCompExpressionDO) -> int;
```
## SetCompExpressionDO::getEltOid

```java
/**
* @brief gets the elt oid of this element.
* @return int
*/
```
```rust
pub fn getEltOid(self: SetCompExpressionDO) -> int;
```
## SetCompExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *SetCompExpressionDO;
```
