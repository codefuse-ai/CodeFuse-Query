# TypeLiteralDO

Primary key: `element_hash_id: int`

```rust
schema TypeLiteralDO {
  type_hash_id: int,
  type_element_hash_id: int,
  @primary element_hash_id: int
}
```
## TypeLiteralDO::getTypeElementHashId

```java
/**
* @brief gets the type element hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeElementHashId(self: TypeLiteralDO) -> int;
```
## TypeLiteralDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: TypeLiteralDO) -> int;
```
## TypeLiteralDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TypeLiteralDO;
```
