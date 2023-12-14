# EnumClass

Primary key: `element_hash_id: int`

```rust
schema EnumClass {
  parent_hash_id: int,
  identifier_hash_id: int,
  location_hash_id: int,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## EnumClass::getModifier

```java
/**
* @brief gets the modifier of the Class
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: EnumClass) -> *Modifier;
```
## EnumClass::getName

```java
/**
* @brief gets the name of the class.
* @return string 
*/
```
```rust
pub fn getName(self: EnumClass) -> string;
```
## EnumClass::getPackage

```java
/**
* @brief gets the package of the class element.
* @return Package 
*/
```
```rust
pub fn getPackage(self: EnumClass) -> Package;
```
## EnumClass::getSuperOrImplementsType

```java
/**
* @brief gets the super class or implemented interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getSuperOrImplementsType(self: EnumClass) -> *ClassOrInterface;
```
## EnumClass::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: EnumClass) -> *ElementParent;
```
## EnumClass::getParent

```java
/**
* @brief gets the parent of the method.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: EnumClass) -> ElementParent;
```
## EnumClass::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: EnumClass) -> int;
```
## EnumClass::getIdentifier

```java
/**
* @brief gets the identifier of the class name.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: EnumClass) -> Identifier;
```
## EnumClass::getAnnotation

```java
/**
* @brief gets the annotation of the class, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: EnumClass) -> *Annotation;
```
## EnumClass::getSuperClass

```java
/**
* @brief gets the super class of the element.
* @return Class 
*/
```
```rust
pub fn getSuperClass(self: EnumClass) -> Class;
```
## EnumClass::getImplementsInterface

```java
/**
* @brief gets the implemented interface of the class element.
* @return Interface 
*/
```
```rust
pub fn getImplementsInterface(self: EnumClass) -> *Interface;
```
## EnumClass::getAllMethods

```java
/**
* @brief gets all methods of the class element.
* @return Method 
*/
```
```rust
pub fn getAllMethods(self: EnumClass) -> *Method;
```
## EnumClass::getSize

```java
/**
* @brief gets the size information of the class element.
* @return NumberOfLines 
*/
```
```rust
pub fn getSize(self: EnumClass) -> NumberOfLines;
```
## EnumClass::getIdentifierHashId

```java
/**
* @brief gets the identifier hash id of this element.
* @return int
*/
```
```rust
pub fn getIdentifierHashId(self: EnumClass) -> int;
```
## EnumClass::getAnAscentantClassOrInterface

```java
/**
* @brief gets any ascentant class or interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getAnAscentantClassOrInterface(self: EnumClass) -> *ClassOrInterface;
```
## EnumClass::getContainingFile

```java
/**
* @brief gets the containing file of the class element.
* @return File 
*/
```
```rust
pub fn getContainingFile(self: EnumClass) -> File;
```
## EnumClass::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: EnumClass) -> string;
```
## EnumClass::getAnAncestorClass

```java
/**
* @brief gets all ancestor classes of the element.
* @return Class
*/
```
```rust
pub fn getAnAncestorClass(self: EnumClass) -> *Class;
```
## EnumClass::getAllFields

```java
/**
* @brief gets all fields of the class.
* @return Field 
*/
```
```rust
pub fn getAllFields(self: EnumClass) -> *Field;
```
## EnumClass::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: EnumClass) -> Location;
```
## EnumClass::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: EnumClass) -> int;
```
## EnumClass::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *EnumClass;
```
