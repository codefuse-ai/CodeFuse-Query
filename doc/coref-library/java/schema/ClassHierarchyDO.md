# ClassHierarchyDO

Primary key: `child_hash_id: int`

```rust
schema ClassHierarchyDO {
  parent_hash_id: int,
  @primary child_hash_id: int,
}
```
## ClassHierarchyDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ClassHierarchyDO) -> int;
```
## ClassHierarchyDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ClassHierarchyDO;
```
## ClassHierarchyDO::is\<T\>

```rust
pub fn is<T>(self: ClassHierarchyDO) -> bool;
```
## ClassHierarchyDO::to\<T\>

```rust
pub fn to<T>(self: ClassHierarchyDO) -> <any>;
```
## ClassHierarchyDO::key\_neq

```rust
pub fn key_neq(self: ClassHierarchyDO, object: <any>) -> bool;
```
## ClassHierarchyDO::key\_eq

```rust
pub fn key_eq(self: ClassHierarchyDO, object: <any>) -> bool;
```
## ClassHierarchyDO::to\_set

```rust
pub fn to_set(self: ClassHierarchyDO) -> *ClassHierarchyDO;
```
