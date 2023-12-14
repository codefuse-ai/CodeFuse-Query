# Comment

Inherit from [CommentDO](./CommentDO.md)

Primary key: `element_oid: int`

```rust
schema Comment extends CommentDO {
  @primary element_oid: int,
  text: string,
  parent_oid: int,
  location_oid: int,
}
```
## Comment::getText

```java
/**
* @brief gets the text of this element.
* @return string
*/
```
```rust
pub fn getText(self: Comment) -> string;
```
## Comment::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: Comment) -> int;
```
## Comment::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: Comment) -> int;
```
## Comment::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: Comment) -> CombineElement;
```
## Comment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *Comment;
```
## Comment::getDocumentedBelowElement

```java
/**
* @brief gets the documented element of the comment.
* @return CombineElement
*/
```
```rust
pub fn getDocumentedBelowElement(self: Comment) -> *CombineElement;
```
## Comment::getDocumentedClassOrFunctionElement

```java
/**
* @brief gets the documented class or function of the comment.
* @return CombineElement
*/
```
```rust
pub fn getDocumentedClassOrFunctionElement(self: Comment) -> CombineElement;
```
## Comment::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Comment) -> Location;
```
## Comment::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: Comment) -> *CombineElement;
```
