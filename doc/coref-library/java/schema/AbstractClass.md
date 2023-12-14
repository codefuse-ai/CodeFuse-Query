# AbstractClass

Primary key: `element_hash_id: int`

```rust
schema AbstractClass {
  parent_hash_id: int,
  identifier_hash_id: int,
  location_hash_id: int,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## AbstractClass::getModifier

```rust
/**
     * @brief gets the modifier of the Class
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: AbstractClass) -> *Modifier;
```
## AbstractClass::getName

```rust
/**
     * @brief gets the name of the class.
     * @return string 
     */
```
```rust
pub fn getName(self: AbstractClass) -> string;
```
## AbstractClass::getPackage

```rust
/**
     * @brief gets the package of the class element.
     * @return Package 
     */
```
```rust
pub fn getPackage(self: AbstractClass) -> Package;
```
## AbstractClass::getSuperOrImplementsType

```rust
/**
     * @brief gets the super class or implemented interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getSuperOrImplementsType(self: AbstractClass) -> *ClassOrInterface;
```
## AbstractClass::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: AbstractClass) -> *ElementParent;
```
## AbstractClass::getParent

```rust
/**
     * @brief gets the parent of the method.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: AbstractClass) -> ElementParent;
```
## AbstractClass::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: AbstractClass) -> int;
```
## AbstractClass::getIdentifier

```rust
/**
     * @brief gets the identifier of the class name.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: AbstractClass) -> Identifier;
```
## AbstractClass::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: AbstractClass) -> *Annotation;
```
## AbstractClass::getSuperClass

```rust
/**
     * @brief gets the super class of the element.
     * @return Class 
     */
```
```rust
pub fn getSuperClass(self: AbstractClass) -> Class;
```
## AbstractClass::getImplementsInterface

```rust
/**
     * @brief gets the implemented interface of the class element.
     * @return Interface 
     */
```
```rust
pub fn getImplementsInterface(self: AbstractClass) -> *Interface;
```
## AbstractClass::getAllMethods

```rust
/**
     * @brief gets all methods of the class element.
     * @return Method 
     */
```
```rust
pub fn getAllMethods(self: AbstractClass) -> *Method;
```
## AbstractClass::getSize

```rust
/**
     * @brief gets the size information of the class element.
     * @return NumberOfLines 
     */
```
```rust
pub fn getSize(self: AbstractClass) -> NumberOfLines;
```
## AbstractClass::getIdentifierHashId

```rust
/**
     * @brief gets the identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getIdentifierHashId(self: AbstractClass) -> int;
```
## AbstractClass::getAnAscentantClassOrInterface

```rust
/**
     * @brief gets any ascentant class or interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getAnAscentantClassOrInterface(self: AbstractClass) -> *ClassOrInterface;
```
## AbstractClass::getContainingFile

```rust
/**
     * @brief gets the containing file of the class element.
     * @return File 
     */
```
```rust
pub fn getContainingFile(self: AbstractClass) -> File;
```
## AbstractClass::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: AbstractClass) -> string;
```
## AbstractClass::getAnAncestorClass

```rust
/**
     * @brief gets all ancestor classes of the element.
     * @return Class
     */
```
```rust
pub fn getAnAncestorClass(self: AbstractClass) -> *Class;
```
## AbstractClass::getAllFields

```rust
/**
     * @brief gets all fields of the class.
     * @return Field 
     */
```
```rust
pub fn getAllFields(self: AbstractClass) -> *Field;
```
## AbstractClass::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AbstractClass) -> Location;
```
## AbstractClass::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: AbstractClass) -> int;
```
## AbstractClass::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AbstractClass;
```
## AbstractClass::is\<T\>

```rust
pub fn is<T>(self: AbstractClass) -> bool;
```
## AbstractClass::to\<T\>

```rust
pub fn to<T>(self: AbstractClass) -> <any>;
```
## AbstractClass::key\_neq

```rust
pub fn key_neq(self: AbstractClass, object: <any>) -> bool;
```
## AbstractClass::key\_eq

```rust
pub fn key_eq(self: AbstractClass, object: <any>) -> bool;
```
## AbstractClass::to\_set

```rust
pub fn to_set(self: AbstractClass) -> *AbstractClass;
```
