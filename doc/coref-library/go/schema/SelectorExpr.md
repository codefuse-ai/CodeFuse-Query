# SelectorExpr

Primary key: `id: int`

```rust
schema SelectorExpr {
  @primary id: int,
}
```
## SelectorExpr::isNotExpr

```rust
pub fn isNotExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getIdx

```rust
pub fn getIdx(self: SelectorExpr) -> int;
```
## SelectorExpr::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: SelectorExpr) -> int;
```
## SelectorExpr::getType

```rust
pub fn getType(self: SelectorExpr) -> string;
```
## SelectorExpr::isGenericfunctioninstantiationExpr

```rust
pub fn isGenericfunctioninstantiationExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getAChildByIdx

```rust
pub fn getAChildByIdx(self: SelectorExpr, idx: int) -> *Node;
```
## SelectorExpr::isSubExpr

```rust
pub fn isSubExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getSignature

```rust
pub fn getSignature(self: SelectorExpr) -> *string;
```
## SelectorExpr::isArrowExpr

```rust
pub fn isArrowExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getBasicLitValue

```rust
pub fn getBasicLitValue(self: SelectorExpr) -> string;
```
## SelectorExpr::isCompositeLit

```rust
pub fn isCompositeLit(self: SelectorExpr) -> bool;
```
## SelectorExpr::isControlExpr

```rust
// Check if the expression is a control expression.
```
```rust
pub fn isControlExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isSliceExpr

```rust
pub fn isSliceExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getDebugInfo

```rust
pub fn getDebugInfo(self: SelectorExpr) -> string;
```
## SelectorExpr::isBasicLitExpr

```rust
pub fn isBasicLitExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isFloatLit

```rust
pub fn isFloatLit(self: SelectorExpr) -> bool;
```
## SelectorExpr::getBelongsStmt

```rust
pub fn getBelongsStmt(self: SelectorExpr) -> Statement;
```
## SelectorExpr::isAndExpr

```rust
pub fn isAndExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isBadExpr

```rust
pub fn isBadExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getExprTypeName

```rust
pub fn getExprTypeName(self: SelectorExpr) -> *string;
```
## SelectorExpr::isCallorconversionExpr

```rust
pub fn isCallorconversionExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isIdent

```rust
pub fn isIdent(self: SelectorExpr) -> bool;
```
## SelectorExpr::hasLocation

```rust
pub fn hasLocation(self: SelectorExpr) -> bool;
```
## SelectorExpr::isStringLit

```rust
pub fn isStringLit(self: SelectorExpr) -> bool;
```
## SelectorExpr::isEllipsis

```rust
pub fn isEllipsis(self: SelectorExpr) -> bool;
```
## SelectorExpr::isStarExpr

```rust
pub fn isStarExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isImagLit

```rust
pub fn isImagLit(self: SelectorExpr) -> bool;
```
## SelectorExpr::isLssExpr

```rust
pub fn isLssExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isUnaryExpr

```rust
// Check if the given expression is a unary expression.
```
```rust
pub fn isUnaryExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isSelectorExpr

```rust
pub fn isSelectorExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isCharLit

```rust
pub fn isCharLit(self: SelectorExpr) -> bool;
```
## SelectorExpr::isFunctypeExpr

```rust
pub fn isFunctypeExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isParenExpr

```rust
pub fn isParenExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isLorExpr

```rust
pub fn isLorExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isAndnotExpr

```rust
pub fn isAndnotExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isIndexExpr

```rust
pub fn isIndexExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getKind

```rust
pub fn getKind(self: SelectorExpr) -> int;
```
## SelectorExpr::isTypeassertExpr

```rust
pub fn isTypeassertExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isGenerictypeinstantiationExpr

```rust
pub fn isGenerictypeinstantiationExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isInterfacetypeExpr

```rust
pub fn isInterfacetypeExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isBinaryExpr

```rust
// Check if the expression is a binary expression.
```
```rust
pub fn isBinaryExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isAddressExpr

```rust
pub fn isAddressExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isKeyvalueExpr

```rust
pub fn isKeyvalueExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isMaptypeExpr

