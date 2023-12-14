# Receiver

Primary key: `id: int`

```rust
schema Receiver {
  @primary id: int,
}
```
## Receiver::getIdx

```rust
pub fn getIdx(self: Receiver) -> int;
```
## Receiver::getMethodReceiverType

```rust
pub fn getMethodReceiverType(self: Receiver) -> string;
```
## Receiver::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Receiver) -> int;
```
## Receiver::hasLocation

```rust
pub fn hasLocation(self: Receiver) -> bool;
```
## Receiver::getResultsField

```rust
pub fn getResultsField(self: Receiver) -> *string;
```
## Receiver::getGlobalSignature

```rust
pub fn getGlobalSignature(self: Receiver) -> string;
```
## Receiver::print

```rust
pub fn print(self: Receiver) -> *string;
```
## Receiver::getFunctionTypeSignature

```rust
pub fn getFunctionTypeSignature(self: Receiver) -> string;
```
## Receiver::getMethodReceiverName

```rust
pub fn getMethodReceiverName(self: Receiver) -> string;
```
## Receiver::getCyclomaticComplexity

```rust
pub fn getCyclomaticComplexity(self: Receiver) -> int;
```
## Receiver::getTextSize

```rust
pub fn getTextSize(self: Receiver) -> int;
```
## Receiver::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Receiver, index: int) -> Node;
```
## Receiver::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: Receiver) -> File;
```
## Receiver::getAchildNode

```rust
pub fn getAchildNode(self: Receiver) -> *Node;
```
## Receiver::getFunctionReceiverType

```rust
pub fn getFunctionReceiverType(self: Receiver) -> string;
```
## Receiver::getAResult

```rust
pub fn getAResult(self: Receiver) -> *Node;
```
## Receiver::isMethod

```rust
pub fn isMethod(self: Receiver) -> bool;
```
## Receiver::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Receiver) -> string;
```
## Receiver::isPublicFunction

```rust
pub fn isPublicFunction(self: Receiver) -> bool;
```
## Receiver::isRootNode

```rust
pub fn isRootNode(self: Receiver) -> bool;
```
## Receiver::getParentNode

```rust
pub fn getParentNode(self: Receiver) -> Node;
```
## Receiver::getCommentCnt

```rust
pub fn getCommentCnt(self: Receiver) -> int;
```
## Receiver::getAssociatedComment

```rust
pub fn getAssociatedComment(self: Receiver) -> string;
```
## Receiver::getFunctionReceiverInfo

```rust
pub fn getFunctionReceiverInfo(self: Receiver) -> string;
```
## Receiver::getFunctionFullSignature

```rust
pub fn getFunctionFullSignature(self: Receiver) -> string;
```
## Receiver::getChildCount

```rust
pub fn getChildCount(self: Receiver) -> int;
```
## Receiver::getName

```rust
pub fn getName(self: Receiver) -> string;
```
## Receiver::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Receiver) -> string;
```
## Receiver::getAnAncestor

```rust
pub fn getAnAncestor(self: Receiver) -> *Node;
```
## Receiver::isCommented

```rust
pub fn isCommented(self: Receiver) -> bool;
```
## Receiver::getAParameter

```rust
pub fn getAParameter(self: Receiver) -> *Node;
```
## Receiver::getFunctionSignature

```rust
pub fn getFunctionSignature(self: Receiver) -> string;
```
## Receiver::getParamsField

```rust
pub fn getParamsField(self: Receiver) -> *string;
```
## Receiver::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Receiver) -> int;
```
## Receiver::isValueReceiver

```rust
pub fn isValueReceiver(self: Receiver) -> bool;
```
## Receiver::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Receiver) -> Function;
```
## Receiver::getLocation

```rust
pub fn getLocation(self: Receiver) -> Location;
```
## Receiver::isPointerReceiver

```rust
pub fn isPointerReceiver(self: Receiver) -> bool;
```
## Receiver::getType

```rust
pub fn getType(self: Receiver) -> string;
```
## Receiver::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Receiver) -> int;
```
## Receiver::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *Receiver;
```
## Receiver::is\<T\>

```rust
pub fn is<T>(self: Receiver) -> bool;
```
## Receiver::to\<T\>

```rust
pub fn to<T>(self: Receiver) -> <any>;
```
## Receiver::key\_neq

```rust
pub fn key_neq(self: Receiver, object: <any>) -> bool;
```
## Receiver::key\_eq

```rust
pub fn key_eq(self: Receiver, object: <any>) -> bool;
```
## Receiver::to\_set

```rust
pub fn to_set(self: Receiver) -> *Receiver;
```
