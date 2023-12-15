# ClassHierarchyDO

Primary key: `child_hash_id: int`

```rust
schema ClassHierarchyDO {
  parent_hash_id: int,
  @primary child_hash_id: int
}
```
## ClassHierarchyDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ClassHierarchyDO) -> int;
```
## ClassHierarchyDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ClassHierarchyDO;
```
