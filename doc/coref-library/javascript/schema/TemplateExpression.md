# TemplateExpression

Primary key: `id: int`

```rust
schema TemplateExpression {
  @primary id: int,
}
```
## TemplateExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateExpression) -> *Node;
```
## TemplateExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateExpression) -> int;
```
## TemplateExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateExpression) -> string;
```
## TemplateExpression::getExpression

```rust
pub fn getExpression(self: TemplateExpression) -> Expression;
```
## TemplateExpression::getIndex

```rust
pub fn getIndex(self: TemplateExpression) -> int;
```
## TemplateExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateExpression) -> int;
```
## TemplateExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateExpression, level: int) -> Node;
```
## TemplateExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateExpression) -> File;
```
## TemplateExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateExpression) -> int;
```
## TemplateExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateExpression) -> FunctionLikeDeclaration;
```
## TemplateExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateExpression) -> *Comment;
```
## TemplateExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateExpression) -> *Comment;
```
## TemplateExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateExpression) -> int;
```
## TemplateExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateExpression) -> *Modifier;
```
## TemplateExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateExpression) -> int;
```
## TemplateExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateExpression) -> int;
```
## TemplateExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateExpression, i: int) -> Node;
```
## TemplateExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateExpression, i: int) -> Decorator;
```
## TemplateExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateExpression) -> TopLevelDO;
```
## TemplateExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateExpression) -> int;
```
## TemplateExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateExpression) -> Node;
```
## TemplateExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TemplateExpression) -> Node;
```
## TemplateExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateExpression) -> *Node;
```
## TemplateExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateExpression) -> *Node;
```
## TemplateExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateExpression) -> *Comment;
```
## TemplateExpression::getHead

```rust
pub fn getHead(self: TemplateExpression) -> TemplateHead;
```
## TemplateExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateExpression) -> *Decorator;
```
## TemplateExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateExpression) -> Symbol;
```
## TemplateExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateExpression, i: int) -> Modifier;
```
## TemplateExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateExpression) -> string;
```
## TemplateExpression::getATemplateSpan

```rust
pub fn getATemplateSpan(self: TemplateExpression) -> *TemplateSpan;
```
## TemplateExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateExpression) -> Location;
```
## TemplateExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateExpression;
```
## TemplateExpression::getTemplateSpan

```rust
pub fn getTemplateSpan(self: TemplateExpression, i: int) -> TemplateSpan;
```
## TemplateExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateExpression) -> *FunctionLikeDeclaration;
```
## TemplateExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateExpression, level: int) -> *Node;
```
## TemplateExpression::is\<T\>

```rust
pub fn is<T>(self: TemplateExpression) -> bool;
```
## TemplateExpression::to\<T\>

```rust
pub fn to<T>(self: TemplateExpression) -> <any>;
```
## TemplateExpression::key\_neq

```rust
pub fn key_neq(self: TemplateExpression, object: <any>) -> bool;
```
## TemplateExpression::key\_eq

```rust
pub fn key_eq(self: TemplateExpression, object: <any>) -> bool;
```
## TemplateExpression::to\_set

```rust
pub fn to_set(self: TemplateExpression) -> *TemplateExpression;
```
