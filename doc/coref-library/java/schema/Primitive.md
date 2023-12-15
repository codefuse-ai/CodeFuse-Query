# Primitive

Inherit from [PrimitiveDO](./PrimitiveDO.md)

Primary key: `oid: int`

```rust
schema Primitive extends PrimitiveDO {
  @primary oid: int,
  name: string
}
```
## Primitive::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Primitive) -> string;
```
## Primitive::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Primitive;
```
