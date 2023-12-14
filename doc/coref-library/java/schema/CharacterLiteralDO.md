# CharacterLiteralDO

Primary key: `element_hash_id: int`

```rust
schema CharacterLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## CharacterLiteralDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: CharacterLiteralDO) -> string;
```
## CharacterLiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CharacterLiteralDO;
```
