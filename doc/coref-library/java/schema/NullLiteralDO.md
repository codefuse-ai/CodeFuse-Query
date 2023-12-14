# NullLiteralDO

Primary key: `element_hash_id: int`

```rust
schema NullLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## NullLiteralDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: NullLiteralDO) -> string;
```
## NullLiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NullLiteralDO;
```
