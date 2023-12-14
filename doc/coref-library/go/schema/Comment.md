# Comment

Primary key: `id: int`

```rust
schema Comment {
  @primary id: int,
}
```
## Comment::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Comment, index: int) -> Node;
```
## Comment::getTextSize

```rust
pub fn getTextSize(self: Comment) -> int;
```
## Comment::getParentNode

```rust
pub fn getParentNode(self: Comment) -> Node;
```
## Comment::getChildCount

```rust
pub fn getChildCount(self: Comment) -> int;
```
## Comment::getBelongsFile

```rust
pub fn getBelongsFile(self: Comment) -> File;
```
## Comment::isRootNode

```rust
pub fn isRootNode(self: Comment) -> bool;
```
## Comment::print

```rust
pub fn print(self: Comment) -> *string;
```
## Comment::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Comment) -> Function;
```
## Comment::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Comment) -> int;
```
## Comment::getAnAncestor

```rust
pub fn getAnAncestor(self: Comment) -> *Node;
```
## Comment::hasLocation

```rust
pub fn hasLocation(self: Comment) -> bool;
```
## Comment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Comment;
```
## Comment::getLocation

```rust
pub fn getLocation(self: Comment) -> Location;
```
## Comment::getType

```rust
pub fn getType(self: Comment) -> string;
```
## Comment::getAchildNode

```rust
pub fn getAchildNode(self: Comment) -> *Node;
```
## Comment::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Comment) -> string;
```
## Comment::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Comment) -> int;
```
## Comment::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Comment) -> string;
```
## Comment::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Comment) -> int;
```
