# Parameter

Inherit from [ParameterDO](./ParameterDO.md)

Primary key: `element_hash_id: int`

```rust
schema Parameter extends ParameterDO {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  index_order: int,
  printable_text: string,
  type_hash_id: int,
}
```
## Parameter::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: Parameter) -> int;
```
## Parameter::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: Parameter) -> int;
```
## Parameter::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: Parameter) -> string;
```
## Parameter::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Parameter;
```
## Parameter::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Parameter) -> int;
```
## Parameter::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Parameter) -> Location;
```
## Parameter::getTypeElement

```java
/**
* @brief gets the type element for the element.
* @return TypeElement
*/
```
```rust
pub fn getTypeElement(self: Parameter) -> TypeElement;
```
## Parameter::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Parameter) -> *ElementParent;
```
## Parameter::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Parameter) -> int;
```
## Parameter::getParent

```java
/**
* @brief gets the parent of the element, which can be a for each statement, lambda expression, a callable, or a catch clause section.
* @return ExpressionParent 
*/
```
```rust
pub fn getParent(self: Parameter) -> ElementParent;
```
## Parameter::getAnnotation

```java
/**
* @brief gets the annotation of the class, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: Parameter) -> Annotation;
```
## Parameter::getIdentifier

```java
/**
* @brief gets the identifier of the parameter. 
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: Parameter) -> Identifier;
```
## Parameter::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: Parameter) -> Type;
```
## Parameter::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Parameter) -> string;
```
## Parameter::getTypeName

```java
/**
* @brief gets the name of the parameter
* @return string 
*/
```
```rust
pub fn getTypeName(self: Parameter) -> string;
```
