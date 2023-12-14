# VarDecl

Primary key: `id: int`

```rust
schema VarDecl {
  @primary id: int,
}
```
## VarDecl::getLocation

```rust
pub fn getLocation(self: VarDecl) -> Location;
```
## VarDecl::getBelongsFunction

```rust
pub fn getBelongsFunction(self: VarDecl) -> Function;
```
## VarDecl::getKind

```rust
pub fn getKind(self: VarDecl) -> int;
```
## VarDecl::isBadDecl

```rust
pub fn isBadDecl(self: VarDecl) -> bool;
```
## VarDecl::isFuncDecl

```rust
pub fn isFuncDecl(self: VarDecl) -> bool;
```
## VarDecl::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: VarDecl, index: int) -> Node;
```
## VarDecl::isVarDecl

```rust
pub fn isVarDecl(self: VarDecl) -> bool;
```
## VarDecl::getAchildNode

```rust
pub fn getAchildNode(self: VarDecl) -> *Node;
```
## VarDecl::isLocalVaribleDecl

```rust
pub fn isLocalVaribleDecl(self: VarDecl) -> bool;
```
## VarDecl::isRootNode

```rust
pub fn isRootNode(self: VarDecl) -> bool;
```
## VarDecl::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: VarDecl) -> string;
```
## VarDecl::isConstDecl

```rust
pub fn isConstDecl(self: VarDecl) -> bool;
```
## VarDecl::print

```rust
pub fn print(self: VarDecl) -> *string;
```
## VarDecl::isTypeDecl

```rust
pub fn isTypeDecl(self: VarDecl) -> bool;
```
## VarDecl::countAssociatedComment

```rust
pub fn countAssociatedComment(self: VarDecl) -> int;
```
## VarDecl::isImportDecl

```rust
pub fn isImportDecl(self: VarDecl) -> bool;
```
## VarDecl::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *VarDecl;
```
## VarDecl::getTextStartOffset

```rust
pub fn getTextStartOffset(self: VarDecl) -> int;
```
## VarDecl::getType

```rust
pub fn getType(self: VarDecl) -> string;
```
## VarDecl::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: VarDecl) -> int;
```
## VarDecl::hasLocation

```rust
pub fn hasLocation(self: VarDecl) -> bool;
```
## VarDecl::getAnAncestor

```rust
pub fn getAnAncestor(self: VarDecl) -> *Node;
```
## VarDecl::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: VarDecl) -> string;
```
## VarDecl::getChildCount

```rust
pub fn getChildCount(self: VarDecl) -> int;
```
## VarDecl::getName

```rust
pub fn getName(self: VarDecl) -> string;
```
## VarDecl::getParentNode

```rust
pub fn getParentNode(self: VarDecl) -> Node;
```
## VarDecl::getTextSize

```rust
pub fn getTextSize(self: VarDecl) -> int;
```
## VarDecl::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: VarDecl) -> File;
```
## VarDecl::is\<T\>

```rust
pub fn is<T>(self: VarDecl) -> bool;
```
## VarDecl::to\<T\>

```rust
pub fn to<T>(self: VarDecl) -> <any>;
```
## VarDecl::key\_neq

```rust
pub fn key_neq(self: VarDecl, object: <any>) -> bool;
```
## VarDecl::key\_eq

```rust
pub fn key_eq(self: VarDecl, object: <any>) -> bool;
```
## VarDecl::to\_set

```rust
pub fn to_set(self: VarDecl) -> *VarDecl;
```
