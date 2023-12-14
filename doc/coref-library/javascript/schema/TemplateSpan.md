# TemplateSpan

Primary key: `id: int`

```rust
schema TemplateSpan {
  @primary id: int,
}
```
## TemplateSpan::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateSpan) -> *Node;
```
## TemplateSpan::getIndex

```rust
pub fn getIndex(self: TemplateSpan) -> int;
```
## TemplateSpan::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateSpan) -> int;
```
## TemplateSpan::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateSpan) -> int;
```
## TemplateSpan::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateSpan) -> Node;
```
## TemplateSpan::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateSpan) -> FunctionLikeDeclaration;
```
## TemplateSpan::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateSpan) -> File;
```
## TemplateSpan::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateSpan, level: int) -> Node;
```
## TemplateSpan::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateSpan) -> Location;
```
## TemplateSpan::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateSpan) -> *FunctionLikeDeclaration;
```
## TemplateSpan::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateSpan, level: int) -> *Node;
```
## TemplateSpan::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateSpan) -> int;
```
## TemplateSpan::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateSpan) -> *Modifier;
```
## TemplateSpan::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateSpan) -> int;
```
## TemplateSpan::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateSpan) -> int;
```
## TemplateSpan::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateSpan, i: int) -> Node;
```
## TemplateSpan::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateSpan) -> int;
```
## TemplateSpan::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateSpan) -> TopLevelDO;
```
## TemplateSpan::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateSpan, i: int) -> Decorator;
```
## TemplateSpan::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateSpan) -> *Comment;
```
## TemplateSpan::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateSpan) -> *Comment;
```
## TemplateSpan::getParent

```rust
pub fn getParent(self: TemplateSpan) -> TemplateExpression;
```
## TemplateSpan::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateSpan) -> *Node;
```
## TemplateSpan::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateSpan) -> *Node;
```
## TemplateSpan::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateSpan) -> *Comment;
```
## TemplateSpan::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateSpan, i: int) -> Modifier;
```
## TemplateSpan::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateSpan) -> string;
```
## TemplateSpan::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateSpan) -> *Decorator;
```
## TemplateSpan::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateSpan) -> Symbol;
```
## TemplateSpan::getLiteral

```rust
pub fn getLiteral(self: TemplateSpan) -> Token;
```
## TemplateSpan::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateSpan;
```
## TemplateSpan::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateSpan) -> string;
```
## TemplateSpan::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateSpan) -> int;
```
## TemplateSpan::getExpression

```rust
pub fn getExpression(self: TemplateSpan) -> Expression;
```
## TemplateSpan::is\<T\>

```rust
pub fn is<T>(self: TemplateSpan) -> bool;
```
## TemplateSpan::to\<T\>

```rust
pub fn to<T>(self: TemplateSpan) -> <any>;
```
## TemplateSpan::key\_neq

```rust
pub fn key_neq(self: TemplateSpan, object: <any>) -> bool;
```
## TemplateSpan::key\_eq

```rust
pub fn key_eq(self: TemplateSpan, object: <any>) -> bool;
```
## TemplateSpan::to\_set

```rust
pub fn to_set(self: TemplateSpan) -> *TemplateSpan;
```
