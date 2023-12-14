# LocalVariable

Primary key: `element_hash_id: int`

```rust
schema LocalVariable {
  @primary element_hash_id: int,
  location_hash_id: int,
  name: string,
  parent_hash_id: int,
  printable_text: string,
  index_order: int,
}
```
## LocalVariable::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: LocalVariable) -> string;
```
## LocalVariable::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: LocalVariable) -> string;
```
## LocalVariable::getReferenced

```rust
/**
     * @brief gets the reference expression of the local variable.
     * @return Expression 
     */
```
```rust
pub fn getReferenced(self: LocalVariable) -> Expression;
```
## LocalVariable::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: LocalVariable) -> int;
```
## LocalVariable::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: LocalVariable) -> int;
```
## LocalVariable::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LocalVariable;
```
## LocalVariable::getExpression

```rust
/**
     * @brief gets the expression of the local variable.
     * @return Expression 
     */
```
```rust
pub fn getExpression(self: LocalVariable) -> Expression;
```
## LocalVariable::getLocation

```rust
/**
     * @brief gets the location of the local variable.
     * @return Location 
     */
```
```rust
pub fn getLocation(self: LocalVariable) -> Location;
```
## LocalVariable::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: LocalVariable) -> Annotation;
```
## LocalVariable::getIdentifier

```rust
/**
     * @brief gets the identifier of the local variable.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: LocalVariable) -> Identifier;
```
## LocalVariable::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: LocalVariable) -> *ElementParent;
```
## LocalVariable::getTypeElement

```rust
/**
     * @brief gets the type element for the element.
     * @return TypeElement
     */
```
```rust
pub fn getTypeElement(self: LocalVariable) -> TypeElement;
```
## LocalVariable::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: LocalVariable) -> Type;
```
## LocalVariable::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: LocalVariable) -> int;
```
## LocalVariable::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: LocalVariable) -> ElementParent;
```
## LocalVariable::is\<T\>

```rust
pub fn is<T>(self: LocalVariable) -> bool;
```
## LocalVariable::to\<T\>

```rust
pub fn to<T>(self: LocalVariable) -> <any>;
```
## LocalVariable::key\_neq

```rust
pub fn key_neq(self: LocalVariable, object: <any>) -> bool;
```
## LocalVariable::key\_eq

```rust
pub fn key_eq(self: LocalVariable, object: <any>) -> bool;
```
## LocalVariable::to\_set

```rust
pub fn to_set(self: LocalVariable) -> *LocalVariable;
```
