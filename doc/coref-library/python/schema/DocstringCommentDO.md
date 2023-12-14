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

```rust
/**
     * @brief gets the documented element oid of this element.
     * @return int
     */
```
```rust
pub fn getDocumentedElementOid(self: DocstringCommentDO) -> int;
```
## DocstringCommentDO::getText

```rust
/**
     * @brief gets the text of this element.
     * @return string
     */
```
```rust
pub fn getText(self: DocstringCommentDO) -> string;
```
## DocstringCommentDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *DocstringCommentDO;
```
## DocstringCommentDO::is\<T\>

```rust
pub fn is<T>(self: DocstringCommentDO) -> bool;
```
## DocstringCommentDO::to\<T\>

```rust
pub fn to<T>(self: DocstringCommentDO) -> <any>;
```
## DocstringCommentDO::key\_neq

```rust
pub fn key_neq(self: DocstringCommentDO, object: <any>) -> bool;
```
## DocstringCommentDO::key\_eq

```rust
pub fn key_eq(self: DocstringCommentDO, object: <any>) -> bool;
```
## DocstringCommentDO::to\_set

```rust
pub fn to_set(self: DocstringCommentDO) -> *DocstringCommentDO;
```
