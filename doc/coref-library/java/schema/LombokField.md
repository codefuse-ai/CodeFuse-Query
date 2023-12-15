# LombokField

Inherit from [Field](./Field.md)

Primary key: `element_hash_id: int`

```rust
schema LombokField extends Field {
  printable_text: string,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int
}
```
## LombokField::getModifier

```java
/**
* @brief gets the modifier of the constructor
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: LombokField) -> *Modifier;
```
## LombokField::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: LombokField) -> Type;
```
## LombokField::getBelongedClass

```java
/**
* @brief gets the contained class of the field.
* @return Class 
*/
```
```rust
pub fn getBelongedClass(self: LombokField) -> Class;
```
## LombokField::getAnnotation

```java
/**
* @brief gets the annotation of the field, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: LombokField) -> *Annotation;
```
## LombokField::getIdentifier

```java
/**
* @brief gets the identifier of the element.
* @return Identifier 
*/
```
```rust
pub fn getIdentifier(self: LombokField) -> Identifier;
```
## LombokField::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LombokField;
```
## LombokField::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: LombokField) -> int;
```
## LombokField::getLocation

```java
/**
* @brief gets the location of the element.
* @return Location 
*/
```
```rust
pub fn getLocation(self: LombokField) -> Location;
```
## LombokField::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: LombokField) -> int;
```
## LombokField::getParent

```java
/**
* @brief gets the parent of the constructor.
* @return ClassOrInterface 
*/
```
```rust
pub fn getParent(self: LombokField) -> ClassOrInterface;
```
## LombokField::getDefaultValue

```java
/**
* @brief gets the default value of the element, if any.
* @return string 
*/
```
```rust
pub fn getDefaultValue(self: LombokField) -> string;
```
## LombokField::getTypeElement

```java
/**
* @brief gets the type element for the element.
* @return TypeElement
*/
```
```rust
pub fn getTypeElement(self: LombokField) -> TypeElement;
```
## LombokField::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: LombokField) -> *ElementParent;
```
## LombokField::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: LombokField) -> string;
```
## LombokField::getLombokMethodName

```rust
pub fn getLombokMethodName(self: LombokField) -> *string;
```
## LombokField::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: LombokField) -> string;
```
