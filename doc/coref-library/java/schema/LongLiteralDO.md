# LongLiteralDO

Primary key: `element_hash_id: int`

```rust
schema LongLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## LongLiteralDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: LongLiteralDO) -> string;
```
## LongLiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LongLiteralDO;
```
