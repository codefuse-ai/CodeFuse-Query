# Interface

Primary key: `element_hash_id: int`

```rust
schema Interface {
  @primary element_hash_id: int,
  qualified_name: string,
  location_hash_id: int,
  identifier_hash_id: int,
  parent_hash_id: int,
}
```
## Interface::getQualifiedName

```rust
/**
     * @brief gets the qualified name of this element.
     * @return string
     */
```
```rust
pub fn getQualifiedName(self: Interface) -> string;
```
## Interface::getIdentifierHashId

```rust
/**
     * @brief gets the identifier hash id of this element.
     * @return int
     */
```
```rust
pub fn getIdentifierHashId(self: Interface) -> int;
```
## Interface::getMethod

```rust
/**
     * @brief gets all methods of the class element.
     * @return Method 
     */
```
```rust
pub fn getMethod(self: Interface) -> *Method;
```
## Interface::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Interface) -> *ElementParent;
```
## Interface::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Interface) -> int;
```
## Interface::getSuperInterface

```rust
/**
     * @brief gets the extends interface of the element.
     * @return Interface
     */
```
```rust
pub fn getSuperInterface(self: Interface) -> *Interface;
```
## Interface::getField

```rust
/**
     * @brief gets all fields of the class.
     * @return Field 
     */
```
```rust
pub fn getField(self: Interface) -> *Field;
```
## Interface::getParent

```rust
/**
     * @brief gets the parent of the method.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getParent(self: Interface) -> ElementParent;
```
## Interface::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Interface) -> int;
```
## Interface::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Interface;
```
## Interface::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Interface) -> Location;
```
## Interface::getAnAncestorInterface

```rust
/**
     * @brief gets all ancestor classes of the element.
     * @return Interface
     */
```
```rust
pub fn getAnAncestorInterface(self: Interface) -> *Interface;
```
## Interface::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: Interface) -> *Annotation;
```
## Interface::getIdentifier

```rust
/**
     * @brief gets the identifier of the element.
     * @return Identifier 
     */
```
```rust
pub fn getIdentifier(self: Interface) -> Identifier;
```
## Interface::getName

```rust
/**
     * @brief gets the name of the interface.
     * @return string 
     */
```
```rust
pub fn getName(self: Interface) -> string;
```
## Interface::is\<T\>

```rust
pub fn is<T>(self: Interface) -> bool;
```
## Interface::to\<T\>

```rust
pub fn to<T>(self: Interface) -> <any>;
```
## Interface::key\_neq

```rust
pub fn key_neq(self: Interface, object: <any>) -> bool;
```
## Interface::key\_eq

```rust
pub fn key_eq(self: Interface, object: <any>) -> bool;
```
## Interface::to\_set

```rust
pub fn to_set(self: Interface) -> *Interface;
```
