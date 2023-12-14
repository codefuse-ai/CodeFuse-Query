# ContainerParentDO

Primary key: `oid: int`

```rust
schema ContainerParentDO {
  child: int,
  parent: int,
  @primary oid: int,
}
```
## ContainerParentDO::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return int
     */
```
```rust
pub fn getParent(self: ContainerParentDO) -> int;
```
## ContainerParentDO::getChild

```rust
/**
     * @brief gets the child of this element.
     * @return int
     */
```
```rust
pub fn getChild(self: ContainerParentDO) -> int;
```
## ContainerParentDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ContainerParentDO;
```
## ContainerParentDO::is\<T\>

```rust
pub fn is<T>(self: ContainerParentDO) -> bool;
```
## ContainerParentDO::to\<T\>

```rust
pub fn to<T>(self: ContainerParentDO) -> <any>;
```
## ContainerParentDO::key\_neq

```rust
pub fn key_neq(self: ContainerParentDO, object: <any>) -> bool;
```
## ContainerParentDO::key\_eq

```rust
pub fn key_eq(self: ContainerParentDO, object: <any>) -> bool;
```
## ContainerParentDO::to\_set

```rust
pub fn to_set(self: ContainerParentDO) -> *ContainerParentDO;
```
