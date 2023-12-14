# DirectoryHierarchyDO

Primary key: `child_oid: int`

```rust
schema DirectoryHierarchyDO {
  @primary child_oid: int,
  parent_oid: int,
}
```
## DirectoryHierarchyDO::getParentOid

```rust
pub fn getParentOid(self: DirectoryHierarchyDO) -> int;
```
## DirectoryHierarchyDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DirectoryHierarchyDO;
```
## DirectoryHierarchyDO::is\<T\>

```rust
pub fn is<T>(self: DirectoryHierarchyDO) -> bool;
```
## DirectoryHierarchyDO::to\<T\>

```rust
pub fn to<T>(self: DirectoryHierarchyDO) -> <any>;
```
## DirectoryHierarchyDO::key\_neq

```rust
pub fn key_neq(self: DirectoryHierarchyDO, object: <any>) -> bool;
```
## DirectoryHierarchyDO::key\_eq

```rust
pub fn key_eq(self: DirectoryHierarchyDO, object: <any>) -> bool;
```
## DirectoryHierarchyDO::to\_set

```rust
pub fn to_set(self: DirectoryHierarchyDO) -> *DirectoryHierarchyDO;
```
