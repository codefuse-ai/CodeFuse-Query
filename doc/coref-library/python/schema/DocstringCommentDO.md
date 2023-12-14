# DocstringCommentDO

Primary key: `element_oid: int`

```rust
schema DocstringCommentDO {
  documented_element_oid: int,
  text: string,
  @primary element_oid: int,
}
```
## DocstringCommentDO::getDocumentedElementOid

```java
/**
* @brief gets the documented element oid of this element.
* @return int
*/
```
```rust
pub fn getDocumentedElementOid(self: DocstringCommentDO) -> int;
```
## DocstringCommentDO::getText

```java
/**
* @brief gets the text of this element.
* @return string
*/
```
```rust
pub fn getText(self: DocstringCommentDO) -> string;
```
## DocstringCommentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *DocstringCommentDO;
```
