# ConstDecl

Primary key: `id: int`

```rust
schema ConstDecl {
  @primary id: int,
}
```
## ConstDecl::getLocation

```rust
pub fn getLocation(self: ConstDecl) -> Location;
```
## ConstDecl::getBelongsFunction

```rust
pub fn getBelongsFunction(self: ConstDecl) -> Function;
```
## ConstDecl::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: ConstDecl) -> string;
```
## ConstDecl::getChildCount

```rust
pub fn getChildCount(self: ConstDecl) -> int;
```
## ConstDecl::getKind

```rust
pub fn getKind(self: ConstDecl) -> int;
```
## ConstDecl::isBadDecl

```rust
pub fn isBadDecl(self: ConstDecl) -> bool;
```
## ConstDecl::isFuncDecl

```rust
pub fn isFuncDecl(self: ConstDecl) -> bool;
```
## ConstDecl::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: ConstDecl, index: int) -> Node;
```
## ConstDecl::isVarDecl

```rust
pub fn isVarDecl(self: ConstDecl) -> bool;
```
## ConstDecl::getAchildNode

```rust
pub fn getAchildNode(self: ConstDecl) -> *Node;
```
## ConstDecl::isLocalVaribleDecl

```rust
pub fn isLocalVaribleDecl(self: ConstDecl) -> bool;
```
## ConstDecl::isRootNode

```rust
pub fn isRootNode(self: ConstDecl) -> bool;
```
## ConstDecl::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: ConstDecl) -> string;
```
## ConstDecl::isConstDecl

```rust
pub fn isConstDecl(self: ConstDecl) -> bool;
```
## ConstDecl::print

```rust
pub fn print(self: ConstDecl) -> *string;
```
## ConstDecl::isTypeDecl

```rust
pub fn isTypeDecl(self: ConstDecl) -> bool;
```
## ConstDecl::countAssociatedComment

```rust
pub fn countAssociatedComment(self: ConstDecl) -> int;
```
## ConstDecl::isImportDecl

```rust
pub fn isImportDecl(self: ConstDecl) -> bool;
```
## ConstDecl::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ConstDecl;
```
## ConstDecl::getType

```rust
pub fn getType(self: ConstDecl) -> string;
```
## ConstDecl::getTextStartOffset

```rust
pub fn getTextStartOffset(self: ConstDecl) -> int;
```
## ConstDecl::getParentNode

```rust
pub fn getParentNode(self: ConstDecl) -> Node;
```
## ConstDecl::getTextSize

```rust
pub fn getTextSize(self: ConstDecl) -> int;
```
## ConstDecl::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: ConstDecl) -> int;
```
## ConstDecl::hasLocation

```rust
pub fn hasLocation(self: ConstDecl) -> bool;
```
## ConstDecl::getAnAncestor

```rust
pub fn getAnAncestor(self: ConstDecl) -> *Node;
```
## ConstDecl::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: ConstDecl) -> File;
```
## ConstDecl::is\<T\>

```rust
pub fn is<T>(self: ConstDecl) -> bool;
```
## ConstDecl::to\<T\>

```rust
pub fn to<T>(self: ConstDecl) -> <any>;
```
## ConstDecl::key\_neq

```rust
pub fn key_neq(self: ConstDecl, object: <any>) -> bool;
```
## ConstDecl::key\_eq

```rust
pub fn key_eq(self: ConstDecl, object: <any>) -> bool;
```
## ConstDecl::to\_set

```rust
pub fn to_set(self: ConstDecl) -> *ConstDecl;
```
