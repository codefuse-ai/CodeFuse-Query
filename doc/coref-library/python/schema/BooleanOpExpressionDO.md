# BooleanOpExpressionDO

Primary key: `element_oid: int`

```rust
schema BooleanOpExpressionDO {
  size: int,
  type: string,
  @primary element_oid: int
}
```
## BooleanOpExpressionDO::getSize

```java
/**
* @brief gets the size of this element.
* @return int
*/
```
```rust
pub fn getSize(self: BooleanOpExpressionDO) -> int;
```
## BooleanOpExpressionDO::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: BooleanOpExpressionDO) -> string;
```
## BooleanOpExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *BooleanOpExpressionDO;
```
