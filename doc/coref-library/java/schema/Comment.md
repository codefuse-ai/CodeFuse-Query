# Comment

Primary key: `element_hash_id: int`

```rust
schema Comment {
  @primary element_hash_id: int,
  text: string,
  location_hash_id: int,
  parent_hash_id: int,
  comment_type: string,
}
```
## Comment::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: Comment) -> int;
```
## Comment::getText

```rust
/**
     * @brief gets the text of this element.
     * @return string
     */
```
```rust
pub fn getText(self: Comment) -> string;
```
## Comment::getCommentType

```rust
/**
     * @brief gets the comment type of this element.
     * @return string
     */
```
```rust
pub fn getCommentType(self: Comment) -> string;
```
## Comment::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: Comment) -> int;
```
## Comment::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Comment) -> Location;
```
## Comment::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: Comment) -> ElementParent;
```
## Comment::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Comment) -> *ElementParent;
```
## Comment::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Comment;
```
## Comment::is\<T\>

```rust
pub fn is<T>(self: Comment) -> bool;
```
## Comment::to\<T\>

```rust
pub fn to<T>(self: Comment) -> <any>;
```
## Comment::key\_neq

```rust
pub fn key_neq(self: Comment, object: <any>) -> bool;
```
## Comment::key\_eq

```rust
pub fn key_eq(self: Comment, object: <any>) -> bool;
```
## Comment::to\_set

```rust
pub fn to_set(self: Comment) -> *Comment;
```
