# BooleanLiteralDO

Primary key: `element_hash_id: int`

```rust
schema BooleanLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## BooleanLiteralDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: BooleanLiteralDO) -> string;
```
## BooleanLiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *BooleanLiteralDO;
```
