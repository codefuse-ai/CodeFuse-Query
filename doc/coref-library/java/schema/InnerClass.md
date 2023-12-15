# InnerClass

Inherit from [NestedClass](./NestedClass.md)

Primary key: `element_hash_id: int`

```rust
schema InnerClass extends NestedClass {
  @primary element_hash_id: int,
  qualified_name: string,
  location_hash_id: int,
  identifier_hash_id: int,
  parent_hash_id: int
}
```
## InnerClass::getAllFields

```java
/**
* @brief gets all fields of the class.
* @return Field 
*/
```
```rust
pub fn getAllFields(self: InnerClass) -> *Field;
```
## InnerClass::getAnAncestorClass

```java
/**
* @brief gets all ancestor classes of the element.
* @return Class
*/
```
```rust
pub fn getAnAncestorClass(self: InnerClass) -> *Class;
```
## InnerClass::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: InnerClass) -> string;
```
## InnerClass::getContainingFile

```java
/**
* @brief gets the containing file of the class element.
* @return File 
*/
```
```rust
pub fn getContainingFile(self: InnerClass) -> File;
```
## InnerClass::getAnAscentantClassOrInterface

```java
/**
* @brief gets any ascentant class or interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getAnAscentantClassOrInterface(self: InnerClass) -> *ClassOrInterface;
```
## InnerClass::getIdentifierHashId

```java
/**
* @brief gets the identifier hash id of this element.
* @return int
*/
```
```rust
pub fn getIdentifierHashId(self: InnerClass) -> int;
```
## InnerClass::getSize

```java
/**
* @brief gets the size information of the class element.
* @return NumberOfLines 
*/
```
```rust
pub fn getSize(self: InnerClass) -> NumberOfLines;
```
## InnerClass::getAllMethods

```java
/**
* @brief gets all methods of the class element.
* @return Method 
*/
```
```rust
pub fn getAllMethods(self: InnerClass) -> *Method;
```
## InnerClass::getImplementsInterface

```java
/**
* @brief gets the implemented interface of the class element.
* @return Interface 
*/
```
```rust
pub fn getImplementsInterface(self: InnerClass) -> *Interface;
```
## InnerClass::getSuperClass

```java
/**
* @brief gets the super class of the element.
* @return Class 
*/
```
```rust
pub fn getSuperClass(self: InnerClass) -> Class;
```
## InnerClass::getAnnotation

```java
/**
* @brief gets the annotation of the class, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: InnerClass) -> *Annotation;
```
## InnerClass::getIdentifier

```java
/**
* @brief gets the identifier of the class name.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: InnerClass) -> Identifier;
```
## InnerClass::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: InnerClass) -> int;
```
## InnerClass::getParent

```java
/**
* @brief gets the parent of the method.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: InnerClass) -> ElementParent;
```
## InnerClass::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: InnerClass) -> *ElementParent;
```
## InnerClass::getPackage

```java
/**
* @brief gets the package of the class element.
* @return Package 
*/
```
```rust
pub fn getPackage(self: InnerClass) -> Package;
```
## InnerClass::getName

```java
/**
* @brief gets the name of the class.
* @return string 
*/
```
```rust
pub fn getName(self: InnerClass) -> string;
```
## InnerClass::getSuperOrImplementsType

```java
/**
* @brief gets the super class or implemented interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getSuperOrImplementsType(self: InnerClass) -> *ClassOrInterface;
```
## InnerClass::getModifier

```java
/**
* @brief gets the modifier of the Class
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: InnerClass) -> *Modifier;
```
## InnerClass::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: InnerClass) -> int;
```
## InnerClass::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: InnerClass) -> Location;
```
## InnerClass::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *InnerClass;
```
