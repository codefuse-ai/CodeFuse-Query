# ForStmt

Primary key: `id: int`

```rust
schema ForStmt {
  @primary id: int,
}
```
## ForStmt::getKind

```rust
pub fn getKind(self: ForStmt) -> int;
```
## ForStmt::isBlockStmt

```rust
pub fn isBlockStmt(self: ForStmt) -> bool;
```
## ForStmt::getIdx

```rust
pub fn getIdx(self: ForStmt) -> int;
```
## ForStmt::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: ForStmt) -> int;
```
## ForStmt::isXorassignStmt

```rust
pub fn isXorassignStmt(self: ForStmt) -> bool;
```
## ForStmt::isExprStmt

```rust
pub fn isExprStmt(self: ForStmt) -> bool;
```
## ForStmt::isAndnotassignStmt

```rust
pub fn isAndnotassignStmt(self: ForStmt) -> bool;
```
## ForStmt::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: ForStmt, index: int) -> Node;
```
## ForStmt::isDeclStmt

```rust
pub fn isDeclStmt(self: ForStmt) -> bool;
```
## ForStmt::isCaseClause

```rust
pub fn isCaseClause(self: ForStmt) -> bool;
```
## ForStmt::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: ForStmt) -> string;
```
## ForStmt::isSendStmt

```rust
pub fn isSendStmt(self: ForStmt) -> bool;
```
## ForStmt::getAnAncestor

```rust
pub fn getAnAncestor(self: ForStmt) -> *Node;
```
## ForStmt::isSubassignStmt

```rust
pub fn isSubassignStmt(self: ForStmt) -> bool;
```
## ForStmt::getType

```rust
pub fn getType(self: ForStmt) -> string;
```
## ForStmt::isIncStmt

```rust
pub fn isIncStmt(self: ForStmt) -> bool;
```
## ForStmt::isBadStmt

```rust
pub fn isBadStmt(self: ForStmt) -> bool;
```
## ForStmt::isBreakStmt

```rust
pub fn isBreakStmt(self: ForStmt) -> bool;
```
## ForStmt::isDecStmt

```rust
pub fn isDecStmt(self: ForStmt) -> bool;
```
## ForStmt::getBelongsFunction

```rust
pub fn getBelongsFunction(self: ForStmt) -> Function;
```
## ForStmt::isExprswitchStmt

```rust
pub fn isExprswitchStmt(self: ForStmt) -> bool;
```
## ForStmt::isAssignStmt

```rust
pub fn isAssignStmt(self: ForStmt) -> bool;
```
## ForStmt::getChildCount

```rust
pub fn getChildCount(self: ForStmt) -> int;
```
## ForStmt::getParentNode

```rust
pub fn getParentNode(self: ForStmt) -> Node;
```
## ForStmt::isReturnStmt

```rust
pub fn isReturnStmt(self: ForStmt) -> bool;
```
## ForStmt::getBodyStmt

```rust
pub fn getBodyStmt(self: ForStmt) -> Statement;
```
## ForStmt::isTypeswitchStmt

```rust
pub fn isTypeswitchStmt(self: ForStmt) -> bool;
```
## ForStmt::isContinueStmt

```rust
pub fn isContinueStmt(self: ForStmt) -> bool;
```
## ForStmt::isDeferStmt

```rust
pub fn isDeferStmt(self: ForStmt) -> bool;
```
## ForStmt::isGotoStmt

```rust
pub fn isGotoStmt(self: ForStmt) -> bool;
```
## ForStmt::isLabeledStmt

```rust
pub fn isLabeledStmt(self: ForStmt) -> bool;
```
## ForStmt::isEmptyStmt

```rust
pub fn isEmptyStmt(self: ForStmt) -> bool;
```
## ForStmt::isShlassignStmt

```rust
pub fn isShlassignStmt(self: ForStmt) -> bool;
```
## ForStmt::isFallthroughStmt

```rust
pub fn isFallthroughStmt(self: ForStmt) -> bool;
```
## ForStmt::isControlStmt

```rust
pub fn isControlStmt(self: ForStmt) -> bool;
```
## ForStmt::isIfStmt

```rust
pub fn isIfStmt(self: ForStmt) -> bool;
```
## ForStmt::countAssociatedComment

```rust
pub fn countAssociatedComment(self: ForStmt) -> int;
```
## ForStmt::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: ForStmt) -> File;
```
## ForStmt::isCommClause

```rust
pub fn isCommClause(self: ForStmt) -> bool;
```
## ForStmt::isGoStmt

```rust
pub fn isGoStmt(self: ForStmt) -> bool;
```
## ForStmt::getLocation

```rust
pub fn getLocation(self: ForStmt) -> Location;
```
## ForStmt::isSelectStmt

```rust
pub fn isSelectStmt(self: ForStmt) -> bool;
```
## ForStmt::getTextStartOffset

```rust
pub fn getTextStartOffset(self: ForStmt) -> int;
```
## ForStmt::isOrassignStmt

```rust
pub fn isOrassignStmt(self: ForStmt) -> bool;
```
## ForStmt::isQuoassignStmt

```rust
pub fn isQuoassignStmt(self: ForStmt) -> bool;
```
## ForStmt::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ForStmt;
```
## ForStmt::getCondExpr

```rust
pub fn getCondExpr(self: ForStmt) -> Expr;
```
## ForStmt::isForStmt

```rust
pub fn isForStmt(self: ForStmt) -> bool;
```
## ForStmt::isRangeStmt

```rust
pub fn isRangeStmt(self: ForStmt) -> bool;
```
## ForStmt::isShrassignStmt

```rust
pub fn isShrassignStmt(self: ForStmt) -> bool;
```
## ForStmt::isDefineStmt

```rust
pub fn isDefineStmt(self: ForStmt) -> bool;
```
## ForStmt::isAddassignStmt

```rust
pub fn isAddassignStmt(self: ForStmt) -> bool;
```
## ForStmt::isMulassignStmt

```rust
pub fn isMulassignStmt(self: ForStmt) -> bool;
```
## ForStmt::isRemassignStmt

```rust
pub fn isRemassignStmt(self: ForStmt) -> bool;
```
## ForStmt::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: ForStmt) -> string;
```
## ForStmt::print

```rust
pub fn print(self: ForStmt) -> *string;
```
## ForStmt::getAchildNode

```rust
pub fn getAchildNode(self: ForStmt) -> *Node;
```
## ForStmt::hasLocation

```rust
pub fn hasLocation(self: ForStmt) -> bool;
```
## ForStmt::isAndassignStmt

```rust
pub fn isAndassignStmt(self: ForStmt) -> bool;
```
## ForStmt::isRootNode

```rust
pub fn isRootNode(self: ForStmt) -> bool;
```
## ForStmt::getInitStmt

```rust
pub fn getInitStmt(self: ForStmt) -> Statement;
```
## ForStmt::getPostStmt

```rust
pub fn getPostStmt(self: ForStmt) -> Statement;
```
## ForStmt::getTextSize

```rust
pub fn getTextSize(self: ForStmt) -> int;
```
## ForStmt::is\<T\>

```rust
pub fn is<T>(self: ForStmt) -> bool;
```
## ForStmt::to\<T\>

```rust
pub fn to<T>(self: ForStmt) -> <any>;
```
## ForStmt::key\_neq

```rust
pub fn key_neq(self: ForStmt, object: <any>) -> bool;
```
## ForStmt::key\_eq

```rust
pub fn key_eq(self: ForStmt, object: <any>) -> bool;
```
## ForStmt::to\_set

```rust
pub fn to_set(self: ForStmt) -> *ForStmt;
```
