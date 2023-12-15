# DoubleLiteralDO

Primary key: `element_hash_id: int`

```rust
schema DoubleLiteralDO {
  value: string,
  @primary element_hash_id: int
}
```
## DoubleLiteralDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: DoubleLiteralDO) -> string;
```
## DoubleLiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *DoubleLiteralDO;
```
