# TemplateTailToken

Primary key: `id: int`

```rust
schema TemplateTailToken {
  @primary id: int,
}
```
## TemplateTailToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateTailToken) -> Location;
```
## TemplateTailToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateTailToken) -> Symbol;
```
## TemplateTailToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateTailToken) -> *Decorator;
```
## TemplateTailToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateTailToken) -> string;
```
## TemplateTailToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateTailToken, i: int) -> Modifier;
```
## TemplateTailToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateTailToken) -> *Comment;
```
## TemplateTailToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateTailToken) -> *Node;
```
## TemplateTailToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateTailToken) -> *Node;
```
## TemplateTailToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TemplateTailToken) -> Node;
```
## TemplateTailToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateTailToken) -> TopLevelDO;
```
## TemplateTailToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateTailToken, i: int) -> Decorator;
```
## TemplateTailToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateTailToken) -> *Modifier;
```
## TemplateTailToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateTailToken, i: int) -> Node;
```
## TemplateTailToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateTailToken) -> *FunctionLikeDeclaration;
```
## TemplateTailToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateTailToken, level: int) -> *Node;
```
## TemplateTailToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateTailToken) -> string;
```
## TemplateTailToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateTailToken, level: int) -> Node;
```
## TemplateTailToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateTailToken) -> File;
```
## TemplateTailToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateTailToken) -> *Comment;
```
## TemplateTailToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateTailToken) -> *Comment;
```
## TemplateTailToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateTailToken) -> Node;
```
## TemplateTailToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateTailToken) -> FunctionLikeDeclaration;
```
## TemplateTailToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getIndex

```rust
pub fn getIndex(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateTailToken) -> *Node;
```
## TemplateTailToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateTailToken;
```
## TemplateTailToken::is\<T\>

```rust
pub fn is<T>(self: TemplateTailToken) -> bool;
```
## TemplateTailToken::to\<T\>

```rust
pub fn to<T>(self: TemplateTailToken) -> <any>;
```
## TemplateTailToken::key\_neq

```rust
pub fn key_neq(self: TemplateTailToken, object: <any>) -> bool;
```
## TemplateTailToken::key\_eq

```rust
pub fn key_eq(self: TemplateTailToken, object: <any>) -> bool;
```
## TemplateTailToken::to\_set

```rust
pub fn to_set(self: TemplateTailToken) -> *TemplateTailToken;
```
