# LombokField

Primary key: `element_hash_id: int`

```rust
schema LombokField {
  printable_text: string,
  parent_hash_id: int,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## LombokField::getModifier

```rust
/**
     * @brief gets the modifier of the constructor
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: LombokField) -> *Modifier;
```
## LombokField::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: LombokField) -> Type;
```
## LombokField::getBelongedClass

```rust
/**
     * @brief gets the contained class of the field.
     * @return Class 
     */
```
```rust
pub fn getBelongedClass(self: LombokField) -> Class;
```
## LombokField::getAnnotation

```rust
/**
     * @brief gets the annotation of the field, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: LombokField) -> *Annotation;
```
## LombokField::getIdentifier

```rust
/**
     * @brief gets the identifier of the element.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: LombokField) -> Identifier;
```
## LombokField::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LombokField;
```
## LombokField::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: LombokField) -> int;
```
## LombokField::getLocation

```rust
/**
     * @brief gets the location of the element.
     * @return Location 
     */
```
```rust
pub fn getLocation(self: LombokField) -> Location;
```
## LombokField::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: LombokField) -> int;
```
## LombokField::getParent

```rust
/**
     * @brief gets the parent of the constructor.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getParent(self: LombokField) -> ClassOrInterface;
```
## LombokField::getDefaultValue

```rust
/**
     * @brief gets the default value of the element, if any.
     * @return string 
     */
```
```rust
pub fn getDefaultValue(self: LombokField) -> string;
```
## LombokField::getTypeElement

```rust
/**
     * @brief gets the type element for the element.
     * @return TypeElement
     */
```
```rust
pub fn getTypeElement(self: LombokField) -> TypeElement;
```
## LombokField::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: LombokField) -> *ElementParent;
```
## LombokField::getPrintableText

```rust
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

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: LombokField) -> string;
```
## LombokField::is\<T\>

```rust
pub fn is<T>(self: LombokField) -> bool;
```
## LombokField::to\<T\>

```rust
pub fn to<T>(self: LombokField) -> <any>;
```
## LombokField::key\_neq

```rust
pub fn key_neq(self: LombokField, object: <any>) -> bool;
```
## LombokField::key\_eq

```rust
pub fn key_eq(self: LombokField, object: <any>) -> bool;
```
## LombokField::to\_set

```rust
pub fn to_set(self: LombokField) -> *LombokField;
```
