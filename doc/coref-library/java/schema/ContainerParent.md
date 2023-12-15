# ContainerParent

Inherit from [ContainerParentDO](./ContainerParentDO.md)

Primary key: `child_hash_id: int`

```rust
schema ContainerParent extends ContainerParentDO {
  @primary child_hash_id: int,
  parent_hash_id: int
}
```
## ContainerParent::getBelongedFolder

```java
/**
* @brief gets the folder which contains the file, if any.
* @return Folder 
*/
```
```rust
pub fn getBelongedFolder(self: ContainerParent) -> Folder;
```
## ContainerParent::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ContainerParent) -> int;
```
## ContainerParent::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ContainerParent;
```
