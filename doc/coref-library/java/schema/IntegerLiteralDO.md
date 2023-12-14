# IntegerLiteralDO

Primary key: `element_hash_id: int`

```rust
schema IntegerLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## IntegerLiteralDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: IntegerLiteralDO) -> string;
```
## IntegerLiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *IntegerLiteralDO;
```
