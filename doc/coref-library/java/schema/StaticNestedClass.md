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

```rust
/**
     * @brief gets all fields of the class.
     * @return Field 
     */
```
```rust
pub fn getAllFields(self: StaticNestedClass) -> *Field;
```
## StaticNestedClass::getAnAncestorClass

```rust
/**
     * @brief gets all ancestor classes of the element.
     * @return Class
     */
```
```rust
pub fn getAnAncestorClass(self: StaticNestedClass) -> *Class;
```
## StaticNestedClass::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: StaticNestedClass) -> string;
```
## StaticNestedClass::getContainingFile

```rust
/**
     * @brief gets the containing file of the class element.
     * @return File 
     */
```
```rust
pub fn getContainingFile(self: StaticNestedClass) -> File;
```
## StaticNestedClass::getAnAscentantClassOrInterface

```rust
/**
     * @brief gets any ascentant class or interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getAnAscentantClassOrInterface(self: StaticNestedClass) -> *ClassOrInterface;
```
## StaticNestedClass::getIdentifierHashId

```rust
/**
     * @brief gets the identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getIdentifierHashId(self: StaticNestedClass) -> int;
```
## StaticNestedClass::getSize

```rust
/**
     * @brief gets the size information of the class element.
     * @return NumberOfLines 
     */
```
```rust
pub fn getSize(self: StaticNestedClass) -> NumberOfLines;
```
## StaticNestedClass::getAllMethods

```rust
/**
     * @brief gets all methods of the class element.
     * @return Method 
     */
```
```rust
pub fn getAllMethods(self: StaticNestedClass) -> *Method;
```
## StaticNestedClass::getImplementsInterface

```rust
/**
     * @brief gets the implemented interface of the class element.
     * @return Interface 
     */
```
```rust
pub fn getImplementsInterface(self: StaticNestedClass) -> *Interface;
```
## StaticNestedClass::getSuperClass

```rust
/**
     * @brief gets the super class of the element.
     * @return Class 
     */
```
```rust
pub fn getSuperClass(self: StaticNestedClass) -> Class;
```
## StaticNestedClass::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: StaticNestedClass) -> *Annotation;
```
## StaticNestedClass::getIdentifier

```rust
/**
     * @brief gets the identifier of the class name.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: StaticNestedClass) -> Identifier;
```
## StaticNestedClass::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: StaticNestedClass) -> int;
```
## StaticNestedClass::getParent

```rust
/**
     * @brief gets the parent of the method.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: StaticNestedClass) -> ElementParent;
```
## StaticNestedClass::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: StaticNestedClass) -> *ElementParent;
```
## StaticNestedClass::getPackage

```rust
/**
     * @brief gets the package of the class element.
     * @return Package 
     */
```
```rust
pub fn getPackage(self: StaticNestedClass) -> Package;
```
## StaticNestedClass::getName

```rust
/**
     * @brief gets the name of the class.
     * @return string 
     */
```
```rust
pub fn getName(self: StaticNestedClass) -> string;
```
## StaticNestedClass::getSuperOrImplementsType

```rust
/**
     * @brief gets the super class or implemented interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getSuperOrImplementsType(self: StaticNestedClass) -> *ClassOrInterface;
```
## StaticNestedClass::getModifier

```rust
/**
     * @brief gets the modifier of the Class
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: StaticNestedClass) -> *Modifier;
```
## StaticNestedClass::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: StaticNestedClass) -> int;
```
## StaticNestedClass::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: StaticNestedClass) -> Location;
```
## StaticNestedClass::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *StaticNestedClass;
```
## StaticNestedClass::is\<T\>

```rust
pub fn is<T>(self: StaticNestedClass) -> bool;
```
## StaticNestedClass::to\<T\>

```rust
pub fn to<T>(self: StaticNestedClass) -> <any>;
```
## StaticNestedClass::key\_neq

```rust
pub fn key_neq(self: StaticNestedClass, object: <any>) -> bool;
```
## StaticNestedClass::key\_eq

```rust
pub fn key_eq(self: StaticNestedClass, object: <any>) -> bool;
```
## StaticNestedClass::to\_set

```rust
pub fn to_set(self: StaticNestedClass) -> *StaticNestedClass;
```
