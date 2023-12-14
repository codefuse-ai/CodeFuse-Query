# TemplateLiteralTypeSpan

Primary key: `id: int`

```rust
schema TemplateLiteralTypeSpan {
  @primary id: int,
}
```
## TemplateLiteralTypeSpan::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateLiteralTypeSpan) -> Location;
```
## TemplateLiteralTypeSpan::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateLiteralTypeSpan) -> Symbol;
```
## TemplateLiteralTypeSpan::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateLiteralTypeSpan) -> *Decorator;
```
## TemplateLiteralTypeSpan::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateLiteralTypeSpan) -> string;
```
## TemplateLiteralTypeSpan::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateLiteralTypeSpan, i: int) -> Modifier;
```
## TemplateLiteralTypeSpan::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateLiteralTypeSpan) -> *Comment;
```
## TemplateLiteralTypeSpan::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateLiteralTypeSpan) -> *Node;
```
## TemplateLiteralTypeSpan::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateLiteralTypeSpan) -> *Node;
```
## TemplateLiteralTypeSpan::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TemplateLiteralTypeSpan) -> Node;
```
## TemplateLiteralTypeSpan::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateLiteralTypeSpan) -> TopLevelDO;
```
## TemplateLiteralTypeSpan::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateLiteralTypeSpan, i: int) -> Decorator;
```
## TemplateLiteralTypeSpan::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateLiteralTypeSpan) -> *Modifier;
```
## TemplateLiteralTypeSpan::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateLiteralTypeSpan, i: int) -> Node;
```
## TemplateLiteralTypeSpan::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateLiteralTypeSpan) -> *FunctionLikeDeclaration;
```
## TemplateLiteralTypeSpan::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateLiteralTypeSpan, level: int) -> *Node;
```
## TemplateLiteralTypeSpan::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateLiteralTypeSpan) -> string;
```
## TemplateLiteralTypeSpan::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateLiteralTypeSpan, level: int) -> Node;
```
## TemplateLiteralTypeSpan::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateLiteralTypeSpan) -> File;
```
## TemplateLiteralTypeSpan::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateLiteralTypeSpan) -> *Comment;
```
## TemplateLiteralTypeSpan::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateLiteralTypeSpan) -> *Comment;
```
## TemplateLiteralTypeSpan::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateLiteralTypeSpan) -> Node;
```
## TemplateLiteralTypeSpan::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateLiteralTypeSpan) -> FunctionLikeDeclaration;
```
## TemplateLiteralTypeSpan::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getIndex

```rust
pub fn getIndex(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateLiteralTypeSpan) -> *Node;
```
## TemplateLiteralTypeSpan::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateLiteralTypeSpan;
```
## TemplateLiteralTypeSpan::is\<T\>

```rust
pub fn is<T>(self: TemplateLiteralTypeSpan) -> bool;
```
## TemplateLiteralTypeSpan::to\<T\>

```rust
pub fn to<T>(self: TemplateLiteralTypeSpan) -> <any>;
```
## TemplateLiteralTypeSpan::key\_neq

```rust
pub fn key_neq(self: TemplateLiteralTypeSpan, object: <any>) -> bool;
```
## TemplateLiteralTypeSpan::key\_eq

```rust
pub fn key_eq(self: TemplateLiteralTypeSpan, object: <any>) -> bool;
```
## TemplateLiteralTypeSpan::to\_set

```rust
pub fn to_set(self: TemplateLiteralTypeSpan) -> *TemplateLiteralTypeSpan;
```
