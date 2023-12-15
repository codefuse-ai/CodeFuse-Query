# DictCompExpressionDO

Primary key: `element_oid: int`

```rust
schema DictCompExpressionDO {
  comprehension_size: int,
  @primary element_oid: int
}
```
## DictCompExpressionDO::getComprehensionSize

```java
/**
* @brief gets the comprehension size of this element.
* @return int
*/
```
```rust
pub fn getComprehensionSize(self: DictCompExpressionDO) -> int;
```
## DictCompExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *DictCompExpressionDO;
```
