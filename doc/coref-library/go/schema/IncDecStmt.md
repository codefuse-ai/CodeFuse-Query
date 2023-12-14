# IncDecStmt

Primary key: `id: int`

```rust
schema IncDecStmt {
  @primary id: int,
}
```
## IncDecStmt::getKind

```rust
pub fn getKind(self: IncDecStmt) -> int;
```
## IncDecStmt::isBlockStmt

```rust
pub fn isBlockStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getIdx

```rust
pub fn getIdx(self: IncDecStmt) -> int;
```
## IncDecStmt::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: IncDecStmt) -> int;
```
## IncDecStmt::isXorassignStmt

```rust
pub fn isXorassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isExprStmt

```rust
pub fn isExprStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isAndnotassignStmt

```rust
pub fn isAndnotassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: IncDecStmt, index: int) -> Node;
```
## IncDecStmt::isDeclStmt

```rust
pub fn isDeclStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isCaseClause

```rust
pub fn isCaseClause(self: IncDecStmt) -> bool;
```
## IncDecStmt::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: IncDecStmt) -> string;
```
## IncDecStmt::isSendStmt

```rust
pub fn isSendStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getAnAncestor

```rust
pub fn getAnAncestor(self: IncDecStmt) -> *Node;
```
## IncDecStmt::isBreakStmt

```rust
pub fn isBreakStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isDecStmt

```rust
pub fn isDecStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getBelongsFunction

```rust
pub fn getBelongsFunction(self: IncDecStmt) -> Function;
```
## IncDecStmt::isExprswitchStmt

```rust
pub fn isExprswitchStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isAssignStmt

```rust
pub fn isAssignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getChildCount

```rust
pub fn getChildCount(self: IncDecStmt) -> int;
```
## IncDecStmt::getParentNode

```rust
pub fn getParentNode(self: IncDecStmt) -> Node;
```
## IncDecStmt::isReturnStmt

```rust
pub fn isReturnStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isTypeswitchStmt

```rust
pub fn isTypeswitchStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isContinueStmt

```rust
pub fn isContinueStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isDeferStmt

```rust
pub fn isDeferStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isGotoStmt

```rust
pub fn isGotoStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isLabeledStmt

```rust
pub fn isLabeledStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isEmptyStmt

```rust
pub fn isEmptyStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isShlassignStmt

```rust
pub fn isShlassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isFallthroughStmt

```rust
pub fn isFallthroughStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isControlStmt

```rust
pub fn isControlStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isIfStmt

```rust
pub fn isIfStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::countAssociatedComment

```rust
pub fn countAssociatedComment(self: IncDecStmt) -> int;
```
## IncDecStmt::isGoStmt

```rust
pub fn isGoStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isCommClause

```rust
pub fn isCommClause(self: IncDecStmt) -> bool;
```
## IncDecStmt::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: IncDecStmt) -> File;
```
## IncDecStmt::isQuoassignStmt

```rust
pub fn isQuoassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getLocation

```rust
pub fn getLocation(self: IncDecStmt) -> Location;
```
## IncDecStmt::isSelectStmt

```rust
pub fn isSelectStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getTextStartOffset

```rust
pub fn getTextStartOffset(self: IncDecStmt) -> int;
```
## IncDecStmt::isOrassignStmt

```rust
pub fn isOrassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isSubassignStmt

```rust
pub fn isSubassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getType

```rust
pub fn getType(self: IncDecStmt) -> string;
```
## IncDecStmt::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *IncDecStmt;
```
## IncDecStmt::isForStmt

```rust
pub fn isForStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isRangeStmt

```rust
pub fn isRangeStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isShrassignStmt

```rust
pub fn isShrassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isDefineStmt

```rust
pub fn isDefineStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isMulassignStmt

```rust
pub fn isMulassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isAddassignStmt

```rust
pub fn isAddassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getAchildNode

```rust
pub fn getAchildNode(self: IncDecStmt) -> *Node;
```
## IncDecStmt::print

```rust
pub fn print(self: IncDecStmt) -> *string;
```
## IncDecStmt::isRootNode

```rust
pub fn isRootNode(self: IncDecStmt) -> bool;
```
## IncDecStmt::isAndassignStmt

```rust
pub fn isAndassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: IncDecStmt) -> string;
```
## IncDecStmt::isRemassignStmt

```rust
pub fn isRemassignStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isIncStmt

```rust
pub fn isIncStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::isBadStmt

```rust
pub fn isBadStmt(self: IncDecStmt) -> bool;
```
## IncDecStmt::getTextSize

```rust
pub fn getTextSize(self: IncDecStmt) -> int;
```
## IncDecStmt::hasLocation

```rust
pub fn hasLocation(self: IncDecStmt) -> bool;
```
## IncDecStmt::is\<T\>

```rust
pub fn is<T>(self: IncDecStmt) -> bool;
```
## IncDecStmt::to\<T\>

```rust
pub fn to<T>(self: IncDecStmt) -> <any>;
```
## IncDecStmt::key\_neq

```rust
pub fn key_neq(self: IncDecStmt, object: <any>) -> bool;
```
## IncDecStmt::key\_eq

```rust
pub fn key_eq(self: IncDecStmt, object: <any>) -> bool;
```
## IncDecStmt::to\_set

```rust
pub fn to_set(self: IncDecStmt) -> *IncDecStmt;
```
