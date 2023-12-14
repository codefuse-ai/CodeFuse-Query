# Field

Inherit from [FieldDO](./FieldDO.md)

Primary key: `element_hash_id: int`

```rust
schema Field extends FieldDO {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  printable_text: string,
}
```
## Field::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Field) -> string;
```
## Field::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: Field) -> string;
```
## Field::getTypeElement

```java
/**
* @brief gets the type element for the element.
* @return TypeElement
*/
```
```rust
pub fn getTypeElement(self: Field) -> TypeElement;
```
## Field::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Field) -> *ElementParent;
```
## Field::getDefaultValue

```java
/**
* @brief gets the default value of the element, if any.
* @return string 
*/
```
```rust
pub fn getDefaultValue(self: Field) -> string;
```
## Field::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Field) -> int;
```
## Field::getParent

```java
/**
* @brief gets the parent of the constructor.
* @return ClassOrInterface 
*/
```
```rust
pub fn getParent(self: Field) -> ClassOrInterface;
```
## Field::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Field) -> int;
```
## Field::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Field;
```
## Field::getLocation

```java
/**
* @brief gets the location of the element.
* @return Location 
*/
```
```rust
pub fn getLocation(self: Field) -> Location;
```
## Field::getIdentifier

```java
/**
* @brief gets the identifier of the element.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: Field) -> Identifier;
```
## Field::getAnnotation

```java
/**
* @brief gets the annotation of the field, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: Field) -> *Annotation;
```
## Field::getBelongedClass

```java
/**
* @brief gets the contained class of the field.
* @return Class 
*/
```
```rust
pub fn getBelongedClass(self: Field) -> Class;
```
## Field::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: Field) -> Type;
```
## Field::getModifier

```java
/**
* @brief gets the modifier of the constructor
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: Field) -> *Modifier;
```
