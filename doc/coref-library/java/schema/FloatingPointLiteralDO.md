# FloatingPointLiteralDO

Primary key: `element_hash_id: int`

```rust
schema FloatingPointLiteralDO {
  value: string,
  @primary element_hash_id: int
}
```
## FloatingPointLiteralDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: FloatingPointLiteralDO) -> string;
```
## FloatingPointLiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *FloatingPointLiteralDO;
```
