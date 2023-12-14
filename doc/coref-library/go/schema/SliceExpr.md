# SliceExpr

Primary key: `id: int`

```rust
schema SliceExpr {
  @primary id: int,
}
```
## SliceExpr::isNotExpr

```rust
pub fn isNotExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getIdx

```rust
pub fn getIdx(self: SliceExpr) -> int;
```
## SliceExpr::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: SliceExpr) -> int;
```
## SliceExpr::getType

```rust
pub fn getType(self: SliceExpr) -> string;
```
## SliceExpr::isGenericfunctioninstantiationExpr

```rust
pub fn isGenericfunctioninstantiationExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getAChildByIdx

```rust
pub fn getAChildByIdx(self: SliceExpr, idx: int) -> *Node;
```
## SliceExpr::isSubExpr

```rust
pub fn isSubExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getSignature

```rust
pub fn getSignature(self: SliceExpr) -> *string;
```
## SliceExpr::isArrowExpr

```rust
pub fn isArrowExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getBasicLitValue

```rust
pub fn getBasicLitValue(self: SliceExpr) -> string;
```
## SliceExpr::isCompositeLit

```rust
pub fn isCompositeLit(self: SliceExpr) -> bool;
```
## SliceExpr::isControlExpr

```java
// Any of ['||', '&&']
```
```rust
pub fn isControlExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isSliceExpr

```rust
pub fn isSliceExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getDebugInfo

```rust
pub fn getDebugInfo(self: SliceExpr) -> string;
```
## SliceExpr::isBasicLitExpr

```rust
pub fn isBasicLitExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isFloatLit

```rust
pub fn isFloatLit(self: SliceExpr) -> bool;
```
## SliceExpr::getBelongsStmt

```rust
pub fn getBelongsStmt(self: SliceExpr) -> Statement;
```
## SliceExpr::isAndExpr

```rust
pub fn isAndExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isBadExpr

```rust
pub fn isBadExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getExprTypeName

```rust
pub fn getExprTypeName(self: SliceExpr) -> *string;
```
## SliceExpr::isCallorconversionExpr

```rust
pub fn isCallorconversionExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isIdent

```rust
pub fn isIdent(self: SliceExpr) -> bool;
```
## SliceExpr::hasLocation

```rust
pub fn hasLocation(self: SliceExpr) -> bool;
```
## SliceExpr::isStringLit

```rust
pub fn isStringLit(self: SliceExpr) -> bool;
```
## SliceExpr::isEllipsis

```rust
pub fn isEllipsis(self: SliceExpr) -> bool;
```
## SliceExpr::isStarExpr

```rust
pub fn isStarExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isImagLit

```rust
pub fn isImagLit(self: SliceExpr) -> bool;
```
## SliceExpr::isLssExpr

```rust
pub fn isLssExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isUnaryExpr

```java
// Any of ['+','-','!','^','*','&','->' ]
```
```rust
pub fn isUnaryExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isSelectorExpr

```rust
pub fn isSelectorExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isCharLit

```rust
pub fn isCharLit(self: SliceExpr) -> bool;
```
## SliceExpr::isFunctypeExpr

```rust
pub fn isFunctypeExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isParenExpr

```rust
pub fn isParenExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isLorExpr

```rust
pub fn isLorExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isAndnotExpr

```rust
pub fn isAndnotExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isIndexExpr

```rust
pub fn isIndexExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getKind

```rust
pub fn getKind(self: SliceExpr) -> int;
```
## SliceExpr::isTypeassertExpr

```rust
pub fn isTypeassertExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isGenerictypeinstantiationExpr

```rust
pub fn isGenerictypeinstantiationExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isInterfacetypeExpr

```rust
pub fn isInterfacetypeExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isBinaryExpr

```java
// Any of ['||', '&&', '==', '!=', '<', '<=', '>', '+', '-', '|', '^', '*', '/', '%', '<<', '>>', '&', '&^' ]
```
```rust
pub fn isBinaryExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isAddressExpr

```rust
pub fn isAddressExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isKeyvalueExpr

```rust
pub fn isKeyvalueExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isIntLit

