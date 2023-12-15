# AnonymousClassDO

Primary key: `element_hash_id: int`

```rust
schema AnonymousClassDO {
  parent_hash_id: int,
  base_class_type_hash_id: int,
  base_class_reference_hash_id: int,
  location_hash_id: int,
  @primary element_hash_id: int
}
```
## AnonymousClassDO::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnonymousClassDO) -> int;
```
## AnonymousClassDO::getBaseClassTypeHashId

```java
/**
* @brief gets the base class type hash id of this element.
* @return int
*/
```
```rust
pub fn getBaseClassTypeHashId(self: AnonymousClassDO) -> int;
```
## AnonymousClassDO::getBaseClassReferenceHashId

```java
/**
* @brief gets the reference element id specifying the base class for the anonymous class.
* @return int
*/
```
```rust
pub fn getBaseClassReferenceHashId(self: AnonymousClassDO) -> int;
```
## AnonymousClassDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: AnonymousClassDO) -> int;
```
## AnonymousClassDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnonymousClassDO;
```
