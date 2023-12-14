# TypeObjectDO

Primary key: `oid: int`

```rust
schema TypeObjectDO {
  object: int,
  @primary oid: int,
}
```
## TypeObjectDO::getObject

```rust
/**
     * @brief gets the object of this element.
     * @return int
     */
```
```rust
pub fn getObject(self: TypeObjectDO) -> int;
```
## TypeObjectDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *TypeObjectDO;
```
## TypeObjectDO::is\<T\>

```rust
pub fn is<T>(self: TypeObjectDO) -> bool;
```
## TypeObjectDO::to\<T\>

```rust
pub fn to<T>(self: TypeObjectDO) -> <any>;
```
## TypeObjectDO::key\_neq

```rust
pub fn key_neq(self: TypeObjectDO, object: <any>) -> bool;
```
## TypeObjectDO::key\_eq

```rust
pub fn key_eq(self: TypeObjectDO, object: <any>) -> bool;
```
## TypeObjectDO::to\_set

```rust
pub fn to_set(self: TypeObjectDO) -> *TypeObjectDO;
```
