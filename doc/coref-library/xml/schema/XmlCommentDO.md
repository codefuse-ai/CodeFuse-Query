# XmlCommentDO

Primary key: `id: int`

```rust
schema XmlCommentDO {
  parent_id: int,
  text: string,
  location_id: int,
  @primary id: int,
}
```
## XmlCommentDO::getParentId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentId(self: XmlCommentDO) -> int;
```
## XmlCommentDO::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlCommentDO) -> int;
```
## XmlCommentDO::getText

```rust
/**
     * @brief gets the text of the comment.
     * @return string 
     */
```
```rust
pub fn getText(self: XmlCommentDO) -> string;
```
## XmlCommentDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlCommentDO;
```
## XmlCommentDO::is\<T\>

```rust
pub fn is<T>(self: XmlCommentDO) -> bool;
```
## XmlCommentDO::to\<T\>

```rust
pub fn to<T>(self: XmlCommentDO) -> <any>;
```
## XmlCommentDO::key\_neq

```rust
pub fn key_neq(self: XmlCommentDO, object: <any>) -> bool;
```
## XmlCommentDO::key\_eq

```rust
pub fn key_eq(self: XmlCommentDO, object: <any>) -> bool;
```
## XmlCommentDO::to\_set

```rust
pub fn to_set(self: XmlCommentDO) -> *XmlCommentDO;
```
