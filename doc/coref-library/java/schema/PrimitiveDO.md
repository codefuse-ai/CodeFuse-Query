# PrimitiveDO

Primary key: `oid: int`

```rust
schema PrimitiveDO {
  name: string,
  @primary oid: int,
}
```
## PrimitiveDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: PrimitiveDO) -> string;
```
## PrimitiveDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *PrimitiveDO;
```
