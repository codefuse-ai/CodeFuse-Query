# Function

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema Function extends Node {
  @primary id: int
}
```
## Function::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Function, index: int) -> Node;
```
## Function::getTextSize

```rust
pub fn getTextSize(self: Function) -> int;
```
## Function::getBelongsFile

```rust
pub fn getBelongsFile(self: Function) -> File;
```
## Function::print

```rust
pub fn print(self: Function) -> *string;
```
## Function::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Function) -> Function;
```
## Function::getLocation

```rust
pub fn getLocation(self: Function) -> Location;
```
## Function::getAchildNode

```rust
pub fn getAchildNode(self: Function) -> *Node;
```
## Function::getFunctionTypeSignature

```rust
pub fn getFunctionTypeSignature(self: Function) -> string;
```
## Function::getFunctionReceiverType

```rust
pub fn getFunctionReceiverType(self: Function) -> string;
```
## Function::getAResult

```rust
pub fn getAResult(self: Function) -> *Node;
```
## Function::isMethod

```rust
pub fn isMethod(self: Function) -> bool;
```
## Function::isRootNode

```rust
pub fn isRootNode(self: Function) -> bool;
```
## Function::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Function) -> string;
```
## Function::isPublicFunction

```rust
pub fn isPublicFunction(self: Function) -> bool;
```
## Function::getParentNode

```rust
pub fn getParentNode(self: Function) -> Node;
```
## Function::getCommentCnt

```rust
pub fn getCommentCnt(self: Function) -> int;
```
## Function::getAssociatedComment

```rust
pub fn getAssociatedComment(self: Function) -> string;
```
## Function::getFunctionReceiverInfo

```rust
pub fn getFunctionReceiverInfo(self: Function) -> string;
```
## Function::getFunctionFullSignature

```rust
pub fn getFunctionFullSignature(self: Function) -> string;
```
## Function::getAParameter

```rust
pub fn getAParameter(self: Function) -> *Node;
```
## Function::getFunctionSignature

```rust
pub fn getFunctionSignature(self: Function) -> string;
```
## Function::getChildCount

```rust
pub fn getChildCount(self: Function) -> int;
```
## Function::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Function) -> string;
```
## Function::getName

```rust
pub fn getName(self: Function) -> string;
```
## Function::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Function) -> int;
```
## Function::hasLocation

```rust
pub fn hasLocation(self: Function) -> bool;
```
## Function::getResultsField

```rust
pub fn getResultsField(self: Function) -> *string;
```
## Function::getGlobalSignature

```rust
pub fn getGlobalSignature(self: Function) -> string;
```
## Function::getAnAncestor

```rust
pub fn getAnAncestor(self: Function) -> *Node;
```
## Function::isCommented

```rust
pub fn isCommented(self: Function) -> bool;
```
## Function::getCyclomaticComplexity

```rust
pub fn getCyclomaticComplexity(self: Function) -> int;
```
## Function::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Function) -> int;
```
## Function::getParamsField

```rust
pub fn getParamsField(self: Function) -> *string;
```
## Function::getType

```rust
pub fn getType(self: Function) -> string;
```
## Function::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Function) -> int;
```
## Function::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Function;
```
