# Selector

Primary key: `id: int`

```rust
schema Selector {
  @primary id: int,
}
```
## Selector::isNotExpr

```rust
pub fn isNotExpr(self: Selector) -> bool;
```
## Selector::getIdx

```rust
pub fn getIdx(self: Selector) -> int;
```
## Selector::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Selector) -> int;
```
## Selector::getType

```rust
pub fn getType(self: Selector) -> string;
```
## Selector::isGenericfunctioninstantiationExpr

```rust
pub fn isGenericfunctioninstantiationExpr(self: Selector) -> bool;
```
## Selector::getAChildByIdx

```rust
pub fn getAChildByIdx(self: Selector, idx: int) -> *Node;
```
## Selector::isSubExpr

```rust
pub fn isSubExpr(self: Selector) -> bool;
```
## Selector::getSignature

```rust
pub fn getSignature(self: Selector) -> *string;
```
## Selector::isArrowExpr

```rust
pub fn isArrowExpr(self: Selector) -> bool;
```
## Selector::getBasicLitValue

```rust
pub fn getBasicLitValue(self: Selector) -> string;
```
## Selector::isCompositeLit

```rust
pub fn isCompositeLit(self: Selector) -> bool;
```
## Selector::isControlExpr

```java
// Any of ['||', '&&']
```
```rust
pub fn isControlExpr(self: Selector) -> bool;
```
## Selector::isSliceExpr

```rust
pub fn isSliceExpr(self: Selector) -> bool;
```
## Selector::getDebugInfo

```rust
pub fn getDebugInfo(self: Selector) -> string;
```
## Selector::isBasicLitExpr

```rust
pub fn isBasicLitExpr(self: Selector) -> bool;
```
## Selector::isFloatLit

```rust
pub fn isFloatLit(self: Selector) -> bool;
```
## Selector::getBelongsStmt

```rust
pub fn getBelongsStmt(self: Selector) -> Statement;
```
## Selector::isAndExpr

```rust
pub fn isAndExpr(self: Selector) -> bool;
```
## Selector::isBadExpr

```rust
pub fn isBadExpr(self: Selector) -> bool;
```
## Selector::getExprTypeName

```rust
pub fn getExprTypeName(self: Selector) -> *string;
```
## Selector::isCallorconversionExpr

```rust
pub fn isCallorconversionExpr(self: Selector) -> bool;
```
## Selector::isIdent

```rust
pub fn isIdent(self: Selector) -> bool;
```
## Selector::hasLocation

```rust
pub fn hasLocation(self: Selector) -> bool;
```
## Selector::isStringLit

```rust
pub fn isStringLit(self: Selector) -> bool;
```
## Selector::isEllipsis

```rust
pub fn isEllipsis(self: Selector) -> bool;
```
## Selector::isFuncLit

```rust
pub fn isFuncLit(self: Selector) -> bool;
```
## Selector::isStarExpr

```rust
pub fn isStarExpr(self: Selector) -> bool;
```
## Selector::isImagLit

```rust
pub fn isImagLit(self: Selector) -> bool;
```
## Selector::isLssExpr

```rust
pub fn isLssExpr(self: Selector) -> bool;
```
## Selector::isUnaryExpr

```java
// Any of ['+','-','!','^','*','&','->' ]
```
```rust
pub fn isUnaryExpr(self: Selector) -> bool;
```
## Selector::isSelectorExpr

```rust
pub fn isSelectorExpr(self: Selector) -> bool;
```
## Selector::isCharLit

```rust
pub fn isCharLit(self: Selector) -> bool;
```
## Selector::isFunctypeExpr

```rust
pub fn isFunctypeExpr(self: Selector) -> bool;
```
## Selector::isParenExpr

```rust
pub fn isParenExpr(self: Selector) -> bool;
```
## Selector::isLorExpr

```rust
pub fn isLorExpr(self: Selector) -> bool;
```
## Selector::isAndnotExpr

```rust
pub fn isAndnotExpr(self: Selector) -> bool;
```
## Selector::isIndexExpr

```rust
pub fn isIndexExpr(self: Selector) -> bool;
```
## Selector::getKind

```rust
pub fn getKind(self: Selector) -> int;
```
## Selector::isTypeassertExpr

```rust
pub fn isTypeassertExpr(self: Selector) -> bool;
```
## Selector::isGenerictypeinstantiationExpr

```rust
pub fn isGenerictypeinstantiationExpr(self: Selector) -> bool;
```
## Selector::isBinaryExpr

```java
// Any of ['||', '&&', '==', '!=', '<', '<=', '>', '+', '-', '|', '^', '*', '/', '%', '<<', '>>', '&', '&^' ]
```
```rust
pub fn isBinaryExpr(self: Selector) -> bool;
```
## Selector::isInterfacetypeExpr

```rust
pub fn isInterfacetypeExpr(self: Selector) -> bool;
```
## Selector::getSelectorSignature

```rust
pub fn getSelectorSignature(self: Selector) -> *string;
```
## Selector::isAddressExpr

```rust
pub fn isAddressExpr(self: Selector) -> bool;
```
## Selector::isKeyvalueExpr

```rust
pub fn isKeyvalueExpr(self: Selector) -> bool;
```
## Selector::isIntLit

```rust
pub fn isIntLit(self: Selector) -> bool;
```
## Selector::isMaptypeExpr

```rust
pub fn isMaptypeExpr(self: Selector) -> bool;
```
## Selector::isArraytypeExpr

```rust
pub fn isArraytypeExpr(self: Selector) -> bool;
```
## Selector::isTypesetliteralExpr

```rust
pub fn isTypesetliteralExpr(self: Selector) -> bool;
```
## Selector::isComplementExpr

```rust
pub fn isComplementExpr(self: Selector) -> bool;
```
## Selector::isPlusExpr

```rust
pub fn isPlusExpr(self: Selector) -> bool;
```
## Selector::isSendrcvchantypeExpr

```rust
pub fn isSendrcvchantypeExpr(self: Selector) -> bool;
```
## Selector::isStructtypeExpr

```rust
pub fn isStructtypeExpr(self: Selector) -> bool;
```
## Selector::isShlExpr

```rust
pub fn isShlExpr(self: Selector) -> bool;
```
## Selector::isEqlExpr

```rust
pub fn isEqlExpr(self: Selector) -> bool;
```
## Selector::isLeqExpr

```rust
pub fn isLeqExpr(self: Selector) -> bool;
```
## Selector::getLocation

```rust
pub fn getLocation(self: Selector) -> Location;
```
## Selector::isShrExpr

```rust
pub fn isShrExpr(self: Selector) -> bool;
```
## Selector::isGeqExpr

```rust
pub fn isGeqExpr(self: Selector) -> bool;
```
## Selector::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Selector) -> Function;
```
## Selector::isAddExpr

