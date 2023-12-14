# CommentDO

Primary key: `element_oid: int`

```rust
schema CommentDO {
  location_oid: int,
  parent_oid: int,
  text: string,
  @primary element_oid: int,
}
```
## CommentDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: CommentDO) -> int;
```
## CommentDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: CommentDO) -> int;
```
## CommentDO::getText

```rust
/**
     * @brief gets the text of this element.
     * @return string
     */
```
```rust
pub fn getText(self: CommentDO) -> string;
```
## CommentDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *CommentDO;
```
## CommentDO::is\<T\>

```rust
pub fn is<T>(self: CommentDO) -> bool;
```
## CommentDO::to\<T\>

```rust
pub fn to<T>(self: CommentDO) -> <any>;
```
## CommentDO::key\_neq

```rust
pub fn key_neq(self: CommentDO, object: <any>) -> bool;
```
## CommentDO::key\_eq

```rust
pub fn key_eq(self: CommentDO, object: <any>) -> bool;
```
## CommentDO::to\_set

```rust
pub fn to_set(self: CommentDO) -> *CommentDO;
```
