# FieldStructDO

Primary key: `oid: int`

```rust
schema FieldStructDO {
  struct: int,
  @primary oid: int
}
```
## FieldStructDO::getStruct

```java
/**
* @brief gets the struct of this element.
* @return int
*/
```
```rust
pub fn getStruct(self: FieldStructDO) -> int;
```
## FieldStructDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *FieldStructDO;
```
