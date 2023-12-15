# Spec

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema Spec extends Node {
  @primary id: int
}
```
## Spec::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Spec, index: int) -> Node;
```
## Spec::getTextSize

```rust
pub fn getTextSize(self: Spec) -> int;
```
## Spec::getParentNode

```rust
pub fn getParentNode(self: Spec) -> Node;
```
## Spec::getBelongsFile

```rust
pub fn getBelongsFile(self: Spec) -> File;
```
## Spec::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Spec) -> string;
```
## Spec::isRootNode

```rust
pub fn isRootNode(self: Spec) -> bool;
```
## Spec::print

```rust
pub fn print(self: Spec) -> *string;
```
## Spec::getAchildNode

```rust
pub fn getAchildNode(self: Spec) -> *Node;
```
## Spec::getChildCount

```rust
pub fn getChildCount(self: Spec) -> int;
```
## Spec::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Spec) -> string;
```
## Spec::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Spec;
```
## Spec::getType

```rust
pub fn getType(self: Spec) -> string;
```
## Spec::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Spec) -> int;
```
## Spec::getLocation

```rust
pub fn getLocation(self: Spec) -> Location;
```
## Spec::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Spec) -> Function;
```
## Spec::hasLocation

```rust
pub fn hasLocation(self: Spec) -> bool;
```
## Spec::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Spec) -> int;
```
## Spec::getAssociatedGenDecl

```rust
pub fn getAssociatedGenDecl(self: Spec) -> Node;
```
## Spec::isAliasSpec

```rust
pub fn isAliasSpec(self: Spec) -> bool;
```
## Spec::isImportSpec

```rust
pub fn isImportSpec(self: Spec) -> bool;
```
## Spec::isValueSpec

```rust
pub fn isValueSpec(self: Spec) -> bool;
```
## Spec::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Spec) -> int;
```
## Spec::isTypedefSpec

```rust
pub fn isTypedefSpec(self: Spec) -> bool;
```
## Spec::getAnAncestor

```rust
pub fn getAnAncestor(self: Spec) -> *Node;
```
## Spec::getIdx

```rust
pub fn getIdx(self: Spec) -> int;
```
## Spec::getKind

```rust
pub fn getKind(self: Spec) -> int;
```
