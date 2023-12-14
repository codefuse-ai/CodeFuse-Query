# Expr

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema Expr extends Node {
  @primary id: int,
}
```
## Expr::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: Expr, index: int) -> Node;
```
## Expr::getTextSize

```rust
pub fn getTextSize(self: Expr) -> int;
```
## Expr::getParentNode

```rust
pub fn getParentNode(self: Expr) -> Node;
```
## Expr::getChildCount

```rust
pub fn getChildCount(self: Expr) -> int;
```
## Expr::getBelongsFile

```rust
pub fn getBelongsFile(self: Expr) -> File;
```
## Expr::getAnAncestor

```rust
pub fn getAnAncestor(self: Expr) -> *Node;
```
## Expr::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: Expr) -> string;
```
## Expr::getTextStartOffset

```rust
pub fn getTextStartOffset(self: Expr) -> int;
```
## Expr::countAssociatedComment

```rust
pub fn countAssociatedComment(self: Expr) -> int;
```
## Expr::isRecvchantypeExpr

```rust
pub fn isRecvchantypeExpr(self: Expr) -> bool;
```
## Expr::isSendchantypeExpr

```rust
pub fn isSendchantypeExpr(self: Expr) -> bool;
```
## Expr::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: Expr) -> string;
```
## Expr::isQuoExpr

```rust
pub fn isQuoExpr(self: Expr) -> bool;
```
## Expr::isMulExpr

```rust
pub fn isMulExpr(self: Expr) -> bool;
```
## Expr::isRootNode

```rust
pub fn isRootNode(self: Expr) -> bool;
```
## Expr::isXorExpr

```rust
pub fn isXorExpr(self: Expr) -> bool;
```
## Expr::isOrExpr

```rust
pub fn isOrExpr(self: Expr) -> bool;
```
## Expr::print

```rust
pub fn print(self: Expr) -> *string;
```
## Expr::getAchildNode

```rust
pub fn getAchildNode(self: Expr) -> *Node;
```
## Expr::isAddExpr

```rust
pub fn isAddExpr(self: Expr) -> bool;
```
## Expr::getBelongsFunction

```rust
pub fn getBelongsFunction(self: Expr) -> Function;
```
## Expr::isShrExpr

```rust
pub fn isShrExpr(self: Expr) -> bool;
```
## Expr::isGeqExpr

```rust
pub fn isGeqExpr(self: Expr) -> bool;
```
## Expr::isGtrExpr

```rust
pub fn isGtrExpr(self: Expr) -> bool;
```
## Expr::getLocation

```rust
pub fn getLocation(self: Expr) -> Location;
```
## Expr::isLeqExpr

```rust
pub fn isLeqExpr(self: Expr) -> bool;
```
## Expr::isNeqExpr

```rust
pub fn isNeqExpr(self: Expr) -> bool;
```
## Expr::isEqlExpr

```rust
pub fn isEqlExpr(self: Expr) -> bool;
```
## Expr::isLandExpr

```rust
pub fn isLandExpr(self: Expr) -> bool;
```
## Expr::isDerefExpr

```rust
pub fn isDerefExpr(self: Expr) -> bool;
```
## Expr::isSendrcvchantypeExpr

```rust
pub fn isSendrcvchantypeExpr(self: Expr) -> bool;
```
## Expr::isPlusExpr

```rust
pub fn isPlusExpr(self: Expr) -> bool;
```
## Expr::isComplementExpr

```rust
pub fn isComplementExpr(self: Expr) -> bool;
```
## Expr::isTypesetliteralExpr

```rust
pub fn isTypesetliteralExpr(self: Expr) -> bool;
```
## Expr::isMinusExpr

```rust
pub fn isMinusExpr(self: Expr) -> bool;
```
## Expr::isArraytypeExpr

```rust
pub fn isArraytypeExpr(self: Expr) -> bool;
```
## Expr::isIntLit

```rust
pub fn isIntLit(self: Expr) -> bool;
```
## Expr::isMaptypeExpr

```rust
pub fn isMaptypeExpr(self: Expr) -> bool;
```
## Expr::isShlExpr

```rust
pub fn isShlExpr(self: Expr) -> bool;
```
## Expr::isStructtypeExpr

```rust
pub fn isStructtypeExpr(self: Expr) -> bool;
```
## Expr::isKeyvalueExpr

```rust
pub fn isKeyvalueExpr(self: Expr) -> bool;
```
## Expr::isAddressExpr

```rust
pub fn isAddressExpr(self: Expr) -> bool;
```
## Expr::isBinaryExpr

```java
// Any of ['||', '&&', '==', '!=', '<', '<=', '>', '+', '-', '|', '^', '*', '/', '%', '<<', '>>', '&', '&^' ]
```
```rust
pub fn isBinaryExpr(self: Expr) -> bool;
```
## Expr::isInterfacetypeExpr

