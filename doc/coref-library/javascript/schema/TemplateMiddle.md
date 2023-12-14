# TemplateMiddle

Primary key: `id: int`

```rust
schema TemplateMiddle {
  @primary id: int,
}
```
## TemplateMiddle::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateMiddle) -> Location;
```
## TemplateMiddle::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateMiddle) -> Symbol;
```
## TemplateMiddle::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateMiddle) -> *Decorator;
```
## TemplateMiddle::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateMiddle) -> string;
```
## TemplateMiddle::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateMiddle, i: int) -> Modifier;
```
## TemplateMiddle::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateMiddle) -> *Comment;
```
## TemplateMiddle::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateMiddle) -> *Node;
```
## TemplateMiddle::getValue

```rust
/**
     * Gets the value of this literal-like node, as a string.
     */
```
```rust
pub fn getValue(self: TemplateMiddle) -> string;
```
## TemplateMiddle::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateMiddle) -> *Node;
```
## TemplateMiddle::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TemplateMiddle) -> Node;
```
## TemplateMiddle::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateMiddle) -> TopLevelDO;
```
## TemplateMiddle::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateMiddle, i: int) -> Decorator;
```
## TemplateMiddle::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateMiddle) -> *Modifier;
```
## TemplateMiddle::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateMiddle, i: int) -> Node;
```
## TemplateMiddle::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateMiddle) -> *FunctionLikeDeclaration;
```
## TemplateMiddle::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateMiddle, level: int) -> *Node;
```
## TemplateMiddle::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateMiddle) -> string;
```
## TemplateMiddle::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateMiddle, level: int) -> Node;
```
## TemplateMiddle::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateMiddle) -> File;
```
## TemplateMiddle::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateMiddle) -> *Comment;
```
## TemplateMiddle::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateMiddle) -> *Comment;
```
## TemplateMiddle::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateMiddle) -> Node;
```
## TemplateMiddle::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateMiddle) -> FunctionLikeDeclaration;
```
## TemplateMiddle::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getIndex

```rust
pub fn getIndex(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateMiddle) -> *Node;
```
## TemplateMiddle::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateMiddle;
```
## TemplateMiddle::is\<T\>

```rust
pub fn is<T>(self: TemplateMiddle) -> bool;
```
## TemplateMiddle::to\<T\>

```rust
pub fn to<T>(self: TemplateMiddle) -> <any>;
```
## TemplateMiddle::key\_neq

```rust
pub fn key_neq(self: TemplateMiddle, object: <any>) -> bool;
```
## TemplateMiddle::key\_eq

```rust
pub fn key_eq(self: TemplateMiddle, object: <any>) -> bool;
```
## TemplateMiddle::to\_set

```rust
pub fn to_set(self: TemplateMiddle) -> *TemplateMiddle;
```
