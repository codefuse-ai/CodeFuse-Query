# RegularExpressionLiteralToken

Primary key: `id: int`

```rust
schema RegularExpressionLiteralToken {
  @primary id: int,
}
```
## RegularExpressionLiteralToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RegularExpressionLiteralToken) -> Location;
```
## RegularExpressionLiteralToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RegularExpressionLiteralToken) -> Symbol;
```
## RegularExpressionLiteralToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RegularExpressionLiteralToken) -> *Decorator;
```
## RegularExpressionLiteralToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RegularExpressionLiteralToken) -> string;
```
## RegularExpressionLiteralToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RegularExpressionLiteralToken, i: int) -> Modifier;
```
## RegularExpressionLiteralToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RegularExpressionLiteralToken) -> *Comment;
```
## RegularExpressionLiteralToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RegularExpressionLiteralToken) -> *Node;
```
## RegularExpressionLiteralToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RegularExpressionLiteralToken) -> *Node;
```
## RegularExpressionLiteralToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RegularExpressionLiteralToken) -> Node;
```
## RegularExpressionLiteralToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RegularExpressionLiteralToken) -> TopLevelDO;
```
## RegularExpressionLiteralToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RegularExpressionLiteralToken, i: int) -> Decorator;
```
## RegularExpressionLiteralToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RegularExpressionLiteralToken) -> *Modifier;
```
## RegularExpressionLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RegularExpressionLiteralToken, i: int) -> Node;
```
## RegularExpressionLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RegularExpressionLiteralToken) -> *FunctionLikeDeclaration;
```
## RegularExpressionLiteralToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RegularExpressionLiteralToken, level: int) -> *Node;
```
## RegularExpressionLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RegularExpressionLiteralToken) -> string;
```
## RegularExpressionLiteralToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RegularExpressionLiteralToken, level: int) -> Node;
```
## RegularExpressionLiteralToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RegularExpressionLiteralToken) -> File;
```
## RegularExpressionLiteralToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RegularExpressionLiteralToken) -> *Comment;
```
## RegularExpressionLiteralToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RegularExpressionLiteralToken) -> *Comment;
```
## RegularExpressionLiteralToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RegularExpressionLiteralToken) -> Node;
```
## RegularExpressionLiteralToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RegularExpressionLiteralToken) -> FunctionLikeDeclaration;
```
## RegularExpressionLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getIndex

```rust
pub fn getIndex(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RegularExpressionLiteralToken) -> *Node;
```
## RegularExpressionLiteralToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RegularExpressionLiteralToken;
```
## RegularExpressionLiteralToken::is\<T\>

```rust
pub fn is<T>(self: RegularExpressionLiteralToken) -> bool;
```
## RegularExpressionLiteralToken::to\<T\>

```rust
pub fn to<T>(self: RegularExpressionLiteralToken) -> <any>;
```
## RegularExpressionLiteralToken::key\_neq

```rust
pub fn key_neq(self: RegularExpressionLiteralToken, object: <any>) -> bool;
```
## RegularExpressionLiteralToken::key\_eq

```rust
pub fn key_eq(self: RegularExpressionLiteralToken, object: <any>) -> bool;
```
## RegularExpressionLiteralToken::to\_set

```rust
pub fn to_set(self: RegularExpressionLiteralToken) -> *RegularExpressionLiteralToken;
```
