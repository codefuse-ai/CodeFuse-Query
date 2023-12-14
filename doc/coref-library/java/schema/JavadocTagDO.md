# JavadocTagDO

Primary key: `element_hash_id: int`

```rust
schema JavadocTagDO {
  index_order: int,
  location_hash_id: int,
  @primary element_hash_id: int,
  name: string,
  containing_comment_hash_id: int,
  value: string,
}
```
## JavadocTagDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: JavadocTagDO) -> int;
```
## JavadocTagDO::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: JavadocTagDO) -> int;
```
## JavadocTagDO::getContainingCommentHashId

```rust
/**
     * @brief gets the containing comment hash id of this element.
     * @return int
     */
```
```rust
pub fn getContainingCommentHashId(self: JavadocTagDO) -> int;
```
## JavadocTagDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: JavadocTagDO) -> string;
```
## JavadocTagDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: JavadocTagDO) -> string;
```
## JavadocTagDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *JavadocTagDO;
```
## JavadocTagDO::is\<T\>

```rust
pub fn is<T>(self: JavadocTagDO) -> bool;
```
## JavadocTagDO::to\<T\>

```rust
pub fn to<T>(self: JavadocTagDO) -> <any>;
```
## JavadocTagDO::key\_neq

```rust
pub fn key_neq(self: JavadocTagDO, object: <any>) -> bool;
```
## JavadocTagDO::key\_eq

```rust
pub fn key_eq(self: JavadocTagDO, object: <any>) -> bool;
```
## JavadocTagDO::to\_set

```rust
pub fn to_set(self: JavadocTagDO) -> *JavadocTagDO;
```
