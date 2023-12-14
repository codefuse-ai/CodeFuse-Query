# Fields

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema Fields extends Node {
  @primary id: int,
}
```
## Fields::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Fields, index: int) -> Node;
```
## Fields::getTextSize

```rust
pub fn getTextSize(self: Fields) -> int;
```
## Fields::getParentNode

```rust
pub fn getParentNode(self: Fields) -> Node;
```
## Fields::getBelongsFile

```rust
pub fn getBelongsFile(self: Fields) -> File;
```
## Fields::print

```rust
pub fn print(self: Fields) -> *string;
```
## Fields::getLocation

```rust
pub fn getLocation(self: Fields) -> Location;
```
## Fields::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Fields) -> Function;
```
## Fields::hasLocation

```rust
pub fn hasLocation(self: Fields) -> bool;
```
## Fields::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Fields) -> int;
```
## Fields::getAchildNode

```rust
pub fn getAchildNode(self: Fields) -> *Node;
```
## Fields::getChildCount

```rust
pub fn getChildCount(self: Fields) -> int;
```
## Fields::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Fields) -> string;
```
## Fields::getType

```rust
pub fn getType(self: Fields) -> string;
```
## Fields::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Fields;
```
## Fields::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Fields) -> int;
```
## Fields::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Fields) -> int;
```
## Fields::isRootNode

```rust
pub fn isRootNode(self: Fields) -> bool;
```
## Fields::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Fields) -> string;
```
## Fields::makeFieldStringForFunctionSignature

```rust
pub fn makeFieldStringForFunctionSignature(self: Fields) -> *string;
```
## Fields::isStructFields

```rust
pub fn isStructFields(self: Fields) -> bool;
```
## Fields::getFieldType

```rust
pub fn getFieldType(self: Fields) -> *string;
```
## Fields::getFieldName

```rust
pub fn getFieldName(self: Fields) -> *string;
```
## Fields::isFuncDeclRecvFields

```rust
pub fn isFuncDeclRecvFields(self: Fields) -> bool;
```
## Fields::getAnAncestor

```rust
pub fn getAnAncestor(self: Fields) -> *Node;
```
## Fields::getIdx

```rust
pub fn getIdx(self: Fields) -> int;
```
## Fields::isFuncResultsFields

```rust
pub fn isFuncResultsFields(self: Fields) -> bool;
```
## Fields::isInterfaceMethodFields

```rust
pub fn isInterfaceMethodFields(self: Fields) -> bool;
```
## Fields::getKind

```rust
pub fn getKind(self: Fields) -> int;
```
## Fields::isFuncParamsFields

```rust
pub fn isFuncParamsFields(self: Fields) -> bool;
```
