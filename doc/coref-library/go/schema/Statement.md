# Statement

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema Statement extends Node {
  @primary id: int,
}
```
## Statement::getTextSize

```rust
pub fn getTextSize(self: Statement) -> int;
```
## Statement::isRootNode

```rust
pub fn isRootNode(self: Statement) -> bool;
```
## Statement::hasLocation

```rust
pub fn hasLocation(self: Statement) -> bool;
```
## Statement::print

```rust
pub fn print(self: Statement) -> *string;
```
## Statement::getAchildNode

```rust
pub fn getAchildNode(self: Statement) -> *Node;
```
## Statement::isAndassignStmt

```rust
pub fn isAndassignStmt(self: Statement) -> bool;
```
## Statement::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Statement) -> string;
```
## Statement::isRemassignStmt

```rust
pub fn isRemassignStmt(self: Statement) -> bool;
```
## Statement::isMulassignStmt

```rust
pub fn isMulassignStmt(self: Statement) -> bool;
```
## Statement::isAddassignStmt

```rust
pub fn isAddassignStmt(self: Statement) -> bool;
```
## Statement::isDefineStmt

```rust
pub fn isDefineStmt(self: Statement) -> bool;
```
## Statement::isShrassignStmt

```rust
pub fn isShrassignStmt(self: Statement) -> bool;
```
## Statement::isRangeStmt

```rust
pub fn isRangeStmt(self: Statement) -> bool;
```
## Statement::isForStmt

```rust
pub fn isForStmt(self: Statement) -> bool;
```
## Statement::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Statement) -> int;
```
## Statement::isOrassignStmt

```rust
pub fn isOrassignStmt(self: Statement) -> bool;
```
## Statement::isQuoassignStmt

```rust
pub fn isQuoassignStmt(self: Statement) -> bool;
```
## Statement::getLocation

```rust
pub fn getLocation(self: Statement) -> Location;
```
## Statement::isSelectStmt

```rust
pub fn isSelectStmt(self: Statement) -> bool;
```
## Statement::getBelongsFile

```rust
pub fn getBelongsFile(self: Statement) -> File;
```
## Statement::isCommClause

```rust
pub fn isCommClause(self: Statement) -> bool;
```
## Statement::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Statement) -> int;
```
## Statement::isIfStmt

```rust
pub fn isIfStmt(self: Statement) -> bool;
```
## Statement::isControlStmt

```rust
pub fn isControlStmt(self: Statement) -> bool;
```
## Statement::isFallthroughStmt

```rust
pub fn isFallthroughStmt(self: Statement) -> bool;
```
## Statement::isShlassignStmt

```rust
pub fn isShlassignStmt(self: Statement) -> bool;
```
## Statement::isEmptyStmt

```rust
pub fn isEmptyStmt(self: Statement) -> bool;
```
## Statement::isLabeledStmt

```rust
pub fn isLabeledStmt(self: Statement) -> bool;
```
## Statement::isDeferStmt

```rust
pub fn isDeferStmt(self: Statement) -> bool;
```
## Statement::isGotoStmt

```rust
pub fn isGotoStmt(self: Statement) -> bool;
```
## Statement::isContinueStmt

```rust
pub fn isContinueStmt(self: Statement) -> bool;
```
## Statement::isTypeswitchStmt

```rust
pub fn isTypeswitchStmt(self: Statement) -> bool;
```
## Statement::getParentNode

```rust
pub fn getParentNode(self: Statement) -> Node;
```
## Statement::getChildCount

```rust
pub fn getChildCount(self: Statement) -> int;
```
## Statement::isReturnStmt

```rust
pub fn isReturnStmt(self: Statement) -> bool;
```
## Statement::isGoStmt

```rust
pub fn isGoStmt(self: Statement) -> bool;
```
## Statement::isAssignStmt

```rust
pub fn isAssignStmt(self: Statement) -> bool;
```
## Statement::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Statement) -> Function;
```
## Statement::isExprswitchStmt

```rust
pub fn isExprswitchStmt(self: Statement) -> bool;
```
## Statement::isDecStmt

```rust
pub fn isDecStmt(self: Statement) -> bool;
```
## Statement::isBreakStmt

```rust
pub fn isBreakStmt(self: Statement) -> bool;
```
## Statement::isBadStmt

```rust
pub fn isBadStmt(self: Statement) -> bool;
```
## Statement::isIncStmt

```rust
pub fn isIncStmt(self: Statement) -> bool;
```
## Statement::getType

```rust
pub fn getType(self: Statement) -> string;
```
## Statement::isSubassignStmt

```rust
pub fn isSubassignStmt(self: Statement) -> bool;
```
## Statement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Statement;
```
## Statement::getAnAncestor

```rust
pub fn getAnAncestor(self: Statement) -> *Node;
```
## Statement::isSendStmt

```rust
pub fn isSendStmt(self: Statement) -> bool;
```
## Statement::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Statement) -> string;
```
## Statement::isCaseClause

```rust
pub fn isCaseClause(self: Statement) -> bool;
```
## Statement::isDeclStmt

```rust
pub fn isDeclStmt(self: Statement) -> bool;
```
## Statement::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Statement, index: int) -> Node;
```
## Statement::isAndnotassignStmt

```rust
pub fn isAndnotassignStmt(self: Statement) -> bool;
```
## Statement::isExprStmt

```rust
pub fn isExprStmt(self: Statement) -> bool;
```
## Statement::isXorassignStmt

```rust
pub fn isXorassignStmt(self: Statement) -> bool;
```
## Statement::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Statement) -> int;
```
## Statement::getIdx

```rust
pub fn getIdx(self: Statement) -> int;
```
## Statement::isBlockStmt

```rust
pub fn isBlockStmt(self: Statement) -> bool;
```
## Statement::getKind

```rust
pub fn getKind(self: Statement) -> int;
```
