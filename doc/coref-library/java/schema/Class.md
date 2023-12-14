# Class

Primary key: `element_hash_id: int`

```rust
schema Class {
  @primary element_hash_id: int,
  qualified_name: string,
  location_hash_id: int,
  identifier_hash_id: int,
  parent_hash_id: int,
}
```
## Class::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: Class) -> string;
```
## Class::getIdentifierHashId

```rust
/**
     * @brief gets the identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getIdentifierHashId(self: Class) -> int;
```
## Class::getSize

```rust
/**
     * @brief gets the size information of the class element.
     * @return NumberOfLines 
     */
```
```rust
pub fn getSize(self: Class) -> NumberOfLines;
```
## Class::getContainingFile

```rust
/**
     * @brief gets the containing file of the class element.
     * @return File 
     */
```
```rust
pub fn getContainingFile(self: Class) -> File;
```
## Class::getAllMethods

```rust
/**
     * @brief gets all methods of the class element.
     * @return Method 
     */
```
```rust
pub fn getAllMethods(self: Class) -> *Method;
```
## Class::getAllFields

```rust
/**
     * @brief gets all fields of the class.
     * @return Field 
     */
```
```rust
pub fn getAllFields(self: Class) -> *Field;
```
## Class::getAnAncestorClass

```rust
/**
     * @brief gets all ancestor classes of the element.
     * @return Class
     */
```
```rust
pub fn getAnAncestorClass(self: Class) -> *Class;
```
## Class::getAnAscentantClassOrInterface

```rust
/**
     * @brief gets any ascentant class or interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getAnAscentantClassOrInterface(self: Class) -> *ClassOrInterface;
```
## Class::getImplementsInterface

```rust
/**
     * @brief gets the implemented interface of the class element.
     * @return Interface 
     */
```
```rust
pub fn getImplementsInterface(self: Class) -> *Interface;
```
## Class::getSuperClass

```rust
/**
     * @brief gets the super class of the element.
     * @return Class 
     */
```
```rust
pub fn getSuperClass(self: Class) -> Class;
```
## Class::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Class) -> int;
```
## Class::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Class;
```
## Class::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Class) -> Location;
```
## Class::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: Class) -> *Annotation;
```
## Class::getIdentifier

```rust
/**
     * @brief gets the identifier of the class name.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: Class) -> Identifier;
```
## Class::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Class) -> int;
```
## Class::getParent

```rust
/**
     * @brief gets the parent of the method.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: Class) -> ElementParent;
```
## Class::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Class) -> *ElementParent;
```
## Class::getSuperOrImplementsType

```rust
/**
     * @brief gets the super class or implemented interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getSuperOrImplementsType(self: Class) -> *ClassOrInterface;
```
## Class::getPackage

```rust
/**
     * @brief gets the package of the class element.
     * @return Package 
     */
```
```rust
pub fn getPackage(self: Class) -> Package;
```
## Class::getName

```rust
/**
     * @brief gets the name of the class.
     * @return string 
     */
```
```rust
pub fn getName(self: Class) -> string;
```
## Class::getModifier

```rust
/**
     * @brief gets the modifier of the Class
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: Class) -> *Modifier;
```
## Class::is\<T\>

```rust
pub fn is<T>(self: Class) -> bool;
```
## Class::to\<T\>

```rust
pub fn to<T>(self: Class) -> <any>;
```
## Class::key\_neq

```rust
pub fn key_neq(self: Class, object: <any>) -> bool;
```
## Class::key\_eq

```rust
pub fn key_eq(self: Class, object: <any>) -> bool;
```
## Class::to\_set

```rust
pub fn to_set(self: Class) -> *Class;
```
