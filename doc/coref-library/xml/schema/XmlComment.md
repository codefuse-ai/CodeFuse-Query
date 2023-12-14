# XmlComment

Primary key: `id: int`

```rust
schema XmlComment {
  @primary id: int,
  location_id: int,
  text: string,
  parent_id: int,
}
```
## XmlComment::getText

```rust
/**
     * @brief gets the text of the comment.
     * @return string 
     */
```
```rust
pub fn getText(self: XmlComment) -> string;
```
## XmlComment::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlComment) -> int;
```
## XmlComment::getParentId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentId(self: XmlComment) -> int;
```
## XmlComment::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: XmlComment) -> Location;
```
## XmlComment::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlComment;
```
## XmlComment::is\<T\>

```rust
pub fn is<T>(self: XmlComment) -> bool;
```
## XmlComment::to\<T\>

```rust
pub fn to<T>(self: XmlComment) -> <any>;
```
## XmlComment::key\_neq

```rust
pub fn key_neq(self: XmlComment, object: <any>) -> bool;
```
## XmlComment::key\_eq

```rust
pub fn key_eq(self: XmlComment, object: <any>) -> bool;
```
## XmlComment::to\_set

```rust
pub fn to_set(self: XmlComment) -> *XmlComment;
```
