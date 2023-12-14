# DocComment

Primary key: `id: int`

```rust
schema DocComment {
  @primary id: int,
}
```
## DocComment::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: DocComment, index: int) -> Node;
```
## DocComment::getTextSize

```rust
pub fn getTextSize(self: DocComment) -> int;
```
## DocComment::getParentNode

```rust
pub fn getParentNode(self: DocComment) -> Node;
```
## DocComment::getChildCount

```rust
pub fn getChildCount(self: DocComment) -> int;
```
## DocComment::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: DocComment) -> File;
```
## DocComment::getBelongsFunction

```rust
pub fn getBelongsFunction(self: DocComment) -> Function;
```
## DocComment::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: DocComment) -> int;
```
## DocComment::getType

```rust
pub fn getType(self: DocComment) -> string;
```
## DocComment::getAnAncestor

```rust
pub fn getAnAncestor(self: DocComment) -> *Node;
```
## DocComment::hasLocation

```rust
pub fn hasLocation(self: DocComment) -> bool;
```
## DocComment::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *DocComment;
```
## DocComment::getLocation

```rust
pub fn getLocation(self: DocComment) -> Location;
```
## DocComment::getAchildNode

```rust
pub fn getAchildNode(self: DocComment) -> *Node;
```
## DocComment::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: DocComment) -> string;
```
## DocComment::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: DocComment) -> string;
```
## DocComment::getTextStartOffset

```rust
pub fn getTextStartOffset(self: DocComment) -> int;
```
## DocComment::getCommentGroup

```rust
pub fn getCommentGroup(self: DocComment) -> Node;
```
## DocComment::isRootNode

```rust
pub fn isRootNode(self: DocComment) -> bool;
```
## DocComment::print

```rust
pub fn print(self: DocComment) -> *string;
```
## DocComment::getAssociateObj

```rust
pub fn getAssociateObj(self: DocComment) -> Node;
```
## DocComment::countAssociatedComment

```rust
pub fn countAssociatedComment(self: DocComment) -> int;
```
## DocComment::is\<T\>

```rust
pub fn is<T>(self: DocComment) -> bool;
```
## DocComment::to\<T\>

```rust
pub fn to<T>(self: DocComment) -> <any>;
```
## DocComment::key\_neq

```rust
pub fn key_neq(self: DocComment, object: <any>) -> bool;
```
## DocComment::key\_eq

```rust
pub fn key_eq(self: DocComment, object: <any>) -> bool;
```
## DocComment::to\_set

```rust
pub fn to_set(self: DocComment) -> *DocComment;
```
