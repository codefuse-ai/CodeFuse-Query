# PolyadicExpressionDO

Primary key: `element_hash_id: int`

```rust
schema PolyadicExpressionDO {
  opcode: string,
  size: int,
  @primary element_hash_id: int
}
```
## PolyadicExpressionDO::getOpcode

```java
/**
* @brief gets the opcode of this element.
* @return string
*/
```
```rust
pub fn getOpcode(self: PolyadicExpressionDO) -> string;
```
## PolyadicExpressionDO::getSize

```java
/**
* @brief gets the size of this element.
* @return int
*/
```
```rust
pub fn getSize(self: PolyadicExpressionDO) -> int;
```
## PolyadicExpressionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *PolyadicExpressionDO;
```
