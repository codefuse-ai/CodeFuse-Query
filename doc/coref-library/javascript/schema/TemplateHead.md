# TemplateHead

Primary key: `id: int`

```rust
schema TemplateHead {
  @primary id: int,
}
```
## TemplateHead::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateHead) -> Location;
```
## TemplateHead::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateHead) -> Symbol;
```
## TemplateHead::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateHead) -> *Decorator;
```
## TemplateHead::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateHead) -> string;
```
## TemplateHead::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateHead, i: int) -> Modifier;
```
## TemplateHead::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateHead) -> *Comment;
```
## TemplateHead::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateHead) -> *Node;
```
## TemplateHead::getValue

```rust
/**
     * Gets the value of this literal-like node, as a string.
     */
```
```rust
pub fn getValue(self: TemplateHead) -> string;
```
## TemplateHead::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateHead) -> *Node;
```
## TemplateHead::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TemplateHead) -> Node;
```
## TemplateHead::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateHead) -> TopLevelDO;
```
## TemplateHead::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateHead, i: int) -> Decorator;
```
## TemplateHead::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateHead) -> int;
```
## TemplateHead::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateHead) -> int;
```
## TemplateHead::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateHead) -> int;
```
## TemplateHead::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateHead) -> *Modifier;
```
## TemplateHead::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateHead, i: int) -> Node;
```
## TemplateHead::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateHead) -> int;
```
## TemplateHead::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateHead) -> *FunctionLikeDeclaration;
```
## TemplateHead::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateHead, level: int) -> *Node;
```
## TemplateHead::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateHead) -> int;
```
## TemplateHead::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateHead) -> string;
```
## TemplateHead::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateHead, level: int) -> Node;
```
## TemplateHead::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateHead) -> File;
```
## TemplateHead::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateHead) -> *Comment;
```
## TemplateHead::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateHead) -> *Comment;
```
## TemplateHead::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateHead) -> Node;
```
## TemplateHead::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateHead) -> FunctionLikeDeclaration;
```
## TemplateHead::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateHead) -> int;
```
## TemplateHead::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateHead) -> int;
```
## TemplateHead::getIndex

```rust
pub fn getIndex(self: TemplateHead) -> int;
```
## TemplateHead::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateHead) -> *Node;
```
## TemplateHead::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateHead;
```
## TemplateHead::is\<T\>

```rust
pub fn is<T>(self: TemplateHead) -> bool;
```
## TemplateHead::to\<T\>

```rust
pub fn to<T>(self: TemplateHead) -> <any>;
```
## TemplateHead::key\_neq

```rust
pub fn key_neq(self: TemplateHead, object: <any>) -> bool;
```
## TemplateHead::key\_eq

```rust
pub fn key_eq(self: TemplateHead, object: <any>) -> bool;
```
## TemplateHead::to\_set

```rust
pub fn to_set(self: TemplateHead) -> *TemplateHead;
```
