# ContainerParent

Primary key: `child_oid: int`

```rust
schema ContainerParent {
  @primary child_oid: int,
  parent_oid: int,
}
```
## ContainerParent::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ContainerParent) -> int;
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
## ContainerParent::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ContainerParent;
```
