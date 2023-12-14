# Comment

Primary key: `element_oid: int`

```rust
schema Comment {
  @primary element_oid: int,
  text: string,
  parent_oid: int,
  location_oid: int,
}
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
## Comment::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Comment) -> int;
```
## Comment::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Comment) -> int;
```
## Comment::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Comment) -> CombineElement;
```
## Comment::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Comment;
```
## Comment::getDocumentedBelowElement

```rust
/**
     * @brief gets the documented element of the comment.
     * @return CombineElement
     */
```
```rust
pub fn getDocumentedBelowElement(self: Comment) -> *CombineElement;
```
## Comment::getDocumentedClassOrFunctionElement

```rust
/**
     * @brief gets the documented class or function of the comment.
     * @return CombineElement
     */
```
```rust
pub fn getDocumentedClassOrFunctionElement(self: Comment) -> CombineElement;
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
## Comment::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Comment) -> *CombineElement;
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
