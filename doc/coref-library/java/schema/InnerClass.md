# InnerClass

Primary key: `element_hash_id: int`

```rust
schema InnerClass {
  @primary element_hash_id: int,
  qualified_name: string,
  location_hash_id: int,
  identifier_hash_id: int,
  parent_hash_id: int,
}
```
## InnerClass::getAllFields

```rust
/**
     * @brief gets all fields of the class.
     * @return Field 
     */
```
```rust
pub fn getAllFields(self: InnerClass) -> *Field;
```
## InnerClass::getAnAncestorClass

```rust
/**
     * @brief gets all ancestor classes of the element.
     * @return Class
     */
```
```rust
pub fn getAnAncestorClass(self: InnerClass) -> *Class;
```
## InnerClass::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: InnerClass) -> string;
```
## InnerClass::getContainingFile

```rust
/**
     * @brief gets the containing file of the class element.
     * @return File 
     */
```
```rust
pub fn getContainingFile(self: InnerClass) -> File;
```
## InnerClass::getAnAscentantClassOrInterface

```rust
/**
     * @brief gets any ascentant class or interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getAnAscentantClassOrInterface(self: InnerClass) -> *ClassOrInterface;
```
## InnerClass::getIdentifierHashId

```rust
/**
     * @brief gets the identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getIdentifierHashId(self: InnerClass) -> int;
```
## InnerClass::getSize

```rust
/**
     * @brief gets the size information of the class element.
     * @return NumberOfLines 
     */
```
```rust
pub fn getSize(self: InnerClass) -> NumberOfLines;
```
## InnerClass::getAllMethods

```rust
/**
     * @brief gets all methods of the class element.
     * @return Method 
     */
```
```rust
pub fn getAllMethods(self: InnerClass) -> *Method;
```
## InnerClass::getImplementsInterface

```rust
/**
     * @brief gets the implemented interface of the class element.
     * @return Interface 
     */
```
```rust
pub fn getImplementsInterface(self: InnerClass) -> *Interface;
```
## InnerClass::getSuperClass

```rust
/**
     * @brief gets the super class of the element.
     * @return Class 
     */
```
```rust
pub fn getSuperClass(self: InnerClass) -> Class;
```
## InnerClass::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: InnerClass) -> *Annotation;
```
## InnerClass::getIdentifier

```rust
/**
     * @brief gets the identifier of the class name.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: InnerClass) -> Identifier;
```
## InnerClass::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: InnerClass) -> int;
```
## InnerClass::getParent

```rust
/**
     * @brief gets the parent of the method.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: InnerClass) -> ElementParent;
```
## InnerClass::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: InnerClass) -> *ElementParent;
```
## InnerClass::getPackage

```rust
/**
     * @brief gets the package of the class element.
     * @return Package 
     */
```
```rust
pub fn getPackage(self: InnerClass) -> Package;
```
## InnerClass::getName

```rust
/**
     * @brief gets the name of the class.
     * @return string 
     */
```
```rust
pub fn getName(self: InnerClass) -> string;
```
## InnerClass::getSuperOrImplementsType

```rust
/**
     * @brief gets the super class or implemented interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getSuperOrImplementsType(self: InnerClass) -> *ClassOrInterface;
```
## InnerClass::getModifier

```rust
/**
     * @brief gets the modifier of the Class
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: InnerClass) -> *Modifier;
```
## InnerClass::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: InnerClass) -> int;
```
## InnerClass::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: InnerClass) -> Location;
```
## InnerClass::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *InnerClass;
```
## InnerClass::is\<T\>

```rust
pub fn is<T>(self: InnerClass) -> bool;
```
## InnerClass::to\<T\>

```rust
pub fn to<T>(self: InnerClass) -> <any>;
```
## InnerClass::key\_neq

```rust
pub fn key_neq(self: InnerClass, object: <any>) -> bool;
```
## InnerClass::key\_eq

```rust
pub fn key_eq(self: InnerClass, object: <any>) -> bool;
```
## InnerClass::to\_set

```rust
pub fn to_set(self: InnerClass) -> *InnerClass;
```
