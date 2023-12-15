# LocalVaribleDecl

Inherit from [Decl](./Decl.md)

Primary key: `id: int`

```rust
schema LocalVaribleDecl extends Decl {
  @primary id: int
}
```
## LocalVaribleDecl::getLocation

```rust
pub fn getLocation(self: LocalVaribleDecl) -> Location;
```
## LocalVaribleDecl::getBelongsFunction

```rust
pub fn getBelongsFunction(self: LocalVaribleDecl) -> Function;
```
## LocalVaribleDecl::isConstDecl

```rust
pub fn isConstDecl(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::print

```rust
pub fn print(self: LocalVaribleDecl) -> *string;
```
## LocalVaribleDecl::isFuncDecl

```rust
pub fn isFuncDecl(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: LocalVaribleDecl, index: int) -> Node;
```
## LocalVaribleDecl::isVarDecl

```rust
pub fn isVarDecl(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::getAchildNode

```rust
pub fn getAchildNode(self: LocalVaribleDecl) -> *Node;
```
## LocalVaribleDecl::isLocalVaribleDecl

```rust
pub fn isLocalVaribleDecl(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: LocalVaribleDecl) -> string;
```
## LocalVaribleDecl::isRootNode

```rust
pub fn isRootNode(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::isTypeDecl

```rust
pub fn isTypeDecl(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::countAssociatedComment

```rust
pub fn countAssociatedComment(self: LocalVaribleDecl) -> int;
```
## LocalVaribleDecl::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *LocalVaribleDecl;
```
## LocalVaribleDecl::getType

```rust
pub fn getType(self: LocalVaribleDecl) -> string;
```
## LocalVaribleDecl::getTextStartOffset

```rust
pub fn getTextStartOffset(self: LocalVaribleDecl) -> int;
```
## LocalVaribleDecl::isImportDecl

```rust
pub fn isImportDecl(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::isCommented

```rust
pub fn isCommented(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::getAnAncestor

```rust
pub fn getAnAncestor(self: LocalVaribleDecl) -> *Node;
```
## LocalVaribleDecl::hasLocation

```rust
pub fn hasLocation(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: LocalVaribleDecl) -> int;
```
## LocalVaribleDecl::getBelongsFile

```rust
pub fn getBelongsFile(self: LocalVaribleDecl) -> File;
```
## LocalVaribleDecl::getKind

```rust
pub fn getKind(self: LocalVaribleDecl) -> int;
```
## LocalVaribleDecl::isBadDecl

```rust
pub fn isBadDecl(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::isPublicDecl

```rust
pub fn isPublicDecl(self: LocalVaribleDecl) -> bool;
```
## LocalVaribleDecl::getTextSize

```rust
pub fn getTextSize(self: LocalVaribleDecl) -> int;
```
## LocalVaribleDecl::getParentNode

```rust
pub fn getParentNode(self: LocalVaribleDecl) -> Node;
```
## LocalVaribleDecl::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: LocalVaribleDecl) -> string;
```
## LocalVaribleDecl::getChildCount

```rust
pub fn getChildCount(self: LocalVaribleDecl) -> int;
```
## LocalVaribleDecl::getName

```rust
pub fn getName(self: LocalVaribleDecl) -> *string;
```
