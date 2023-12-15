# TypeSpec

Inherit from [Spec](./Spec.md)

Primary key: `id: int`

```rust
schema TypeSpec extends Spec {
  @primary id: int
}
```
## TypeSpec::getKind

```rust
pub fn getKind(self: TypeSpec) -> int;
```
## TypeSpec::getIdx

```rust
pub fn getIdx(self: TypeSpec) -> int;
```
## TypeSpec::getAnAncestor

```rust
pub fn getAnAncestor(self: TypeSpec) -> *Node;
```
## TypeSpec::isTypedefSpec

```rust
pub fn isTypedefSpec(self: TypeSpec) -> bool;
```
## TypeSpec::isValueSpec

```rust
pub fn isValueSpec(self: TypeSpec) -> bool;
```
## TypeSpec::countAssociatedComment

```rust
pub fn countAssociatedComment(self: TypeSpec) -> int;
```
## TypeSpec::isImportSpec

```rust
pub fn isImportSpec(self: TypeSpec) -> bool;
```
## TypeSpec::isAliasSpec

```rust
pub fn isAliasSpec(self: TypeSpec) -> bool;
```
## TypeSpec::getAssociatedGenDecl

```rust
pub fn getAssociatedGenDecl(self: TypeSpec) -> Node;
```
## TypeSpec::hasLocation

```rust
pub fn hasLocation(self: TypeSpec) -> bool;
```
## TypeSpec::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: TypeSpec) -> int;
```
## TypeSpec::getLocation

```rust
pub fn getLocation(self: TypeSpec) -> Location;
```
## TypeSpec::getBelongsFunction

```rust
pub fn getBelongsFunction(self: TypeSpec) -> Function;
```
## TypeSpec::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *TypeSpec;
```
## TypeSpec::getTextStartOffset

```rust
pub fn getTextStartOffset(self: TypeSpec) -> int;
```
## TypeSpec::getType

```rust
pub fn getType(self: TypeSpec) -> string;
```
## TypeSpec::getChildCount

```rust
pub fn getChildCount(self: TypeSpec) -> int;
```
## TypeSpec::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: TypeSpec) -> string;
```
## TypeSpec::getParentNode

```rust
pub fn getParentNode(self: TypeSpec) -> Node;
```
## TypeSpec::getAchildNode

```rust
pub fn getAchildNode(self: TypeSpec) -> *Node;
```
## TypeSpec::print

```rust
pub fn print(self: TypeSpec) -> *string;
```
## TypeSpec::isRootNode

```rust
pub fn isRootNode(self: TypeSpec) -> bool;
```
## TypeSpec::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: TypeSpec) -> string;
```
## TypeSpec::getBelongsFile

```rust
pub fn getBelongsFile(self: TypeSpec) -> File;
```
## TypeSpec::getTextSize

```rust
pub fn getTextSize(self: TypeSpec) -> int;
```
## TypeSpec::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: TypeSpec, index: int) -> Node;
```
## TypeSpec::getTypeSpecName

```rust
pub fn getTypeSpecName(self: TypeSpec) -> string;
```
