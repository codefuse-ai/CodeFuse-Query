# AnonymousClass

Primary key: `element_hash_id: int`

```rust
schema AnonymousClass {
  @primary element_hash_id: int,
  location_hash_id: int,
  base_class_reference_hash_id: int,
  base_class_type_hash_id: int,
  parent_hash_id: int,
}
```
## AnonymousClass::getBaseClassReferenceHashId

```java
/**
* @brief gets the reference element id specifying the base class for the anonymous class.
* @return int
*/
```
```rust
pub fn getBaseClassReferenceHashId(self: AnonymousClass) -> int;
```
## AnonymousClass::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: AnonymousClass) -> int;
```
## AnonymousClass::getBaseClassReference

```java
/**
* @brief gets the reference element specifying the base class for the anonymous class.
* @return ReferenceElement 
*/
```
```rust
pub fn getBaseClassReference(self: AnonymousClass) -> ReferenceElement;
```
## AnonymousClass::getBaseClassTypeHashId

```java
/**
* @brief gets the base class type hash id of this element.
* @return int
*/
```
```rust
pub fn getBaseClassTypeHashId(self: AnonymousClass) -> int;
```
## AnonymousClass::getEnclosingCallable

```java
/**
* @brief gets the enclosing callable of the element, if any.
* @return Callable 
*/
```
```rust
pub fn getEnclosingCallable(self: AnonymousClass) -> *Callable;
```
## AnonymousClass::getBaseClassType

```java
/**
* @brief gets the type for the base class of the anonymous class.
* @return ReferenceType 
*/
```
```rust
pub fn getBaseClassType(self: AnonymousClass) -> ReferenceType;
```
## AnonymousClass::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: AnonymousClass) -> int;
```
## AnonymousClass::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AnonymousClass) -> Location;
```
## AnonymousClass::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return Expression 
*/
```
```rust
pub fn getParent(self: AnonymousClass) -> Expression;
```
## AnonymousClass::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: AnonymousClass) -> *ElementParent;
```
## AnonymousClass::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnonymousClass;
```
