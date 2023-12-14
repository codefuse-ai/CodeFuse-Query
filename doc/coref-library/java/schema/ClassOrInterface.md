# ClassOrInterface

Primary key: `id: int`

```rust
schema ClassOrInterface {
  @primary id: int,
}
```
## ClassOrInterface::getImplementsList

```rust
/**
     * @brief gets the implements info of the element.
     * @return string 
     */
```
```rust
pub fn getImplementsList(self: ClassOrInterface) -> *string;
```
## ClassOrInterface::getModifier

```rust
/**
     * @brief gets the modifier info of the element.
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: ClassOrInterface) -> *Modifier;
```
## ClassOrInterface::getAnnotation

```rust
/**
     * @brief gets the annotation info of the element.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: ClassOrInterface) -> *Annotation;
```
## ClassOrInterface::getImportlist

```rust
/**
     * @brief gets the import info of the element.
     * @return string 
     */
```
```rust
pub fn getImportlist(self: ClassOrInterface) -> *string;
```
## ClassOrInterface::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ClassOrInterface;
```
## ClassOrInterface::getLocation

```rust
/**
     * @brief gets the location info of the element.
     * @return Location 
     */
```
```rust
pub fn getLocation(self: ClassOrInterface) -> Location;
```
## ClassOrInterface::getAnAscentantClassOrInterface

```rust
/**
     * @brief gets any ascentant class or interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getAnAscentantClassOrInterface(self: ClassOrInterface) -> *ClassOrInterface;
```
## ClassOrInterface::getClassType

```rust
/**
     * @brief gets the type of the class, which can be class, interface or enum.
     * @return string 
     */
```
```rust
pub fn getClassType(self: ClassOrInterface) -> string;
```
## ClassOrInterface::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ClassOrInterface) -> *ElementParent;
```
## ClassOrInterface::getParent

```rust
/**
     * @brief gets the parent of the method.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getParent(self: ClassOrInterface) -> ElementParent;
```
## ClassOrInterface::getQualifiedName

```rust
/**
     * @brief gets the qualified name of the element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: ClassOrInterface) -> string;
```
## ClassOrInterface::getExtendsList

```rust
/**
     * @brief gets the extends info of the element.
     * @return string 
     */
```
```rust
pub fn getExtendsList(self: ClassOrInterface) -> *string;
```
## ClassOrInterface::getPackageInfo

```rust
/**
     * @brief gets the package info of the element.
     * @return string 
     */
```
```rust
pub fn getPackageInfo(self: ClassOrInterface) -> string;
```
## ClassOrInterface::getSuperOrImplementsType

```rust
/**
     * @brief gets the super class or implemented interface of the class element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getSuperOrImplementsType(self: ClassOrInterface) -> *ClassOrInterface;
```
## ClassOrInterface::getName

```rust
/**
     * @brief gets the name of the element.
     * @return string
     */
```
```rust
pub fn getName(self: ClassOrInterface) -> string;
```
## ClassOrInterface::is\<T\>

```rust
pub fn is<T>(self: ClassOrInterface) -> bool;
```
## ClassOrInterface::to\<T\>

```rust
pub fn to<T>(self: ClassOrInterface) -> <any>;
```
## ClassOrInterface::key\_neq

```rust
pub fn key_neq(self: ClassOrInterface, object: <any>) -> bool;
```
## ClassOrInterface::key\_eq

```rust
pub fn key_eq(self: ClassOrInterface, object: <any>) -> bool;
```
## ClassOrInterface::to\_set

```rust
pub fn to_set(self: ClassOrInterface) -> *ClassOrInterface;
```
