# TypeParameter

Primary key: `element_hash_id: int`

```rust
schema TypeParameter {
  @primary element_hash_id: int,
  location_hash_id: int,
  owner_hash_id: int,
  printable_text: string,
  index_order: int,
  extends_list_hash_id: int,
  parent_hash_id: int,
}
```
## TypeParameter::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: TypeParameter) -> string;
```
## TypeParameter::getExtendsListHashId

```java
/**
* @brief gets the extends list hash id of this element.
* @return int
*/
```
```rust
pub fn getExtendsListHashId(self: TypeParameter) -> int;
```
## TypeParameter::getOwner

```java
/**
* @brief gets the element which is parameterized by the type parameter.
* @return ExpressionParent 
*/
```
```rust
pub fn getOwner(self: TypeParameter) -> ElementParent;
```
## TypeParameter::getOwnerHashId

```java
/**
* @brief gets the owner hash id of this element.
* @return int
*/
```
```rust
pub fn getOwnerHashId(self: TypeParameter) -> int;
```
## TypeParameter::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *TypeParameter;
```
## TypeParameter::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: TypeParameter) -> Location;
```
## TypeParameter::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: TypeParameter) -> int;
```
## TypeParameter::getExtendsList

```java
/**
* @brief gets the extends list id (reference list)of the type parameter.
* @return ExpressionParent 
*/
```
```rust
pub fn getExtendsList(self: TypeParameter) -> ReferenceList;
```
## TypeParameter::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: TypeParameter) -> int;
```
## TypeParameter::getParent

```java
/**
* @brief gets the parent of the element.
* @return ExpressionParent 
*/
```
```rust
pub fn getParent(self: TypeParameter) -> ElementParent;
```
## TypeParameter::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: TypeParameter) -> int;
```
## TypeParameter::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: TypeParameter) -> *ElementParent;
```
