# ClassHierarchy

Primary key: `child_hash_id: int`

```rust
schema ClassHierarchy {
  @primary child_hash_id: int,
  parent_hash_id: int,
}
```
## ClassHierarchy::getInterface

```rust
/**
     * @brief gets the implements interface of the class.
     * @return Interface 
     */
```
```rust
pub fn getInterface(self: ClassHierarchy) -> *Interface;
```
## ClassHierarchy::getSuperClass

```rust
/**
     * @brief gets the superclass of the class.
     * @return Class 
     */
```
```rust
pub fn getSuperClass(self: ClassHierarchy) -> Class;
```
## ClassHierarchy::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ClassHierarchy) -> int;
```
## ClassHierarchy::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ClassHierarchy;
```
## ClassHierarchy::is\<T\>

```rust
pub fn is<T>(self: ClassHierarchy) -> bool;
```
## ClassHierarchy::to\<T\>

```rust
pub fn to<T>(self: ClassHierarchy) -> <any>;
```
## ClassHierarchy::key\_neq

```rust
pub fn key_neq(self: ClassHierarchy, object: <any>) -> bool;
```
## ClassHierarchy::key\_eq

```rust
pub fn key_eq(self: ClassHierarchy, object: <any>) -> bool;
```
## ClassHierarchy::to\_set

```rust
pub fn to_set(self: ClassHierarchy) -> *ClassHierarchy;
```
