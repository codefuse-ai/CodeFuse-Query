# ReturnStmt

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema ReturnStmt extends Statement {
  @primary id: int,
}
```
## ReturnStmt::getKind

```rust
pub fn getKind(self: ReturnStmt) -> int;
```
## ReturnStmt::isBlockStmt

```rust
pub fn isBlockStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isXorassignStmt

```rust
pub fn isXorassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isExprStmt

```rust
pub fn isExprStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isAndnotassignStmt

```rust
pub fn isAndnotassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: ReturnStmt, index: int) -> Node;
```
## ReturnStmt::isDeclStmt

```rust
pub fn isDeclStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isCaseClause

```rust
pub fn isCaseClause(self: ReturnStmt) -> bool;
```
## ReturnStmt::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: ReturnStmt) -> string;
```
## ReturnStmt::isSendStmt

```rust
pub fn isSendStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getAnAncestor

```rust
pub fn getAnAncestor(self: ReturnStmt) -> *Node;
```
## ReturnStmt::isSubassignStmt

```rust
pub fn isSubassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getType

```rust
pub fn getType(self: ReturnStmt) -> string;
```
## ReturnStmt::isBreakStmt

```rust
pub fn isBreakStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isDecStmt

```rust
pub fn isDecStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getBelongsFunction

```rust
pub fn getBelongsFunction(self: ReturnStmt) -> Function;
```
## ReturnStmt::isExprswitchStmt

```rust
pub fn isExprswitchStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isAssignStmt

```rust
pub fn isAssignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getChildCount

```rust
pub fn getChildCount(self: ReturnStmt) -> int;
```
## ReturnStmt::getParentNode

```rust
pub fn getParentNode(self: ReturnStmt) -> Node;
```
## ReturnStmt::isReturnStmt

```rust
pub fn isReturnStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isTypeswitchStmt

```rust
pub fn isTypeswitchStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isContinueStmt

```rust
pub fn isContinueStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isDeferStmt

```rust
pub fn isDeferStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isGotoStmt

```rust
pub fn isGotoStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isLabeledStmt

```rust
pub fn isLabeledStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isEmptyStmt

```rust
pub fn isEmptyStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isShlassignStmt

```rust
pub fn isShlassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isFallthroughStmt

```rust
pub fn isFallthroughStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isControlStmt

```rust
pub fn isControlStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isIfStmt

```rust
pub fn isIfStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::countAssociatedComment

```rust
pub fn countAssociatedComment(self: ReturnStmt) -> int;
```
## ReturnStmt::getBelongsFile

```rust
pub fn getBelongsFile(self: ReturnStmt) -> File;
```
## ReturnStmt::isCommClause

```rust
pub fn isCommClause(self: ReturnStmt) -> bool;
```
## ReturnStmt::isGoStmt

```rust
pub fn isGoStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getLocation

```rust
pub fn getLocation(self: ReturnStmt) -> Location;
```
## ReturnStmt::isSelectStmt

```rust
pub fn isSelectStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isQuoassignStmt

```rust
pub fn isQuoassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getTextStartOffset

```rust
pub fn getTextStartOffset(self: ReturnStmt) -> int;
```
## ReturnStmt::isOrassignStmt

```rust
pub fn isOrassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ReturnStmt;
```
## ReturnStmt::isForStmt

```rust
pub fn isForStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isRangeStmt

```rust
pub fn isRangeStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isShrassignStmt

```rust
pub fn isShrassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isDefineStmt

```rust
pub fn isDefineStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getAReturnField

```rust
pub fn getAReturnField(self: ReturnStmt) -> *Node;
```
## ReturnStmt::isAddassignStmt

```rust
pub fn isAddassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isMulassignStmt

```rust
pub fn isMulassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: ReturnStmt) -> string;
```
## ReturnStmt::isRemassignStmt

```rust
pub fn isRemassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isIncStmt

```rust
pub fn isIncStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::isBadStmt

```rust
pub fn isBadStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::getIdx

```rust
pub fn getIdx(self: ReturnStmt) -> int;
```
## ReturnStmt::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: ReturnStmt) -> int;
```
## ReturnStmt::getReturnListCount

```rust
pub fn getReturnListCount(self: ReturnStmt) -> int;
```
## ReturnStmt::getAchildNode

```rust
pub fn getAchildNode(self: ReturnStmt) -> *Node;
```
## ReturnStmt::print

```rust
pub fn print(self: ReturnStmt) -> *string;
```
## ReturnStmt::isRootNode

```rust
pub fn isRootNode(self: ReturnStmt) -> bool;
```
## ReturnStmt::isAndassignStmt

```rust
pub fn isAndassignStmt(self: ReturnStmt) -> bool;
```
## ReturnStmt::hasLocation

```rust
pub fn hasLocation(self: ReturnStmt) -> bool;
```
## ReturnStmt::getTextSize

```rust
pub fn getTextSize(self: ReturnStmt) -> int;
```
## ReturnStmt::getAReturnFieldByIndex

```rust
pub fn getAReturnFieldByIndex(self: ReturnStmt, index: int) -> *Node;
```
