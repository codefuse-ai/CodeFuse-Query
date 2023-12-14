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

```rust
/**
     * @brief gets the modifier of the Class
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: EnumClass) -> *Modifier;
```
## EnumClass::getName

```rust
/**
     * @brief gets the name of the class.
     * @return string 
     */
```
```rust
pub fn getName(self: EnumClass) -> string;
```
## EnumClass::getPackage

```rust
/**
     * @brief gets the package of the class element.
     * @return Package 
     */
```
```rust
pub fn getPackage(self: EnumClass) -> Package;
```
## EnumClass::getSuperOrImplementsType

```rust
/**
     * @brief gets the super class or implemented interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getSuperOrImplementsType(self: EnumClass) -> *ClassOrInterface;
```
## EnumClass::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: EnumClass) -> *ElementParent;
```
## EnumClass::getParent

```rust
/**
     * @brief gets the parent of the method.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: EnumClass) -> ElementParent;
```
## EnumClass::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: EnumClass) -> int;
```
## EnumClass::getIdentifier

```rust
/**
     * @brief gets the identifier of the class name.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: EnumClass) -> Identifier;
```
## EnumClass::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: EnumClass) -> *Annotation;
```
## EnumClass::getSuperClass

```rust
/**
     * @brief gets the super class of the element.
     * @return Class 
     */
```
```rust
pub fn getSuperClass(self: EnumClass) -> Class;
```
## EnumClass::getImplementsInterface

```rust
/**
     * @brief gets the implemented interface of the class element.
     * @return Interface 
     */
```
```rust
pub fn getImplementsInterface(self: EnumClass) -> *Interface;
```
## EnumClass::getAllMethods

```rust
/**
     * @brief gets all methods of the class element.
     * @return Method 
     */
```
```rust
pub fn getAllMethods(self: EnumClass) -> *Method;
```
## EnumClass::getSize

```rust
/**
     * @brief gets the size information of the class element.
     * @return NumberOfLines 
     */
```
```rust
pub fn getSize(self: EnumClass) -> NumberOfLines;
```
## EnumClass::getIdentifierHashId

```rust
/**
     * @brief gets the identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getIdentifierHashId(self: EnumClass) -> int;
```
## EnumClass::getAnAscentantClassOrInterface

```rust
/**
     * @brief gets any ascentant class or interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getAnAscentantClassOrInterface(self: EnumClass) -> *ClassOrInterface;
```
## EnumClass::getContainingFile

```rust
/**
     * @brief gets the containing file of the class element.
     * @return File 
     */
```
```rust
pub fn getContainingFile(self: EnumClass) -> File;
```
## EnumClass::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: EnumClass) -> string;
```
## EnumClass::getAnAncestorClass

```rust
/**
     * @brief gets all ancestor classes of the element.
     * @return Class
     */
```
```rust
pub fn getAnAncestorClass(self: EnumClass) -> *Class;
```
## EnumClass::getAllFields

```rust
/**
     * @brief gets all fields of the class.
     * @return Field 
     */
```
```rust
pub fn getAllFields(self: EnumClass) -> *Field;
```
## EnumClass::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: EnumClass) -> Location;
```
## EnumClass::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: EnumClass) -> int;
```
## EnumClass::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *EnumClass;
```
## EnumClass::is\<T\>

```rust
pub fn is<T>(self: EnumClass) -> bool;
```
## EnumClass::to\<T\>

```rust
pub fn to<T>(self: EnumClass) -> <any>;
```
## EnumClass::key\_neq

```rust
pub fn key_neq(self: EnumClass, object: <any>) -> bool;
```
## EnumClass::key\_eq

```rust
pub fn key_eq(self: EnumClass, object: <any>) -> bool;
```
## EnumClass::to\_set

```rust
pub fn to_set(self: EnumClass) -> *EnumClass;
```
