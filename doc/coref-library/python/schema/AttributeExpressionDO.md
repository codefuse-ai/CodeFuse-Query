# AttributeExpressionDO

Primary key: `element_oid: int`

```rust
schema AttributeExpressionDO {
  ctx_type: string,
  value_oid: int,
  @primary element_oid: int,
}
```
## AttributeExpressionDO::getCtxType

```java
/**
* @brief gets the ctx type of this element.
* @return string
*/
```
```rust
pub fn getCtxType(self: AttributeExpressionDO) -> string;
```
## AttributeExpressionDO::getValueOid

```java
/**
* @brief gets the value oid of this element.
* @return int
*/
```
```rust
pub fn getValueOid(self: AttributeExpressionDO) -> int;
```
## AttributeExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AttributeExpressionDO;
```
