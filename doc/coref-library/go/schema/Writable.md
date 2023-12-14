# Writable

Primary key: `id: int`

```rust
schema Writable {
  @primary id: int,
}
```
## Writable::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Writable, index: int) -> Node;
```
## Writable::getTextSize

```rust
pub fn getTextSize(self: Writable) -> int;
```
## Writable::getParentNode

```rust
pub fn getParentNode(self: Writable) -> Node;
```
## Writable::getChildCount

```rust
pub fn getChildCount(self: Writable) -> int;
```
## Writable::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: Writable) -> File;
```
## Writable::isRootNode

```rust
pub fn isRootNode(self: Writable) -> bool;
```
## Writable::print

```rust
pub fn print(self: Writable) -> *string;
```
## Writable::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Writable) -> Function;
```
## Writable::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Writable) -> int;
```
## Writable::getType

```rust
pub fn getType(self: Writable) -> string;
```
## Writable::getAnAncestor

```rust
pub fn getAnAncestor(self: Writable) -> *Node;
```
## Writable::hasLocation

```rust
pub fn hasLocation(self: Writable) -> bool;
```
## Writable::getAWriteSource

```rust
pub fn getAWriteSource(self: Writable) -> *Node;
```
## Writable::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *Writable;
```
## Writable::getLocation

```rust
pub fn getLocation(self: Writable) -> Location;
```
## Writable::getAchildNode

```rust
pub fn getAchildNode(self: Writable) -> *Node;
```
## Writable::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Writable) -> string;
```
## Writable::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Writable) -> int;
```
## Writable::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Writable) -> string;
```
## Writable::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Writable) -> int;
```
## Writable::getAWrite

```rust
pub fn getAWrite(self: Writable) -> *Node;
```
## Writable::getAWriteDist

```rust
pub fn getAWriteDist(self: Writable) -> *Node;
```
## Writable::is\<T\>

```rust
pub fn is<T>(self: Writable) -> bool;
```
## Writable::to\<T\>

```rust
pub fn to<T>(self: Writable) -> <any>;
```
## Writable::key\_neq

```rust
pub fn key_neq(self: Writable, object: <any>) -> bool;
```
## Writable::key\_eq

```rust
pub fn key_eq(self: Writable, object: <any>) -> bool;
```
## Writable::to\_set

```rust
pub fn to_set(self: Writable) -> *Writable;
```
