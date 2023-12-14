# Constructor

Primary key: `element_hash_id: int`

```rust
schema Constructor {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  signature: string,
  definition_body: string,
}
```
## Constructor::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Constructor) -> string;
```
## Constructor::getDefinitionBody

```rust
pub fn getDefinitionBody(self: Constructor) -> string;
```
## Constructor::getSignature

```rust
/**
     * @brief gets the signature of this element.
     * @return string
     */
```
```rust
pub fn getSignature(self: Constructor) -> string;
```
## Constructor::getAnnotation

```rust
/**
     * @brief gets the annotation of the class, if any.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: Constructor) -> Annotation;
```
## Constructor::getBody

```rust
/**
     * @brief gets the body of the constructor.
     * @return CodeBlock 
     */
```
```rust
pub fn getBody(self: Constructor) -> CodeBlock;
```
## Constructor::getType

```rust
/**
     * @brief gets the return type of the constructor, which should be null.
     * @return Type 
     */
```
```rust
pub fn getType(self: Constructor) -> Type;
```
## Constructor::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Constructor) -> int;
```
## Constructor::getParent

```rust
/**
     * @brief gets the parent of the constructor.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getParent(self: Constructor) -> ClassOrInterface;
```
## Constructor::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Constructor) -> NumberOfLines;
```
## Constructor::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Constructor) -> *ElementParent;
```
## Constructor::getMatchedFieldByIndex

```rust
/**
     * @brief gets the matched field of the constructor for a given parameter index.
     * @return Field 
     */
```
```rust
pub fn getMatchedFieldByIndex(self: Constructor, i: int) -> Field;
```
## Constructor::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Constructor) -> int;
```
## Constructor::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Constructor;
```
## Constructor::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Constructor) -> Location;
```
## Constructor::getParameter

```rust
/**
     * @brief gets the parameter of the constructor.
     * @return Parameter 
     */
```
```rust
pub fn getParameter(self: Constructor) -> *Parameter;
```
## Constructor::getModifier

```rust
/**
     * @brief gets the modifier of the constructor
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: Constructor) -> Modifier;
```
## Constructor::is\<T\>

```rust
pub fn is<T>(self: Constructor) -> bool;
```
## Constructor::to\<T\>

```rust
pub fn to<T>(self: Constructor) -> <any>;
```
## Constructor::key\_neq

```rust
pub fn key_neq(self: Constructor, object: <any>) -> bool;
```
## Constructor::key\_eq

```rust
pub fn key_eq(self: Constructor, object: <any>) -> bool;
```
## Constructor::to\_set

```rust
pub fn to_set(self: Constructor) -> *Constructor;
```
