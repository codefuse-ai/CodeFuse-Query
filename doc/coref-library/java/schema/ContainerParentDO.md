# ContainerParentDO

Primary key: `child_hash_id: int`

```rust
schema ContainerParentDO {
  parent_hash_id: int,
  @primary child_hash_id: int,
}
```
## ContainerParentDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ContainerParentDO) -> int;
```
## ContainerParentDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ContainerParentDO;
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
