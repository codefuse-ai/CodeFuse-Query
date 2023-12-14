# ImportSpec

Primary key: `id: int`

```rust
schema ImportSpec {
  @primary id: int,
}
```
## ImportSpec::getKind

```rust
pub fn getKind(self: ImportSpec) -> int;
```
## ImportSpec::getIdx

```rust
pub fn getIdx(self: ImportSpec) -> int;
```
## ImportSpec::getAnAncestor

```rust
pub fn getAnAncestor(self: ImportSpec) -> *Node;
```
## ImportSpec::isTypedefSpec

```rust
pub fn isTypedefSpec(self: ImportSpec) -> bool;
```
## ImportSpec::isImportSpec

```rust
pub fn isImportSpec(self: ImportSpec) -> bool;
```
## ImportSpec::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: ImportSpec) -> int;
```
## ImportSpec::hasLocation

```rust
pub fn hasLocation(self: ImportSpec) -> bool;
```
## ImportSpec::getAssociatedGenDecl

```rust
pub fn getAssociatedGenDecl(self: ImportSpec) -> Node;
```
## ImportSpec::getLocation

```rust
pub fn getLocation(self: ImportSpec) -> Location;
```
## ImportSpec::getBelongsFunction

```rust
pub fn getBelongsFunction(self: ImportSpec) -> Function;
```
## ImportSpec::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ImportSpec;
```
## ImportSpec::getTextStartOffset

```rust
pub fn getTextStartOffset(self: ImportSpec) -> int;
```
## ImportSpec::getType

```rust
pub fn getType(self: ImportSpec) -> string;
```
## ImportSpec::getChildCount

```rust
pub fn getChildCount(self: ImportSpec) -> int;
```
## ImportSpec::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: ImportSpec) -> string;
```
## ImportSpec::print

```rust
pub fn print(self: ImportSpec) -> *string;
```
## ImportSpec::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: ImportSpec) -> string;
```
## ImportSpec::isRootNode

```rust
pub fn isRootNode(self: ImportSpec) -> bool;
```
## ImportSpec::getImportSpecName

```rust
pub fn getImportSpecName(self: ImportSpec) -> string;
```
## ImportSpec::getBelongsFile

```rust
pub fn getBelongsFile(self: ImportSpec) -> File;
```
## ImportSpec::countAssociatedComment

```rust
pub fn countAssociatedComment(self: ImportSpec) -> int;
```
## ImportSpec::isValueSpec

```rust
pub fn isValueSpec(self: ImportSpec) -> bool;
```
## ImportSpec::getParentNode

```rust
pub fn getParentNode(self: ImportSpec) -> Node;
```
## ImportSpec::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: ImportSpec, index: int) -> Node;
```
## ImportSpec::getTextSize

```rust
pub fn getTextSize(self: ImportSpec) -> int;
```
## ImportSpec::getAchildNode

```rust
pub fn getAchildNode(self: ImportSpec) -> *Node;
```
## ImportSpec::isAliasSpec

```rust
pub fn isAliasSpec(self: ImportSpec) -> bool;
```
## ImportSpec::getImportSpecPath

```rust
pub fn getImportSpecPath(self: ImportSpec) -> string;
```
