# AnonymousClassDO

Primary key: `element_hash_id: int`

```rust
schema AnonymousClassDO {
  parent_hash_id: int,
  base_class_type_hash_id: int,
  base_class_reference_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int,
}
```
## AnonymousClassDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AnonymousClassDO) -> int;
```
## AnonymousClassDO::getBaseClassTypeHashId

```rust
/**
     * @brief gets the base class type hash id of this element.
     * @return int
     */
```
```rust
pub fn getBaseClassTypeHashId(self: AnonymousClassDO) -> int;
```
## AnonymousClassDO::getBaseClassReferenceHashId

```rust
/**
     * @brief gets the reference element id specifying the base class for the anonymous class.
     * @return int
     */
```
```rust
pub fn getBaseClassReferenceHashId(self: AnonymousClassDO) -> int;
```
## AnonymousClassDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: AnonymousClassDO) -> int;
```
## AnonymousClassDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnonymousClassDO;
```
## AnonymousClassDO::is\<T\>

```rust
pub fn is<T>(self: AnonymousClassDO) -> bool;
```
## AnonymousClassDO::to\<T\>

```rust
pub fn to<T>(self: AnonymousClassDO) -> <any>;
```
## AnonymousClassDO::key\_neq

```rust
pub fn key_neq(self: AnonymousClassDO, object: <any>) -> bool;
```
## AnonymousClassDO::key\_eq

```rust
pub fn key_eq(self: AnonymousClassDO, object: <any>) -> bool;
```
## AnonymousClassDO::to\_set

```rust
pub fn to_set(self: AnonymousClassDO) -> *AnonymousClassDO;
```
