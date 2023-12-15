# ClassHierarchy

Inherit from [ClassHierarchyDO](./ClassHierarchyDO.md)

Primary key: `base_oid: int`

```rust
schema ClassHierarchy extends ClassHierarchyDO {
  @primary base_oid: int,
  class_oid: int
}
```
## ClassHierarchy::getClassOid

```java
/**
* @brief gets the class oid of this element.
* @return int
*/
```
```rust
pub fn getClassOid(self: ClassHierarchy) -> int;
```
## ClassHierarchy::getClass

```java
/**
* @brief gets the class in the inherited relation.
* @return Class
*/
```
```rust
pub fn getClass(self: ClassHierarchy) -> Class;
```
## ClassHierarchy::getBasedClass

```java
/**
* @brief gets the based class in the inherited relation.
* @return Expression
*/
```
```rust
pub fn getBasedClass(self: ClassHierarchy) -> Expression;
```
## ClassHierarchy::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ClassHierarchy;
```
