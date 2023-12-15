# ClassHierarchyDO

Primary key: `base_oid: int`

```rust
schema ClassHierarchyDO {
  class_oid: int,
  @primary base_oid: int
}
```
## ClassHierarchyDO::getClassOid

```java
/**
* @brief gets the class oid of this element.
* @return int
*/
```
```rust
pub fn getClassOid(self: ClassHierarchyDO) -> int;
```
## ClassHierarchyDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ClassHierarchyDO;
```
