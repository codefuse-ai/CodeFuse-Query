# CallableExpr

Primary key: `id: int`

```rust
schema CallableExpr {
  @primary id: int,
}
```
## CallableExpr::isNotExpr

```rust
pub fn isNotExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getIdx

```rust
pub fn getIdx(self: CallableExpr) -> int;
```
## CallableExpr::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: CallableExpr) -> int;
```
## CallableExpr::getType

```rust
pub fn getType(self: CallableExpr) -> string;
```
## CallableExpr::isGenericfunctioninstantiationExpr

```rust
pub fn isGenericfunctioninstantiationExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getAChildByIdx

```rust
pub fn getAChildByIdx(self: CallableExpr, idx: int) -> *Node;
```
## CallableExpr::isSubExpr

```rust
pub fn isSubExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getSignature

```rust
pub fn getSignature(self: CallableExpr) -> *string;
```
## CallableExpr::isArrowExpr

```rust
pub fn isArrowExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getBasicLitValue

```rust
pub fn getBasicLitValue(self: CallableExpr) -> string;
```
## CallableExpr::isCompositeLit

```rust
pub fn isCompositeLit(self: CallableExpr) -> bool;
```
## CallableExpr::isControlExpr

```rust
// Check if the expression is a control expression.
```
```rust
pub fn isControlExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isSliceExpr

```rust
pub fn isSliceExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getDebugInfo

```rust
pub fn getDebugInfo(self: CallableExpr) -> string;
```
## CallableExpr::isBasicLitExpr

```rust
pub fn isBasicLitExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isFloatLit

```rust
pub fn isFloatLit(self: CallableExpr) -> bool;
```
## CallableExpr::getBelongsStmt

```rust
pub fn getBelongsStmt(self: CallableExpr) -> Statement;
```
## CallableExpr::isAndExpr

```rust
pub fn isAndExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isBadExpr

```rust
pub fn isBadExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getExprTypeName

```rust
pub fn getExprTypeName(self: CallableExpr) -> *string;
```
## CallableExpr::isCallorconversionExpr

```rust
pub fn isCallorconversionExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isIdent

```rust
pub fn isIdent(self: CallableExpr) -> bool;
```
## CallableExpr::hasLocation

```rust
pub fn hasLocation(self: CallableExpr) -> bool;
```
## CallableExpr::isStringLit

```rust
pub fn isStringLit(self: CallableExpr) -> bool;
```
## CallableExpr::isEllipsis

```rust
pub fn isEllipsis(self: CallableExpr) -> bool;
```
## CallableExpr::isFuncLit

```rust
pub fn isFuncLit(self: CallableExpr) -> bool;
```
## CallableExpr::isStarExpr

```rust
pub fn isStarExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isImagLit

```rust
pub fn isImagLit(self: CallableExpr) -> bool;
```
## CallableExpr::isLssExpr

```rust
pub fn isLssExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isUnaryExpr

```rust
// Check if the given expression is a unary expression.
```
```rust
pub fn isUnaryExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isSelectorExpr

```rust
pub fn isSelectorExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isParenExpr

```rust
pub fn isParenExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isLorExpr

```rust
pub fn isLorExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isAndnotExpr

```rust
pub fn isAndnotExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isIndexExpr

```rust
pub fn isIndexExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getKind

```rust
pub fn getKind(self: CallableExpr) -> int;
```
## CallableExpr::isTypeassertExpr

```rust
pub fn isTypeassertExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isGenerictypeinstantiationExpr

```rust
pub fn isGenerictypeinstantiationExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isInterfacetypeExpr

```rust
pub fn isInterfacetypeExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isBinaryExpr

```rust
// Check if the expression is a binary expression.
```
```rust
pub fn isBinaryExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isAddressExpr

```rust
pub fn isAddressExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isKeyvalueExpr

```rust
pub fn isKeyvalueExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isIntLit

```rust
pub fn isIntLit(self: CallableExpr) -> bool;
```
## CallableExpr::isMaptypeExpr

```rust
pub fn isMaptypeExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isArraytypeExpr

```rust
pub fn isArraytypeExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isTypesetliteralExpr

```rust
pub fn isTypesetliteralExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isComplementExpr

```rust
pub fn isComplementExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getCallee

```rust
// find for Call expr and get its associated Callee
```
```rust
pub fn getCallee(self: CallableExpr) -> *Node;
```
## CallableExpr::isPlusExpr

```rust
pub fn isPlusExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isSendrcvchantypeExpr