```rust
pub fn isMaptypeExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isIntLit

```rust
pub fn isIntLit(self: SelectorExpr) -> bool;
```
## SelectorExpr::isArraytypeExpr

```rust
pub fn isArraytypeExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isTypesetliteralExpr

```rust
pub fn isTypesetliteralExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isComplementExpr

```rust
pub fn isComplementExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isPlusExpr

```rust
pub fn isPlusExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isSendrcvchantypeExpr

```rust
pub fn isSendrcvchantypeExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isStructtypeExpr

```rust
pub fn isStructtypeExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isShlExpr

```rust
pub fn isShlExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isEqlExpr

```rust
pub fn isEqlExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isNeqExpr

```rust
pub fn isNeqExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isLeqExpr

```rust
pub fn isLeqExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getLocation

```rust
pub fn getLocation(self: SelectorExpr) -> Location;
```
## SelectorExpr::isShrExpr

```rust
pub fn isShrExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isGeqExpr

```rust
pub fn isGeqExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getBelongsFunction

```rust
pub fn getBelongsFunction(self: SelectorExpr) -> Function;
```
## SelectorExpr::isAddExpr

```rust
pub fn isAddExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::print

```rust
pub fn print(self: SelectorExpr) -> *string;
```
## SelectorExpr::getAchildNode

```rust
pub fn getAchildNode(self: SelectorExpr) -> *Node;
```
## SelectorExpr::isRootNode

```rust
pub fn isRootNode(self: SelectorExpr) -> bool;
```
## SelectorExpr::isXorExpr

```rust
pub fn isXorExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isQuoExpr

```rust
pub fn isQuoExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: SelectorExpr) -> string;
```
## SelectorExpr::isLandExpr

```rust
pub fn isLandExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::countAssociatedComment

```rust
pub fn countAssociatedComment(self: SelectorExpr) -> int;
```
## SelectorExpr::isRemExpr

```rust
pub fn isRemExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *SelectorExpr;
```
## SelectorExpr::getTextStartOffset

```rust
pub fn getTextStartOffset(self: SelectorExpr) -> int;
```
## SelectorExpr::isMulExpr

```rust
pub fn isMulExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getAnAncestor

```rust
pub fn getAnAncestor(self: SelectorExpr) -> *Node;
```
## SelectorExpr::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: SelectorExpr) -> File;
```
## SelectorExpr::isSendchantypeExpr

```rust
pub fn isSendchantypeExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isDerefExpr

```rust
pub fn isDerefExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isGtrExpr

```rust
pub fn isGtrExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getChildCount

```rust
pub fn getChildCount(self: SelectorExpr) -> int;
```
## SelectorExpr::getParentNode

```rust
pub fn getParentNode(self: SelectorExpr) -> Node;
```
## SelectorExpr::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: SelectorExpr) -> string;
```
## SelectorExpr::isRecvchantypeExpr

```rust
pub fn isRecvchantypeExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::getTextSize

```rust
pub fn getTextSize(self: SelectorExpr) -> int;
```
## SelectorExpr::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: SelectorExpr, index: int) -> Node;
```
## SelectorExpr::isFuncLit

```rust
pub fn isFuncLit(self: SelectorExpr) -> bool;
```
## SelectorExpr::getSelector

```rust
pub fn getSelector(self: SelectorExpr) -> Selector;
```
## SelectorExpr::getBase

```rust
pub fn getBase(self: SelectorExpr) -> Node;
```
## SelectorExpr::isMinusExpr

```rust
pub fn isMinusExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::isOrExpr

```rust
pub fn isOrExpr(self: SelectorExpr) -> bool;
```
## SelectorExpr::is\<T\>

```rust
pub fn is<T>(self: SelectorExpr) -> bool;
```
## SelectorExpr::to\<T\>

```rust
pub fn to<T>(self: SelectorExpr) -> <any>;
```
## SelectorExpr::key\_neq

```rust
pub fn key_neq(self: SelectorExpr, object: <any>) -> bool;
```
## SelectorExpr::key\_eq

```rust
pub fn key_eq(self: SelectorExpr, object: <any>) -> bool;
```
## SelectorExpr::to\_set

```rust
pub fn to_set(self: SelectorExpr) -> *SelectorExpr;
```
