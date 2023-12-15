# TypeiadicDO

Primary key: `oid: int`

```rust
schema TypeiadicDO {
  association_obj_id: int,
  @primary oid: int
}
```
## TypeiadicDO::getAssociationObjId

```java
/**
* @brief gets the association obj id of this element.
* @return int
*/
```
```rust
pub fn getAssociationObjId(self: TypeiadicDO) -> int;
```
## TypeiadicDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *TypeiadicDO;
```
