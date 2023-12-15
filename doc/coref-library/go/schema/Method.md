# Method

Inherit from [Function](./Function.md)

Primary key: `id: int`

```rust
schema Method extends Function {
  @primary id: int
}
```
## Method::getParamsField

```rust
pub fn getParamsField(self: Method) -> *string;
```
## Method::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Method) -> int;
```
## Method::isCommented

```rust
pub fn isCommented(self: Method) -> bool;
```
## Method::getAnAncestor

```rust
pub fn getAnAncestor(self: Method) -> *Node;
```
## Method::getName

```rust
pub fn getName(self: Method) -> string;
```
## Method::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Method) -> string;
```
## Method::getChildCount

```rust
pub fn getChildCount(self: Method) -> int;
```
## Method::getFunctionSignature

```rust
pub fn getFunctionSignature(self: Method) -> string;
```
## Method::getAParameter

```rust
pub fn getAParameter(self: Method) -> *Node;
```
## Method::getFunctionFullSignature

```rust
pub fn getFunctionFullSignature(self: Method) -> string;
```
## Method::getFunctionReceiverInfo

```rust
pub fn getFunctionReceiverInfo(self: Method) -> string;
```
## Method::getAssociatedComment

```rust
pub fn getAssociatedComment(self: Method) -> string;
```
## Method::getCommentCnt

```rust
pub fn getCommentCnt(self: Method) -> int;
```
## Method::getParentNode

```rust
pub fn getParentNode(self: Method) -> Node;
```
## Method::isRootNode

```rust
pub fn isRootNode(self: Method) -> bool;
```
## Method::isPublicFunction

```rust
pub fn isPublicFunction(self: Method) -> bool;
```
## Method::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Method) -> string;
```
## Method::isMethod

```rust
pub fn isMethod(self: Method) -> bool;
```
## Method::getAResult

```rust
pub fn getAResult(self: Method) -> *Node;
```
## Method::getFunctionReceiverType

```rust
pub fn getFunctionReceiverType(self: Method) -> string;
```
## Method::getAchildNode

```rust
pub fn getAchildNode(self: Method) -> *Node;
```
## Method::getLocation

```rust
pub fn getLocation(self: Method) -> Location;
```
## Method::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Method) -> Function;
```
## Method::getBelongsFile

```rust
pub fn getBelongsFile(self: Method) -> File;
```
## Method::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Method, index: int) -> Node;
```
## Method::getTextSize

```rust
pub fn getTextSize(self: Method) -> int;
```
## Method::getCyclomaticComplexity

```rust
pub fn getCyclomaticComplexity(self: Method) -> int;
```
## Method::getMethodReceiverName

```rust
pub fn getMethodReceiverName(self: Method) -> string;
```
## Method::getFunctionTypeSignature

```rust
pub fn getFunctionTypeSignature(self: Method) -> string;
```
## Method::print

```rust
pub fn print(self: Method) -> *string;
```
## Method::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Method) -> int;
```
## Method::getType

```rust
pub fn getType(self: Method) -> string;
```
## Method::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Method;
```
## Method::getGlobalSignature

```rust
pub fn getGlobalSignature(self: Method) -> string;
```
## Method::getResultsField

```rust
pub fn getResultsField(self: Method) -> *string;
```
## Method::hasLocation

```rust
pub fn hasLocation(self: Method) -> bool;
```
## Method::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Method) -> int;
```
## Method::getMethodReceiverType

```rust
pub fn getMethodReceiverType(self: Method) -> string;
```
## Method::getIdx

```rust
pub fn getIdx(self: Method) -> int;
```
