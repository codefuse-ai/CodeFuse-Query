# ClassHierarchyDO

Primary key: `base_oid: int`

```rust
schema ClassHierarchyDO {
  class_oid: int,
  @primary base_oid: int,
}
```
## ClassHierarchyDO::getClassOid

```rust
/**
     * @brief gets the class oid of this element.
     * @return int
     */
```
```rust
pub fn getClassOid(self: ClassHierarchyDO) -> int;
```
## ClassHierarchyDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ClassHierarchyDO;
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
