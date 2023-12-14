# JavadocCommentDO

Primary key: `element_hash_id: int`

```rust
schema JavadocCommentDO {
  parent_hash_id: int,
  documentable_hash_id: int,
  location_hash_id: int,
  text: string,
  @primary element_hash_id: int,
}
```
## JavadocCommentDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: JavadocCommentDO) -> int;
```
## JavadocCommentDO::getText

```rust
/**
     * @brief gets the text of this element.
     * @return string
     */
```
```rust
pub fn getText(self: JavadocCommentDO) -> string;
```
## JavadocCommentDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: JavadocCommentDO) -> int;
```
## JavadocCommentDO::getDocumentableHashId

```rust
/**
     * @brief gets the documentable hash id of this element.
     * @return int
     */
```
```rust
pub fn getDocumentableHashId(self: JavadocCommentDO) -> int;
```
## JavadocCommentDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *JavadocCommentDO;
```
## JavadocCommentDO::is\<T\>

```rust
pub fn is<T>(self: JavadocCommentDO) -> bool;
```
## JavadocCommentDO::to\<T\>

```rust
pub fn to<T>(self: JavadocCommentDO) -> <any>;
```
## JavadocCommentDO::key\_neq

```rust
pub fn key_neq(self: JavadocCommentDO, object: <any>) -> bool;
```
## JavadocCommentDO::key\_eq

```rust
pub fn key_eq(self: JavadocCommentDO, object: <any>) -> bool;
```
## JavadocCommentDO::to\_set

```rust
pub fn to_set(self: JavadocCommentDO) -> *JavadocCommentDO;
```
