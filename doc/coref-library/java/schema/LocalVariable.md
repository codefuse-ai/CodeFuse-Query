# LocalVariable

Inherit from [LocalVariableDO](./LocalVariableDO.md)

Primary key: `element_hash_id: int`

```rust
schema LocalVariable extends LocalVariableDO {
  @primary element_hash_id: int,
  location_hash_id: int,
  name: string,
  parent_hash_id: int,
  printable_text: string,
  index_order: int
}
```
## LocalVariable::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: LocalVariable) -> string;
```
## LocalVariable::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: LocalVariable) -> string;
```
## LocalVariable::getReferenced

```java
/**
* @brief gets the reference expression of the local variable.
* @return Expression 
*/
```
```rust
pub fn getReferenced(self: LocalVariable) -> Expression;
```
## LocalVariable::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: LocalVariable) -> int;
```
## LocalVariable::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: LocalVariable) -> int;
```
## LocalVariable::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LocalVariable;
```
## LocalVariable::getExpression

```java
/**
* @brief gets the expression of the local variable.
* @return Expression 
*/
```
```rust
pub fn getExpression(self: LocalVariable) -> Expression;
```
## LocalVariable::getLocation

```java
/**
* @brief gets the location of the local variable.
* @return Location 
*/
```
```rust
pub fn getLocation(self: LocalVariable) -> Location;
```
## LocalVariable::getAnnotation

```java
/**
* @brief gets the annotation of the class, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: LocalVariable) -> Annotation;
```
## LocalVariable::getIdentifier

```java
/**
* @brief gets the identifier of the local variable.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: LocalVariable) -> Identifier;
```
## LocalVariable::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: LocalVariable) -> *ElementParent;
```
## LocalVariable::getTypeElement

```java
/**
* @brief gets the type element for the element.
* @return TypeElement
*/
```
```rust
pub fn getTypeElement(self: LocalVariable) -> TypeElement;
```
## LocalVariable::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: LocalVariable) -> Type;
```
## LocalVariable::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: LocalVariable) -> int;
```
## LocalVariable::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: LocalVariable) -> ElementParent;
```
