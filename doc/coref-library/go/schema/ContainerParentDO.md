# ContainerParentDO

Primary key: `oid: int`

```rust
schema ContainerParentDO {
  child: int,
  parent: int,
  @primary oid: int
}
```
## ContainerParentDO::getParent

```java
/**
* @brief gets the parent of this element.
* @return int
*/
```
```rust
pub fn getParent(self: ContainerParentDO) -> int;
```
## ContainerParentDO::getChild

```java
/**
* @brief gets the child of this element.
* @return int
*/
```
```rust
pub fn getChild(self: ContainerParentDO) -> int;
```
## ContainerParentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ContainerParentDO;
```
