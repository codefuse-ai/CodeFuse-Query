# Method

Primary key: `element_hash_id: int`

```rust
schema Method {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  signature: string,
  type_hash_id: int,
  parent_hash_id: int,
  definition_body: string,
}
```
## Method::getName

```rust
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

```rust
/**
     * @brief gets the return type element for the method.
     * @return TypeElement
     */
```
```rust
pub fn getReturnTypeElement(self: Method) -> TypeElement;
```
## Method::getThrowsList

```rust
/**
     * @description gets the Throw list of the method, if any.
     * @return ReferenceList
     */
```
```rust
pub fn getThrowsList(self: Method) -> ReferenceList;
```
## Method::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Method) -> *ElementParent;
```
## Method::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Method) -> int;
```
## Method::getParent

```rust
/**
     * @brief gets the parent of the method.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getParent(self: Method) -> ClassOrInterface;
```
## Method::getAnAccess

```rust
/**
     * @brief gets a method access expression that calls the method.
     * @return MethodAccessExpression 
     */
```
```rust
pub fn getAnAccess(self: Method) -> *MethodAccessExpression;
```
## Method::getSignature

```rust
/**
     * @brief gets the signature of this element.
     * @return string
     */
```
```rust
pub fn getSignature(self: Method) -> string;
```
## Method::getAnnotation

```rust
/**
     * @brief gets the annotation of the method, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: Method) -> *Annotation;
```
## Method::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Method) -> int;
```
## Method::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Method) -> Location;
```
## Method::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Method;
```
## Method::getModifier

```rust
/**
     * @brief gets the modifier of the Method
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: Method) -> *Modifier;
```
## Method::getParameter

```rust
/**
     * @brief gets the parameter of the method, if any.
     * @return Parameter 
     */
```
```rust
pub fn getParameter(self: Method) -> *Parameter;
```
## Method::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: Method) -> int;
```
## Method::getBelongedClass

```rust
/**
     * @brief gets the class contains the Method
     * @return Class 
     */
```
```rust
pub fn getBelongedClass(self: Method) -> Class;
```
## Method::getPolyMethod

```rust
/**
     * @brief gets the polymorphism methods of the method, if any.
     * @return Method 
     */
```
```rust
pub fn getPolyMethod(self: Method) -> *Method;
```
## Method::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: Method) -> Type;
```
## Method::getBody

```rust
/**
     * @brief gets the body of the method.
     * @return CodeBlock 
     */
```
```rust
pub fn getBody(self: Method) -> CodeBlock;
```
## Method::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Method) -> NumberOfLines;
```
## Method::is\<T\>

```rust
pub fn is<T>(self: Method) -> bool;
```
## Method::to\<T\>

```rust
pub fn to<T>(self: Method) -> <any>;
```
## Method::key\_neq

```rust
pub fn key_neq(self: Method, object: <any>) -> bool;
```
## Method::key\_eq

```rust
pub fn key_eq(self: Method, object: <any>) -> bool;
```
## Method::to\_set

```rust
pub fn to_set(self: Method) -> *Method;
```
