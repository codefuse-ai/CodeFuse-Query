# ContainerParent

Primary key: `child_oid: int`

```rust
schema ContainerParent {
  @primary child_oid: int,
  parent_oid: int,
}
```
## ContainerParent::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ContainerParent) -> int;
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
## ContainerParent::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ContainerParent;
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
