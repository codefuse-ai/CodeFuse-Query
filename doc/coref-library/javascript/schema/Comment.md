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

```rust
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

```rust
pub fn __all__(db: JavascriptDB) -> *Comment;
```
## Comment::is\<T\>

```rust
pub fn is<T>(self: Comment) -> bool;
```
## Comment::to\<T\>

```rust
pub fn to<T>(self: Comment) -> <any>;
```
## Comment::key\_neq

```rust
pub fn key_neq(self: Comment, object: <any>) -> bool;
```
## Comment::key\_eq

```rust
pub fn key_eq(self: Comment, object: <any>) -> bool;
```
## Comment::to\_set

```rust
pub fn to_set(self: Comment) -> *Comment;
```
