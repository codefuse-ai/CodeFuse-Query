# BindingPattern

Primary key: `id: int`

```rust
schema BindingPattern {
  @primary id: int,
}
```
## BindingPattern::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BindingPattern) -> *Node;
```
## BindingPattern::getIndex

```rust
pub fn getIndex(self: BindingPattern) -> int;
```
## BindingPattern::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BindingPattern) -> int;
```
## BindingPattern::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BindingPattern) -> int;
```
## BindingPattern::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BindingPattern) -> FunctionLikeDeclaration;
```
## BindingPattern::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BindingPattern) -> File;
```
## BindingPattern::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BindingPattern, level: int) -> Node;
```
## BindingPattern::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BindingPattern) -> string;
```
## BindingPattern::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BindingPattern) -> int;
```
## BindingPattern::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BindingPattern) -> Location;
```
## BindingPattern::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BindingPattern) -> *FunctionLikeDeclaration;
```
## BindingPattern::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BindingPattern, level: int) -> *Node;
```
## BindingPattern::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BindingPattern) -> int;
```
## BindingPattern::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BindingPattern) -> *Modifier;
```
## BindingPattern::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BindingPattern) -> int;
```
## BindingPattern::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BindingPattern) -> int;
```
## BindingPattern::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BindingPattern, i: int) -> Node;
```
## BindingPattern::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BindingPattern) -> int;
```
## BindingPattern::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BindingPattern, i: int) -> Decorator;
```
## BindingPattern::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BindingPattern) -> TopLevelDO;
```
## BindingPattern::getElement

```rust
pub fn getElement(self: BindingPattern, i: int) -> ArrayBindingElement;
```
## BindingPattern::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BindingPattern) -> Node;
```
## BindingPattern::getAnElement

```rust
pub fn getAnElement(self: BindingPattern) -> *ArrayBindingElement;
```
## BindingPattern::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BindingPattern) -> *Comment;
```
## BindingPattern::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BindingPattern) -> *Comment;
```
## BindingPattern::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BindingPattern) -> Node;
```
## BindingPattern::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BindingPattern) -> *Node;
```
## BindingPattern::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BindingPattern) -> *Node;
```
## BindingPattern::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BindingPattern) -> *Comment;
```
## BindingPattern::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BindingPattern, i: int) -> Modifier;
```
## BindingPattern::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BindingPattern) -> string;
```
## BindingPattern::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BindingPattern) -> Symbol;
```
## BindingPattern::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BindingPattern) -> *Decorator;
```
## BindingPattern::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BindingPattern;
```
## BindingPattern::is\<T\>

```rust
pub fn is<T>(self: BindingPattern) -> bool;
```
## BindingPattern::to\<T\>

```rust
pub fn to<T>(self: BindingPattern) -> <any>;
```
## BindingPattern::key\_neq

```rust
pub fn key_neq(self: BindingPattern, object: <any>) -> bool;
```
## BindingPattern::key\_eq

```rust
pub fn key_eq(self: BindingPattern, object: <any>) -> bool;
```
## BindingPattern::to\_set

```rust
pub fn to_set(self: BindingPattern) -> *BindingPattern;
```
