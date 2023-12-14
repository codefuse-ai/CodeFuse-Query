# DocstringComment

Primary key: `element_oid: int`

```rust
schema DocstringComment {
  @primary element_oid: int,
  text: string,
  documented_element_oid: int,
}
```
## DocstringComment::getText

```rust
/**
     * @brief gets the text of this element.
     * @return string
     */
```
```rust
pub fn getText(self: DocstringComment) -> string;
```
## DocstringComment::getDocumentedElementOid

```rust
/**
     * @brief gets the documented element oid of this element.
     * @return int
     */
```
```rust
pub fn getDocumentedElementOid(self: DocstringComment) -> int;
```
## DocstringComment::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: DocstringComment) -> CombineElement;
```
## DocstringComment::getDocumentableElement

```rust
/**
     * @brief gets the documentable element id of the docstring comment, maybe a callable, field, enumconstant, class or interface.
     * @return CombineElement 
     */
```
```rust
pub fn getDocumentableElement(self: DocstringComment) -> CombineElement;
```
## DocstringComment::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: DocstringComment) -> *CombineElement;
```
## DocstringComment::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *DocstringComment;
```
## DocstringComment::is\<T\>

```rust
pub fn is<T>(self: DocstringComment) -> bool;
```
## DocstringComment::to\<T\>

```rust
pub fn to<T>(self: DocstringComment) -> <any>;
```
## DocstringComment::key\_neq

```rust
pub fn key_neq(self: DocstringComment, object: <any>) -> bool;
```
## DocstringComment::key\_eq

```rust
pub fn key_eq(self: DocstringComment, object: <any>) -> bool;
```
## DocstringComment::to\_set

```rust
pub fn to_set(self: DocstringComment) -> *DocstringComment;
```
