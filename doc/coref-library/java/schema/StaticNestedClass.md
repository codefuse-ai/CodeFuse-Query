# StaticNestedClass

Primary key: `element_hash_id: int`

```rust
schema StaticNestedClass {
  @primary element_hash_id: int,
  qualified_name: string,
  location_hash_id: int,
  identifier_hash_id: int,
  parent_hash_id: int,
}
```
## StaticNestedClass::getAllFields

```java
/**
* @brief gets all fields of the class.
* @return Field 
*/
```
```rust
pub fn getAllFields(self: StaticNestedClass) -> *Field;
```
## StaticNestedClass::getAnAncestorClass

```java
/**
* @brief gets all ancestor classes of the element.
* @return Class
*/
```
```rust
pub fn getAnAncestorClass(self: StaticNestedClass) -> *Class;
```
## StaticNestedClass::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: StaticNestedClass) -> string;
```
## StaticNestedClass::getContainingFile

```java
/**
* @brief gets the containing file of the class element.
* @return File 
*/
```
```rust
pub fn getContainingFile(self: StaticNestedClass) -> File;
```
## StaticNestedClass::getAnAscentantClassOrInterface

```java
/**
* @brief gets any ascentant class or interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getAnAscentantClassOrInterface(self: StaticNestedClass) -> *ClassOrInterface;
```
## StaticNestedClass::getIdentifierHashId

```java
/**
* @brief gets the identifier hash id of this element.
* @return int
*/
```
```rust
pub fn getIdentifierHashId(self: StaticNestedClass) -> int;
```
## StaticNestedClass::getSize

```java
/**
* @brief gets the size information of the class element.
* @return NumberOfLines 
*/
```
```rust
pub fn getSize(self: StaticNestedClass) -> NumberOfLines;
```
## StaticNestedClass::getAllMethods

```java
/**
* @brief gets all methods of the class element.
* @return Method 
*/
```
```rust
pub fn getAllMethods(self: StaticNestedClass) -> *Method;
```
## StaticNestedClass::getImplementsInterface

```java
/**
* @brief gets the implemented interface of the class element.
* @return Interface 
*/
```
```rust
pub fn getImplementsInterface(self: StaticNestedClass) -> *Interface;
```
## StaticNestedClass::getSuperClass

```java
/**
* @brief gets the super class of the element.
* @return Class 
*/
```
```rust
pub fn getSuperClass(self: StaticNestedClass) -> Class;
```
## StaticNestedClass::getAnnotation

```java
/**
* @brief gets the annotation of the class, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: StaticNestedClass) -> *Annotation;
```
## StaticNestedClass::getIdentifier

```java
/**
* @brief gets the identifier of the class name.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: StaticNestedClass) -> Identifier;
```
## StaticNestedClass::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: StaticNestedClass) -> int;
```
## StaticNestedClass::getParent

```java
/**
* @brief gets the parent of the method.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: StaticNestedClass) -> ElementParent;
```
## StaticNestedClass::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: StaticNestedClass) -> *ElementParent;
```
## StaticNestedClass::getPackage

```java
/**
* @brief gets the package of the class element.
* @return Package 
*/
```
```rust
pub fn getPackage(self: StaticNestedClass) -> Package;
```
## StaticNestedClass::getName

```java
/**
* @brief gets the name of the class.
* @return string 
*/
```
```rust
pub fn getName(self: StaticNestedClass) -> string;
```
## StaticNestedClass::getSuperOrImplementsType

```java
/**
* @brief gets the super class or implemented interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getSuperOrImplementsType(self: StaticNestedClass) -> *ClassOrInterface;
```
## StaticNestedClass::getModifier

```java
/**
* @brief gets the modifier of the Class
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: StaticNestedClass) -> *Modifier;
```
## StaticNestedClass::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: StaticNestedClass) -> int;
```
## StaticNestedClass::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: StaticNestedClass) -> Location;
```
## StaticNestedClass::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *StaticNestedClass;
```
