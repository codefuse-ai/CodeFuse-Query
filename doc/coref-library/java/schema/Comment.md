# Comment

Inherit from [CommentDO](./CommentDO.md)

Primary key: `element_hash_id: int`

```rust
schema Comment extends CommentDO {
  @primary element_hash_id: int,
  text: string,
  location_hash_id: int,
  parent_hash_id: int,
  comment_type: string,
}
```
## Comment::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Comment) -> int;
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
## Comment::getCommentType

```java
/**
* @brief gets the comment type of this element.
* @return string
*/
```
```rust
pub fn getCommentType(self: Comment) -> string;
```
## Comment::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Comment) -> int;
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
## Comment::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: Comment) -> ElementParent;
```
## Comment::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Comment) -> *ElementParent;
```
## Comment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Comment;
```