```rust
pub fn isAddExpr(self: Selector) -> bool;
```
## Selector::print

```rust
pub fn print(self: Selector) -> *string;
```
## Selector::getAchildNode

```rust
pub fn getAchildNode(self: Selector) -> *Node;
```
## Selector::isRootNode

```rust
pub fn isRootNode(self: Selector) -> bool;
```
## Selector::isXorExpr

```rust
pub fn isXorExpr(self: Selector) -> bool;
```
## Selector::isQuoExpr

```rust
pub fn isQuoExpr(self: Selector) -> bool;
```
## Selector::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Selector) -> string;
```
## Selector::isLandExpr

```rust
pub fn isLandExpr(self: Selector) -> bool;
```
## Selector::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Selector) -> int;
```
## Selector::isMinusExpr

```rust
pub fn isMinusExpr(self: Selector) -> bool;
```
## Selector::isOrExpr

```rust
pub fn isOrExpr(self: Selector) -> bool;
```
## Selector::getParentNode

```rust
pub fn getParentNode(self: Selector) -> Node;
```
## Selector::getChildCount

```rust
pub fn getChildCount(self: Selector) -> int;
```
## Selector::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Selector) -> string;
```
## Selector::isMulExpr

```rust
pub fn isMulExpr(self: Selector) -> bool;
```
## Selector::isNeqExpr

```rust
pub fn isNeqExpr(self: Selector) -> bool;
```
## Selector::getAnAncestor

```rust
pub fn getAnAncestor(self: Selector) -> *Node;
```
## Selector::getBelongsFile

```rust
pub fn getBelongsFile(self: Selector) -> File;
```
## Selector::isSendchantypeExpr

```rust
pub fn isSendchantypeExpr(self: Selector) -> bool;
```
## Selector::isDerefExpr

```rust
pub fn isDerefExpr(self: Selector) -> bool;
```
## Selector::isGtrExpr

```rust
pub fn isGtrExpr(self: Selector) -> bool;
```
## Selector::isRemExpr

```rust
pub fn isRemExpr(self: Selector) -> bool;
```
## Selector::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Selector;
```
## Selector::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Selector) -> int;
```
## Selector::isRecvchantypeExpr

```rust
pub fn isRecvchantypeExpr(self: Selector) -> bool;
```
## Selector::getTextSize

```rust
pub fn getTextSize(self: Selector) -> int;
```
## Selector::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Selector, index: int) -> Node;
```
