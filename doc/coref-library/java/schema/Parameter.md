# Parameter

Primary key: `element_hash_id: int`

```rust
schema Parameter {
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

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: Parameter) -> int;
```
## Parameter::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: Parameter) -> int;
```
## Parameter::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: Parameter) -> string;
```
## Parameter::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Parameter;
```
## Parameter::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Parameter) -> int;
```
## Parameter::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Parameter) -> Location;
```
## Parameter::getTypeElement

```rust
/**
     * @brief gets the type element for the element.
     * @return TypeElement
     */
```
```rust
pub fn getTypeElement(self: Parameter) -> TypeElement;
```
## Parameter::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Parameter) -> *ElementParent;
```
## Parameter::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Parameter) -> int;
```
## Parameter::getParent

```rust
/**
     * @brief gets the parent of the element, which can be a for each statement, lambda expression, a callable, or a catch clause section.
     * @return ExpressionParent 
     */
```
```rust
pub fn getParent(self: Parameter) -> ElementParent;
```
## Parameter::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: Parameter) -> Annotation;
```
## Parameter::getIdentifier

```rust
/**
     * @brief gets the identifier of the parameter. 
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: Parameter) -> Identifier;
```
## Parameter::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: Parameter) -> Type;
```
## Parameter::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Parameter) -> string;
```
## Parameter::getTypeName

```rust
/**
     * @brief gets the name of the parameter
     * @return string 
     */
```
```rust
pub fn getTypeName(self: Parameter) -> string;
```
## Parameter::is\<T\>

```rust
pub fn is<T>(self: Parameter) -> bool;
```
## Parameter::to\<T\>

```rust
pub fn to<T>(self: Parameter) -> <any>;
```
## Parameter::key\_neq

```rust
pub fn key_neq(self: Parameter, object: <any>) -> bool;
```
## Parameter::key\_eq

```rust
pub fn key_eq(self: Parameter, object: <any>) -> bool;
```
## Parameter::to\_set

```rust
pub fn to_set(self: Parameter) -> *Parameter;
```
