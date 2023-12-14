# Comment

Primary key: `oid: int`

```rust
schema Comment {
  @primary oid: int,
  kind: int,
  location_oid: int,
}
```
## Comment::getKind

```rust
pub fn getKind(self: Comment) -> int;
```
## Comment::getLocationOid

```rust
pub fn getLocationOid(self: Comment) -> int;
```
## Comment::getLocation

```java
/**
* Gets the location of the Comment.
*
* @return Location
*/
```
```rust
pub fn getLocation(self: Comment) -> Location;
```
## Comment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Comment;
```
