# TemplateHeadToken

Primary key: `id: int`

```rust
schema TemplateHeadToken {
  @primary id: int,
}
```
## TemplateHeadToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateHeadToken) -> Location;
```
## TemplateHeadToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateHeadToken) -> Symbol;
```
## TemplateHeadToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateHeadToken) -> *Decorator;
```
## TemplateHeadToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateHeadToken) -> string;
```
## TemplateHeadToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateHeadToken, i: int) -> Modifier;
```
## TemplateHeadToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateHeadToken) -> *Comment;
```
## TemplateHeadToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateHeadToken) -> *Node;
```
## TemplateHeadToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateHeadToken) -> *Node;
```
## TemplateHeadToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TemplateHeadToken) -> Node;
```
## TemplateHeadToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateHeadToken) -> TopLevelDO;
```
## TemplateHeadToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateHeadToken, i: int) -> Decorator;
```
## TemplateHeadToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateHeadToken) -> *Modifier;
```
## TemplateHeadToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateHeadToken, i: int) -> Node;
```
## TemplateHeadToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateHeadToken) -> *FunctionLikeDeclaration;
```
## TemplateHeadToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateHeadToken, level: int) -> *Node;
```
## TemplateHeadToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateHeadToken) -> string;
```
## TemplateHeadToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateHeadToken, level: int) -> Node;
```
## TemplateHeadToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateHeadToken) -> File;
```
## TemplateHeadToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateHeadToken) -> *Comment;
```
## TemplateHeadToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateHeadToken) -> *Comment;
```
## TemplateHeadToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateHeadToken) -> Node;
```
## TemplateHeadToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateHeadToken) -> FunctionLikeDeclaration;
```
## TemplateHeadToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getIndex

```rust
pub fn getIndex(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateHeadToken) -> *Node;
```
## TemplateHeadToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateHeadToken;
```
## TemplateHeadToken::is\<T\>

```rust
pub fn is<T>(self: TemplateHeadToken) -> bool;
```
## TemplateHeadToken::to\<T\>

```rust
pub fn to<T>(self: TemplateHeadToken) -> <any>;
```
## TemplateHeadToken::key\_neq

```rust
pub fn key_neq(self: TemplateHeadToken, object: <any>) -> bool;
```
## TemplateHeadToken::key\_eq

```rust
pub fn key_eq(self: TemplateHeadToken, object: <any>) -> bool;
```
## TemplateHeadToken::to\_set

```rust
pub fn to_set(self: TemplateHeadToken) -> *TemplateHeadToken;
```
