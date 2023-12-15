# ClassOrInterface

Primary key: `id: int`

```rust
schema ClassOrInterface {
  @primary id: int
}
```
## ClassOrInterface::getImplementsList

```java
/**
* @brief gets the implements info of the element.
* @return string 
*/
```
```rust
pub fn getImplementsList(self: ClassOrInterface) -> *string;
```
## ClassOrInterface::getModifier

```java
/**
* @brief gets the modifier info of the element.
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: ClassOrInterface) -> *Modifier;
```
## ClassOrInterface::getAnnotation

```java
/**
* @brief gets the annotation info of the element.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: ClassOrInterface) -> *Annotation;
```
## ClassOrInterface::getImportlist

```java
/**
* @brief gets the import info of the element.
* @return string 
*/
```
```rust
pub fn getImportlist(self: ClassOrInterface) -> *string;
```
## ClassOrInterface::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ClassOrInterface;
```
## ClassOrInterface::getLocation

```java
/**
* @brief gets the location info of the element.
* @return Location 
*/
```
```rust
pub fn getLocation(self: ClassOrInterface) -> Location;
```
## ClassOrInterface::getAnAscentantClassOrInterface

```java
/**
* @brief gets any ascentant class or interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getAnAscentantClassOrInterface(self: ClassOrInterface) -> *ClassOrInterface;
```
## ClassOrInterface::getClassType

```java
/**
* @brief gets the type of the class, which can be class, interface or enum.
* @return string 
*/
```
```rust
pub fn getClassType(self: ClassOrInterface) -> string;
```
## ClassOrInterface::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: ClassOrInterface) -> *ElementParent;
```
## ClassOrInterface::getParent

```java
/**
* @brief gets the parent of the method.
* @return ClassOrInterface 
*/
```
```rust
pub fn getParent(self: ClassOrInterface) -> ElementParent;
```
## ClassOrInterface::getQualifiedName

```java
/**
* @brief gets the qualified name of the element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: ClassOrInterface) -> string;
```
## ClassOrInterface::getExtendsList

```java
/**
* @brief gets the extends info of the element.
* @return string 
*/
```
```rust
pub fn getExtendsList(self: ClassOrInterface) -> *string;
```
## ClassOrInterface::getPackageInfo

```java
/**
* @brief gets the package info of the element.
* @return string 
*/
```
```rust
pub fn getPackageInfo(self: ClassOrInterface) -> string;
```
## ClassOrInterface::getSuperOrImplementsType

```java
/**
* @brief gets the super class or implemented interface of the class element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getSuperOrImplementsType(self: ClassOrInterface) -> *ClassOrInterface;
```
## ClassOrInterface::getName

```java
/**
* @brief gets the name of the element.
* @return string
*/
```
```rust
pub fn getName(self: ClassOrInterface) -> string;
```
