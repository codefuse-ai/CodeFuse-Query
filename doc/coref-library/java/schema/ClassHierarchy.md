# ClassHierarchy

Inherit from [ClassHierarchyDO](./ClassHierarchyDO.md)

Primary key: `child_hash_id: int`

```rust
schema ClassHierarchy extends ClassHierarchyDO {
  @primary child_hash_id: int,
  parent_hash_id: int
}
```
## ClassHierarchy::getInterface

```java
/**
* @brief gets the implements interface of the class.
* @return Interface 
*/
```
```rust
pub fn getInterface(self: ClassHierarchy) -> *Interface;
```
## ClassHierarchy::getSuperClass

```java
/**
* @brief gets the superclass of the class.
* @return Class 
*/
```
```rust
pub fn getSuperClass(self: ClassHierarchy) -> Class;
```
## ClassHierarchy::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: ClassHierarchy) -> int;
```
## ClassHierarchy::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ClassHierarchy;
```
