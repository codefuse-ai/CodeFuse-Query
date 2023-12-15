# TypeObjectDO

Primary key: `oid: int`

```rust
schema TypeObjectDO {
  object: int,
  @primary oid: int
}
```
## TypeObjectDO::getObject

```java
/**
* @brief gets the object of this element.
* @return int
*/
```
```rust
pub fn getObject(self: TypeObjectDO) -> int;
```
## TypeObjectDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *TypeObjectDO;
```
