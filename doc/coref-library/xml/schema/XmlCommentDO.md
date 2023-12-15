# XmlCommentDO

Primary key: `id: int`

```rust
schema XmlCommentDO {
  parent_id: int,
  text: string,
  location_id: int,
  @primary id: int
}
```
## XmlCommentDO::getParentId

```java
/**
* @brief gets the parent id of the element.
* @return int
*/
```
```rust
pub fn getParentId(self: XmlCommentDO) -> int;
```
## XmlCommentDO::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlCommentDO) -> int;
```
## XmlCommentDO::getText

```java
/**
* @brief gets the text of the comment.
* @return string 
*/
```
```rust
pub fn getText(self: XmlCommentDO) -> string;
```
## XmlCommentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlCommentDO;
```
