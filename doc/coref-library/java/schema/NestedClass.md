# NestedClass

Inherit from [Class](./Class.md)

Primary key: `element_hash_id: int`

```rust
schema NestedClass extends Class {
  parent_hash_id: int,
  identifier_hash_id: int,
  location_hash_id: int,
  qualified_name: string,
  @primary element_hash_id: int
}
```
## NestedClass::getModifier

```java
/**
* @brief gets the modifier of the Class
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: NestedClass) -> *Modifier;
```
## NestedClass::getName

```java
/**
* @brief gets the name of the class.
* @return string 
*/
```
```rust
pub fn getName(self: NestedClass) -> string;
```
## NestedClass::getPackage

```java
/**
* @brief gets the package of the class element.
* @return Package 
*/
```
```rust
pub fn getPackage(self: NestedClass) -> Package;
```
## NestedClass::getSuperOrImplementsType

```java
/**
* @brief gets the super class or implemented interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getSuperOrImplementsType(self: NestedClass) -> *ClassOrInterface;
```
## NestedClass::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: NestedClass) -> *ElementParent;
```
## NestedClass::getParent

```java
/**
* @brief gets the parent of the method.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: NestedClass) -> ElementParent;
```
## NestedClass::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: NestedClass) -> int;
```
## NestedClass::getIdentifier

```java
/**
* @brief gets the identifier of the class name.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: NestedClass) -> Identifier;
```
## NestedClass::getAnnotation

```java
/**
* @brief gets the annotation of the class, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: NestedClass) -> *Annotation;
```
## NestedClass::getSuperClass

```java
/**
* @brief gets the super class of the element.
* @return Class 
*/
```
```rust
pub fn getSuperClass(self: NestedClass) -> Class;
```
## NestedClass::getImplementsInterface

```java
/**
* @brief gets the implemented interface of the class element.
* @return Interface 
*/
```
```rust
pub fn getImplementsInterface(self: NestedClass) -> *Interface;
```
## NestedClass::getAllMethods

```java
/**
* @brief gets all methods of the class element.
* @return Method 
*/
```
```rust
pub fn getAllMethods(self: NestedClass) -> *Method;
```
## NestedClass::getSize

```java
/**
* @brief gets the size information of the class element.
* @return NumberOfLines 
*/
```
```rust
pub fn getSize(self: NestedClass) -> NumberOfLines;
```
## NestedClass::getIdentifierHashId

```java
/**
* @brief gets the identifier hash id of this element.
* @return int
*/
```
```rust
pub fn getIdentifierHashId(self: NestedClass) -> int;
```
## NestedClass::getAnAscentantClassOrInterface

```java
/**
* @brief gets any ascentant class or interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getAnAscentantClassOrInterface(self: NestedClass) -> *ClassOrInterface;
```
## NestedClass::getContainingFile

```java
/**
* @brief gets the containing file of the class element.
* @return File 
*/
```
```rust
pub fn getContainingFile(self: NestedClass) -> File;
```
## NestedClass::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: NestedClass) -> string;
```
## NestedClass::getAnAncestorClass

```java
/**
* @brief gets all ancestor classes of the element.
* @return Class
*/
```
```rust
pub fn getAnAncestorClass(self: NestedClass) -> *Class;
```
## NestedClass::getAllFields

```java
/**
* @brief gets all fields of the class.
* @return Field 
*/
```
```rust
pub fn getAllFields(self: NestedClass) -> *Field;
```
## NestedClass::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: NestedClass) -> Location;
```
## NestedClass::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: NestedClass) -> int;
```
## NestedClass::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NestedClass;
```
