# Decl

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema Decl extends Node {
  @primary id: int
}
```
## Decl::getTextSize

```rust
pub fn getTextSize(self: Decl) -> int;
```
## Decl::getParentNode

```rust
pub fn getParentNode(self: Decl) -> Node;
```
## Decl::getBelongsFile

```rust
pub fn getBelongsFile(self: Decl) -> File;
```
## Decl::getAnAncestor

```rust
pub fn getAnAncestor(self: Decl) -> *Node;
```
## Decl::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Decl) -> int;
```
## Decl::hasLocation

```rust
pub fn hasLocation(self: Decl) -> bool;
```
## Decl::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Decl;
```
## Decl::getType

```rust
pub fn getType(self: Decl) -> string;
```
## Decl::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Decl) -> int;
```
## Decl::isTypeDecl

```rust
pub fn isTypeDecl(self: Decl) -> bool;
```
## Decl::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Decl) -> int;
```
## Decl::isRootNode

```rust
pub fn isRootNode(self: Decl) -> bool;
```
## Decl::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Decl) -> string;
```
## Decl::isLocalVaribleDecl

```rust
pub fn isLocalVaribleDecl(self: Decl) -> bool;
```
## Decl::getAchildNode

```rust
pub fn getAchildNode(self: Decl) -> *Node;
```
## Decl::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Decl, index: int) -> Node;
```
## Decl::isVarDecl

```rust
pub fn isVarDecl(self: Decl) -> bool;
```
## Decl::isImportDecl

```rust
pub fn isImportDecl(self: Decl) -> bool;
```
## Decl::isFuncDecl

```rust
pub fn isFuncDecl(self: Decl) -> bool;
```
## Decl::print

```rust
pub fn print(self: Decl) -> *string;
```
## Decl::isConstDecl

```rust
pub fn isConstDecl(self: Decl) -> bool;
```
## Decl::isBadDecl

```rust
pub fn isBadDecl(self: Decl) -> bool;
```
## Decl::getKind

```rust
pub fn getKind(self: Decl) -> int;
```
## Decl::getChildCount

```rust
pub fn getChildCount(self: Decl) -> int;
```
## Decl::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Decl) -> string;
```
## Decl::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Decl) -> Function;
```
## Decl::getLocation

```rust
pub fn getLocation(self: Decl) -> Location;
```
