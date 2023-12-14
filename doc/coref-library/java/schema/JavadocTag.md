# JavadocTag

Primary key: `element_hash_id: int`

```rust
schema JavadocTag {
  value: string,
  containing_comment_hash_id: int,
  name: string,
  @primary element_hash_id: int,
  location_hash_id: int,
  index_order: int,
}
```
## JavadocTag::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: JavadocTag) -> string;
```
## JavadocTag::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: JavadocTag) -> string;
```
## JavadocTag::getContainingCommentHashId

```rust
/**
     * @brief gets the containing comment hash id of this element.
     * @return int
     */
```
```rust
pub fn getContainingCommentHashId(self: JavadocTag) -> int;
```
## JavadocTag::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: JavadocTag) -> int;
```
## JavadocTag::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: JavadocTag) -> int;
```
## JavadocTag::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: JavadocTag) -> *ElementParent;
```
## JavadocTag::getDocumentableElement

```rust
/**
     * @brief gets the documented element.
     * @return ExpressionParent 
     */
```
```rust
pub fn getDocumentableElement(self: JavadocTag) -> ExpressionParent;
```
## JavadocTag::getComment

```rust
/**
     * @brief gets the doc comment in which the tag is contained.
     * @return JavadocComment 
     */
```
```rust
pub fn getComment(self: JavadocTag) -> JavadocComment;
```
## JavadocTag::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: JavadocTag) -> Location;
```
## JavadocTag::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *JavadocTag;
```
## JavadocTag::is\<T\>

```rust
pub fn is<T>(self: JavadocTag) -> bool;
```
## JavadocTag::to\<T\>

```rust
pub fn to<T>(self: JavadocTag) -> <any>;
```
## JavadocTag::key\_neq

```rust
pub fn key_neq(self: JavadocTag, object: <any>) -> bool;
```
## JavadocTag::key\_eq

```rust
pub fn key_eq(self: JavadocTag, object: <any>) -> bool;
```
## JavadocTag::to\_set

```rust
pub fn to_set(self: JavadocTag) -> *JavadocTag;
```
