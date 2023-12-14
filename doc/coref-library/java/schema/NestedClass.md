# NestedClass

Primary key: `element_hash_id: int`

```rust
schema NestedClass {
  parent_hash_id: int,
  identifier_hash_id: int,
  location_hash_id: int,
  qualified_name: string,
  @primary element_hash_id: int,
}
```
## NestedClass::getModifier

```rust
/**
     * @brief gets the modifier of the Class
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: NestedClass) -> *Modifier;
```
## NestedClass::getName

```rust
/**
     * @brief gets the name of the class.
     * @return string 
     */
```
```rust
pub fn getName(self: NestedClass) -> string;
```
## NestedClass::getPackage

```rust
/**
     * @brief gets the package of the class element.
     * @return Package 
     */
```
```rust
pub fn getPackage(self: NestedClass) -> Package;
```
## NestedClass::getSuperOrImplementsType

```rust
/**
     * @brief gets the super class or implemented interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getSuperOrImplementsType(self: NestedClass) -> *ClassOrInterface;
```
## NestedClass::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: NestedClass) -> *ElementParent;
```
## NestedClass::getParent

```rust
/**
     * @brief gets the parent of the method.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: NestedClass) -> ElementParent;
```
## NestedClass::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: NestedClass) -> int;
```
## NestedClass::getIdentifier

```rust
/**
     * @brief gets the identifier of the class name.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: NestedClass) -> Identifier;
```
## NestedClass::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: NestedClass) -> *Annotation;
```
## NestedClass::getSuperClass

```rust
/**
     * @brief gets the super class of the element.
     * @return Class 
     */
```
```rust
pub fn getSuperClass(self: NestedClass) -> Class;
```
## NestedClass::getImplementsInterface

```rust
/**
     * @brief gets the implemented interface of the class element.
     * @return Interface 
     */
```
```rust
pub fn getImplementsInterface(self: NestedClass) -> *Interface;
```
## NestedClass::getAllMethods

```rust
/**
     * @brief gets all methods of the class element.
     * @return Method 
     */
```
```rust
pub fn getAllMethods(self: NestedClass) -> *Method;
```
## NestedClass::getSize

```rust
/**
     * @brief gets the size information of the class element.
     * @return NumberOfLines 
     */
```
```rust
pub fn getSize(self: NestedClass) -> NumberOfLines;
```
## NestedClass::getIdentifierHashId

```rust
/**
     * @brief gets the identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getIdentifierHashId(self: NestedClass) -> int;
```
## NestedClass::getAnAscentantClassOrInterface

```rust
/**
     * @brief gets any ascentant class or interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getAnAscentantClassOrInterface(self: NestedClass) -> *ClassOrInterface;
```
## NestedClass::getContainingFile

```rust
/**
     * @brief gets the containing file of the class element.
     * @return File 
     */
```
```rust
pub fn getContainingFile(self: NestedClass) -> File;
```
## NestedClass::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: NestedClass) -> string;
```
## NestedClass::getAnAncestorClass

```rust
/**
     * @brief gets all ancestor classes of the element.
     * @return Class
     */
```
```rust
pub fn getAnAncestorClass(self: NestedClass) -> *Class;
```
## NestedClass::getAllFields

```rust
/**
     * @brief gets all fields of the class.
     * @return Field 
     */
```
```rust
pub fn getAllFields(self: NestedClass) -> *Field;
```
## NestedClass::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: NestedClass) -> Location;
```
## NestedClass::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: NestedClass) -> int;
```
## NestedClass::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NestedClass;
```
## NestedClass::is\<T\>

```rust
pub fn is<T>(self: NestedClass) -> bool;
```
## NestedClass::to\<T\>

```rust
pub fn to<T>(self: NestedClass) -> <any>;
```
## NestedClass::key\_neq

```rust
pub fn key_neq(self: NestedClass, object: <any>) -> bool;
```
## NestedClass::key\_eq

```rust
pub fn key_eq(self: NestedClass, object: <any>) -> bool;
```
## NestedClass::to\_set

```rust
pub fn to_set(self: NestedClass) -> *NestedClass;
```
