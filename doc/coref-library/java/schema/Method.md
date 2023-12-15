# Method

Inherit from [MethodDO](./MethodDO.md)

Primary key: `element_hash_id: int`

```rust
schema Method extends MethodDO {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  signature: string,
  type_hash_id: int,
  parent_hash_id: int,
  definition_body: string
}
```
## Method::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Method) -> string;
```
## Method::getDefinitionBody

```rust
pub fn getDefinitionBody(self: Method) -> string;
```
## Method::getReturnTypeElement

```java
/**
* @brief gets the return type element for the method.
* @return TypeElement
*/
```
```rust
pub fn getReturnTypeElement(self: Method) -> TypeElement;
```
## Method::getThrowsList

```java
/**
* @description gets the Throw list of the method, if any.
* @return ReferenceList
*/
```
```rust
pub fn getThrowsList(self: Method) -> ReferenceList;
```
## Method::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Method) -> *ElementParent;
```
## Method::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Method) -> int;
```
## Method::getParent

```java
/**
* @brief gets the parent of the method.
* @return ClassOrInterface 
*/
```
```rust
pub fn getParent(self: Method) -> ClassOrInterface;
```
## Method::getAnAccess

```java
/**
* @brief gets a method access expression that calls the method.
* @return MethodAccessExpression 
*/
```
```rust
pub fn getAnAccess(self: Method) -> *MethodAccessExpression;
```
## Method::getSignature

```java
/**
* @brief gets the signature of this element.
* @return string
*/
```
```rust
pub fn getSignature(self: Method) -> string;
```
## Method::getAnnotation

```java
/**
* @brief gets the annotation of the method, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: Method) -> *Annotation;
```
## Method::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Method) -> int;
```
## Method::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Method) -> Location;
```
## Method::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Method;
```
## Method::getModifier

```java
/**
* @brief gets the modifier of the Method
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: Method) -> *Modifier;
```
## Method::getParameter

```java
/**
* @brief gets the parameter of the method, if any.
* @return Parameter 
*/
```
```rust
pub fn getParameter(self: Method) -> *Parameter;
```
## Method::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: Method) -> int;
```
## Method::getBelongedClass

```java
/**
* @brief gets the class contains the Method
* @return Class 
*/
```
```rust
pub fn getBelongedClass(self: Method) -> Class;
```
## Method::getPolyMethod

```java
/**
* @brief gets the polymorphism methods of the method, if any.
* @return Method 
*/
```
```rust
pub fn getPolyMethod(self: Method) -> *Method;
```
## Method::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: Method) -> Type;
```
## Method::getBody

```java
/**
* @brief gets the body of the method.
* @return CodeBlock 
*/
```
```rust
pub fn getBody(self: Method) -> CodeBlock;
```
## Method::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: Method) -> NumberOfLines;
```
