# ContainerParentDO

Primary key: `child_hash_id: int`

```rust
schema ContainerParentDO {
  parent_hash_id: int,
  @primary child_hash_id: int
}
```
## ContainerParentDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ContainerParentDO) -> int;
```
## ContainerParentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ContainerParentDO;
```
