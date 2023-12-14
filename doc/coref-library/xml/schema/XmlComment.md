# XmlComment

Inherit from [XmlCommentDO](./XmlCommentDO.md)

Primary key: `id: int`

```rust
schema XmlComment extends XmlCommentDO {
  @primary id: int,
  location_id: int,
  text: string,
  parent_id: int,
}
```
## XmlComment::getText

```java
/**
* @brief gets the text of the comment.
* @return string 
*/
```
```rust
pub fn getText(self: XmlComment) -> string;
```
## XmlComment::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlComment) -> int;
```
## XmlComment::getParentId

```java
/**
* @brief gets the parent id of the element.
* @return int
*/
```
```rust
pub fn getParentId(self: XmlComment) -> int;
```
## XmlComment::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: XmlComment) -> Location;
```
## XmlComment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlComment;
```
