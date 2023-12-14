# ValueSpec

Primary key: `id: int`

```rust
schema ValueSpec {
  @primary id: int,
}
```
## ValueSpec::getKind

```rust
pub fn getKind(self: ValueSpec) -> int;
```
## ValueSpec::getIdx

```rust
pub fn getIdx(self: ValueSpec) -> int;
```
## ValueSpec::isTypedefSpec

```rust
pub fn isTypedefSpec(self: ValueSpec) -> bool;
```
## ValueSpec::countAssociatedComment

```rust
pub fn countAssociatedComment(self: ValueSpec) -> int;
```
## ValueSpec::isValueSpec

```rust
pub fn isValueSpec(self: ValueSpec) -> bool;
```
## ValueSpec::isImportSpec

```rust
pub fn isImportSpec(self: ValueSpec) -> bool;
```
## ValueSpec::isAliasSpec

```rust
pub fn isAliasSpec(self: ValueSpec) -> bool;
```
## ValueSpec::hasLocation

```rust
pub fn hasLocation(self: ValueSpec) -> bool;
```
## ValueSpec::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: ValueSpec) -> int;
```
## ValueSpec::getLocation

```rust
pub fn getLocation(self: ValueSpec) -> Location;
```
## ValueSpec::getBelongsFunction

```rust
pub fn getBelongsFunction(self: ValueSpec) -> Function;
```
## ValueSpec::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ValueSpec;
```
## ValueSpec::getTextStartOffset

```rust
pub fn getTextStartOffset(self: ValueSpec) -> int;
```
## ValueSpec::getType

```rust
pub fn getType(self: ValueSpec) -> string;
```
## ValueSpec::getAchildNode

```rust
pub fn getAchildNode(self: ValueSpec) -> *Node;
```
## ValueSpec::print

```rust
pub fn print(self: ValueSpec) -> *string;
```
## ValueSpec::isRootNode

```rust
pub fn isRootNode(self: ValueSpec) -> bool;
```
## ValueSpec::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: ValueSpec) -> string;
```
## ValueSpec::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: ValueSpec) -> string;
```
## ValueSpec::getChildCount

```rust
pub fn getChildCount(self: ValueSpec) -> int;
```
## ValueSpec::getParentNode

```rust
pub fn getParentNode(self: ValueSpec) -> Node;
```
## ValueSpec::getAValueNodeByIdx

```rust
pub fn getAValueNodeByIdx(self: ValueSpec, id: int) -> *Node;
```
## ValueSpec::getAnAncestor

```rust
pub fn getAnAncestor(self: ValueSpec) -> *Node;
```
## ValueSpec::hasUserInitValue

```rust
pub fn hasUserInitValue(self: ValueSpec) -> bool;
```
## ValueSpec::getAssociatedGenDecl

```rust
pub fn getAssociatedGenDecl(self: ValueSpec) -> Node;
```
## ValueSpec::getSignature

```rust
pub fn getSignature(self: ValueSpec) -> *string;
```
## ValueSpec::getAValueSpecNameByIdx

```rust
pub fn getAValueSpecNameByIdx(self: ValueSpec, id: int) -> *string;
```
## ValueSpec::getBelongsFile

```rust
pub fn getBelongsFile(self: ValueSpec) -> File;
```
## ValueSpec::getAValueByIdx

```rust
pub fn getAValueByIdx(self: ValueSpec, id: int) -> *string;
```
## ValueSpec::getAValueSpecName

```rust
pub fn getAValueSpecName(self: ValueSpec) -> *string;
```
## ValueSpec::getTextSize

```rust
pub fn getTextSize(self: ValueSpec) -> int;
```
## ValueSpec::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: ValueSpec, index: int) -> Node;
```
