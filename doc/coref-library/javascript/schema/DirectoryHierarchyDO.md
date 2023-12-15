# DirectoryHierarchyDO

Primary key: `child_oid: int`

```rust
schema DirectoryHierarchyDO {
  @primary child_oid: int,
  parent_oid: int
}
```
## DirectoryHierarchyDO::getParentOid

```rust
pub fn getParentOid(self: DirectoryHierarchyDO) -> int;
```
## DirectoryHierarchyDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DirectoryHierarchyDO;
```
