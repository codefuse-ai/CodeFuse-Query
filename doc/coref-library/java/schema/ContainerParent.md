# ContainerParent

Primary key: `child_hash_id: int`

```rust
schema ContainerParent {
  @primary child_hash_id: int,
  parent_hash_id: int,
}
```
## ContainerParent::getBelongedFolder

```rust
/**
     * @brief gets the folder which contains the file, if any.
     * @return Folder 
     */
```
```rust
pub fn getBelongedFolder(self: ContainerParent) -> Folder;
```
## ContainerParent::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ContainerParent) -> int;
```
## ContainerParent::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ContainerParent;
```
## ContainerParent::is\<T\>

```rust
pub fn is<T>(self: ContainerParent) -> bool;
```
## ContainerParent::to\<T\>

```rust
pub fn to<T>(self: ContainerParent) -> <any>;
```
## ContainerParent::key\_neq

```rust
pub fn key_neq(self: ContainerParent, object: <any>) -> bool;
```
## ContainerParent::key\_eq

```rust
pub fn key_eq(self: ContainerParent, object: <any>) -> bool;
```
## ContainerParent::to\_set

```rust
pub fn to_set(self: ContainerParent) -> *ContainerParent;
```
