# DocstringComment

Inherit from [DocstringCommentDO](./DocstringCommentDO.md)

Primary key: `element_oid: int`

```rust
schema DocstringComment extends DocstringCommentDO {
  @primary element_oid: int,
  text: string,
  documented_element_oid: int
}
```
## DocstringComment::getText

```java
/**
* @brief gets the text of this element.
* @return string
*/
```
```rust
pub fn getText(self: DocstringComment) -> string;
```
## DocstringComment::getDocumentedElementOid

```java
/**
* @brief gets the documented element oid of this element.
* @return int
*/
```
```rust
pub fn getDocumentedElementOid(self: DocstringComment) -> int;
```
## DocstringComment::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: DocstringComment) -> CombineElement;
```
## DocstringComment::getDocumentableElement

```java
/**
* @brief gets the documentable element id of the docstring comment, maybe a callable, field, enumconstant, class or interface.
* @return CombineElement 
*/
```
```rust
pub fn getDocumentableElement(self: DocstringComment) -> CombineElement;
```
## DocstringComment::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: DocstringComment) -> *CombineElement;
```
## DocstringComment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *DocstringComment;
```