```rust
pub fn isSendrcvchantypeExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isStructtypeExpr

```rust
pub fn isStructtypeExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isShlExpr

```rust
pub fn isShlExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isEqlExpr

```rust
pub fn isEqlExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isNeqExpr

```rust
pub fn isNeqExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isLeqExpr

```rust
pub fn isLeqExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getLocation

```rust
pub fn getLocation(self: CallableExpr) -> Location;
```
## CallableExpr::isShrExpr

```rust
pub fn isShrExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isGeqExpr

```rust
pub fn isGeqExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getBelongsFunction

```rust
pub fn getBelongsFunction(self: CallableExpr) -> Function;
```
## CallableExpr::isAddExpr

```rust
pub fn isAddExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getAchildNode

```rust
pub fn getAchildNode(self: CallableExpr) -> *Node;
```
## CallableExpr::print

```rust
pub fn print(self: CallableExpr) -> *string;
```
## CallableExpr::isMinusExpr

```rust
pub fn isMinusExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isOrExpr

```rust
pub fn isOrExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isRootNode

```rust
pub fn isRootNode(self: CallableExpr) -> bool;
```
## CallableExpr::isXorExpr

```rust
pub fn isXorExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isLandExpr

```rust
pub fn isLandExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getCalleeFuncName

```rust
pub fn getCalleeFuncName(self: CallableExpr) -> *string;
```
## CallableExpr::isQuoExpr

```rust
pub fn isQuoExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getText

```rust
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: CallableExpr) -> string;
```
## CallableExpr::isRemExpr

```rust
pub fn isRemExpr(self: CallableExpr) -> bool;
```
## CallableExpr::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *CallableExpr;
```
## CallableExpr::getTextStartOffset

```rust
pub fn getTextStartOffset(self: CallableExpr) -> int;
```
## CallableExpr::getParentNode

```rust
pub fn getParentNode(self: CallableExpr) -> Node;
```
## CallableExpr::getChildCount

```rust
pub fn getChildCount(self: CallableExpr) -> int;
```
## CallableExpr::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: CallableExpr) -> string;
```
## CallableExpr::isMulExpr

```rust
pub fn isMulExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getAnAncestor

```rust
pub fn getAnAncestor(self: CallableExpr) -> *Node;
```
## CallableExpr::getCalleeSignature

```rust
pub fn getCalleeSignature(self: CallableExpr) -> *string;
```
## CallableExpr::getBelongsFile

```rust
// root node
```
```rust
pub fn getBelongsFile(self: CallableExpr) -> File;
```
## CallableExpr::isSendchantypeExpr

```rust
pub fn isSendchantypeExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isDerefExpr

```rust
pub fn isDerefExpr(self: CallableExpr) -> bool;
```
## CallableExpr::isGtrExpr

```rust
pub fn isGtrExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: CallableExpr, index: int) -> Node;
```
## CallableExpr::getTextSize

```rust
pub fn getTextSize(self: CallableExpr) -> int;
```
## CallableExpr::isCharLit

```rust
pub fn isCharLit(self: CallableExpr) -> bool;
```
## CallableExpr::isFunctypeExpr

```rust
pub fn isFunctypeExpr(self: CallableExpr) -> bool;
```
## CallableExpr::getCalleeGlobalSignature

```rust
pub fn getCalleeGlobalSignature(self: CallableExpr) -> *string;
```
## CallableExpr::getAParameter

```rust
// For callExpr's parameter
```
```rust
pub fn getAParameter(self: CallableExpr) -> *Node;
```
## CallableExpr::isRecvchantypeExpr

```rust
pub fn isRecvchantypeExpr(self: CallableExpr) -> bool;
```
## CallableExpr::countAssociatedComment

```rust
pub fn countAssociatedComment(self: CallableExpr) -> int;
```
## CallableExpr::is\<T\>

```rust
pub fn is<T>(self: CallableExpr) -> bool;
```
## CallableExpr::to\<T\>

```rust
pub fn to<T>(self: CallableExpr) -> <any>;
```
## CallableExpr::key\_neq

```rust
pub fn key_neq(self: CallableExpr, object: <any>) -> bool;
```
## CallableExpr::key\_eq

```rust
pub fn key_eq(self: CallableExpr, object: <any>) -> bool;
```
## CallableExpr::to\_set

```rust
pub fn to_set(self: CallableExpr) -> *CallableExpr;
```
