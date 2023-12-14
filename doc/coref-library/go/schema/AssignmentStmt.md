# AssignmentStmt

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema AssignmentStmt extends Statement {
  @primary id: int,
}
```
## AssignmentStmt::getKind

```rust
pub fn getKind(self: AssignmentStmt) -> int;
```
## AssignmentStmt::isBlockStmt

```rust
pub fn isBlockStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getIdx

```rust
pub fn getIdx(self: AssignmentStmt) -> int;
```
## AssignmentStmt::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: AssignmentStmt) -> int;
```
## AssignmentStmt::isXorassignStmt

```rust
pub fn isXorassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isExprStmt

```rust
pub fn isExprStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isAndnotassignStmt

```rust
pub fn isAndnotassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: AssignmentStmt, index: int) -> Node;
```
## AssignmentStmt::isDeclStmt

```rust
pub fn isDeclStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isCaseClause

```rust
pub fn isCaseClause(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: AssignmentStmt) -> string;
```
## AssignmentStmt::isSendStmt

```rust
pub fn isSendStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getAnAncestor

```rust
pub fn getAnAncestor(self: AssignmentStmt) -> *Node;
```
## AssignmentStmt::isSubassignStmt

```rust
pub fn isSubassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getType

```rust
pub fn getType(self: AssignmentStmt) -> string;
```
## AssignmentStmt::isBreakStmt

```rust
pub fn isBreakStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isDecStmt

```rust
pub fn isDecStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getBelongsFunction

```rust
pub fn getBelongsFunction(self: AssignmentStmt) -> Function;
```
## AssignmentStmt::isExprswitchStmt

```rust
pub fn isExprswitchStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isAssignStmt

```rust
pub fn isAssignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getChildCount

```rust
pub fn getChildCount(self: AssignmentStmt) -> int;
```
## AssignmentStmt::getParentNode

```rust
pub fn getParentNode(self: AssignmentStmt) -> Node;
```
## AssignmentStmt::isReturnStmt

```rust
pub fn isReturnStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isTypeswitchStmt

```rust
pub fn isTypeswitchStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isContinueStmt

```rust
pub fn isContinueStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isDeferStmt

```rust
pub fn isDeferStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isGotoStmt

```rust
pub fn isGotoStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isLabeledStmt

```rust
pub fn isLabeledStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isEmptyStmt

```rust
pub fn isEmptyStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isShlassignStmt

```rust
pub fn isShlassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isFallthroughStmt

```rust
pub fn isFallthroughStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isControlStmt

```rust
pub fn isControlStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isIfStmt

```rust
pub fn isIfStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::countAssociatedComment

```rust
pub fn countAssociatedComment(self: AssignmentStmt) -> int;
```
## AssignmentStmt::getBelongsFile

```rust
pub fn getBelongsFile(self: AssignmentStmt) -> File;
```
## AssignmentStmt::isCommClause

```rust
pub fn isCommClause(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isGoStmt

```rust
pub fn isGoStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isShrassignStmt

```rust
pub fn isShrassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getALhs

```rust
pub fn getALhs(self: AssignmentStmt) -> *Expr;
```
## AssignmentStmt::isQuoassignStmt

```rust
pub fn isQuoassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getLocation

```rust
pub fn getLocation(self: AssignmentStmt) -> Location;
```
## AssignmentStmt::isSelectStmt

```rust
pub fn isSelectStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getTextStartOffset

```rust
pub fn getTextStartOffset(self: AssignmentStmt) -> int;
```
## AssignmentStmt::isOrassignStmt

```rust
pub fn isOrassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *AssignmentStmt;
```
## AssignmentStmt::isForStmt

```rust
pub fn isForStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isRangeStmt

```rust
pub fn isRangeStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isDefineStmt

```rust
pub fn isDefineStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isAddassignStmt

```rust
pub fn isAddassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isMulassignStmt

```rust
pub fn isMulassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getAchildNode

```rust
pub fn getAchildNode(self: AssignmentStmt) -> *Node;
```
## AssignmentStmt::print

```rust
pub fn print(self: AssignmentStmt) -> *string;
```
## AssignmentStmt::isRootNode

```rust
pub fn isRootNode(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isAndassignStmt

```rust
pub fn isAndassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: AssignmentStmt) -> string;
```
## AssignmentStmt::isRemassignStmt

```rust
pub fn isRemassignStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isIncStmt

```rust
pub fn isIncStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::isBadStmt

```rust
pub fn isBadStmt(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getARhs

```rust
pub fn getARhs(self: AssignmentStmt) -> *Expr;
```
## AssignmentStmt::hasLocation

```rust
pub fn hasLocation(self: AssignmentStmt) -> bool;
```
## AssignmentStmt::getTextSize

```rust
pub fn getTextSize(self: AssignmentStmt) -> int;
```
