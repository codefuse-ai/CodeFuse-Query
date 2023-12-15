# JavadocComment

Inherit from [JavadocCommentDO](./JavadocCommentDO.md)

Primary key: `element_hash_id: int`

```rust
schema JavadocComment extends JavadocCommentDO {
  @primary element_hash_id: int,
  text: string,
  location_hash_id: int,
  documentable_hash_id: int,
  parent_hash_id: int
}
```
## JavadocComment::getDocumentableHashId

```java
/**
* @brief gets the documentable hash id of this element.
* @return int
*/
```
```rust
pub fn getDocumentableHashId(self: JavadocComment) -> int;
```
## JavadocComment::getText

```java
/**
* @brief gets the text of this element.
* @return string
*/
```
```rust
pub fn getText(self: JavadocComment) -> string;
```
## JavadocComment::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: JavadocComment) -> int;
```
## JavadocComment::getParent

```java
/**
* @brief gets the parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: JavadocComment) -> ElementParent;
```
## JavadocComment::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: JavadocComment) -> int;
```
## JavadocComment::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: JavadocComment) -> Location;
```
## JavadocComment::getDocumentableElement

```java
/**
* @brief gets the documentable element id of the java doc comment, maybe a callable, field, enumconstant, class or interface.
* @return ElementParent 
*/
```
```rust
pub fn getDocumentableElement(self: JavadocComment) -> ElementParent;
```
## JavadocComment::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: JavadocComment) -> *ElementParent;
```
## JavadocComment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *JavadocComment;
```