```rust
pub fn isIntLit(self: SliceExpr) -> bool;
```
## SliceExpr::isMaptypeExpr

```rust
pub fn isMaptypeExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isArraytypeExpr

```rust
pub fn isArraytypeExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isTypesetliteralExpr

```rust
pub fn isTypesetliteralExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isComplementExpr

```rust
pub fn isComplementExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isPlusExpr

```rust
pub fn isPlusExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isSendrcvchantypeExpr

```rust
pub fn isSendrcvchantypeExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isStructtypeExpr

```rust
pub fn isStructtypeExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isShlExpr

```rust
pub fn isShlExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isEqlExpr

```rust
pub fn isEqlExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isNeqExpr

```rust
pub fn isNeqExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isLeqExpr

```rust
pub fn isLeqExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getLocation

```rust
pub fn getLocation(self: SliceExpr) -> Location;
```
## SliceExpr::isGeqExpr

```rust
pub fn isGeqExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isShrExpr

```rust
pub fn isShrExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getBelongsFunction

```rust
pub fn getBelongsFunction(self: SliceExpr) -> Function;
```
## SliceExpr::isAddExpr

```rust
pub fn isAddExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getAchildNode

```rust
pub fn getAchildNode(self: SliceExpr) -> *Node;
```
## SliceExpr::print

```rust
pub fn print(self: SliceExpr) -> *string;
```
## SliceExpr::isQuoExpr

```rust
pub fn isQuoExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: SliceExpr) -> string;
```
## SliceExpr::isXorExpr

```rust
pub fn isXorExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isRootNode

```rust
pub fn isRootNode(self: SliceExpr) -> bool;
```
## SliceExpr::isLandExpr

```rust
pub fn isLandExpr(self: SliceExpr) -> bool;
```
## SliceExpr::countAssociatedComment

```rust
pub fn countAssociatedComment(self: SliceExpr) -> int;
```
## SliceExpr::isMinusExpr

```rust
pub fn isMinusExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isOrExpr

```rust
pub fn isOrExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getParentNode

```rust
pub fn getParentNode(self: SliceExpr) -> Node;
```
## SliceExpr::getChildCount

```rust
pub fn getChildCount(self: SliceExpr) -> int;
```
## SliceExpr::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: SliceExpr) -> string;
```
## SliceExpr::isMulExpr

```rust
pub fn isMulExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getAnAncestor

```rust
pub fn getAnAncestor(self: SliceExpr) -> *Node;
```
## SliceExpr::isSendchantypeExpr

```rust
pub fn isSendchantypeExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isDerefExpr

```rust
pub fn isDerefExpr(self: SliceExpr) -> bool;
```
## SliceExpr::isGtrExpr

```rust
pub fn isGtrExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getLow

```rust
pub fn getLow(self: SliceExpr) -> Node;
```
## SliceExpr::getTextSize

```rust
pub fn getTextSize(self: SliceExpr) -> int;
```
## SliceExpr::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: SliceExpr, index: int) -> Node;
```
## SliceExpr::isRecvchantypeExpr

```rust
pub fn isRecvchantypeExpr(self: SliceExpr) -> bool;
```
## SliceExpr::getTextStartOffset

```rust
pub fn getTextStartOffset(self: SliceExpr) -> int;
```
## SliceExpr::isRemExpr

```rust
pub fn isRemExpr(self: SliceExpr) -> bool;
```
## SliceExpr::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *SliceExpr;
```
## SliceExpr::getMax

```rust
pub fn getMax(self: SliceExpr) -> Node;
```
## SliceExpr::isFuncLit

```rust
pub fn isFuncLit(self: SliceExpr) -> bool;
```
## SliceExpr::getBase

```rust
pub fn getBase(self: SliceExpr) -> Node;
```
## SliceExpr::getHigh

```rust
pub fn getHigh(self: SliceExpr) -> Node;
```
## SliceExpr::getBelongsFile

```rust
pub fn getBelongsFile(self: SliceExpr) -> File;
```