```rust
pub fn isInterfacetypeExpr(self: Expr) -> bool;
```
## Expr::isGenerictypeinstantiationExpr

```rust
pub fn isGenerictypeinstantiationExpr(self: Expr) -> bool;
```
## Expr::isTypeassertExpr

```rust
pub fn isTypeassertExpr(self: Expr) -> bool;
```
## Expr::getKind

```rust
pub fn getKind(self: Expr) -> int;
```
## Expr::isIndexExpr

```rust
pub fn isIndexExpr(self: Expr) -> bool;
```
## Expr::isAndnotExpr

```rust
pub fn isAndnotExpr(self: Expr) -> bool;
```
## Expr::isLorExpr

```rust
pub fn isLorExpr(self: Expr) -> bool;
```
## Expr::isParenExpr

```rust
pub fn isParenExpr(self: Expr) -> bool;
```
## Expr::isFunctypeExpr

```rust
pub fn isFunctypeExpr(self: Expr) -> bool;
```
## Expr::isCharLit

```rust
pub fn isCharLit(self: Expr) -> bool;
```
## Expr::isSelectorExpr

```rust
pub fn isSelectorExpr(self: Expr) -> bool;
```
## Expr::isUnaryExpr

```java
// Any of ['+','-','!','^','*','&','->' ]
```
```rust
pub fn isUnaryExpr(self: Expr) -> bool;
```
## Expr::isLssExpr

```rust
pub fn isLssExpr(self: Expr) -> bool;
```
## Expr::isImagLit

```rust
pub fn isImagLit(self: Expr) -> bool;
```
## Expr::isStarExpr

```rust
pub fn isStarExpr(self: Expr) -> bool;
```
## Expr::isFuncLit

```rust
pub fn isFuncLit(self: Expr) -> bool;
```
## Expr::isEllipsis

```rust
pub fn isEllipsis(self: Expr) -> bool;
```
## Expr::isStringLit

```rust
pub fn isStringLit(self: Expr) -> bool;
```
## Expr::hasLocation

```rust
pub fn hasLocation(self: Expr) -> bool;
```
## Expr::isIdent

```rust
pub fn isIdent(self: Expr) -> bool;
```
## Expr::isCallorconversionExpr

```rust
pub fn isCallorconversionExpr(self: Expr) -> bool;
```
## Expr::getExprTypeName

```rust
pub fn getExprTypeName(self: Expr) -> *string;
```
## Expr::isBadExpr

```rust
pub fn isBadExpr(self: Expr) -> bool;
```
## Expr::isAndExpr

```rust
pub fn isAndExpr(self: Expr) -> bool;
```
## Expr::getBelongsStmt

```rust
pub fn getBelongsStmt(self: Expr) -> Statement;
```
## Expr::isFloatLit

```rust
pub fn isFloatLit(self: Expr) -> bool;
```
## Expr::isBasicLitExpr

```rust
pub fn isBasicLitExpr(self: Expr) -> bool;
```
## Expr::getDebugInfo

```rust
pub fn getDebugInfo(self: Expr) -> string;
```
## Expr::isSliceExpr

```rust
pub fn isSliceExpr(self: Expr) -> bool;
```
## Expr::isControlExpr

```java
// Any of ['||', '&&']
```
```rust
pub fn isControlExpr(self: Expr) -> bool;
```
## Expr::isCompositeLit

```rust
pub fn isCompositeLit(self: Expr) -> bool;
```
## Expr::getBasicLitValue

```rust
pub fn getBasicLitValue(self: Expr) -> string;
```
## Expr::isArrowExpr

```rust
pub fn isArrowExpr(self: Expr) -> bool;
```
## Expr::getSignature

```rust
pub fn getSignature(self: Expr) -> *string;
```
## Expr::isSubExpr

```rust
pub fn isSubExpr(self: Expr) -> bool;
```
## Expr::getAChildByIdx

```rust
pub fn getAChildByIdx(self: Expr, idx: int) -> *Node;
```
## Expr::isGenericfunctioninstantiationExpr

```rust
pub fn isGenericfunctioninstantiationExpr(self: Expr) -> bool;
```
## Expr::isRemExpr

```rust
pub fn isRemExpr(self: Expr) -> bool;
```
## Expr::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *Expr;
```
## Expr::getType

```rust
pub fn getType(self: Expr) -> string;
```
## Expr::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: Expr) -> int;
```
## Expr::getIdx

```rust
pub fn getIdx(self: Expr) -> int;
```
## Expr::isNotExpr

```rust
pub fn isNotExpr(self: Expr) -> bool;
```
