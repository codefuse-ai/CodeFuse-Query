# CommentGroup

Primary key: `id: int`

```rust
schema CommentGroup {
  @primary id: int,
}
```
## CommentGroup::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: CommentGroup, index: int) -> Node;
```
## CommentGroup::getTextSize

```rust
pub fn getTextSize(self: CommentGroup) -> int;
```
## CommentGroup::getParentNode

```rust
pub fn getParentNode(self: CommentGroup) -> Node;
```
## CommentGroup::getChildCount

```rust
pub fn getChildCount(self: CommentGroup) -> int;
```
## CommentGroup::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: CommentGroup) -> File;
```
## CommentGroup::isRootNode

```rust
pub fn isRootNode(self: CommentGroup) -> bool;
```
## CommentGroup::print

```rust
pub fn print(self: CommentGroup) -> *string;
```
## CommentGroup::getBelongsFunction

```rust
pub fn getBelongsFunction(self: CommentGroup) -> Function;
```
## CommentGroup::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: CommentGroup) -> int;
```
## CommentGroup::getAnAncestor

```rust
pub fn getAnAncestor(self: CommentGroup) -> *Node;
```
## CommentGroup::hasLocation

```rust
pub fn hasLocation(self: CommentGroup) -> bool;
```
## CommentGroup::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *CommentGroup;
```
## CommentGroup::getLocation

```rust
pub fn getLocation(self: CommentGroup) -> Location;
```
## CommentGroup::getType

```rust
pub fn getType(self: CommentGroup) -> string;
```
## CommentGroup::getAchildNode

```rust
pub fn getAchildNode(self: CommentGroup) -> *Node;
```
## CommentGroup::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: CommentGroup) -> string;
```
## CommentGroup::getTextStartOffset

```rust
pub fn getTextStartOffset(self: CommentGroup) -> int;
```
## CommentGroup::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: CommentGroup) -> string;
```
## CommentGroup::countAssociatedComment

```rust
pub fn countAssociatedComment(self: CommentGroup) -> int;
```
## CommentGroup::is\<T\>

```rust
pub fn is<T>(self: CommentGroup) -> bool;
```
## CommentGroup::to\<T\>

```rust
pub fn to<T>(self: CommentGroup) -> <any>;
```
## CommentGroup::key\_neq

```rust
pub fn key_neq(self: CommentGroup, object: <any>) -> bool;
```
## CommentGroup::key\_eq

```rust
pub fn key_eq(self: CommentGroup, object: <any>) -> bool;
```
## CommentGroup::to\_set

```rust
pub fn to_set(self: CommentGroup) -> *CommentGroup;
```
