# JavadocComment

Primary key: `element_hash_id: int`

```rust
schema JavadocComment {
  @primary element_hash_id: int,
  text: string,
  location_hash_id: int,
  documentable_hash_id: int,
  parent_hash_id: int,
}
```
## JavadocComment::getDocumentableHashId

```rust
/**
     * @brief gets the documentable hash id of this element.
     * @return int
     */
```
```rust
pub fn getDocumentableHashId(self: JavadocComment) -> int;
```
## JavadocComment::getText

```rust
/**
     * @brief gets the text of this element.
     * @return string
     */
```
```rust
pub fn getText(self: JavadocComment) -> string;
```
## JavadocComment::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: JavadocComment) -> int;
```
## JavadocComment::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: JavadocComment) -> ElementParent;
```
## JavadocComment::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: JavadocComment) -> int;
```
## JavadocComment::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: JavadocComment) -> Location;
```
## JavadocComment::getDocumentableElement

```rust
/**
     * @brief gets the documentable element id of the java doc comment, maybe a callable, field, enumconstant, class or interface.
     * @return ElementParent 
     */
```
```rust
pub fn getDocumentableElement(self: JavadocComment) -> ElementParent;
```
## JavadocComment::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: JavadocComment) -> *ElementParent;
```
## JavadocComment::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *JavadocComment;
```
## JavadocComment::is\<T\>

```rust
pub fn is<T>(self: JavadocComment) -> bool;
```
## JavadocComment::to\<T\>

```rust
pub fn to<T>(self: JavadocComment) -> <any>;
```
## JavadocComment::key\_neq

```rust
pub fn key_neq(self: JavadocComment, object: <any>) -> bool;
```
## JavadocComment::key\_eq

```rust
pub fn key_eq(self: JavadocComment, object: <any>) -> bool;
```
## JavadocComment::to\_set

```rust
pub fn to_set(self: JavadocComment) -> *JavadocComment;
```
