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

```java
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

```java
/**
* @brief gets the signature of this element.
* @return string
*/
```
```rust
pub fn getSignature(self: Constructor) -> string;
```
## Constructor::getAnnotation

```java
/**
* @brief gets the annotation of the class, if any.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: Constructor) -> Annotation;
```
## Constructor::getBody

```java
/**
* @brief gets the body of the constructor.
* @return CodeBlock 
*/
```
```rust
pub fn getBody(self: Constructor) -> CodeBlock;
```
## Constructor::getType

```java
/**
* @brief gets the return type of the constructor, which should be null.
* @return Type 
*/
```
```rust
pub fn getType(self: Constructor) -> Type;
```
## Constructor::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Constructor) -> int;
```
## Constructor::getParent

```java
/**
* @brief gets the parent of the constructor.
* @return ClassOrInterface 
*/
```
```rust
pub fn getParent(self: Constructor) -> ClassOrInterface;
```
## Constructor::getSize

```java
/**
* @brief gets the size information for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: Constructor) -> NumberOfLines;
```
## Constructor::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Constructor) -> *ElementParent;
```
## Constructor::getMatchedFieldByIndex

```java
/**
* @brief gets the matched field of the constructor for a given parameter index.
* @return Field 
*/
```
```rust
pub fn getMatchedFieldByIndex(self: Constructor, i: int) -> Field;
```
## Constructor::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Constructor) -> int;
```
## Constructor::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Constructor;
```
## Constructor::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Constructor) -> Location;
```
## Constructor::getParameter

```java
/**
* @brief gets the parameter of the constructor.
* @return Parameter 
*/
```
```rust
pub fn getParameter(self: Constructor) -> *Parameter;
```
## Constructor::getModifier

```java
/**
* @brief gets the modifier of the constructor
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: Constructor) -> Modifier;
```
