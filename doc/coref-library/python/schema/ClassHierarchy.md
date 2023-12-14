# ClassHierarchy

Primary key: `base_oid: int`

```rust
schema ClassHierarchy {
  @primary base_oid: int,
  class_oid: int,
}
```
## ClassHierarchy::getClassOid

```rust
/**
     * @brief gets the class oid of this element.
     * @return int
     */
```
```rust
pub fn getClassOid(self: ClassHierarchy) -> int;
```
## ClassHierarchy::getClass

```rust
/**
     * @brief gets the class in the inherited relation.
     * @return Class
     */
```
```rust
pub fn getClass(self: ClassHierarchy) -> Class;
```
## ClassHierarchy::getBasedClass

```rust
/**
     * @brief gets the based class in the inherited relation.
     * @return Expression
     */
```
```rust
pub fn getBasedClass(self: ClassHierarchy) -> Expression;
```
## ClassHierarchy::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ClassHierarchy;
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
