# Field

Primary key: `element_hash_id: int`

```rust
schema Field {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  printable_text: string,
}
```
## Field::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Field) -> string;
```
## Field::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: Field) -> string;
```
## Field::getTypeElement

```rust
/**
     * @brief gets the type element for the element.
     * @return TypeElement
     */
```
```rust
pub fn getTypeElement(self: Field) -> TypeElement;
```
## Field::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Field) -> *ElementParent;
```
## Field::getDefaultValue

```rust
/**
     * @brief gets the default value of the element, if any.
     * @return string 
     */
```
```rust
pub fn getDefaultValue(self: Field) -> string;
```
## Field::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Field) -> int;
```
## Field::getParent

```rust
/**
     * @brief gets the parent of the constructor.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getParent(self: Field) -> ClassOrInterface;
```
## Field::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Field) -> int;
```
## Field::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Field;
```
## Field::getLocation

```rust
/**
     * @brief gets the location of the element.
     * @return Location 
     */
```
```rust
pub fn getLocation(self: Field) -> Location;
```
## Field::getIdentifier

```rust
/**
     * @brief gets the identifier of the element.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: Field) -> Identifier;
```
## Field::getAnnotation

```rust
/**
     * @brief gets the annotation of the field, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: Field) -> *Annotation;
```
## Field::getBelongedClass

```rust
/**
     * @brief gets the contained class of the field.
     * @return Class 
     */
```
```rust
pub fn getBelongedClass(self: Field) -> Class;
```
## Field::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: Field) -> Type;
```
## Field::getModifier

```rust
/**
     * @brief gets the modifier of the constructor
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: Field) -> *Modifier;
```
## Field::is\<T\>

```rust
pub fn is<T>(self: Field) -> bool;
```
## Field::to\<T\>

```rust
pub fn to<T>(self: Field) -> <any>;
```
## Field::key\_neq

```rust
pub fn key_neq(self: Field, object: <any>) -> bool;
```
## Field::key\_eq

```rust
pub fn key_eq(self: Field, object: <any>) -> bool;
```
## Field::to\_set

```rust
pub fn to_set(self: Field) -> *Field;
```
