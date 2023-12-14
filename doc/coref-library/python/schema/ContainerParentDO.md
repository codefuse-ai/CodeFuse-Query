# ContainerParentDO

Primary key: `child_oid: int`

```rust
schema ContainerParentDO {
  parent_oid: int,
  @primary child_oid: int,
}
```
## ContainerParentDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ContainerParentDO) -> int;
```
## ContainerParentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ContainerParentDO;
```
