# Node

Primary key: `id: int`

```rust
schema Node {
  @primary id: int
}
```
## Node::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Node) -> string;
```
## Node::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Node) -> int;
```
## Node::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Node) -> int;
```
## Node::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Node) -> string;
```
## Node::getAchildNode

```rust
pub fn getAchildNode(self: Node) -> *Node;
```
## Node::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Node;
```
## Node::getLocation

```rust
pub fn getLocation(self: Node) -> Location;
```
## Node::hasLocation

```rust
pub fn hasLocation(self: Node) -> bool;
```
## Node::getAnAncestor

```rust
pub fn getAnAncestor(self: Node) -> *Node;
```
## Node::getType

```rust
pub fn getType(self: Node) -> string;
```
## Node::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Node) -> int;
```
## Node::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Node) -> Function;
```
## Node::print

```rust
pub fn print(self: Node) -> *string;
```
## Node::isRootNode

```rust
pub fn isRootNode(self: Node) -> bool;
```
## Node::getBelongsFile

```rust
pub fn getBelongsFile(self: Node) -> File;
```
## Node::getChildCount

```rust
pub fn getChildCount(self: Node) -> int;
```
## Node::getParentNode

```rust
pub fn getParentNode(self: Node) -> Node;
```
## Node::getTextSize

```rust
pub fn getTextSize(self: Node) -> int;
```
## Node::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Node, index: int) -> Node;
```
