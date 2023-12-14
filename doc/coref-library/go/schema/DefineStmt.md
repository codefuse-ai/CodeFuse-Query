# DefineStmt

Primary key: `id: int`

```rust
schema DefineStmt {
  @primary id: int,
}
```
## DefineStmt::getKind

```rust
pub fn getKind(self: DefineStmt) -> int;
```
## DefineStmt::isBlockStmt

```rust
pub fn isBlockStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getIdx

```rust
pub fn getIdx(self: DefineStmt) -> int;
```
## DefineStmt::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: DefineStmt) -> int;
```
## DefineStmt::isXorassignStmt

```rust
pub fn isXorassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isExprStmt

```rust
pub fn isExprStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isAndnotassignStmt

```rust
pub fn isAndnotassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: DefineStmt, index: int) -> Node;
```
## DefineStmt::isDeclStmt

```rust
pub fn isDeclStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isCaseClause

```rust
pub fn isCaseClause(self: DefineStmt) -> bool;
```
## DefineStmt::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: DefineStmt) -> string;
```
## DefineStmt::isSendStmt

```rust
pub fn isSendStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getAnAncestor

```rust
pub fn getAnAncestor(self: DefineStmt) -> *Node;
```
## DefineStmt::isSubassignStmt

```rust
pub fn isSubassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getType

```rust
pub fn getType(self: DefineStmt) -> string;
```
## DefineStmt::isBreakStmt

```rust
pub fn isBreakStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isDecStmt

```rust
pub fn isDecStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getBelongsFunction

```rust
pub fn getBelongsFunction(self: DefineStmt) -> Function;
```
## DefineStmt::isExprswitchStmt

```rust
pub fn isExprswitchStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isAssignStmt

```rust
pub fn isAssignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getChildCount

```rust
pub fn getChildCount(self: DefineStmt) -> int;
```
## DefineStmt::getParentNode

```rust
pub fn getParentNode(self: DefineStmt) -> Node;
```
## DefineStmt::isReturnStmt

```rust
pub fn isReturnStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isTypeswitchStmt

```rust
pub fn isTypeswitchStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isContinueStmt

```rust
pub fn isContinueStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isDeferStmt

```rust
pub fn isDeferStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isGotoStmt

```rust
pub fn isGotoStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isLabeledStmt

```rust
pub fn isLabeledStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isEmptyStmt

```rust
pub fn isEmptyStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isShlassignStmt

```rust
pub fn isShlassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isFallthroughStmt

```rust
pub fn isFallthroughStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isControlStmt

```rust
pub fn isControlStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isIfStmt

```rust
pub fn isIfStmt(self: DefineStmt) -> bool;
```
## DefineStmt::countAssociatedComment

```rust
pub fn countAssociatedComment(self: DefineStmt) -> int;
```
## DefineStmt::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: DefineStmt) -> File;
```
## DefineStmt::isCommClause

```rust
pub fn isCommClause(self: DefineStmt) -> bool;
```
## DefineStmt::getLocation

```rust
pub fn getLocation(self: DefineStmt) -> Location;
```
## DefineStmt::isSelectStmt

```rust
pub fn isSelectStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isQuoassignStmt

```rust
pub fn isQuoassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getTextStartOffset

```rust
pub fn getTextStartOffset(self: DefineStmt) -> int;
```
## DefineStmt::isOrassignStmt

```rust
pub fn isOrassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *DefineStmt;
```
## DefineStmt::isForStmt

```rust
pub fn isForStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isRangeStmt

```rust
pub fn isRangeStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isShrassignStmt

```rust
pub fn isShrassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isDefineStmt

```rust
pub fn isDefineStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getAVarible

```rust
pub fn getAVarible(self: DefineStmt) -> *Node;
```
## DefineStmt::isAddassignStmt

```rust
pub fn isAddassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isMulassignStmt

```rust
pub fn isMulassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: DefineStmt) -> string;
```
## DefineStmt::isRemassignStmt

```rust
pub fn isRemassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isIncStmt

```rust
pub fn isIncStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isBadStmt

```rust
pub fn isBadStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getAchildNode

```rust
pub fn getAchildNode(self: DefineStmt) -> *Node;
```
## DefineStmt::print

```rust
pub fn print(self: DefineStmt) -> *string;
```
## DefineStmt::isRootNode

```rust
pub fn isRootNode(self: DefineStmt) -> bool;
```
## DefineStmt::isAndassignStmt

```rust
pub fn isAndassignStmt(self: DefineStmt) -> bool;
```
## DefineStmt::isGoStmt

```rust
pub fn isGoStmt(self: DefineStmt) -> bool;
```
## DefineStmt::getASource

```rust
pub fn getASource(self: DefineStmt) -> *Expr;
```
## DefineStmt::hasLocation

```rust
pub fn hasLocation(self: DefineStmt) -> bool;
```
## DefineStmt::getVaribleName

```rust
pub fn getVaribleName(self: DefineStmt) -> *string;
```
## DefineStmt::getTextSize

```rust
pub fn getTextSize(self: DefineStmt) -> int;
```
## DefineStmt::is\<T\>

```rust
pub fn is<T>(self: DefineStmt) -> bool;
```
## DefineStmt::to\<T\>

```rust
pub fn to<T>(self: DefineStmt) -> <any>;
```
## DefineStmt::key\_neq

```rust
pub fn key_neq(self: DefineStmt, object: <any>) -> bool;
```
## DefineStmt::key\_eq

```rust
pub fn key_eq(self: DefineStmt, object: <any>) -> bool;
```
## DefineStmt::to\_set

```rust
pub fn to_set(self: DefineStmt) -> *DefineStmt;
```
