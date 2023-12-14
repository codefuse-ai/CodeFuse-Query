# TypeiadicDO

Primary key: `oid: int`

```rust
schema TypeiadicDO {
  association_obj_id: int,
  @primary oid: int,
}
```
## TypeiadicDO::getAssociationObjId

```rust
/**
     * @brief gets the association obj id of this element.
     * @return int
     */
```
```rust
pub fn getAssociationObjId(self: TypeiadicDO) -> int;
```
## TypeiadicDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *TypeiadicDO;
```
## TypeiadicDO::is\<T\>

```rust
pub fn is<T>(self: TypeiadicDO) -> bool;
```
## TypeiadicDO::to\<T\>

```rust
pub fn to<T>(self: TypeiadicDO) -> <any>;
```
## TypeiadicDO::key\_neq

```rust
pub fn key_neq(self: TypeiadicDO, object: <any>) -> bool;
```
## TypeiadicDO::key\_eq

```rust
pub fn key_eq(self: TypeiadicDO, object: <any>) -> bool;
```
## TypeiadicDO::to\_set

```rust
pub fn to_set(self: TypeiadicDO) -> *TypeiadicDO;
```
